package com.wxc.hwt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "SearchServlet")//查询余额功能
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session=request.getSession();
        String IDcard= (String) session.getAttribute("IDcard");//获取银行卡号
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bank";
            String username = "root";
            String password = "2016013924";
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement sql= conn.createStatement();
            ResultSet rs=sql.executeQuery("select *from balance where IDcard='"+IDcard+"'");
            while(rs.next()) {
                double endCash = rs.getDouble("endCash");
                session.setAttribute("endCash",endCash);
            }
            rs.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("search.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request,response);
    }
}
