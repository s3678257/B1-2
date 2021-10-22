package Dao;

import model.TestingSite;
import util.JDBCutil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getTestingSiteGeoInfoDao {
    static Connection conn = null;
    static PreparedStatement prst = null;
    private TestingSite testingsite = new TestingSite();

    public static final List<TestingSite> getTestingSiteInfo() throws Exception{
        ArrayList<TestingSite> testingsitesinfo = new ArrayList<>();
        try {
            conn = JDBCutil.getCon();
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            String query = "SELECT Suburb,\n" +
                    "       Location,\n" +
                    "       Distance" +
                    "  FROM testingsite";
            ResultSet results = statement.executeQuery(query);


            while (results.next()) {
                TestingSite testingSite = new TestingSite();

                testingSite.setSuburb(results.getString("Suburb"));
                testingSite.setLocation(results.getString("Location"));
                testingSite.setDistance(results.getString("Distance"));
                testingsitesinfo.add(testingSite);

            }
            statement.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return testingsitesinfo;
    }
}
