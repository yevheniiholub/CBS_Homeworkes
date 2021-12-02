package Exceptions.Task_3;

public class Price {
    private String productName;
    private String storeName;
    private Integer price;

    public Price(String productName, String storeName, Integer price) {
        this.productName = productName;
        this.storeName = storeName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
