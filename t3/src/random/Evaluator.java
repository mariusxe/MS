package random;
import java.lang.Math;


public class Evaluator {
	
	private Generator generator;

	public Evaluator(Generator generator) {
		this.generator = generator;
	}

	public double evaluate(int nrPuncte) {

		int nrPuncteInCerc = 0;
		Point origine = new Point(0, 0);
		for (int i=0;i<nrPuncte;i++) {
			Point point = new Point(generator.next(), generator.next());
			if (point.distanceTo(origine) < 1) {
				nrPuncteInCerc++;
			}
		}
		System.out.println("Puncte in sfertul de cerc: " + nrPuncteInCerc);
		double result = Math.PI-nrPuncteInCerc/(nrPuncte/4);
		System.out.println();
		System.out.println("Raportul generat este: " + result);
		return result;
	}
}
