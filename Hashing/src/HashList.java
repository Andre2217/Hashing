
public class HashList {
	LinkedList table[];

	public HashList(int size) {
		table = new LinkedList[size];
	}

	public void initializingList() {
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList();
		}
	}

	public int HashFunction(int num, int size) {
		return num % size;
	}

	public void Add(int num, int size) {
		int position = HashFunction(num, size);
		table[position].addAtEnd(num);
	}

	public void showHash() {
		for (int i = 0; i < table.length; i++) {
			table[i].show(i);
		}
	}
}
