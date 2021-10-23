package Test;

import Dao.getAllTestingSiteDao;

import static org.junit.jupiter.api.Assertions.*;

class getAllTestingSiteDaoTest {

    @org.junit.jupiter.api.Test
    void getAllTestingSite_RightInfo() {

        getAllTestingSiteDao getAll1 = new getAllTestingSiteDao();

        assertAll(
                () -> assertEquals("40", getAll1.getAllTestingSite().get(0).getWaiting_time()),
                () -> assertEquals("0.75", getAll1.getAllTestingSite().get(0).getDistance()),
                () -> assertEquals("8", getAll1.getAllTestingSite().get(0).getNum_people()),

                () -> assertEquals("20", getAll1.getAllTestingSite().get(2).getWaiting_time()),
                () -> assertEquals("12", getAll1.getAllTestingSite().get(2).getDistance()),
                () -> assertEquals("4", getAll1.getAllTestingSite().get(2).getNum_people())

        );

    }

    @org.junit.jupiter.api.Test
    void getAllTestingSite_WrongInfo() {

        getAllTestingSiteDao getAll2 = new getAllTestingSiteDao();

        assertAll(
                () -> assertNotEquals("34", getAll2.getAllTestingSite().get(0).getWaiting_time()),
                () -> assertNotEquals("346", getAll2.getAllTestingSite().get(5).getDistance()),
                () -> assertNotEquals("6", getAll2.getAllTestingSite().get(7).getNum_people()),

                () -> assertNotEquals("AA", getAll2.getAllTestingSite().get(1).getSiteType()),
                () -> assertNotEquals("BB", getAll2.getAllTestingSite().get(4).getLocation()),
                () -> assertNotEquals("CC", getAll2.getAllTestingSite().get(6).getSuburb())

        );

    }
}