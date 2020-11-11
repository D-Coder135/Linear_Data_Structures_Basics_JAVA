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
        int sizeOfTheStack = 5;
        while (sizeOfTheStack != 0) {
            System.out.println("Enter " + sizeOfTheStack + " more values to push in the stack!");
            int value = scanner.nextInt();
            stackObject.pushElements(value);
            sizeOfTheStack -= 1;
        }
        System.out.println("Stack after pushing the values ---> ");
        stackObject.printStack();
        System.out.println();

        System.out.println("Please enter your choice -->");
        System.out.println("1. Want to peek top value." + " " + " 2. Want to pop value." + " " +
                " 3. Want to check the size of the Stack." + " " + " Want to check weather the stack is Empty or not.");
        int choice = scanner.nextInt();

        if (choice == 1) {
            int value = stackObject.peekElement();
            System.out.println("Top most value of the stack is: " + value);
            System.out.println("Stack after peeking the value ---> ");
            stackObject.printStack();
        } else if (choice == 2) {
            int value = stackObject.popElements();
            System.out.println("Value popped from the stack is: " + value);
            System.out.println("Stack after popping the value ---> ");
            stackObject.printStack();
        } else if (choice == 3) {
            System.out.println("The size of the stack is: " + stackObject.size());
        } else if (choice == 4) {
            System.out.println("Stack is empty?");

        } else {
            System.err.println("Wrong Choice!");
        }
    }
}
