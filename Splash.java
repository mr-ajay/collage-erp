import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Splash extends JFrame implements  Runnable {
    Thread t ;
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("clgimg/rbmisp.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        t = new Thread(this);
        t.start();

        setVisible(true);
        int x = 1;
        for (int i =2; i<=600; i+=4, x+=1) {
            setLocation(650-((i+x)/2), 300-(i/2));
            setSize(i+3*x, i+x/2);

            try{
                Thread.sleep(10);

            }catch (Exception e){

            }
        }

    }
    public  void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
        //next frame
            new  login();

        }catch (Exception e){

        }

    }
    public static void main(String[] args) {
        new Splash();
    }
    
}
