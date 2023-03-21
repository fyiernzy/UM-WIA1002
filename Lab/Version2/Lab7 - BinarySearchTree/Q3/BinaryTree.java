package Lab7.Q3;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree<E extends Comparable<E>> {
	static class Node<E extends Comparable<E>> {
		E item;
		Node<E> left;
		Node<E> right;

		Node(E item) {
			this.item = item;
		}
	}

	Node<E> root;
	int size;

	public boolean add(E e) {
		Node<E> newNode = new Node<>(e);
		if (root == null) {
			root = newNode;
		} else {
			Node<E> parent = null;
			for (Node<E> node = root; node != null;) {
				if (e.compareTo(node.item) == 0)
					return false;
				parent = node;
				node = e.compareTo(node.item) > 0 ? node.right : node.left;
			}

			if (e.compareTo(parent.item) > 0)
				parent.right = newNode;
			else
				parent.left = newNode;
		}
		size++;
		return true;
	}

	public int getSize() {
		return size;
	}

	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node<E> node) {
		if (node != null) {
			System.out.printf(" <-- %s ", node.item);
			preOrder(node.left);
			preOrder(node.right);

		}
	}

	public void inOrder() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node<E> node) {
		if (node != null) {
			inOrder(node.left);
			System.out.printf(" <-- %s ", node.item);
			inOrder(node.right);
		}
	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node<E> node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.printf(" <-- %s ", node.item);
		}
	}

	public void levelOrder() {
		Queue<Node<E>> queue = new LinkedList<Node<E>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node<E> node = queue.poll();
			System.out.printf(" <-- %s ", node.item);
			/* add left child to the queue */
			if (node.left != null)
				queue.add(node.left);
			/* add right right child to the queue */
			if (node.right != null)
				queue.add(node.right);
		}
		System.out.println();
	}
}
