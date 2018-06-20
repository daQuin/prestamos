/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Negocio;
import prestamoDTO.Dependencia;
import prestamoDTO.Espacio;

/**
 *
 * @author Juan
 */
@WebServlet(name = "dependencia", urlPatterns = {"/dependencia"})
public class dependencia extends HttpServlet {

    Negocio n = new Negocio();
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet dependencia</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet dependencia at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
     public ArrayList<Dependencia> listarDependencias(){
        return n.listardependencia();
    }
    
     public ArrayList<Espacio> listarEspacios(){
        return n.listarespacios();
    }
    
       public void eliminarDep(int id) {
        this.n.eliminardependencia(id);
    }
    
    
    protected void registroDep(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         String id = request.getParameter("id");
         String nombre = request.getParameter("nombre");
         String correo = request.getParameter("correo");
         String telefono = request.getParameter("telefono");
         String ubicacion = request.getParameter("ubicacion");
         
         Dependencia d = new Dependencia();
         d.setId_dependencia(Integer.parseInt(id));
         d.setNombre(nombre);
         d.setCorreo(correo);
         d.setTelefono(telefono);
         d.setUbicacion(ubicacion);
       
         n.registrardependencia(d);       
        
    }
    
     protected void actualizarDep(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         
         
        
         String id = request.getParameter("id");
         String nombre = request.getParameter("nombre");
         String correo = request.getParameter("correo");
         String telefono = request.getParameter("telefono");
         String ubicacion = request.getParameter("ubicacion");
         
       
         n.actualizardependencia(Integer.parseInt(id), nombre, correo, telefono, ubicacion);
         
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
        String param = request.getParameter("action");
        if (param != null && param.equals("delete")) {
             int id = Integer.parseInt(request.getParameter("id"));
            this.eliminarDep(id);
        }
        request.getRequestDispatcher("/dependencias.jsp").forward(request, response);
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
        String param = request.getParameter("action");
        if (param != null && param.equals("registrar")) {
            this.registroDep(request, response);
        }
         if (param != null && param.equals("actualizar")) {
            this.actualizarDep(request, response);
        }
         
          request.getRequestDispatcher("/dependencias.jsp").forward(request, response);
        
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
