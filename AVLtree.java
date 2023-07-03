public class AVLtree {
    int key;
    int height;
    AVLtree left;
    AVLtree right;

    AVLtree(int key) {
        this.key = key;
        height = 1;
    }
}

class AVLTree {
    AVLtree root;

    int height(AVLtree node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    int balanceFactor(AVLtree node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    AVLtree rightRotate(AVLtree y) {
        AVLtree x = y.left;
        AVLtree T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    AVLtree leftRotate(AVLtree x) {
        AVLtree y = x.right;
        AVLtree T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    AVLtree insert(AVLtree node, int key) {
        if (node == null) {
            return new AVLtree(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node; // Duplicate keys are not allowed in AVL tree
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = balanceFactor(node);

        // Left-Left case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // Right-Right case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // Left-Right case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Left case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void inOrder(AVLtree node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("Inorder traversal of the constructed AVL tree:");
        tree.inOrder(tree.root);
    }
}
 {
    
}
