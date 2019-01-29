
public class Cat extends Animal {

	private String name;
	private int weight;
	private int value;
	
	Cat(String name, int weight, int value) {
		setName(name);
		setWeight(weight);
		setValue(value);
	}
	
	
	public String toString() {
		return "This cat is named " + name + ", weighs " + weight + " pounds, and it's value is " + value;
	}
}
