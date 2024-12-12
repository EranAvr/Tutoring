package others.BST;


/*
    Tutorial: https://www.baeldung.com/java-binary-tree
 */

public class BST {
    public static enum Scheme {IN_ORDER, PRE_ORDER, POST_ORDER};
    Node root;

    public BST() {
        this.root = null;
    }


    // ----------------------------------   INSERT VALUE   ----------------------------------
    public void insert(int value){
        root = insertRecursive(root, value);
    }
    private Node insertRecursive(Node current, int value){
        // base case-
        if (current == null)
            return new Node(value);
        if (value < current.value){
            current.left = insertRecursive(current.left, value);
        }
        else if(value > current.value) {
            current.right = insertRecursive(current.right, value);
        }
        else {  // the else block is actually redundant, because either way the next command is 'return current' .
            // value already exists
            return current;
        }
        // return current node that entered 'if' blocks-
        return current;
    }


    // ----------------------------------   SEARCH VALUE   ----------------------------------
    public boolean search(int value){
        return searchRecursive(root, value);
    }
    private boolean searchRecursive(Node current, int value){
        /*
            Q: Why does it work?
            A: Notice, that in a Binary Search tree, the path
            to a certain value is unique. That is, because in every node
            we know exactly if the value should be in the left subtree, or the right subtree.
            In that case, the return value can come only from
            one of the following cases:
                1) value not found.In this case, we will end up in a leaf-node,
                then enter a null-node and return 'false'.
                2) value found. In this case, we will return 'true'.

            either way, the single returned value will bubble up the recursion tree,
            all the way to the root, and back to the user.
         */
        if (current == null)
            return false;

        else if (current.value == value)
            return true;

        return value < current.value ?
                searchRecursive(current.left, value) :
                searchRecursive(current.right, value);
    }


    // ----------------------------------   DELETE NODE   ----------------------------------
    public void remove(int value){
        root = removeRecursive(root, value);
    }
    /*
        The deletion algorithm works as following:
         The general searching process is similar to that of the insertion.
         We traverse the tree recursively.
         If null is reached we return null, if no stopping condition is reached
         then we keep on traversing.
         If deletion node is found, we follow the next cases:
            1)  Node is a leaf.
                Set its reference to null, and disconnect it from tree.
            2)  Node has a single child
                Release node's memory and return its child to replace it.
            3)  Node has two children
                We want to replace it with a node that is bigger than all left-subtree,
                and smaller than all right-subtree.
                For that, we have 2 options:
                * rightmost node in left subtree (largest among smaller tree)
                * leftmost node in right subtree (smallest among larger tree)
                By replacing target node with one of the above,
                we keep the Binary Search tree formation, and can now delete
                it as a leaf!
     */
    private Node removeRecursive(Node current, int value){
        if (current == null)    // leaf reached, value not found.
            return null;
        if (value == current.value) {    // found node to delete
            if(current.left == null && current.right == null){  // leaf node
                return null;
            }
            else if (current.right == null) {   // node has only left child
                current = current.left;
            }
            else if (current.left == null) {   // node has only right child
                current = current.right;
            }
            else {  // node has 2 children
                int smallestVal = findLeftmostValue(current.right); // retrieve smallest value in right (large) subtree
                current.value = smallestVal;    // replace current node's value, instead of deleting it
                current.right = removeRecursive(current.right, smallestVal);    // delete the smallest node in right tree. That is the node we copied its value
                return current; // return current node, to build (update) the BST after deletion
            }
        }
        if (value < current.value) {
            current.left = removeRecursive(current.left, value);
        }
        else {
            current.right = removeRecursive(current.right, value);
        }
        return current;
    }
    private int findLeftmostValue(Node current){
        /*
            This method is digging into left nodes, in order
            to retrieve the smallest value in a subtree.
            We traverse recursively until a leaf is found (its left ref is null),
            and bubble up its value.
         */
        if (current.left == null)
            return current.value;
        return findLeftmostValue(current.left);
    }


    // ----------------------------------   TRAVERSING METHODS   ----------------------------------
    public void print(Scheme sc){
        switch (sc) {    // 'enhanced switch' syntax
            case IN_ORDER -> inOrderRecursiveTraversing(root);
            case PRE_ORDER -> preOrderRecursiveTraversing(root);
            case POST_ORDER -> postOrderRecursiveTraversing(root);
        };
        System.out.println();
    }
    /*
        The following methods demonstrate different traversing methods,
        on Binary Search tree.
        The key difference between the methods, is where (or when)
        we read the value of the current node.

        In this example we print the value, but any other calculation
        can take place instead.
     */
    private void inOrderRecursiveTraversing(Node current){
        if (current == null)
            return;

        inOrderRecursiveTraversing(current.left);
        // inorder => check current node value in its right order-
        System.out.print(current.value+" ");
        inOrderRecursiveTraversing(current.right);
    }
    private void preOrderRecursiveTraversing(Node current){
        if (current == null)
            return;

        // preorder => check current node value before its children-
        System.out.print(current.value+" ");
        preOrderRecursiveTraversing(current.left);
        preOrderRecursiveTraversing(current.right);
    }
    private void postOrderRecursiveTraversing(Node current){
        if (current == null)
            return;

        postOrderRecursiveTraversing(current.left);
        postOrderRecursiveTraversing(current.right);
        // post order => check current node value after its children-
        System.out.print(current.value+" ");
    }
}
