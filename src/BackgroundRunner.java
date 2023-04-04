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
	public static void left(BackgroundRunner panel, int goalx, int goaly){

		while (panel.red.getX() != goalx) {
			if(panel.red.getX() == 525){
				panel.red.move(0,50);
			}
			if(panel.red.getX() < goalx){
				panel.red.move(1, 0);
			}
			if(panel.red.getX() > goalx){
				panel.red.move(-1, 0);
			}
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.red.getY() != goaly) {
			if(panel.red.getY() < goaly){
				panel.red.move(0, 1);
			}
			if(panel.red.getY() > goaly){
				panel.red.move(0, -1);
			}
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		/*while (panel.blue.getx() > 32) {
			panel.blue.move(-1, 0);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while (panel.blue.gety() < 525) {
			panel.blue.move(0, 1);
			panel.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
	}
	private void drawImage( Graphics window){
		Image img2 = Toolkit.getDefaultToolkit().getImage("Board Layout.jpg"); /*the image cannot be in the SRC folder*/
		window.drawImage(img2, 0, 0, 600, 600 , this);
	}
}

//			panel.drawImage(frame.getGraphics());




