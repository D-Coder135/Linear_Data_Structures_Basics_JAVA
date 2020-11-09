/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 09-11-2020
 *  Time: 07:18 PM
 */

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many values you want to insert?");
        int numberOfValues = scanner.nextInt();
        while (numberOfValues != 0) {
            System.out.println("Enter " + numberOfValues + "more values to insert: ");
            int value = scanner.nextInt();
        }
    }
}
