package random;

import java.util.Random;

public class Default implements Generator{

	private Random random;

	public Default() {
		this.random = new Random();
	}

	@Override
	public float next() {
		float result = random.nextFloat();
		return result;
	}
	
	/*
	@Override
	public double next() {
		// TODO Auto-generated method stub
		double seed=Math.random();
		return seed;
	}
	*/

}
