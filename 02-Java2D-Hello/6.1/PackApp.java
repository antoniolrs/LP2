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

  ArrayList<Figure> figs = new ArrayList<Figure>();

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
		                        int x = rand.nextInt(350);
		                        int y = rand.nextInt(350);
		                        int w = rand.nextInt(50);
		                        int h = rand.nextInt(50);

					if (evt.getKeyChar() == 'r') {
		                            figs.add(new Rect(x,y, w,h, 0,0,0));
		                        }else if (evt.getKeyChar() == 'e'){
					figs.add(new Ellipse(x,y, w,h, 0,0,0)); 
				    }
					repaint();
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
		                        
		                        repaint();  // outer.repaint()
		                    }
		                }
		            }
        );



    }

    public void paint (Graphics g) {
        super.paint(g);

        for (Figure f : this.figs){
			  f.paint(g);
			}

    }
}
