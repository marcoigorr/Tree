
public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    // Aggiunta nodo
    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        }

        else if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        }
        else {
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    // Stampa albero
    public String toString() {
        return toStringInOrder(root);
    }

    public String toStringInOrder(Node current) {
        String foo = "";
        if (current == null) {
            return "";
        }

        foo += toStringInOrder(current.getLeft());
        foo += current.getValue();
        foo += toStringInOrder(current.getRight());
        return foo;
    }
}
