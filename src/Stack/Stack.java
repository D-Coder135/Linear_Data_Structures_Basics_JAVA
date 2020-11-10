/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 10-11-2020
 *  Time: 11:28 PM
 */
package Stack;

public class Stack {
    // A Stack is a arrangement in Data Structures which follows LIFO mechanism i.e Last In First Out!
    // Adding values/data to the stack is known as push.
    // Fetching values/data from the stack is known as pop.
    // We can also search values/data from a stack, which is known as peek.
    // Hence LIFO mechanism means we can only pull the last pushed element in a stack.

    // The last value/data which has been pushed in a stack in considered as top.

    // We will have to first create an array of size either dynamic i.e inputted by the end-user or fixed.

    int[] stack = new int[5]; // Created an array of fixed size.
    int top = 0;

    // Method to add or push values to the stack.
    public void pushElements(int data) {
        stack[top] = data; // Adding values to the array and making it as the top value of the stack.
        top++;
    }

    //Method to remove or pop the values from the stack.
    public int popElements() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    // Method to fetch or take out the value from the stack without removing that value.
    public int peekElement() {
        int data;
        data = stack[top - 1];
        return data;
    }
    /* The difference between pop and peek function is that -->
     *  When we pop any value from the stack, then that value is deleted from the stack and replaced by a zero.
     *  And when we peek any value from the stack then basically we are searching a value in the stack and fetching it
     *  without removing that value.
     */

    public void printStack() {
        for (int element : stack) {
            System.out.print(element + " ");
        }
    }
}
