package lvl1.ex02;

public class GenericMethods {

	public GenericMethods(){}

	public <T> void printGeneric(T arg1, T arg2, T arg3){
		System.out.println(arg1 + " " + arg2 + " " + arg3);
	}
	
}
