package Test;

import Dao.getTestingSiteSuburbDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getTestingSiteSuburbDaoTest {

    @Test
    void getTestingSiteSuburb_Right() throws Exception {

        getTestingSiteSuburbDao getSuburb = new getTestingSiteSuburbDao();

        assertEquals("Melbourne CBD",
                getSuburb.getTestingSiteSuburb().get(5).getSuburb());
    }

    @Test
    void getTestingSiteSuburb_Wrong() throws Exception {

        getTestingSiteSuburbDao getSuburb = new getTestingSiteSuburbDao();

        assertNotEquals("South Melbourne",
                getSuburb.getTestingSiteSuburb().get(9).getSuburb());
    }
}