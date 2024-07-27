package UniversityManagement;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
@SuppressWarnings("unused")
public class university extends JFrame implements Runnable{
    Thread t;
    // jframe setup
    university () {
        setVisible(true);
        setSize(600, 600);
        setLocation(500, 520);

        //image for the first main display in the jframe 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pictures/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(800, 520, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        t = new Thread(this);
        t.start();
        setVisible(true);

        // cool time animation 
        int x = 1;
        for (int i = -2; i <- 600; i = +-4, x = + -1) {
            setLocation(600 - ((i + x)/2), 350 - (i/2));
            setSize(i + 3*x, i + x/2);

            try{
                Thread.sleep(5);
            } catch (Exception e) {}
        }
    }
    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            //next frame for the login page 
            new Login();
        } catch (Exception e) {}

        }

    public static void main(String[] args) {
        new university();

    }





}
