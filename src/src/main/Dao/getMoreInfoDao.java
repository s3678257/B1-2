package Dao;

import model.TestingSite;
import util.JDBCutil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getMoreInfoDao {
    static Connection conn = null;
    static PreparedStatement prst = null;

    private TestingSite testingsite = new TestingSite();

    public static final List<TestingSite> getMoreInfo() throws Exception{
        ArrayList<TestingSite> moreinfo = new ArrayList<>();
        try {
            conn = JDBCutil.getCon();
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            String query = "SELECT OpeningHour,\n" +
                    "       SiteType,\n" +
                    "       PhoneNum,\n" +
                    "       Status,\n"+
                    "       Limitation"+
                    "  FROM testingsite";
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                TestingSite testingSite = new TestingSite();

                testingSite.setOpeningHour(results.getString("OpeningHour"));
                testingSite.setSiteType(results.getString("SiteType"));
                testingSite.setPhoneNum(results.getString("PhoneNum"));
                testingSite.setStatus(results.getString("Status"));
                testingSite.setLimitation(results.getString("Limitation"));
                moreinfo.add(testingSite);

            }
            statement.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return moreinfo;
    }

}