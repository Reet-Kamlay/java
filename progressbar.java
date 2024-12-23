
import javax.swing.*;
import java.awt.*;
public class progressbar {
    public static void main(String [] args){
        JFrame j=new JFrame("Progress Bar");
        j.setBounds(100,100,700,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        Container c=j.getContentPane();
        c.setLayout(null);
        JProgressBar p=new JProgressBar(0,100);
        p.setBounds(100,100,500,50);
        c.add(p);
        p.setStringPainted(true);
        int i=0;
        while(i<=100){
            if(i>=0 && i<=50){
                p.setString("processing...");
            }
            else if(i>50 && i<=90){
                p.setString("Almost done...");
            }
            else{
                p.setString("Done");
            }
            p.setValue(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            i+=10;
        }
        
    }
}
