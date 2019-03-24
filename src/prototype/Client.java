package prototype;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("PrototypeModel");
		Swordsman swordsman_1 = new Swordsman();
		GameUnit swordsman_2 = swordsman_1.clone(); // making copy of existing OBJ


	}

}
