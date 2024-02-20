package org.lab9.lab9_;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.*;

@WebServlet(name = "login" , value = "/login")
public class LoginVerifierServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Context initContext = null;
        PrintWriter out = res.getWriter();
        try {
            initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:/comp/env");
            DataSource dataSource = (DataSource) envContext.lookup("jdbc/MyXAMPPDB");

            try(Connection  con = dataSource.getConnection()){

                String name = req.getParameter("username");
                String pass = req.getParameter("password");
                String query = "SELECT * FROM users  where name= ? and password=?";
                PreparedStatement stmt = con.prepareCall(query);
                stmt.setString(1,name);
                stmt.setString(2,pass);

                ResultSet rs = stmt.executeQuery();
                if(rs.next())
                {


                    out.println("<html> ");
                    out.println("<head> </head>");
                    out.println("<body>");

                    HttpSession ses = req.getSession();
                    ses.setAttribute("name",name);
                    ses.setAttribute("pass",pass);
                    out.println("Welcome " + name);
                    out.println("<br>");
                    out.println("<a href=\"first.jsp\">First</a>");
                    out.println("<a href=\"second.jsp\">Second </a>");
                    out.println("</body>");
                    out.println("</html>");
                }
                else{
                    res.sendRedirect("login.html");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }

    }
}
