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
@WebServlet(name = "TransactionServlet", urlPatterns = {"/TransactionServlet"})
public class TransactionServlet extends HttpServlet {

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
       HttpSession session = request.getSession();
       User user = (User)session.getAttribute("user");
       String amount = request.getParameter("amount");
       
       session.setAttribute("user", user);
       Account checking = AccountDB.selectAccount(user, "checking");
       Account savings = AccountDB.selectAccount(user, "savings");
       
       Double checkingBalance = checking.getStartBalance();
       Double savingBalance = checking.getStartBalance();
       
       checking.credit(Double.parseDouble(amount));
       Transaction t1 = new Transaction(
         checkingBalance, Double.parseDouble(amount), savings.getStartBalance(), "Credit");
       checking.addTransactions(t1);
       
       savings.debit(Double.parseDouble(amount));
       Transaction t2 = new Transaction(
        savingBalance, Double.parseDouble(amount), savings.getStartBalance(), "Debit");
       savings.addTransactions(t2);
       
       AccountDB.updateBalance(savings);
       AccountDB.updateBalance(checking);
       
       session.setAttribute("checking", checking);
       session.setAttribute("savings", savings);
       
       getServletContext()
               .getRequestDispatcher("/Account_activity.jsp")
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
