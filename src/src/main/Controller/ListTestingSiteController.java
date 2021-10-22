package Controller;

import Dao.*;
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

        List<TestingSite> TestingSitesInfo = getTestingSiteGeoInfoDao.getTestingSiteInfo();
        for (int i = 0; i< getTestingSiteGeoInfoDao.getTestingSiteInfo().size(); i++){
            System.out.println("----------------");
            System.out.println(TestingSitesInfo.get(i).getDistance());
        }

        List<TestingSite> TestingSitesMoreInfo = getMoreInfoDao.getMoreInfo();
        for (int i = 0; i< getMoreInfoDao.getMoreInfo().size(); i++){
            System.out.println("----------------");
            System.out.println(TestingSitesMoreInfo.get(i).getLimitation());
        }

        List<TestingSite> TestingSitesLocation = getTestingSiteLocationDao.getTestingSiteLocation();
        for (int i = 0; i< getTestingSiteLocationDao.getTestingSiteLocation().size(); i++){
            System.out.println("----------------");
            System.out.println("The location is: " + TestingSitesLocation.get(i).getLocation());
        }

        List<TestingSite> TestingSitesSuburb = getTestingSiteSuburbDao.getTestingSiteSuburb();
        for (int i = 0; i< getTestingSiteSuburbDao.getTestingSiteSuburb().size(); i++){
            System.out.println("----------------");
            System.out.println("The suburb name is: " + TestingSitesSuburb.get(i).getSuburb());
        }

        List<TestingSite> TestingSitesLimitation = getTestingSiteLimitationDao.getTestingSiteLimitation();
        for (int i = 0; i< getTestingSiteLimitationDao.getTestingSiteLimitation().size(); i++){
            System.out.println("----------------");
            System.out.println("The limitation is: " + TestingSitesLimitation.get(i).getLimitation());
        }

        List<TestingSite> TestingSitesWaitingTime = getCurrentWaitingTimeDao.getCurrentWaitingTime();
        for (int i = 0; i< getCurrentWaitingTimeDao.getCurrentWaitingTime().size(); i++){
            System.out.println("----------------");
            System.out.println("Current waiting time is: " + TestingSitesWaitingTime.get(i).getWaiting_time());
        }

        List<TestingSite> TestingSitesNumPeople = getNumOfPeopleDao.getNumOfPeople();
        for (int i = 0; i< getNumOfPeopleDao.getNumOfPeople().size(); i++){
            System.out.println("----------------");
            System.out.println("Number of people is: " + TestingSitesNumPeople.get(i).getNum_people());
        }
    }
}
