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
import prestamoDAO.DependenciaDAO;
import prestamoDTO.Dependencia;
import prestamoDTO.Elemento;
import prestamoDTO.Espacio;

/**
 *
 * @author DELL
 */
@WebServlet(name = "espacios", urlPatterns = {"/espacios"})
public class espacios extends HttpServlet {
    
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
            out.println("<title>Servlet espacios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet espacios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    public ArrayList<Elemento> listarElementos(){
        return n.listarelementos();
    }
    
    public ArrayList<Dependencia> listarDependencias(){
        return n.listardependencia();
    }
    
     public ArrayList<Espacio> listarEspacios(){
        return n.listarespacios();
    }
    
       public void eliminarEspacio(int id) {
        this.n.eliminarespacio(id);
    }
    
     protected void crearEspacio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         String capacidad = request.getParameter("capacidad");
         String dimenciones = request.getParameter("dimencion");
         String descripcion = request.getParameter("descripcion");
         String nombre = request.getParameter("nombre");
         String valor = request.getParameter("valor");
         String dependencia = request.getParameter("dependencia");
         String dispositivo = request.getParameter("dispositivo");
         String id = request.getParameter("id");
         Espacio e = new Espacio();
         e.setCapacidad(Integer.parseInt(capacidad));
         e.setDescripcion(descripcion);
         e.setDimenciones(dimenciones);
         e.setValor_hora(valor);
         e.setnombre(nombre);
         
        Dependencia d=  n.consultardependencia(Integer.parseInt(dependencia));
         e.setId_dependencia(d);
         e.setIdSpacios(Integer.parseInt(id));
         n.registrarespacio(e);         
              
              }
     
          protected void actualizarEspacio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
         String capacidad = request.getParameter("capacidad");
         String dimenciones = request.getParameter("dimencion");
         String descripcion = request.getParameter("descripcion");
         String nombre = request.getParameter("nombre");
         String valor = request.getParameter("valor");
         String dependencia = request.getParameter("dependencia");
         String dispositivo = request.getParameter("dispositivo");
         String id = request.getParameter("id");
         Espacio e = new Espacio();
         e.setCapacidad(Integer.parseInt(capacidad));
         e.setDescripcion(descripcion);
         e.setDimenciones(dimenciones);
         e.setValor_hora(valor);
         e.setnombre(nombre);
         
        Dependencia d=  n.consultardependencia(Integer.parseInt(dependencia));
         e.setId_dependencia(d);
         e.setIdSpacios(Integer.parseInt(id));
         n.actualizarespacio(Integer.parseInt(id), nombre, Integer.parseInt(capacidad), dimenciones, descripcion, valor, d);
              
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
            this.eliminarEspacio(id);
        }
        request.getRequestDispatcher("/homeAdmin.jsp").forward(request, response);
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
        if (param != null && param.equals("save")) {
            this.crearEspacio(request, response);
        }
         if (param != null && param.equals("editar")) {
            this.actualizarEspacio(request, response);
        }
         
          request.getRequestDispatcher("/homeAdmin.jsp").forward(request, response);
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
