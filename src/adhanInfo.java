
public class adhanInfo {
    
    
    private int prayerID;
    private String prayerName;
    private String prayerTime;

    public adhanInfo() {
    }
    

    public adhanInfo(int prayerID, String prayerName, String prayerTime) {
        this.prayerID = prayerID;
        this.prayerName = prayerName;
        this.prayerTime = prayerTime;
    }

    public int getPrayerID() {
        return prayerID;
    }

    public void setPrayerID(int prayerID) {
        this.prayerID = prayerID;
    }

    public String getPrayerName() {
        return prayerName;
    }

    public void setPrayerName(String prayerName) {
        this.prayerName = prayerName;
    }

    public String getPrayerTime() {
        return prayerTime;
    }

    public void setPrayerTime(String prayerTime) {
        this.prayerTime = prayerTime;
    }
    
    
    
}
