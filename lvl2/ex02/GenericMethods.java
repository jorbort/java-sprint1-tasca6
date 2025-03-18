package lvl2.ex02;

public class GenericMethods {

	public GenericMethods(){}

	public <T> void printGeneric(String arg1, T ... argv){
		System.out.print(arg1 + " " );
		for(T arg : argv){
			System.out.print(arg + " ");
		}
	}
	
}
