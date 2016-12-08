/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
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
@WebServlet(urlPatterns = {"/NewCustomerServlet"})
public class NewCustomerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";

        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }
        
        if (action.equals("add")) {
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String phonenumber = request.getParameter("phonenumber");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipcode = request.getParameter("zipcode");
            String email = request.getParameter("email");
            String username = lastname.concat(zipcode);
            String password = "welcome1";
            String message;
            if (firstname.equals("") || lastname.equals("") || email.equals("") ||address.equals("") || city.equals("") || state.equals("") || zipcode.equals("")) {
                message = "*Please fill out all boxes*";
                url = "/NewCustomer.jsp";
            } else {
                message = "";
                url = "/Success.jsp";
            }

            User user = new User();
            user.setUsername(lastname + zipcode);
            user.setFirstName(firstname);
            user.setLastName(lastname);
            user.setPhoneNumber(phonenumber);
            user.setAddress(address);
            user.setCity(city);
            user.setState(state);
            user.setZipcode(zipcode);
            user.setEmail(email);
            user.setPassword(password);
            Account checking = new Account("Checking", 0, user);
            Account savings = new Account("Savings", 25.0, user);

            UserDB.insert(user);
            AccountDB.insert(savings);
            AccountDB.insert(checking);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            request.setAttribute("user", user);
            request.setAttribute("message", message);


        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

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
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
