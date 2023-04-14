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
        //addPlayers();
        Scanner keyboard = new Scanner( System.in );
        int original;
        int turn;
        int diff;

        JFrame frame = new JFrame();
        BackgroundRunner panel = new BackgroundRunner();
        Image img2 = Toolkit.getDefaultToolkit().getImage("lunuarSurface.png");
        frame.add(panel);
        frame.setSize(650, 650);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(valid){

            panel.repaint();
            String inp = keyboard.next();
            if(inp.equals("a")){
                BackgroundRunner.left(panel);
            }
            else if(inp.equals("d")){
                BackgroundRunner.right(panel);
            }
            else if(inp.equals("s")){
                BackgroundRunner.down(panel);
            }
            else if(inp.equals("w")){
                BackgroundRunner.up(panel);
            }
        }
        System.out.println("Congratulations, you finished with a final score of " + finalScore + "!");
    }

    public static void main(String[] args) {
        Main g = new Main();
        g.playGame();
        System.out.println("Hello world!");
    }
}
