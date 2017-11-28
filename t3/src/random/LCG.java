package random;

public class LCG implements Generator{
	
	private int seed;
	private int a;
	private int c;
	private int m;
	
	public LCG(int seed, int multiplicator, int increment, int module) {
		this.seed = seed;
		this.a = multiplicator;
		this.c = increment;
		this.m = module;
	}
	
	/*
	public int counter(double seed) {
		copieSeed=seed;
		while(copieSeed>0) {
			copieSeed=copieSeed/10;
			nrCifre++;
		}
		return nrCifre;
	}
	
	@Override
	public double next() {
		newSeed=(a*seed+c)%m;
		if(newSeed==seed) newSeed++;
		seed= newSeed;
		System.out.println("LCG "+ seed);
		return seed/Math.pow(10, nrCifre);
	}
	*/
	
	@Override
	public float next() {

		int newSeed = (a*seed+c)%m;
		if (seed==newSeed) {
			newSeed++;
		}
		seed = newSeed;
		float result = (float)newSeed/m;
		return result;
		}

}
