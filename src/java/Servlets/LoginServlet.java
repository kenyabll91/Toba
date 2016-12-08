package Servlets;



import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/Login.jsp";
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }
        
        if (action.equals("join")) {
            url = "/Login.jsp";
        }
        else if (action.equals("add")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            User user = UserDB.selectUser(username);
            Account account = new Account();
            String message = null;
            if (username.equals("") || password.equals("")) {
                message = "*Please fill out all boxes*";
                url = "/Login.jsp";
            } else {
                message = "";
            }
            Login login = new Login(username, password);
            HttpSession session = request.getSession();
            
            String salt ="";
            String saltedAndHashedPassword;
            try {
                salt = user.getSalt();
                saltedAndHashedPassword = PasswordUtil.hashPassword(password + salt);
            } catch (NoSuchAlgorithmException ex) {
                saltedAndHashedPassword = ex.getMessage();
            }
            session.setAttribute("user", user);
            request.setAttribute("Login", login);
            request.setAttribute("message", message);
            
            if (user.getPassWord().equals(saltedAndHashedPassword)) {
                session.setAttribute("user", user);
                url = "/Account_activity.jsp";
            }
        }
            else {
                url = "/Login_failure.html";
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
