/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.modelo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ProcesaServlet4", urlPatterns = {"/ProcesaServlet4"})
public class GestorTareas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recibo datos del formulario
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String resumen  = request.getParameter("resumen");
      String medio  = request.getParameter("medio");
     // Instanciar un objeto apartir de la clase Persona  
     Tarea per =new Tarea();
     // Encapsulamos los datos recibidos en el objeto per
     per.setTitulo(titulo);
     per.setAutor(autor);
     per.setResumen(resumen);
     per.setMedio(medio);
     // Colocar al objeto per como un atributo de request
    
    request.setAttribute("persona",per);
    
    //Derivamos el control a output.jsp incluye al objeto request
    request.getRequestDispatcher("output4.jsp").forward(request,response);
    
    } 
}

