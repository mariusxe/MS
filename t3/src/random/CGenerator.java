package random;

import java.util.Scanner;

public class CGenerator {
	
	int counter;
	public CGenerator() {
		System.out.print("Nr de numere generate: ");
		Scanner scanner = new Scanner(System.in);
		this.counter = scanner.nextInt();
	}

	public void run(Generator generator) {

		System.out.println("Numerele generate: ");
		for (int i=0;i<counter;i++) {
			float result = generator.next();
			System.out.print(result + " ");
		}
		System.out.println();
	}
}
