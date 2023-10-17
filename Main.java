import javax.swing.*;
import java.awt.*;

public class Main {
    private final JFrame frame = new JFrame("Lab_3");
    private final JButton back_btn = new JButton("Назад");
    private final JButton circles_btn = new JButton("Окружности");
    private final JButton circle_btn = new JButton("Окружность");
    private final JButton ellipse_btn = new JButton("Эллипс");
    private final JButton quads_btn = new JButton("Четырехугольники");
    private final JButton quad_btn = new JButton("Четырехугольник");
    private final JButton romb_btn = new JButton("Ромб");
    private final JButton trap_btn = new JButton("Трапеция");
    private final JButton create_btn = new JButton("Создать");
    private final JButton move_btn = new JButton("Передвинуть");
    private final JButton remove_btn = new JButton("Удалить объект");
    private final JButton csize_btn = new JButton("Изменить размер");
    private final JButton rotate_btn = new JButton("Повернуть");
    private final JButton array_btn = new JButton("Массив");
    private final JPanel Canvas = canvas();
    private JPanel circle = null;
    private TCircle[] circles = null;
    private JPanel ellipse = null;
    private TEllipse[] ellipses = null;
    private JPanel quadrangle = null;
    private TQuadrangle[] quadrangles = null;
    private JPanel romb = null;
    private TRomb[] rombs = null;
    private JPanel trapeze = null;
    private TTrapeze[] trapezes = null;
    private int btn_num;
    private Main() {
        frame.setLayout(new BorderLayout());
        frame.setSize(1920,1080);
        frame.add(Canvas, BorderLayout.CENTER);
        JPanel NPanel = navigation_panel();
        frame.add(NPanel, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private JPanel canvas() {
        JPanel canvas = new JPanel();
        canvas.setLayout(new BorderLayout());
        canvas.setBackground(Color.WHITE);
        return canvas;
    }
    private JPanel createButton(JButton button) {
        JPanel panel = new JPanel();
        Dimension buttonSize = new Dimension(200, 50);
        button.setPreferredSize(buttonSize);
        Font font = new Font("Open Sans", Font.PLAIN, 20);
        button.setFont(font);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(button);
        return panel;
    }
    private void SetDefaultMenu(JPanel panel){
        panel.removeAll();
        panel.add(createButton(circles_btn));
        panel.add(createButton(quads_btn));
    }
    private void SetCirclesMenu(JPanel panel){
        panel.removeAll();
        panel.add(createButton(back_btn));
        panel.add(createButton(circle_btn));
        panel.add(createButton(ellipse_btn));
        panel.revalidate();
        panel.repaint();
    }
    private void SetQuadsMenu(JPanel panel){
        panel.removeAll();
        panel.add(createButton(back_btn));
        panel.add(createButton(quad_btn));
        panel.add(createButton(romb_btn));
        panel.add(createButton(trap_btn));
        panel.revalidate();
        panel.repaint();
    }
    private void SetQuadAndCircleMenu(JPanel panel){
        panel.removeAll();
        panel.add(createButton(back_btn));
        panel.add(createButton(create_btn));
        panel.add(createButton(remove_btn));
        panel.add(createButton(move_btn));
        panel.add(createButton(csize_btn));
        panel.add(createButton(array_btn));
        panel.revalidate();
        panel.repaint();
    }
    private void SetEllipseMenu(JPanel panel){
        panel.removeAll();
        panel.add(createButton(back_btn));
        panel.add(createButton(create_btn));
        panel.add(createButton(remove_btn));
        panel.add(createButton(move_btn));
        panel.add(createButton(rotate_btn));
        panel.add(createButton(array_btn));
        panel.revalidate();
        panel.repaint();
    }
    private JPanel navigation_panel() {
        JPanel NPanel = new JPanel();
        NPanel.setLayout(new BoxLayout(NPanel, BoxLayout.Y_AXIS));
        NPanel.setBackground(Color.lightGray);
        SetDefaultMenu(NPanel);




        return NPanel;
    }
    public static void main(String[] argc) {
        SwingUtilities.invokeLater(Main::new);
    }
}
