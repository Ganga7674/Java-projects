class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
class GfG {
    static Node search(Node root, int key)
    {
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return search(root.right, key);
        return search(root.left, key);
    }
    public static void main(String[] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        System.out.println(search(root, 19) != null
                               ? "Found"
                               : "Not Found");
        System.out.println(search(root, 80) != null
                               ? "Found"
                               : "Not Found");
    }
}
