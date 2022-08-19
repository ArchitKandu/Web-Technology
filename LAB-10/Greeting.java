import java.applet.*;
import java.awt.*;
/*
<applet code="Greeting.class" width="300" height="200"></applet>
*/
public class Greeting extends Applet {
    public void paint(Graphics g)
    {
        final int FONT_SIZE = 400;
        Font font = new Font("Serif",Font.BOLD,FONT_SIZE);
        g.drawString("Hello  world!",250,150); 
    }
}
