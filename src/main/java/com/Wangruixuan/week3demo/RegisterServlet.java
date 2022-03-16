package com.Wangruixuan.week3demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter( s:"username");
        String password =request.getParameter( s:"password");
        String email =request.getParameter( s:"email");
        String gender =request.getParameter( s:"gender");
        String birthDate =request.getParameter( s:"birthDate");

        PrintWriter writer = response.getWriter();
        writer.println("<br/>username :"+username);
        writer.println("<br/>password :"+password);
        writer.println("<br/>email :"+email);
        writer.println("<br/>gender :"+gender);
        writer.println("<br/>birthDate :"+birthDate);
        writer.close();

    }
}
