/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 10-11-2020
 *  Time: 11:29 PM
 */
package Stack;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Stack stackObject = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your choice -->");
        System.out.println("1. Want to push values." + " " + " 2. Want to peek top value." + " " + " 3. Want to pop value.");
        int choice = scanner.nextInt();

        if (choice == 1) {
            int sizeOfTheStack = 5;
            while (sizeOfTheStack != 0) {
                System.out.println("Enter " + sizeOfTheStack + " more values to push!");
                int value = scanner.nextInt();
                stackObject.pushElements(value);
                sizeOfTheStack -= 1;
            }
            System.out.println("Stack after pushing the values ---> ");
            stackObject.printStack();
        } else if (choice == 2) {
            int value = stackObject.peekElement();
            System.out.println("Top most value of the stack is: " + value);
            System.out.println("Stack after peeking the value ---> ");
            stackObject.printStack();
        } else if (choice == 3) {
            int value = stackObject.popElements();
            System.out.println("Value popped from the stack is: " + value);
            System.out.println("Stack after popping the value ---> ");
            stackObject.printStack();
        } else {

        }
    }
}
