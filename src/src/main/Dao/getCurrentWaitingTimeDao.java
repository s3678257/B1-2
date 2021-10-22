package Dao;

import model.TestingSite;
import util.JDBCutil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getCurrentWaitingTimeDao {
    static Connection conn = null;
    static PreparedStatement prst = null;

    private TestingSite testingsite = new TestingSite();

    public static final List<TestingSite> getCurrentWaitingTime() throws Exception{
        ArrayList<TestingSite> CurrentWaitingTime = new ArrayList<>();
        try {
            conn = JDBCutil.getCon();
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            String query = "SELECT Waiting_time" + "  FROM testingsite";
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                TestingSite testingSite = new TestingSite();

                testingSite.setWaiting_time(results.getString("Waiting_time"));
                CurrentWaitingTime.add(testingSite);

            }
            statement.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return CurrentWaitingTime;
    }

}