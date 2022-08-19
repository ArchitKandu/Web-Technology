import java.applet.*;
import java.awt.*;
/*<applet code="details.class" width="300" height="200"></applet>*/
public class details extends Applet {
    public void paint(Graphics g) {
        final int FONT_SIZE = 400;
        Font font = new Font("Serif",Font.BOLD,FONT_SIZE);
        setBackground(Color.YELLOW);
        g.setColor(Color.BLACK);
        g.drawString("ROLL NO.: 20051924",70,70);
        g.setColor(Color.BLUE);
        g.drawString("NAME: ARCHIT KANDU",70,90);
        g.setColor(Color.GREEN);
        g.drawString("BRANCH: CSE",70,110);
        g.setColor(Color.RED);
        g.drawString("SECTION: CSE-26",70,130);
    }
}
