/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "listarEmpleado", urlPatterns = {"/listarEmpleado"})
public class listarEmpleado extends HttpServlet {

    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //MARCOTRABAJO
        Empleado emp = new Empleado();
        ArrayList<Empleado> listaEmpleados;
        try {
            listaEmpleados = emp.Listar();

            response.setContentType("text/html;charset=UTF-8");
            
            try (PrintWriter out = response.getWriter()) {

                out.println("<table align=\"center\" width='311' border='1'><tr><td colspan='2' bgcolor='#000099' "
                        + "style='color:#FFFFFF'>Listado de empleados</td></tr> "
                        + "<tr><td width='300'>RUT</td><td width='130'>NOMBRE</td><td>CARGO</td><td> SUELDO BASE</td><td>HORAS EXTRAS</td><td>DIAS DE AUSENCIA</td></tr>");

                for (Empleado m : listaEmpleados) {
                    
                    
                    out.println("<tr align='center'>");
                    out.println("<td>" + m.getRut() + "</td>");
                    out.println("<td>" + m.getNombre() + "</td> ");
                    out.println("<td>" + m.getCargo() + "</td> ");
                    out.println("<td>" + m.getSbase()+ "</td> ");
                    out.println("<td>" + m.getHextras() + "</td> ");
                    out.println("<td>" + m.getAusencia() + "</td> ");
                    

                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.setContentType("text/html;charset=UTF-8");
       
        
    }

    
    

}
