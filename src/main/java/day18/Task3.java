package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {20, 14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int number : numbers) {
            addNode(number, root);
        }

        dfs(root);
    }

    private static void addNode(int insertNumber, Node root) {
        if (root == null)
            throw new IllegalArgumentException("The root node cannot be 'null'");

        Node nextNode = root;
        Node current = null;

        while (nextNode != null) {
            current = nextNode;

            if (insertNumber < current.getValue())
                nextNode = current.getLeftBranch();
            else
                nextNode = current.getRightBranch();
        }

        if (insertNumber < current.getValue())
            current.setLeftBranch(new Node(insertNumber));
        else
            current.setRightBranch(new Node(insertNumber));
    }

    private static void dfs (Node node) {
        if (node == null)
            return;

        dfs(node.getLeftBranch());
        System.out.print(node.getValue() + " ");
        dfs(node.getRightBranch());

    }
}