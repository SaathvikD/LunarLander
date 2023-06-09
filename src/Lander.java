import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.Object;
import java.awt.Color;

public class Lander {
    int fuel,damage,x,y,vSpeed,hSpeed,score,dx,dy;

    public Lander(){
        fuel = 100;
        damage = 0;
        x = 100;
        y = 100;
        vSpeed = -2;
        hSpeed = 2;
        score = 1000;
        dx=0;
        dy=0;

    }
    public void draw(Graphics g) {
        g.drawRect(x, y, 15, 25);
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 15, 25);
        g.drawString("Score:" + score + " X - Value " + x + " Y - Value " + y, 150, 150);

    }
    public void move(int vx, int vy) {
        x += vx;
        y += vy;
    }
    public void AHS(int a){
        hSpeed += a;
    }
    public void AVS(int a){
        vSpeed += a;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT){
            dx=-2;
        }
        if(key == KeyEvent.VK_RIGHT){
            dx=-2;
        }
        if(key == KeyEvent.VK_UP){
            dx=-2;
        }
        if(key == KeyEvent.VK_DOWN){
            dx=-2;
        }
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT){
            dx=0;
        }
        if(key == KeyEvent.VK_RIGHT){
            dx=0;
        }
        if(key == KeyEvent.VK_UP){
            dx=0;
        }
        if(key == KeyEvent.VK_DOWN){
            dx=0;
        }
    }
}