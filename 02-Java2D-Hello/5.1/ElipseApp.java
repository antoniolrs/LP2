import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ElipseApp {
	public static void main(String [] args) {
		PaintFrame frame = new PaintFrame();
		frame.setVisible(true);
	}
}

class PaintFrame extends JFrame{
	Elipse e1, e2, e3;
	PaintFrame(){
		this.setTitle("Painting Figures");
		this.setSize(350,350);
		this.e1 = new Elipse(50,  50,  100,30, 0,0,0);
		this.e2 = new Elipse(150, 80,  100,30, 255,165,0);
		this.e3 = new Elipse(50,  110, 100,30, 54,100,139);
	}

    public void paint (Graphics g) {
    super.paint(g);
	this.e1.paint(g);
	this.e2.paint(g);
	this.e3.paint(g);
	}

}

class Elipse{
	int x, y;
	int w, h;
	int r, g, b;

	Elipse(int x, int y, int w, int h, int r, int g, int b){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.r = r;
		this.g = g;
		this.b = b;
	}

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(this.x, this.y, this.w, this.h);
        g.setColor(new Color(this.r, this.g, this.b));
        g.fillOval(this.x, this.y, this.w, this.h);

    }
}
