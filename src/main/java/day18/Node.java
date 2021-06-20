package day18;

public class Node {
    int valueNode;
    Node nodeRight;
    Node nodeLeft;

    public Node(int valueNode) {
        this.valueNode = valueNode;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public int getValueNode() {
        return valueNode;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    public Node getNodeLeft() {
        return nodeLeft;
    }
}
