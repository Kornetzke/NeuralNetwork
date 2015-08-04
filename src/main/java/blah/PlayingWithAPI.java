package blah;

public class PlayingWithAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.currentTimeMillis();
		
		long startTime = System.nanoTime();
		Blah blah = new Blah().setAge("Age").setName("Name").setStuff("Stuff").setOtherStuff("OtherStuff");
		long endTime = System.nanoTime();
		System.out.println(blah);
		
		System.out.println(endTime - startTime);

	}

}
