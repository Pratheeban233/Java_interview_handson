package DSA;

class Main1 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(3);
        tree.insert(10);
        tree.insert(4);
        tree.insert(7);
        tree.insert(71);

        tree.inOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
    }
}

public class BinaryTree {
    TreeNode root;

    public void insert(int data) {
        root = insertRecursion(root, data);
    }

    private TreeNode insertRecursion(TreeNode root, int data) {

        if (root == null) {
            root = new TreeNode(data);
        } else if (data < root.data) {
            root.left = insertRecursion(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursion(root.right, data);
        }

        return root;
    }

    public void inOrder() {    // left -> root -> right
        inOrderRecursion(root);
    }

    public void inOrderRecursion(TreeNode root) {
        if (root != null) {
            inOrderRecursion(root.left);
            System.out.print(root.data + " ");
            inOrderRecursion(root.right);
        }
    }

    public void preOrder() {    // root -> left -> right
        preOrderRecursion(root);
    }

    public void preOrderRecursion(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRecursion(root.left);
            preOrderRecursion(root.right);
        }
    }

    public void postOrder() {    // left -> right -> root
        postOrderRecursion(root);
    }

    public void postOrderRecursion(TreeNode root) {
        if (root != null) {
            postOrderRecursion(root.left);
            postOrderRecursion(root.right);
            System.out.print(root.data + " ");
        }
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}