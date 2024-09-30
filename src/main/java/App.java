import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static ArrayList<SportApp> log = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;


        while (run) {
            System.out.println("1. Add new sport activity");
            System.out.println("2. Show all sport activities");
            System.out.println("3. Total time on activities");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    addSport(scanner);
                    break;
                case 2:
                    showSports();
                    break;
                case 3:
                    totalTime();
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        scanner.close();
    }

    private static void addSport(Scanner scanner) {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter duration (hours):");
        int duration = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter day of sport:");
        String day = scanner.nextLine();

        SportApp sport = new SportApp(name, duration, day);
        log.add(sport);
        System.out.println("Sport added");
    }

    private static void showSports() {
        for (SportApp sport : log) {
            System.out.println(sport);
        }
    }

    private static void totalTime() {
        int total = 0;
        for (SportApp sport : log) {
            total += sport.getDuration();
        }
        System.out.println("Total time spent: " + total + " hours");
    }
}
