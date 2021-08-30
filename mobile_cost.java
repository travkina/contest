import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        String costs;
        if (Integer.parseInt(data[3]) <= Integer.parseInt(data[1]))
            costs = data[0];
        else {
            costs = Integer.toString((Integer.parseInt(data[3]) - Integer.parseInt(data[1]))
                    * Integer.parseInt(data[2]) + Integer.parseInt(data[0]));
        }
        System.out.println(costs);
    }
}
