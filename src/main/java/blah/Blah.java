package blah;

public class Blah {

	String name,age,stuff,otherStuff;
	
	public Blah(){}
	
	
	public Blah Blah(){
		return this;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public Blah setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public Blah setAge(String age) {
		this.age = age;
		return this;
	}

	/**
	 * @return the stuff
	 */
	public String getStuff() {
		return stuff;
	}

	/**
	 * @param stuff the stuff to set
	 */
	public Blah setStuff(String stuff) {
		this.stuff = stuff;
		return this;
	}

	/**
	 * @return the otherStuff
	 */
	public String getOtherStuff() {
		return otherStuff;
	}

	/**
	 * @param otherStuff the otherStuff to set
	 */
	public Blah setOtherStuff(String otherStuff) {
		this.otherStuff = otherStuff;
		return this;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Blah [name=" + name + ", age=" + age + ", stuff=" + stuff
				+ ", otherStuff=" + otherStuff + "]";
	}
	
	
	
}
