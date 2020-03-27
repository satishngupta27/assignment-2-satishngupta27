/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bt = new MyBinarySearchTree();
        bt.insert(50);
        bt.insert(35);
        bt.insert(65);
        bt.insert(40);
        bt.insert(30);
        bt.insert(60);
        bt.insert(64);
        bt.insert(62);


        bt.printPreorder();
        System.out.println();
        bt.printPostorder();
        System.out.println();
        bt.printLeftChild();
    }

}
