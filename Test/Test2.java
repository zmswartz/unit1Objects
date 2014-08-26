import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test2
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://www.mccabesnursery.com/A%20Fruit%20Trees/Gala%20Apple.jpg");
        JOptionPane.showMessageDialog(null , "Hello", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }