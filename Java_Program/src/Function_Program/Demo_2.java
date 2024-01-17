package Function_Program;

class Computer {
	
	public void playMusic() {
		System.out.println("Playing Music");
	}
	
	public String giveMeAPen(int price) {
		if(price >= 10) {
			return "Pen";
		}
		return "You have not sufficient amount";
	}
}

public class Demo_2 {

	public static void main(String[] args) {
		
		Computer obj = new Computer();
		obj.playMusic();
		String res = obj.giveMeAPen(5);
		System.out.println(res);
	}
}
