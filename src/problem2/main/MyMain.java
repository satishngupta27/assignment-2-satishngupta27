/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
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

        bt.printPreorder();
        System.out.println();
        bt.printPostorder();
        System.out.println();
        System.out.println("The first for preordertraversal and last element for postoredertraversal is same so a: True");
        System.out.println();
        System.out.println("the traversal will not give same element at the mid position for odd number of nodes in preorder and postorder traversal hence b:False");

    }
}
