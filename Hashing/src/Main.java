import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many test cases?");
		int N = input.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println("How many slots is going to be in the Hash?");
			int size = input.nextInt();
			HashList hash = new HashList(size);
			hash.initializingList();
			System.out.println("How many numbers is going in the hash?");
			int C = input.nextInt();
			System.out.println("What are those numbers?(You can type them and separte by space. Ex: 14 15 3 25 67 45...)");
			for (int j = 0; j < C; j++) {
				int num = input.nextInt();
				hash.Add(num, size);
			}
			hash.showHash();
			if (i + 1 != N) {
				System.out.println();
			}
		}
	}
}
