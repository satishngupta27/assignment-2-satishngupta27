package problem4.myqueue;

import problem4.node.Node;

public class MyQueue {
   private Node front, end, tmp;
   private int size;

   public MyQueue() {
      front = null;
      end = null;
      tmp = null;
      size = 0;

   }

   public int getSize(MyQueue queue) {
      queue.tmp = queue.front;
      while (queue.tmp != null) {
         ++size;
         queue.tmp = queue.tmp.getNext();
      }
      queue.tmp = queue.front;
      return size;

   }

   public void setSize(int size) {

      this.size = size;

   }

   public Node getFront() {

      return front;

   }


   public void setFront(Node front) {

      this.front = front;

   }


   public Node getEnd() {

      return end;

   }


   public void setEnd(Node end) {

      this.end = end;

   }


   public Node getTmp() {

      return tmp;

   }

   public void setTmp(Node tmp) {

      this.tmp = tmp;

   }

}