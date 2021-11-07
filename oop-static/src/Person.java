
public class Person {

	// TODO
	
	public static int count = 0;
	
	public static int getCount() {
		count ++;
		return count;
	}

	String name;

	public Person(String name) {
		this.name = name;
	}

}
