package lvl2.ex01;

public class Main{
	
	public static void main(String []argv){
		GenericMethods generics = new GenericMethods();
		Person pepe = new Person("pepe", "Gonsalez", 48);
		String message = "Message printed from inside a generic method";
		int number = 12345;
		generics.printGeneric(message, pepe, number);
	}
}