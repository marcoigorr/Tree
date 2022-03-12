
public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    // GET
    public int getValue() {
        return value;
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }

    // SET
    public void setValue(int value) {
        this.value = value;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}
