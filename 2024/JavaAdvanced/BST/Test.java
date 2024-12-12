package others.BST;

public class Test {
    public static void main(String[] args) {
        // Use our custom method to build a tree (create object and insert elements):
        // Tree visualization: https://www.baeldung.com/wp-content/uploads/2017/12/Tree-1.jpg
        BST bt = createBinaryTree();

        // Check traversing methods:
        System.out.println("Inorder traversing:");
        bt.print(BST.Scheme.IN_ORDER);
        System.out.println("Preorder traversing:");
        bt.print(BST.Scheme.PRE_ORDER);
        System.out.println("Post order traversing:");
        bt.print(BST.Scheme.POST_ORDER);

        // Check searching method:
        System.out.println("Search 8: " + bt.search(8));
        System.out.println("Search 7: " + bt.search(7));
        System.out.println("Search 11: " + bt.search(11));

        // Check deletion:
        bt.print(BST.Scheme.PRE_ORDER);
        bt.remove(9);
        bt.print(BST.Scheme.PRE_ORDER);
    }

    static private BST createBinaryTree() {
        BST bt = new BST();

        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);

        return bt;
    }
}
