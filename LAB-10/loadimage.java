import java.applet.*;
import java.awt.*;
/*<applet code="loadimage.class" width="300" height="200"></applet>*/
public class loadimage extends Applet {
    Image picture;
    public void init() {
        picture = getImage(getDocumentBase(),"image.jpeg");
    }
    public void paint(Graphics g) {
        g.drawImage(picture,50,50,this);
    }
}
