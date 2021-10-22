package Dao;

import model.TestingSite;
import util.JDBCutil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getTestingSiteLocationDao {
    static Connection conn = null;
    static PreparedStatement prst = null;



    public static final List<TestingSite> getTestingSiteLocation() throws Exception{
        ArrayList<TestingSite> TestingSiteLocation = new ArrayList<>();
        try {
            conn = JDBCutil.getCon();
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            String query = "SELECT Location,\n" + "  FROM testingsite";
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                TestingSite testingSite = new TestingSite();

                testingSite.setLocation(results.getString("Location"));
                TestingSiteLocation.add(testingSite);

            }
            statement.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return TestingSiteLocation;
    }

}