package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyLinkedList {
	Node first = null;
	MyLinkedList() {}

	public int get(int i) {
		Node n = first;
		for (int j = 0; j < i; j++) {
			n = n.next;
		}
		return n.value;
	}

	public void add(int i) {
		Node n = new Node(i);
		if (Objects.isNull(first)) {
			n.before = null;
			first = n;
		} else {
			Node node = first;
			while (Objects.nonNull(node.next)) {
				node = node.next;
			}
			node.next = n;
			n.before = node;
		}
	}

	public String toString() {
		if (Objects.isNull(first)) return "";
		StringBuilder sb = new StringBuilder(Integer.toString(first.value));
		Node n = first.next;
		while (Objects.nonNull(n)) {
			sb.append(" ");
			sb.append(Integer.toString(n.value));
			n = n.next;
		}
		return sb.toString();
	}

	public void deleteDuplication() {
		if (Objects.isNull(first)) return;
		Node n = first;
		while (Objects.nonNull(n)) {
			Node next = n.next;
			while (Objects.nonNull(next)) {
				if (n.value == next.value) {
					next.before.next = next.next;
					next.next.before = next.before;
				}
				next = next.next;
			}
			n = n.next;
		}
	}

	public int getFromBackAt(int x) {
		int size = 0;
		Node n = first;
		List<Integer> list = new ArrayList<>();
		do {
			list.add(n.value);
			n = n.next;
			size++;
		} while (Objects.nonNull(n));
		System.out.println(size);
		if (size < x) {
			throw new IndexOutOfBoundsException("x = " + x);
		}
		return list.get(size - x);
	}

	class Node {
		int value;
		Node before;
		Node next;
		Node(int i) {
			this.value = i;
		}
	}
}
