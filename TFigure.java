import javax.swing.*;
abstract class TFigure extends JPanel {
    private final Point TPoint = new Point();
    abstract void Move(int x, int y);
    abstract void Show(boolean vision);
    public void Set(int x, int y) {
        TPoint.Set(x,y);
    }
    public int GetX() {return TPoint.GetX();}
    public int GetY() {return TPoint.GetY();}
    public TFigure(int x, int y){
        setLayout(null);
        setOpaque(false);
        TPoint.Set(x,y);
    }
}
