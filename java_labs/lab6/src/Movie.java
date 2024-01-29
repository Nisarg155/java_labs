import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Movie{
    private Integer id;
    private String title;
    private String gener;
    private String yearOfRelease;

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public String getGener() {
        return gener;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", gener='" + gener + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void createMovie(Movie m)
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root",""))
        {
            Statement s = con.createStatement();
            String query;
            query = "INSERT INTO movies (title,genre,yearofrelease) VALUES ('"+m.getTitle()+"','"+m.getGener()+"','"+m.getYearOfRelease()+"')";
            int i = s.executeUpdate(query);
            System.out.println(i + " rows inserted");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    void deleteMovie(Integer id)
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","")){
            Statement s = con.createStatement();
            String query;
            query = "DELETE FROM movies WHERE id =  '"+id+"'";
            int i = s.executeUpdate(query);
            System.out.println(i + " rows deleted");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void updateMovieTitle(Integer id,String title)
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root",""))
        {
            Statement s = con.createStatement();
            String query ;
            query = "UPDATE movies   SET title ='"+title+"' WHERE id ='"+id+"' ";
            int i = s.executeUpdate(query);
            System.out.println(i + " rows updated");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    void findMovieByid(Integer id)
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root",""))
        {
            Statement s = con.createStatement();
            String query ;
            query = "SELECT * FROM movies WHERE id ='"+id+"' ";
            ResultSet rs = s.executeQuery(query);
            while(rs.next())
            {
                System.out.println("id :- " +  rs.getInt("id")+ "\ntitle :-  "+rs.getString("title")+"\ngenre :- "+rs.getString("genre")+"\nYear :- "+rs.getString("yearofrelease"));
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    void findallMovie()
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root",""))
        {
            Statement s = con.createStatement();
            String query ;
            query = "SELECT * FROM movies";
            ResultSet rs = s.executeQuery(query);
            while(rs.next())
            {
                System.out.println("id :- " +  rs.getInt("id")+ "\ntitle :-  "+rs.getString("title")+"\ngenre :- "+rs.getString("genre")+"\nYear :- "+rs.getString("yearofrelease"));
                System.out.println("----------------------------------------------------");

            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class Main{
    public static void main(String[] args) {
        Movie m = new Movie();
//        m.setTitle("The Dark Knight");
//        m.setGener("Action");
//        m.setYearOfRelease("2008");
//        m.createMovie(m);
//        m.deleteMovie(5);
//        m.updateMovieTitle(3,"The Dark Knight Rises");
//        m.findMovieByid(3);
        m.findallMovie();

    }
}