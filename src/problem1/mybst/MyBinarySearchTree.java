/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;

    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (data < current.getData()) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    private void printPreorder(TreeNode node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.getData() + " ");

        /* then recur on left sutree */
        printPreorder(node.getLeft());

        /* now recur on right subtree */
        printPreorder(node.getRight());
    }


    private void printPostorder(TreeNode node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.getLeft());

        // then recur on right subtree
        printPostorder(node.getRight());

        // now deal with the node
        System.out.print(node.getData() + " ");
    }

    private void printInorder(TreeNode node) {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.getLeft());

        /* then print the data of node */
        System.out.print(node.getData() + " ");

        /* now recur on right child */
        printInorder(node.getRight());
    }

    // wrapper over recursive funtion
    public void printPreorder() {
        printPreorder(this.root);
    }

    public void printPostorder() {
        printPostorder(this.root);
    }

    public void printInorder() {
        printInorder(root);
    }


}
