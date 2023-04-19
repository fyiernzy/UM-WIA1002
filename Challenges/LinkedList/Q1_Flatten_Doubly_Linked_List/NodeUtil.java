package Scratch;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class NodeUtil {
    public static Node flattenRecursive(Node head) {
        Node current = head;
        if(head != null) {
            Node next = current.next;

            if (current.child != null) {
                current.next = flattenRecursive(current.child);
                current.child = null;
                current.next.prev = current;
                while(current.next != null) {
                    current = current.next;
                }
            }

            current.next = flattenRecursive(next);
            
        }
        return head;
    }

    public static Node flattenIterative(Node head) {
        Stack<Node> stack = new Stack<>();
        Node current = head;

        while (current != null || !stack.isEmpty()) {
            if (current.child != null) {
                stack.push(current.next);

                current.next = current.child;
                current.child = null;
                current.next.prev = current;

            } else if (current.next == null && !stack.isEmpty()) {
                Node next = stack.pop();
                current.next = next;
                if (next != null) {
                    next.prev = current;
                }
            }
            current = current.next;
        }
        return head;
    }

    public static String[] node2Array(Node head) {
        ArrayList<String> ls = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Node current = head;

        while (current != null) {
            ls.add(String.valueOf(current.val));

            if (current.child != null) {
                queue.add(current);
            }

            if (current.next == null && !queue.isEmpty()) {
                while (current != queue.peek()) {
                    current = current.prev;
                    ls.add("null");
                }
                current = queue.poll().child;
            } else {
                current = current.next;
            }
        }

        return ls.toArray(new String[ls.size()]);
    }

    public static void printNode(Node head) {
        System.out.println(toString(head));
    }

    public static String toString(Node head) {
        return Arrays.toString(node2Array(head));
    }

    public static Node toNodeList(String str) {
        String[] strArr = str.substring(1, str.length() - 1).split(",");
        Node head = null;

        if (!strArr[0].equals("null")) {
            Node current = new Node(Integer.parseInt(strArr[0]));
            head = current;
            boolean toChild = false;

            for (int i = 1; i < strArr.length; i++) {
                if (strArr[i].equals("null")) {
                    current = current.prev;
                    toChild = true;
                } else if (toChild) {
                    current.child = new Node(Integer.parseInt(strArr[i]));
                    current = current.child;
                    toChild = false;
                } else {
                    current.next = new Node(Integer.parseInt(strArr[i]));
                    current.next.prev = current;
                    current = current.next;
                }
            }
        }

        return head;
    }
}
