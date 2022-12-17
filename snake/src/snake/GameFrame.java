package snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
//constructor for game frame class
	GameFrame()
	{
		GamePanel panel=new GamePanel();
		this.add(panel);
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
