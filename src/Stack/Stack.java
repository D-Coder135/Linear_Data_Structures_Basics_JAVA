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

    public void push(int data) {
        stack[top] = data;
    }
}
