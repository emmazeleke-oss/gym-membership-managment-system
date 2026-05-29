import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Choose membership:");
        System.out.println("1 = Basic");
        System.out.println("2 = VIP");
        System.out.println("3 = Premium");

        int choice = input.nextInt();

        Member m;

        if (choice == 1) {
            m = new Member(name, phone, age);

        } else if (choice == 2) {
            m = new VIPMember(name, phone, age);

        } else {
            m = new PremiumMember(name, phone, age);
        }

        System.out.println("\n--- Membership Result ---");

        m.showPackage();

        System.out.println("Thank you for joining the gym!");
    }
}