package random;
import java.util.Random;

public class Poisson implements Generator{

	private int k;
	private float p;
	private Random nr;
	private float L;
	private float lambda;
	private int n;

	public Poisson(int n, float lambda) {
		this.k = 0;
		this.p = 1f;
		this.n = n;
		this.lambda = lambda;
		this.nr = new Random();
		this.L = (float) Math.pow(Math.E, lambda);
	}

	@Override
	public float next() {
		do {
			k++;
			p = p*nr.nextFloat();
		} while (p>L && k<=n);
		int rezultat = (k-1)/(n);
		return rezultat;
	}

	
}
