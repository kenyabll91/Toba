/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kimbreal
 */
@WebServlet(name = "Password_reset", urlPatterns = {"/Password_reset"})
public class Password_resetServlet extends HttpServlet {
    
    private String s;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String url = "/Password_reset.jsp";
        
        String NewPassword = request.getParameter("NewPassword");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        
        if (user == null) {
            url = "/NewCustomer.jsp";
        } else {
            s = NewPassword;
            user.passWord = s;
            
            session.setAttribute("user", user);
            request.setAttribute("s", s);
            
            String message;
            try {
                PasswordUtil.checkPasswordStrength(user.passWord);
                message = "";
            } catch (Exception e) {
                message = e.getMessage();
                url = "/Password_reset.jsp"; 
            }
            request.setAttribute("message", message);
            
            String hashedPassword;
            String salt = "";
            String saltedAndHashedPassword;
            try {
              hashedPassword = PasswordUtil.hashPassword(user.passWord);
              salt = PasswordUtil.getSalt();
              saltedAndHashedPassword = PasswordUtil.hashAndSaltPassword(user.passWord);
            } catch (NoSuchAlgorithmException ex) {
                hashedPassword = ex.getMessage();
                saltedAndHashedPassword = ex.getMessage();
            }
            session.setAttribute("hashedPassword", hashedPassword);
            session.setAttribute("salt", salt);
            session.setAttribute("saltedAndHashedPassword", saltedAndHashedPassword);
            
            request.setAttribute("message", message);
            
            UserDB.update(user);
            request.setAttribute("user", user);
            url = "/Account_activity.jsp";
        
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    }
