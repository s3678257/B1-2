package Test;

import Dao.getMoreInfoDao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getMoreInfoDaoTest {

    @Test
    void getMoreInfo_RightInfo() {

        getMoreInfoDao getMore = new getMoreInfoDao();

        assertAll(
                () -> assertEquals("Walk-in clinic", getMore.getMoreInfo().get(0).getSiteType()),
                () -> assertEquals("Opening", getMore.getMoreInfo().get(1).getStatus()),
                () -> assertEquals("+61 3 9448 5528", getMore.getMoreInfo().get(2).getPhoneNum())


        );
    }

    @Test
    void getMoreInfo_WrongInfo() {

        getMoreInfoDao getMore = new getMoreInfoDao();

        assertAll(
                () -> assertNotEquals("Walk-in clinic", getMore.getMoreInfo().get(3).getSiteType()),
                () -> assertNotEquals("Close", getMore.getMoreInfo().get(4).getStatus()),
                () -> assertNotEquals("+61 3 9699 3362", getMore.getMoreInfo().get(5).getPhoneNum())


        );
    }
}