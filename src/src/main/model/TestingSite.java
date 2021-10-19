package model;

public class TestingSite {

    private String Suburb;
    private String Location;
    private String Waiting_time;
    private String Distance;
    private int Num_people;
    private String OpeningHour;
    private String SiteType;
    private String PhoneNum;
    private String Status;
    private String Limitation;


    public TestingSite() {
    }

    public TestingSite(String Suburb, String Location, String Waiting_time, String Distance, int Num_people, String OpeningHour, String SiteType, String PhoneNum, String Status, String Limitation) {
        this.Suburb = Suburb;
        this.Location = Location;
        this.Waiting_time = Waiting_time;
        this.Distance = Distance;
        this.Num_people = Num_people;
        this.OpeningHour = OpeningHour;
        this.SiteType = SiteType;
        this.PhoneNum = Suburb;
        this.Status = Location;
        this.Limitation= Waiting_time;
    }


    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getWaiting_time() {
        return Waiting_time;
    }

    public void setWaiting_time(String waiting_time) {
        Waiting_time = waiting_time;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String distance) {
        Distance = distance;
    }

    public int getNum_people() {
        return Num_people;
    }

    public void setNum_people(int num_people) {
        Num_people = num_people;
    }

    public String getOpeningHour() {
        return OpeningHour;
    }

    public void setOpeningHour(String openingHour) {
        OpeningHour = openingHour;
    }

    public String getSiteType() {
        return SiteType;
    }

    public void setSiteType(String siteType) {
        SiteType = siteType;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getLimitation() {
        return Limitation;
    }

    public void setLimitation(String limitation) {
        Limitation = limitation;
    }

    public String getSuburb() {
        return Suburb;
    }

    public void setSuburb(String suburb) {
        Suburb = suburb;
    }

}
