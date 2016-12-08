/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kimbreal
 */
@WebServlet(name = "UserTableGZIPServlet", urlPatterns = {"/UserTableGZIPServlet"})
public class UserTableGZIPServlet extends HttpServlet {

    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("User table");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue(" The User Table");

        List<User> users = UserDB.selectUsers();

        try {
            int i = 2;
            for (User u : users) {
                row = sheet.createRow(i);
                row.createCell(0).setCellValue(u.getUserId());
                row.createCell(1).setCellValue(u.getLastName());
                row.createCell(2).setCellValue(u.getFirstName());
                row.createCell(3).setCellValue(u.getEmail());
                i++;

            }
        } catch (Exception e) {
            this.log(e.toString());
        }

        response.setHeader("content-disposition",
                "attachment; filename=users.xls");
        response.setHeader("cache-control", "no-cache");
        String encodingString = request.getHeader("accept-encoding");
        OutputStream out;
        if (encodingString != null && encodingString.contains("gzip")) {
            out = new GZIPOutputStream(response.getOutputStream());
            response.setHeader("content-encoding", "gzip");
        } else {
            out = response.getOutputStream();
        }
        
        workbook.write(out);
        out.close();

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
