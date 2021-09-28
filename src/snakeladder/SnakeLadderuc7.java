package snakeladder;
public class SnakeLadderuc7 {
	
	public static void main(String[] args) {
			//System.out.println("Starting of Snake and Ladder Game");
			int presentPosition1 = 0;
			int presentPosition2 = 0;
			
			int ladder = 1;
			int snake = 2 ;
			//int urPresentStep = 0;
			//int dieRoll = 0;
			while(presentPosition1 < 100 && presentPosition2 <100)
			{
				//dieRoll++;
				int dice1= (int) Math.floor((Math.random()*10) %6) + 1;
				System.out.println("The number on dice is " + dice1);
				int dice2 = (int) Math.floor((Math.random()*10) %6) + 1;
				System.out.println("Random number is:"+dice2);
				int position =(int)Math.floor((Math.random()*10)%3);
				if(position == ladder)
				{
					presentPosition1 += dice1;
					presentPosition2 += dice2;
					if(presentPosition1 > 100 || presentPosition2 > 100)
					{
						presentPosition1 -= dice1;
						presentPosition2 -= dice2;
					}
						
					System.out.println("Ladder move forward1"+presentPosition1);
					System.out.println("Ladder move forward2"+presentPosition2);
				}

					else if(position == snake)

					{
						presentPosition1 -= dice1;
						presentPosition2 -= dice2;
							
							if(presentPosition1 < 0 || presentPosition2 <0)
							{
								presentPosition1 = 0;
								presentPosition2 = 0;
							}
							
								System.out.println("Ladder move backward1"+presentPosition1);
								System.out.println("Ladder move backward2"+presentPosition2);
							}
							else
								{
								System.out.println("You are on"+presentPosition1);
								System.out.println("You are on"+presentPosition2);
								}
									if(presentPosition1 == 100)
										System.out.println("Player1 win");
									else if(presentPosition2 == 100)
										System.out.println("Player2 win");
					}
			}
	}
	