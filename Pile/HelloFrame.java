import javax.swing.JFrame;

public class HelloFrame {
    
    public static void main(String[] args) { 
        new HelloFrame().run(); 
    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Hello, World!");
        JFrame frame2 = new JFrame("This is another frame");
        frame.setSize(400, 300);
        frame2.setSize(250, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame2.setVisible(true);
    }
}