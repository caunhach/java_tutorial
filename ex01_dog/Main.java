
public class Main{
	public static void main(String[] args){
		Dog dog1 = new Dog("Charles", "Syberian");
		Dog dog2 = new Dog("Toto", "German Shepherd");

		System.out.println(dog1.getName() + "'s breed is " + dog1.getBreed());
		System.out.println(dog2.getName() + "'s breed is " + dog2.getBreed());

		System.out.println("\nSet the new Breed of dog1 and new Name of dog2:\n");
		dog1.setName("Lilly");
		dog2.setBreed("Golden Retriever");

		System.out.println(dog1.getName() + "'s breed is " + dog1.getBreed());
		System.out.println(dog2.getName() + "'s breed is " + dog2.getBreed());
	}
}