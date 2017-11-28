package random;
import java.util.Random;

public class Binomial implements Generator{

	private int n;
	private float p;
	private Random nr;

	public Binomial(int n, float p) {
		this.n = n;
		this.p = p;
		this.nr = new Random();
	}

	@Override
	public float next() {
		int x = 0;
		float u = 0f;
		for (int i=0;i<n;i++) {
			u = nr.nextFloat();
			if (u < p) {
				x++;
			}
		}
		float rezultat = (float) (x/(n-1));
		return rezultat;
	}
}
