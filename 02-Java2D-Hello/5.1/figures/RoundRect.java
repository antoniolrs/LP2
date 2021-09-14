package figures;

import java.awt.*;

public class RoundRect {
    int x, y;
    int w, h;
    int aw, ah;
	int r, g, b;

    public RoundRect (int x, int y, int w, int h, int aw, int ah, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.aw = aw;
        this.ah = ah;
		this.r = r;
		this.g = g;
		this.b = b;

    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(this.r, this.g, this.b));
        g2d.drawRoundRect(this.x,this.y, this.w,this.h,this.aw,this.ah);
        g2d.fillRoundRect(this.x,this.y, this.w,this.h,this.aw,this.ah);
    }
}

