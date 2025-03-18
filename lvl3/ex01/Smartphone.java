package lvl3.ex01;

public class Smartphone implements Telephone{
	
	public Smartphone(){}

	@Override
	public void call(){
		System.out.println("Calling ....");
	}

	public void TakePictures(){
		System.out.println("Taking pictures ...");
	}
}
