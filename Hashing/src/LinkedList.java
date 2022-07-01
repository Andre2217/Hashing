
public class LinkedList {
	Node first;
	Node last;

	public LinkedList() {
		first = null;
		last = null;
	}

	public void addAtEnd(int num) {
		Node fresh = new Node(num);
		if (first == null) {
			first = fresh;
			last = fresh;
		} else {
			last.next = fresh;
			last = fresh;
		}
	}

	public void show(int i) {
		Node current = first;
		System.out.print(i + " -> ");
		while (current != null) {
			System.out.print(current.num + " -> ");
			current = current.next;
		}
		System.out.println("\\");
	}
}
