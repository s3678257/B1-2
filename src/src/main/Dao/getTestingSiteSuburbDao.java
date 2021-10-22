package Dao;

import model.TestingSite;
import util.JDBCutil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getTestingSiteSuburbDao {
    static Connection conn = null;
    static PreparedStatement prst = null;

    private TestingSite testingsite = new TestingSite();

    public static final List<TestingSite> getTestingSiteSuburb() throws Exception{
        ArrayList<TestingSite> TestingSiteSuburb = new ArrayList<>();
        try {
            conn = JDBCutil.getCon();
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            String query = "SELECT Suburb,\n" + "  FROM testingsite";
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                TestingSite testingSite = new TestingSite();

                testingSite.setSuburb(results.getString("Suburb"));
                TestingSiteSuburb.add(testingSite);

            }
            statement.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return TestingSiteSuburb;
    }

}