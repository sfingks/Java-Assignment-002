/**     *@author Trevor Hartman
        * @author MK Ripley
        *
        * @since Version 1.0
        * 1/28/2023
*/
import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please type the number of sides:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 1) {
                break;
            }
            if (n > 999999999) {
                break;
            }
            double a = 180.0 / n;
            double s = Math.sin(Math.toRadians(a));
            double pi = n * s;
            System.out.printf("Our Pi estimate is: %.10f%n", pi);
        }
    }
}