package random;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Generator middleSquare  = new MiddleSquare(5197);
		Generator lcg  = new LCG(27, 17, 43, 100);
		Generator def = new Default();
		Generator poisson = new Poisson(100, 26.0f);
		Generator binomial = new Binomial(10,0.2f);
		
		CGenerator generate = new CGenerator();
		generate.run(middleSquare);
		generate.run(lcg);
		generate.run(def);
		generate.run(poisson);
		generate.run(binomial);

		System.out.print("Cate puncte se vor folosi pt evaluare: ");
		Scanner scanner = new Scanner(System.in);
		//int nrPuncte;
		
		int nrPuncte = scanner.nextInt();
		
		scanner.close();
		
		Evaluator evaluator1 = new Evaluator(middleSquare);
		evaluator1.evaluate(nrPuncte);
		
		Evaluator evaluator2 = new Evaluator(def);
		evaluator2.evaluate(nrPuncte);
		
		Evaluator evaluator3 = new Evaluator(lcg);
		evaluator3.evaluate(nrPuncte);
	}
}