package Dao;

import model.TestingSite;
import util.JDBCutil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getTestingSiteLimitationDao {
    static Connection conn = null;
    static PreparedStatement prst = null;

    private TestingSite testingsite = new TestingSite();

    public static final List<TestingSite> getTestingSiteLimitation() throws Exception{
        ArrayList<TestingSite> TestingSiteLimitation = new ArrayList<>();
        try {
            conn = JDBCutil.getCon();
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            String query = "SELECT Limitation" + "  FROM testingsite";
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                TestingSite testingSite = new TestingSite();

                testingSite.setLimitation(results.getString("Limitation"));
                TestingSiteLimitation.add(testingSite);

            }
            statement.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return TestingSiteLimitation;
    }

}