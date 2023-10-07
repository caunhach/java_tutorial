package ex08_GuessGame;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		int	target_num = (int) (Math.random() * 9);
		int	try_p1 = 0;
		int try_p2 = 0;
		int try_p3 = 0;
		boolean guess_p1 = false;
		boolean guess_p2 = false;
		boolean guess_p3 = false;
		System.out.println("<< target number : " + target_num + " >>");
		while(true){
			if (try_p1 != 0 && guess_p1 == false)
				p1.number = p1.guess();
			if (p1.number != target_num)
			{
				try_p1++;
				System.out.println("p1 guess " + p1.number + " is wrong");
				System.out.println("current try : " + try_p1);
			}
			else
			{
				System.out.println("p1 guess " + p1.number + " is right");
				break;
			}
			if (try_p2 != 0 && guess_p2 == false)
				p2.number = p2.guess();
			if (p2.number != target_num)
			{
				try_p2++;
				System.out.println("p2 guess " + p2.number + " is wrong");
				System.out.println("current try : " + try_p2);
			}
			else
			{
				System.out.println("p2 guess " + p2.number + " is right");
				break;
			}
			if (try_p3 != 0 && guess_p3 == false)
				p3.number = p3.guess();
			if (p3.number != target_num)
			{
				try_p3++;
				System.out.println("p3 guess " + p3.number + " is wrong");
				System.out.println("current try : " + try_p3);
			}
			else
			{
				System.out.println("p3 guess " + p3.number + " is right");
				break;
			}
		}
	}
}
