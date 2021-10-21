package Controller;

import Dao.TestingSiteDao;

public class ListTestingSiteController {
    public static void main(String[] args) throws Exception{
        System.out.println("----------------");
        System.out.println(TestingSiteDao.getAllTestingSite());
    }
}
