package JavaInterestingThings;

import java.util.Random;
import java.util.stream.DoubleStream;

public class GaussianExample1 {
	
	public static void main(String[] args) {
		
		Random random=new Random();
		
		// Generate 1000 Gaussian values
		
		int numValues=1000;
		
		double[] gaussianValues=new double[numValues];
		
		for(int i=0; i<numValues ;i++) {
			
			gaussianValues[i]=random.nextGaussian();
			
		}
		
		// Print first 10 values
		
		System.out.println("First 10 Gaussian values : ");
		for(int i=0;i<10;i++) {
			System.out.println(gaussianValues[i]);
		}
		
		// calculate mean and standard deviation
		
		double mean=DoubleStream.of(gaussianValues).average()
				.orElse(0.0);
		
		 double stdDev = Math.sqrt(DoubleStream.of(gaussianValues)
                 .map(val -> Math.pow(val - mean, 2))
                 .average()
                 .orElse(0.0));
		 
		 System.out.println("Mean: " + mean);
	        System.out.println("Standard Deviation: " + stdDev);
	}

}
