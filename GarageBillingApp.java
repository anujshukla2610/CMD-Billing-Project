import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("___________________ CAR ADDAA SERVICE CENTER 🎯___________________");

        while(running) {
            System.out.println("1. Add Customer🧑‍💼");
            System.out.println("2. Display Services 🛠️");
            System.out.println("3. Exit 📴");
            System.out.println("Enter your choice 📝 : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter Customer Name : ");
                    String Name = sc.next();
                    System.out.println("Enter Phone Number : ");
                    String PhoneNumber = sc.next();

                    System.out.println("Enter Car Number : ");
                    String CarNumber = sc.next();
                    System.out.println("Enter Car Model : ");
                    String CarModel = sc.next();
                    garageService.addCustomer(Name, PhoneNumber, CarNumber, CarModel);
                    break;

                    case 2:
                        System.out.println("Enter Car Number : ");
                        String CarNum = sc.next();
                        garageService.createInvoice(CarNum);
                        break;

                        case 3:
                            System.out.println("Exiting 👍......... Thank You!😊");
                            running = false;
                            break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
