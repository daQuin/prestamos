/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Negocio;
import prestamoDTO.Persona;
import prestamoDTO.TipoPersona;

/**
 *
 * @author Juan
 */
@WebServlet(name = "controllerReegistro", urlPatterns = {"/controllerReegistro"})
public class controllerReegistro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String cedula=request.getParameter("doc");
        String nombre=request.getParameter("nom");
        String apellido=request.getParameter("ape");
        String telefono=request.getParameter("tel");
        String correo=request.getParameter("correo");
        String tipopersona=request.getParameter("tipo");        
        String pasword=request.getParameter("pass");
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controllerReegistro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controllerReegistro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Negocio n=new Negocio();
        String cedula=request.getParameter("doc");
        String nombre=request.getParameter("nom");
        String apellido=request.getParameter("ape");
        String telefono=request.getParameter("tel");
        String correo=request.getParameter("correo");
        String tipopersona=request.getParameter("tipo");
        int tpp=0;
        if(tipopersona.equalsIgnoreCase("interna")){
            tpp=1;
        }else{
            tpp=2;
        }
        String pasword=request.getParameter("tpp");
        TipoPersona tp=n.consultartipopersona(tipopersona);
        Persona p=new Persona(cedula, nombre, apellido, telefono, correo, tp, pasword);
        n.registrarPersona(p);
        response.sendRedirect("index.html");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
