package LinkedList;/* Created By IntelliJ IDEA
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

            System.out.println("Enter " + numberOfValues + " more values to insert: ");
            int value = scanner.nextInt();

            System.out.println("Where you want the value to be inserted? Please enter the choice as mentioned below: ");
            System.out.println("1. At the Start.");
            System.out.println("2. At the End.");
            System.out.println("3. At some random index.");
            int choice = scanner.nextInt();

            if (choice == 1) {
                list.insertAtStart(value);
            }
            /*System.out.println("Where you want to insert this value?" +
                    "1. At Start." +
                    "2. At End" +
                    "3. At some random index");
            int choice = scanner.nextInt();
            if (choice == 1) {
                list.insertAtStart(value);
            } else if (choice == 2) {
                list.insertAtEnd(value);
            } else if (choice == 3) {
                System.out.println("Enter the index at which you want to insert the value: ");
                int indexValue = scanner.nextInt();
                list.insertAt(indexValue, value);
            } else {
                System.err.println("Wrong Choice!");
            */
        }
            numberOfValues -= 1;
        System.out.println("The final list is: ");
        list.print();
    }
}
