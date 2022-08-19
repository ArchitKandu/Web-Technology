import java.applet.*;
import java.awt.*;
/*<applet code="smiley.class" width="300" height="200"></applet>*/
public class smiley extends Applet {
    public void paint(Graphics g) {
        g.drawOval(100,130,200,200);
        g.setColor(Color.BLACK);
        g.fillOval(140,180,50,50);
        g.fillOval(210,180,50,50);
        g.drawArc(170,250,70,50,180,180);;
    }
}
