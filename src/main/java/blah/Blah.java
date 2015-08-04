package blah;

public class Blah {

	String name,age,stuff,otherStuff;
	
	public Blah(){}
	
	public Blah(String name,String age,String stuff, String otherStuff){
		this.name = name;
		this.age = age;
		this.stuff = stuff;
		this.otherStuff = otherStuff;
	}

	public Blah setName(String name) {
		this.name = name;
		return this;
	}
	public Blah setAge(String age) {
		this.age = age;
		return this;
	}

	public Blah setStuff(String stuff) {
		this.stuff = stuff;
		return this;
	}

	public Blah setOtherStuff(String otherStuff) {
		this.otherStuff = otherStuff;
		return this;
	}
	
	public void setterName(String name) {
		this.name = name;
	}
	public void setterAge(String age) {
		this.age = age;
	}

	public void setterStuff(String stuff) {
		this.stuff = stuff;
	}

	public void setterOtherStuff(String otherStuff) {
		this.otherStuff = otherStuff;
	}

	public Boolean compare(Blah otherBlah){
		return this.age == otherBlah.age && this.name == otherBlah.name && this.stuff == otherBlah.stuff && this.otherStuff == otherBlah.otherStuff;
	}
	
	
	
}
