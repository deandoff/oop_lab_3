package src;

import java.awt.Color;
import java.awt.Graphics;

public class TCircle extends TFigure {
    protected int r;
    protected Color color;

    public TCircle(int x, int y, int r, Color color) {
        super(x, y);
        this.r = r;
        this.color = color;
    }

    public TCircle(int x, int y) {
        super(x, y);
    }

    public void Move(int x, int y) {
        super.Set(super.GetX() + x, super.GetY() + y);
        this.repaint();
    }

    public void Show(boolean vision) {
        setVisible(vision);
        this.repaint();
    }

    public void ChangeRadius(int r) {
        this.r = r;
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics component) {
        super.paintComponent(component);
        component.setColor(color);
        component.drawOval(super.GetX(), super.GetY(), r * 2, r * 2);
    }
}
