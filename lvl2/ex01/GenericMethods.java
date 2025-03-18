package lvl2.ex01;

public class GenericMethods {

	public GenericMethods(){}

	public <T> void printGeneric(String arg1, T arg2, T arg3){
		System.out.println(arg1 + " " + arg2 + " " + arg3);
	}
	
}
