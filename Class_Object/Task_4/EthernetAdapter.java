package Class_Object.Task_4;

import java.util.Objects;

public class EthernetAdapter extends Device {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mac, speed);
    }
}
