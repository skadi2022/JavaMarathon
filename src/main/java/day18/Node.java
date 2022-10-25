package day18;

public class Node {
    private int value;
    private Node leftBranch;
    private Node rightBranch;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftBranch() {
        return leftBranch;
    }

    public Node getRightBranch() {
        return rightBranch;
    }

    public void setLeftBranch(Node leftBranch) {
        this.leftBranch = leftBranch;
    }

    public void setRightBranch(Node rightBranch) {
        this.rightBranch = rightBranch;
    }
}
