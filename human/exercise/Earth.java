package udemy.oop.java.human.exercise;

public class Earth {
	
	public static void main(String args []) {
		
		Human human1 = new Human("Tom", 25, 76, "Blue");
		Human human2 = new Human("Joe", 28, 68, "Green");
		
		human1.speak();
		System.out.println();
		human2.speak();
		
	}

}
