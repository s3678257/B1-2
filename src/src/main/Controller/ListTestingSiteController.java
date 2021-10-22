package Controller;

import Dao.getTestingSiteSuburbDao;
import Dao.getTestingSiteInfoDao;
import Dao.getAllTestingSiteDao;
import Dao.getMoreInfoDao;
import Dao.getTestingSiteLocationDao;
import model.TestingSite;

import java.util.List;

public class ListTestingSiteController {
    public static void main(String[] args) throws Exception{
        List<TestingSite> allTestingSites = getAllTestingSiteDao.getAllTestingSite();

        for (int i = 0; i< getAllTestingSiteDao.getAllTestingSite().size(); i++){
            System.out.println("----------------");
            System.out.println("Location:" + allTestingSites.get(i).getLocation()
                    + " Status:" + allTestingSites.get(i).getStatus()
                    + " Number of people:" + allTestingSites.get(i).getNum_people()
                    + " Current Waiting time:" + allTestingSites.get(i).getWaiting_time()
                    + " Distance:" + allTestingSites.get(i).getDistance());
        }

        List<TestingSite> TestingSitesInfo = getTestingSiteInfoDao.getTestingSiteInfo();
        for (int i = 0; i< getTestingSiteInfoDao.getTestingSiteInfo().size(); i++){
            System.out.println("----------------");
            System.out.println(TestingSitesInfo.get(i).getLocation());
        }

        List<TestingSite> TestingSitesMoreInfo = getMoreInfoDao.getMoreInfo();
        for (int i = 0; i< getMoreInfoDao.getMoreInfo().size(); i++){
            System.out.println("----------------");
            System.out.println(TestingSitesMoreInfo.get(i).getOpeningHour());
        }

        List<TestingSite> TestingSitesLocation = getTestingSiteLocationDao.getTestingSiteLocation();
        for (int i = 0; i< getTestingSiteLocationDao.getTestingSiteLocation().size(); i++){
            System.out.println("----------------");
            System.out.println(TestingSitesLocation.get(i).getLocation());
        }

        List<TestingSite> TestingSitesSuburb = getTestingSiteSuburbDao.getTestingSiteSuburb();
        for (int i = 0; i< getTestingSiteSuburbDao.getTestingSiteSuburb().size(); i++){
            System.out.println("----------------");
            System.out.println(TestingSitesSuburb.get(i).getLocation());
        }
    }
}
