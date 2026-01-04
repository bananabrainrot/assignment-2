import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FleetApp {
    private List<Vehicle> vehicles;
    private Scanner scanner;

    public FleetApp(){
        this.scanner = new Scanner(System.in);
        this.vehicles = new ArrayList<>();

    }

    public static void main(String[] args){
        FleetApp app = new FleetApp();
        app.run();
    }

    public void run(){
        while (true){
            System.out.println("=====================================");
            System.out.println("1. Print all vehicles");
            System.out.println("2. Add new car");
            System.out.println("3. Add new bus");
            System.out.println("4. Show total yearly insurance fees");
            System.out.println("5. Perform service for all vehicles");
            System.out.println("6. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:

            }
        }
    }
}
