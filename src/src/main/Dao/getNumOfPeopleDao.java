package Dao;

import model.TestingSite;
import util.JDBCutil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class getNumOfPeopleDao {
    static Connection conn = null;
    static PreparedStatement prst = null;

    private TestingSite testingsite = new TestingSite();

    public static final List<TestingSite> getNumOfPeople() throws Exception{
        ArrayList<TestingSite> NumOfPeople = new ArrayList<>();
        try {
            conn = JDBCutil.getCon();
            Statement statement = conn.createStatement();
            statement.setQueryTimeout(30);
            String query = "SELECT Num_people" + "  FROM testingsite";
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                TestingSite testingSite = new TestingSite();

                testingSite.setNum_people(results.getString("Num_people"));
                NumOfPeople.add(testingSite);

            }
            statement.close();


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return NumOfPeople;
    }

}
