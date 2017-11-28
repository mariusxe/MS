package random;

public class MiddleSquare implements Generator{
	
	//double  newSeed;
	private int seed = 0;
	private int n = 0;

	public MiddleSquare(int seed) {
		this.seed = seed;
		this.n = nrCifre(seed);
	}
	
	public int nrCifre(int nr) {
		int counter = 0;
		while (nr!=0) {
			nr=nr/10;
			counter++;
		}
		return counter;
	}
	
	public int pow(int baza, int putere) {
		int rezultat = 1;
		for (int i=0;i<putere;i++) {
			rezultat=rezultat*baza;
		}
		return rezultat;
	}
	
	/*
	@Override
	public double next() {
		newSeed= ((seed*seed)/Math.pow(10,n/2))%Math.pow(10, n);
		System.out.println("MiddleSquarenewSeed "+ newSeed);
		seed=newSeed;
		System.out.println("MiddleSquare "+ seed);
		return seed/Math.pow(10, n);
	}
	*/
	
	@Override
	public float next() {

		int newSeed = 0;
		newSeed = ((seed*seed)/pow(10,n/2)%pow(10,n));
		if (seed == newSeed) {
			newSeed = newSeed + 1;
		}
		if (newSeed<pow(10,n-1)) {
			newSeed = newSeed+pow(10,n-1);
		}
		seed = newSeed;
		float result = (float)newSeed/pow(10,n);
		return result;
	}

}
