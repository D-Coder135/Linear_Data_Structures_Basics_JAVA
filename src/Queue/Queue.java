/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 26-11-2020
 *  Time: 10:17 PM
 */
package Queue;

public class Queue {
    // Queue in Data structures follow FIFO: First In First Out.
    // In a Queue there are two ends -->
    // First end is from where the values will be inserted. And Second end is from where the values will be removed.

    // There are two main terms related to a Queue in Data Structures -->
    // 1. Front(Represents the Front End of the Queue)
    // 2. Rear(Represents the back end of the Queue)

    // Queue can be implemented in JAVA using --> 1. Arrays & 2. LinkedList
    // Here, Queue is implemented using arrays.


    // In Queue, when we add something then that process is known as enqueue. (Just like push in stack)
    // And when we delete or remove values from it, then that is known as dequeue. (Just like pop in stack)

    int[] queue = new int[5];
    int size; // To store the size of the queue.
    int front; // To Store the index of the value present at the front end of the queue.
    int rear;
}
