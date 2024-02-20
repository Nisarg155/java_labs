package com.lab8.lab8;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

@WebServlet(name = "validateServlet", value = "/validate-servlet")
public class ValidateServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        
        try {
            InitialContext initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            DataSource dataSource = (DataSource) envContext.lookup("jdbc/MyXAMPPDB");
            try (Connection con = dataSource.getConnection()) {
                String Name = request.getParameter("username");
                String Password = request.getParameter("password");
                String sql = "select * from users where name=? and password=?";
                try (PreparedStatement st = con.prepareStatement(sql)) {
                    st.setString(1, Name);
                    st.setString(2, Password);
                    try (ResultSet rs = st.executeQuery()) {
                        if (rs.next()) {
                            response.sendRedirect("welcome.jsp");
                        } else {
                            response.sendRedirect("index.html");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } catch (SQLException e) {
            // Proper logging should be implemented in a production environment
            e.printStackTrace();
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}

