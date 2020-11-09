/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (D-Coder135)
 *  Date: 09-11-2020
 *  Time: 06:44 PM
 */

public class LinkedList {

    // In Linked List, the first node is considered as the head node.
    Node head;

    public void insert(int data) {
        Node newNode = new Node(); // Every time data is inserted, it will be inserted in a new node.
        newNode.data = data;
        newNode.next = null;

        // If the value is inserted for the first time i.e. no other value was present before this value was added.
        // For that, checking the condition and assigning the node containing the first value as head.

        if (head == null) {
            head = newNode;
        } else {
            Node temporaryNode = head; // For traversing between different nodes.
            while (temporaryNode.next != null) {

                // This will travel from node to node in a series until the next block of the node contains null value.
                temporaryNode = temporaryNode.next;
            }
            temporaryNode.next = newNode; // This will make the next property of the node as not null.
        }
    }

    public void print() {

    }
}
