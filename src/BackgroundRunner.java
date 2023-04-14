import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class BackgroundRunner extends JPanel {

	private BackgroundRunner panel;
	private Lander red;
	private Image backgroundImage;

	public BackgroundRunner() {
		try {
			backgroundImage = ImageIO.read(new File("lunarSurface.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		red = new Lander();


	}


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 20, 20, 600, 600, this);
		red.draw(g);
	}

	public static void main(String[] args) throws InterruptedException {

	}
	public static void left(BackgroundRunner panel){
			panel.red.move(-10,0);
			panel.repaint();
	}
	public static void right(BackgroundRunner panel){
			panel.red.move(10,0);
			panel.repaint();
	}
	public static void up(BackgroundRunner panel){
			panel.red.move(0,-10);
			panel.repaint();
	}
	public static void down(BackgroundRunner panel){
			panel.red.move(0,10);
			panel.repaint();
	}

	/*public static void down(BackgroundRunner panel, int goaly){
		while(panel.red.getX() != goaly){
			panel.red.move(0,10);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}*/
	private void drawImage( Graphics window){
		Image img2 = Toolkit.getDefaultToolkit().getImage("Board Layout.jpg"); /*the image cannot be in the SRC folder*/
		window.drawImage(img2, 0, 0, 600, 600 , this);
	}
}

//			panel.drawImage(frame.getGraphics());




