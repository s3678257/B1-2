package Test;

import Dao.getNumOfPeopleDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getNumOfPeopleDaoTest {

    @Test
    void getNumOfPeople_Right1() throws Exception {

        getNumOfPeopleDao getNum = new getNumOfPeopleDao();

        assertEquals("10",getNum.getNumOfPeople().get(10).getNum_people());
    }

    @Test
    void getNumOfPeople_Right2() throws Exception {

        getNumOfPeopleDao getNum = new getNumOfPeopleDao();

        assertEquals("4",getNum.getNumOfPeople().get(11).getNum_people());
    }

    @Test
    void getNumOfPeople_Wrong() throws Exception {

        getNumOfPeopleDao getNum = new getNumOfPeopleDao();

        assertNotEquals(5,getNum.getNumOfPeople().get(12).getNum_people());
    }
}