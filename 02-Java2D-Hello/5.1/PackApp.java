import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;

import figures.*;

class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {

  ArrayList<Rect> rs = new ArrayList<Rect>();
  ArrayList<Ellipse> es = new ArrayList<Ellipse>();
  Random rand = new Random();

    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java Packages");
        this.setSize(350, 350);

		this.addKeyListener (
		            new KeyAdapter() {
		                public void keyPressed (KeyEvent evt) {
		                    if (evt.getKeyChar() == 'r') {
		                        int x = rand.nextInt(350);
		                        int y = rand.nextInt(350);
		                        int w = rand.nextInt(50);
		                        int h = rand.nextInt(50);
		                        rs.add(new Rect(x,y, w,h, 0,0,0));
		                        repaint();  // outer.repaint()
		                    }
		                }
		            }
        );

		this.addKeyListener (
		            new KeyAdapter() {
		                public void keyPressed (KeyEvent evt) {
		                    if (evt.getKeyChar() == 'e') {
		                        int x = rand.nextInt(350);
		                        int y = rand.nextInt(350);
		                        int w = rand.nextInt(50);
		                        int h = rand.nextInt(50);
		                        es.add(new Ellipse(x,y, w,h, 255,255,255));
		                        repaint();  // outer.repaint()
		                    }
		                }
		            }
        );



    }

    public void paint (Graphics g) {
        super.paint(g);

        for (Rect r : this.rs){
			  r.paint(g);
			}

        for (Ellipse e : this.es){
			  e.paint(g);
			}

    }
}