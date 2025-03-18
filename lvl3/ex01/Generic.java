package lvl3.ex01;

public class Generic {
	
	public Generic(){}

	public <T extends Telephone> void genericMethodTelePhone(T telephone){
		System.out.println("----call method from a Telephone-----");
		telephone.call();
	}

	public <T extends Smartphone> void genericMethodSmartPhone(T smartphone){
		System.out.println("----call method from a Smartphone-----");
		smartphone.call();
		System.out.println("----Take picture method from a SmartPhone-----");
		smartphone.TakePictures();
	}
}
