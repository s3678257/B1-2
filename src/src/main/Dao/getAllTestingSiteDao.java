package Dao;

import model.TestingSite;
import util.JDBCutil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getAllTestingSiteDao {
    static Connection conn = null;
    static PreparedStatement prst = null;

    private TestingSite testingsite = new TestingSite();

    public static final List<TestingSite> getAllTestingSite() throws Exception{
        ArrayList<TestingSite> testingsiteslist = new ArrayList<>();
        try {
            conn = JDBCutil.getCon();
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            String query = "SELECT Suburb,\n" +
                    "       Location,\n" +
                    "       Waiting_time,\n" +
                    "       Distance,\n" +
                    "       Num_people,\n" +
                    "       OpeningHour,\n" +
                    "       SiteType,\n" +
                    "       PhoneNum,\n" +
                    "       Status,\n"+
                    "       Limitation"+
                    "  FROM testingsite";
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                TestingSite testingSite = new TestingSite();

                testingSite.setSuburb(results.getString("Suburb"));
                testingSite.setLocation(results.getString("Location"));
                testingSite.setWaiting_time(results.getString("Waiting_time"));
                testingSite.setDistance(results.getString("Distance"));
                testingSite.setNum_people(results.getString("Num_people"));
                testingSite.setOpeningHour(results.getString("OpeningHour"));
                testingSite.setSiteType(results.getString("SiteType"));
                testingSite.setPhoneNum(results.getString("PhoneNum"));
                testingSite.setStatus(results.getString("Status"));
                testingSite.setLimitation(results.getString("Limitation"));
                testingsiteslist.add(testingSite);

            }
            statement.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return testingsiteslist;
    }



}
