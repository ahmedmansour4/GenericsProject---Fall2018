/* This is the main class, which holds all the generic methods.
 * 
 * Name: Ahmed Mansour
 * Date: 10/24/18
 */
public class Generic {

	public static void main(String[] args) {
		
		
		Integer[] intArray = {1, 20, 45, 18, 65}; //Because Generic methods don't allow primitive methods to be passed in, wrapper classes must be used
		
		String[] stringArray = {"Hello", "Cheese", "Racecar", "Dolphin"};
		
		Double[] doubleArray = {13.56, 3.14, 25.0, 725.99, 0.01};
		
		
		System.out.println("\nPosition of 18: " + elementPosition(intArray, 18) + "\n");
		System.out.println("\nPosition of Racecar: " + elementPosition(stringArray, "Racecar") + "\n");
		System.out.println("\nPosition of 0.01: " + elementPosition(doubleArray, 0.01) + "\n");
		
		Dog max = new Dog("Max", 25, 150); //Dog object with a value method
		
		Cat riley = new Cat("Riley", 13, 160); //Cat object with a value method
		
		System.out.println("Between " + max.getName() + " and " + riley.getName() + ", " + greaterThanValue(max, riley) + " has a larger value."); //greaterThanValue() method is called
		
		
		
}
	public static <T> int elementPosition(T[] array, T element) { //this method accept a generic array and element type, and finds the position of the first instance of that element
		int position = 0;
		System.out.print("Array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
			if(array[i].equals(element)) { //if element is matched, it's position is saved and return
				position = i;
			}
		}
		return position;
	}
	
	public static <T extends Animal> String greaterThanValue(T object1, T object2) { //Generic method is constrained to objects of Animal, which include Dog and Cat.
		if(object1.getValue() > object2.getValue()) { //If the first objects value is more than the second, the first object's name is returned
			return object1.getName();
		}
		else if (object1.getValue() < object2.getValue()){
			return object2.getName();
		}
		return "neither of them";
	}
	
	
}
