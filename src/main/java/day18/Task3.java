package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int number : numbers) {
            addNode(number, root);
        }

        showNumbersTree(root);
    }

    private static void addNode(int number, Node root) {
        Node nextNode = root;
        Node countNode = null;

        while (nextNode != null) {
            countNode = nextNode;
            if (number < countNode.getValueNode()) {
                nextNode = countNode.getNodeLeft();
            } else nextNode = countNode.getNodeRight();
        }
        if (number < countNode.getValueNode()) {
            countNode.setNodeLeft(new Node(number));
        } else countNode.setNodeRight(new Node(number));
    }

    private static void showNumbersTree(Node node) {
        if (node == null) return;

        showNumbersTree(node.getNodeLeft());
        System.out.print(node.getValueNode() + " ");
        showNumbersTree(node.getNodeRight());
    }
}
