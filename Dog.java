
public class Dog extends Animal{

	private String name;
	private int weight;
	private int value;
	
	Dog(String name, int weight, int value) {
		setName(name);
		setWeight(weight);
		setValue(value);
	}
	
	public String toString() {
		return "This dog is named " + name + ", weighs " + weight + " pounds, and it's value is " + value;
	}
}
