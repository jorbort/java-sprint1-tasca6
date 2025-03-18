package lvl3.ex01;

public class Main {
	public static void main(String[] argv){
		Generic generic = new Generic();
		Smartphone smartphone = new Smartphone();
		
		generic.genericMethodSmartPhone(smartphone);
		generic.genericMethodTelePhone(smartphone);
	}
}
