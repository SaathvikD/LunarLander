import java.awt.*;

public class Lander {
    int fuel,damage,x,y,vSpeed,hSpeed,score;

    public Lander(){
        fuel = 100;
        damage = 0;
        x = 100;
        y = 100;
        vSpeed = -2;
        hSpeed = 0;
        score = 1000;
    }
    public void draw(Graphics g) {
        g.drawRect(x, y, 15, 25);
        g.fillRect(x, y, 15, 25);
        g.setColor(Color.WHITE);
    }
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
