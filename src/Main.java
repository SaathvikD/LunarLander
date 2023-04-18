import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Main {
    private void playGame(){
        boolean valid = true;
        int finalScore =0;
        Scanner keyboard = new Scanner( System.in );
        int original;
        int turn;
        int diff;

        JFrame frame = new JFrame();
        BackgroundRunner panel = new BackgroundRunner();
        Image img2 = Toolkit.getDefaultToolkit().getImage("lunarSurface.png");
        frame.add(panel);
        frame.setSize(650, 650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(valid){
            System.out.print("next move?");
            String inp = keyboard.next();
            System.out.print("recieved");
            if(inp.equals("a")){
                BackgroundRunner.left(panel);
                panel.repaint();
            }
            else if(inp.equals("d")){
                BackgroundRunner.right(panel);
                panel.repaint();
            }
            else if(inp.equals("s")){
                BackgroundRunner.down(panel);
                panel.repaint();
            }
            else if(inp.equals("w")){
                BackgroundRunner.up(panel);
                panel.repaint();
            }
            System.out.print("completed");
        }
        System.out.println("Congratulations, you finished with a final score of " + finalScore + "!");
    }

    public static void main(String[] args) {
        Main g = new Main();
        g.playGame();
        System.out.println("Hello world!");
    }
}