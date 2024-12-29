
import java.awt.Frame;

public class Main{
    public static void main(String[] args) {
        Frame frame = new Frame("Painter Applet");
        Painter painter = new Painter();

        frame.add(painter);
        frame.setSize(800, 600);
        frame.setVisible(true);

        painter.init();
        painter.start();

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}