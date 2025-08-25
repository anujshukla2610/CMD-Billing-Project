import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private Customer customer;

    private List<Services> servicesList;

    private double totalAmount;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.servicesList = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addService(Services service) {
        servicesList.add(service);
        totalAmount += service.getPrice();
    }

    public void printInvoice() {
        System.out.println("--------------- Invoice --------------");
        System.out.println();
        System.out.println("Customer: "+customer.getName()+ " | Phone: "+customer.getPhone()+" | Car: "+customer.getCar().getModel()+ " | Car Number: "+customer.getCar().getCarNumber());
        System.out.println("Services : ");

        for(int i=0; i<servicesList.size(); i++) {
            System.out.println((i+1)+ " - "+ servicesList.get(i).getServiceName() + ": ₹"+ servicesList.get(i).getPrice());
        }

        System.out.println("Total Amount : ₹"+totalAmount);
        System.out.println();
        System.out.println("---------------- Thank You ----------------");
    }
}
