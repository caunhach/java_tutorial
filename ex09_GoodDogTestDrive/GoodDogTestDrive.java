package ex09_GoodDogTestDrive;

class GoodDog{
	private int size;

	public int getSize(){
		return size;
	}
	public void setSize(int s){
		this.size = s;
	}
	public void bark() {
		if (this.size > 60){
			System.out.println("Wooof! Wooof!");
		}
		else if  (this.size > 14){
			System.out.println("Ruff! Ruff!");
		}
		else{
			System.out.println("Yip! Yip!");
		}
	}
}

public class GoodDogTestDrive {
	public static void main(String[] args){
		GoodDog one = new GoodDog();
		GoodDog two = new GoodDog();
		one.setSize(70);
		two.setSize(8);
		System.out.println("Dog one : " + one.getSize());
		System.out.println("Dog two : " + two.getSize());
		one.bark();
		two.bark();		
	}
}
