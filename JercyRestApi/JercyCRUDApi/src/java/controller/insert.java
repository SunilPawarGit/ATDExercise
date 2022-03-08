/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import static controller.Mydb.con;
import static controller.Mydb.connect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sunil
 */
@WebServlet(name = "insert", urlPatterns = {"/insert"})
public class insert extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            try{
                   
                                    
                    String id = request.getParameter("stid");
                    String name=request.getParameter("nm");
                    String dob= request.getParameter("dob");
                    String doj=request.getParameter("doj");
                    connect();
                    String sql="insert into tbl_Student values ('"+id+"','"+name+"','"+dob+"','"+doj+"')";
                    Statement st = con.createStatement();
                    if(st.execute(sql)){
                        response.sendRedirect("/index.html");
                    }
                
            }
            catch(Exception e){
                out.println("Exception :"+e.getMessage());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()){
            connect();
            PreparedStatement st=con.prepareStatement("Select * from tbl_Student");
            ResultSet rs=st.executeQuery();
            ArrayList<Students> student=new ArrayList<>();
            while(rs.next()){
                Students s=new Students();
                s.id=rs.getInt("Id");
                s.name=rs.getString("Name");
                s.dob=rs.getString("DOB");
                s.doj=rs.getString("DOJ");
                student.add(s);
            }
            request.setAttribute("student", student);
            request.getRequestDispatcher("/index.html").forward(request, response);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
