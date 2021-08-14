import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
        getContentPane().setBackground(Color.blue);
        setResizable(false);
    }

   public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.red);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,0, w,h);
        g2d.setPaint(Color.black);
        g2d.drawLine(0,h, w,0); 

        g.setColor( Color.orange );        
        g.fillOval( 225, 37, 50, 25 );
        g.setColor(Color.black );        
        g.drawOval( 50, 225, 100, 50 );

    }
}   
