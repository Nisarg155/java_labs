

import java.sql.*;


public class StatementCRUD {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (Connection con =

                     DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "")) {
            Statement s ;
            s = con.createStatement();
            String query = "INSERT INTO `student` (`firstName`,`lastName`,`branch`,`username`,`password`) VALUES ('Nisarg','Amlani','ce','djdjsfdjhfj','jdshfjdh')";
            int i = s.executeUpdate(query);
            System.out.println(i + "rows inserted");
            String query2 = "INSERT INTO `student` (`firstName`,`lastName`,`branch`,`username`,`password`) VALUES ('Nisarg1','Amlani','ce','djdjsfdjhfj','jdshfjdh')";
            i = s.executeUpdate(query2);
            System.out.println(i + "rows inserted");

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}