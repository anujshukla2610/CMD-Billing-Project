import java.util.*;

public class GarageService {
    private Map<String, Customer> customersMap;
    private List<Services> availableServices;

    public GarageService() {
        this.customersMap = new HashMap<>();
        this.availableServices = new ArrayList<>();
        loadServices();
    }

    public void loadServices(){
        availableServices.add(new Services("Car Wash", 250));
        availableServices.add(new Services("Oil change", 850));
        availableServices.add(new Services("Wheel Alignment", 350));
        availableServices.add(new Services("Tyre Replacement", 3000));
        availableServices.add(new Services("Extra functionality", 1000));
        availableServices.add(new Services("Punchar", 80));
    }

    public void addCustomer(String name, String phone, String carNumber, String model) {
        Car car = new Car(carNumber, model);
        Customer customer = new Customer(name, phone, car);
        customersMap.put(carNumber, customer);
        System.out.println("Customer added successfully !");
    }

    public void createInvoice(String carNumber) {
        if (!customersMap.containsKey(carNumber)) {
            System.out.println("Customer not found with this car number !"+ carNumber);
            return;
        }
        Scanner sc = new Scanner(System.in);
        Customer customer = customersMap.get(carNumber);
        Invoice invoice = new Invoice(customer);

        System.out.println("Available services :");
        for(int i=0; i<availableServices.size(); i++) {
            System.out.println((i+1)+" - "+availableServices.get(i).getServiceName()+ " - ₹"+availableServices.get(i).getPrice());
        }

        while (true){
            System.out.println("Enter service number to add or 0 to finish :");
            int choice = sc.nextInt();
            if(choice == 0) break;
            if(choice>=0 && choice<=availableServices.size()) {
                invoice.addService(availableServices.get(choice-1));
                System.out.println("Service Done");
            }
            else{
                System.out.println("Invalid choice. Try again !");
            }
        }
        invoice.printInvoice();
    }
}
