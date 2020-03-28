/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private static Node rear;
    private static int size;

    public MyCircularQueue() {
        rear = null;
        size = 0;
    }

    public static boolean dequeue() {
        boolean response = false;
        if (!isEmpty()) {
            size--;
            response = true;
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(rear.getNext().getNext());
            }
        }
        return response;
    }

    public Node getRear() {
        return rear;
    }

    private static boolean isEmpty() {
        boolean response = false;
        if (rear == null)
            response = true;
        return response;
    }

    public void enqueue(Student data) {
        Node node = new Node(data);
        if (isEmpty()) {
            rear = node;
            size++;
            node.setNext(node);
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;
        }

    }

    public int getSize() {
        return size;
    }

    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = rear.getNext();
        }
        return response;
    }


}
