import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class E1_18
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL( "https://media1.tenor.com/images/93bffd24ee47f56d29bedd09e4cec069/tenor.gif?itemid=13934296");
        JOptionPane.showMessageDialog(null, "Greetings, Traveler.", "Fancy Message Box", Icon(imageLocation));
    }
}