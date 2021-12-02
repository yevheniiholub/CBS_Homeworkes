package Class_Object.Task_3;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(int resolutionX, int resolutionY, String manufacturer, String serialNumber, float price) {
        super(manufacturer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor :"
                + "manufacturer =" + getManufacturer()
                + ", price=" + getPrice()
                + ", serialNumber=" + getSerialNumber()
                + ", resolutionX=" + resolutionX
                + ", resolutionY=" + resolutionY;
    }
}
