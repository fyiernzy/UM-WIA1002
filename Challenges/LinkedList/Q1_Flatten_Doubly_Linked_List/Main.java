package Scratch;

public class Main {
    public static void main(String[] args) {
        Node head;
        String format = "%20s : %s\n";


        head = NodeUtil.toNodeList("[1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]");
        System.out.printf(format, "Input", NodeUtil.toString(head));
        NodeUtil.flattenIterative(head);
        System.out.printf(format, "Iterative flatten", NodeUtil.toString(head));

        head = NodeUtil.toNodeList("[1,2,null,3]");
        System.out.printf(format, "Input", NodeUtil.toString(head));
        NodeUtil.flattenRecursive(head);
        System.out.printf(format, "Recursive flatten", NodeUtil.toString(head));
    }
}
