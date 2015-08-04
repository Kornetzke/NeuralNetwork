package blah;

import java.util.ArrayList;
import java.util.List;

public class PlayingWithConstructorsAndSetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Blah properBlah = new Blah("Age", "Name", "Stuff", "OtherStuff");
		List<Double> oddResultList = new ArrayList<Double>();
		List<Double> setterResultList = new ArrayList<Double>();
		List<Double> constructorResultList = new ArrayList<Double>();
		Blah blah;
		Blah blah2;
		Blah blah3;

		int numberOfReRuns = 5;
		

		for (int i = 0; i < numberOfReRuns; i++) {
			double numberOfObjectsCreated = Math.pow(10, i);
			System.out.println("Number of Objects Created : "
					+ numberOfObjectsCreated);
			long deltaTime = 0;
			long startTime = 0;
			long endTime =0;
			
			for (long index = 0; index < numberOfObjectsCreated; index++) {
				startTime = System.nanoTime();
				
				blah = new Blah().setAge("Age").setName("Name")
						.setStuff("Stuff").setOtherStuff("OtherStuff");
				blah.compare(properBlah);
				endTime = System.nanoTime();
				deltaTime += endTime - startTime;
			}
			oddResultList.add( deltaTime / numberOfObjectsCreated);

			System.out.println("First way time : " + deltaTime
					/ numberOfObjectsCreated);

			deltaTime=0;
			for (long index = 0; index < numberOfObjectsCreated; index++) {
				startTime = System.nanoTime();
				blah2 = new Blah();
				blah2.setterAge("Age");
				blah2.setterName("Name");
				blah2.setterStuff("Stuff");
				blah2.setterOtherStuff("OtherStuff");
				endTime = System.nanoTime();
				deltaTime += endTime - startTime;
			}

			setterResultList.add((deltaTime)/ numberOfObjectsCreated);
			System.out.println("Setters way time : " + (deltaTime)
					/ numberOfObjectsCreated);

			deltaTime =0;
			for (long index = 0; index < numberOfObjectsCreated; index++) {
				startTime = System.nanoTime();
				blah3 = new Blah("Age", "Name", "stuff", "OtherStuff");
				blah3.compare(properBlah);
				endTime = System.nanoTime();
				deltaTime += endTime - startTime;
			}

			constructorResultList.add((deltaTime)/ numberOfObjectsCreated);
			System.out.println("Constructor way time : "
					+ (deltaTime) / numberOfObjectsCreated);

			System.out.println();
		}

		System.out.println(oddResultList);
		System.out.println(setterResultList);
		System.out.println(constructorResultList);
		
	}

}
