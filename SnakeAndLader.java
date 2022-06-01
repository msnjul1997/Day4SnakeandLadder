package snakeandladder;

public class SnakeAndLader {
	public static void main(String[] args)
	{
	int PlayerPosition=0;
	int WinningPosition=100;
	System.out.println("Welcome to Snake And Ladder");
	while(WinningPosition>PlayerPosition)
	{
	int die = (int) (Math.floor( Math.random() * 10) % 6+1);

	System.out.println("Die rolled is :" +die);
	int RemainingPosition= WinningPosition-PlayerPosition;

	int option =(int) (Math.floor(Math.random() * 10)%3);
	if(RemainingPosition>=die)
	{
	switch(option)
	{
	case 0:
	System.out.println("No play" +0);
	PlayerPosition += 0;
	break;
	case 1:
	System.out.println("Ladder" +die);
	PlayerPosition += die;
	break;
	default:
	System.out.println("Snake"+die);
	PlayerPosition -= die;
	if(PlayerPosition<0)
	PlayerPosition=0;
	}
	}
	}
	System.out.println("Player position is : "+PlayerPosition);
	}

}
