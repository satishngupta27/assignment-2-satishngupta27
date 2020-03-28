/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {

    Node front, rear;

    public MyPriorityQueue() {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    public void enqueue(Object obj) {

        // Create a new LL node
        Node temp = new Node(obj);

        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        // Add the new node at the end of queue and change rear
        this.rear.setNext(temp);
        this.rear = temp;
    }

    // method to sort queue

    // Method to remove an key from queue.
    public Node dequeue() {

        // If queue is empty, return NULL.
        if (this.front == null)
            return null;

        // Store previous front and move front one node ahead
        Node temp = this.front;
        this.front = this.front.getNext();


        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
        return temp;
    }


}
