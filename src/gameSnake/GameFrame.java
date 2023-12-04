package gameSnake;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	//constructors
	GameFrame(){
		this.add(new GamePannel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setResizable(false);
		this.pack(); //fits our components to the JFrame 
		this.setVisible(true);
		this.setLocationRelativeTo(null);  //to make the game console fits the center of the screen
	}

}
