package src;

import java.awt.Color;
import java.awt.Graphics;

public class TEllipse extends TCircle {
    protected int r1;
    protected Color color;

    public TEllipse(int x, int y, int r, int r1, Color color) {
        super(x, y);
        this.r = r;
        this.r1 = r1;
        this.color = color;
    }

    public void Turn() {
        int temp = r;
        r = r1;
        r1 = temp;
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics component) {
        component.setColor(color);
        component.drawOval(super.GetX(), super.GetY(), r * 3, r1 * 4);
    }
}