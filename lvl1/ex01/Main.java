package lvl1.ex01;
class Main{

	public static void main(){
		NoGenericMethods obj1 = new NoGenericMethods("Pepe", "Spain", "Pepito");
		NoGenericMethods obj2 = new NoGenericMethods("Brazil", "Roberto", "Gil");

		System.out.println("Obj1: " + obj1.getName() + ", " + obj1.getLastName() + ", " + obj1.getCountry());
		System.out.println("Obj2: " + obj2.getName() + ", " + obj2.getLastName() + ", " + obj2.getCountry());
	}
}
