package Class_Object.Task_2;

public class EthernetAdapter extends Device{
    private String mac;
    private int speed;

    public EthernetAdapter(String mac, int speed, String manufacturer, String serialNumber, float price) {
        super(manufacturer, serialNumber, price);
        this.mac = mac;
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
