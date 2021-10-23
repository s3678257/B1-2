package Test;

import Dao.getCurrentWaitingTimeDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getCurrentWaitingTimeDaoTest {

    @Test
    void getCurrentWaitingTime_Right_FirstTestingSite() throws Exception {

        getCurrentWaitingTimeDao getTime1 = new getCurrentWaitingTimeDao();


        assertEquals("60",getTime1.getCurrentWaitingTime().get(3).getWaiting_time());
    }

    @Test
    void getCurrentWaitingTime_Right_SecondTestingSite() throws Exception {

        getCurrentWaitingTimeDao getTime2 = new getCurrentWaitingTimeDao();


        assertEquals("10",getTime2.getCurrentWaitingTime().get(6).getWaiting_time());
    }

    @Test
    void getCurrentWaitingTime_Wrong() throws Exception {

        getCurrentWaitingTimeDao getTime2 = new getCurrentWaitingTimeDao();


        assertNotEquals("10",getTime2.getCurrentWaitingTime().get(7).getWaiting_time());
    }
}