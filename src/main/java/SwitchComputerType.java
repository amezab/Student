import java.util.Scanner;

public class SwitchComputerType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter computer type (Desktop, Laptop, Tablet, Server): ");
        String computerType = scanner.nextLine();

        computerType = computerType.toLowerCase();


       String description =  switch (computerType) {
            case "desktop" -> "You selected a Desktop computer.";
            case "laptop"  -> "You selected a Laptop computer.";
            case "tablet"  -> "You selected a Tablet computer.";
            case "server"  -> "You selected a Server computer.";
            default  -> "Unknown computer type selected.";
        };

        System.out.println(description);


        scanner.close();
    }

}
