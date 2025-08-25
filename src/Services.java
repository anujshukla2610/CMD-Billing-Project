
public class Services {

    private String serviceName;

    private double Price;

    public Services(String serviceName, double price) {
        this.serviceName = serviceName;
        Price = price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getPrice() {
        return Price;
    }
}
