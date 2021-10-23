package Test;

import Dao.getTestingSiteLocationDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getTestingSiteLocationDaoTest {

    @Test
    void getTestingSiteLocation_Right() throws Exception {

        getTestingSiteLocationDao getLocation = new getTestingSiteLocationDao();

        assertEquals("Aughtie Walk，51-55 Dundas Pl, Albert Park VIC 3206",
                getLocation.getTestingSiteLocation().get(0).getLocation());
    }

    @Test
    void getTestingSiteLocation_Wrong() throws Exception {

        getTestingSiteLocationDao getLocation = new getTestingSiteLocationDao();

        assertNotEquals("RMIT，Melbourne CBD",
                getLocation.getTestingSiteLocation().get(6).getLocation());
    }
}