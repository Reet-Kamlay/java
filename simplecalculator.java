// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// class MyFrame extends JFrame implements ActionListener{
//     Container c;
//     JLabel label1,label2,label3;
//     JTextField t1,t2;
//     JButton add,sub,mul,div;

//     MyFrame(){
//         setTitle("Simple Calculator");
//         setSize(300,300);
//         setLocation(100,100);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);

//         c=getContentPane();
//         setLayout(null);

//         label1=new JLabel("First Number");
//         label2=new JLabel("Second Number");
//         label1.setBounds(10, 20, 100, 20);
//         label2.setBounds(10, 50, 100, 20);
//         c.add(label1);
//         c.add(label2);
//         t1=new JTextField();
//         t1.setBounds(120, 20, 100, 20);
//         c.add(t1);
//         t2=new JTextField();
//         t2.setBounds(120, 50, 100, 20);
//         c.add(t2);
                    

//         add=new JButton("+");
//         add.setBounds(10, 120, 50, 30);
//         c.add(add);
//         sub=new JButton("-");
//         sub.setBounds(70,120,50,30);
//         c.add(sub);
//         mul=new JButton("x");
//         mul.setBounds(130, 120, 50, 30);
//         c.add(mul);
//         div=new JButton("/");
//         div.setBounds(190, 120, 50, 30);
//         c.add(div);
           
//         add.addActionListener(this);
//         sub.addActionListener(this);
//         mul.addActionListener(this);
//         div.addActionListener(this);

//         label3=new JLabel("Result: ");
//         label3.setBounds(10,150,100,100);
//         c.add(label3);
//         setVisible(true);
//     }
//     public void actionPerformed(ActionEvent e){
//         try{
//             if(e.getSource()==add){

//                 int a=Integer.parseInt(t1.getText());
//                 int b=Integer.parseInt(t2.getText());
//                 int c=a+b;
//                 label3.setText("Result :"+c);
//             }
//             if(e.getSource()==sub){
    
//                 int a=Integer.parseInt(t1.getText());
//                 int b=Integer.parseInt(t2.getText());
//                 int c=a-b;
//                 label3.setText("Result :"+c);
//             }
//             if(e.getSource()==mul){
    
//                 int a=Integer.parseInt(t1.getText());
//                 int b=Integer.parseInt(t2.getText());
//                 int c=a*b;
//                 label3.setText("Result :"+c);
//             }
//             if(e.getSource()==div){
    
//                 int a=Integer.parseInt(t1.getText());
//                 int b=Integer.parseInt(t2.getText());
//                 int c=a/b;
//                 label3.setText("Result :"+c);
//             }
//         }
//         }catch(NumberFormatException e1){
//             result.setText("Please input integers only");
//         }catch(ArithmeticException e2){
//             result.setText("Can not divide by zero");
//         }
//     }
// }   
// public class simplecalculator {
//     public static void main(String[] args) {
//         MyFrame frame=new MyFrame();
//     }
// }
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
    Container c;
    JLabel label1,label2,label3;
    JTextField t1,t2;
    JButton add,sub,mul,div;

    MyFrame(){
        setTitle("Simple Calculator");
        setSize(300,300);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        setLayout(null);

        label1=new JLabel("First Number");
        label2=new JLabel("Second Number");
        label1.setBounds(10, 20, 100, 20);
        label2.setBounds(10, 50, 100, 20);
        c.add(label1);
        c.add(label2);
        t1=new JTextField();
        t1.setBounds(120, 20, 100, 20);
        c.add(t1);
        t2=new JTextField();
        t2.setBounds(120, 50, 100, 20);
        c.add(t2);
                    

        add=new JButton("+");
        add.setBounds(10, 120, 50, 30);
        c.add(add);
        sub=new JButton("-");
        sub.setBounds(70,120,50,30);
        c.add(sub);
        mul=new JButton("x");
        mul.setBounds(130, 120, 50, 30);
        c.add(mul);
        div=new JButton("/");
        div.setBounds(190, 120, 50, 30);
        c.add(div);
           
   

        label3=new JLabel("Result: ");
        label3.setBounds(10,150,100,100);
        c.add(label3);
        
    
            add.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                try{
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c=a+b;
                    label3.setText("Result :"+c);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                    
                }
                
            });
            sub.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                try{
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c=a-b;
                    label3.setText("Result :"+c);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                    
                }
                
            });
            mul.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                try{
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c=a*b;
                    label3.setText("Result :"+c);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                    
                }
                
            });
            div.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                try{
                    int a=Integer.parseInt(t1.getText());
                    int b=Integer.parseInt(t2.getText());
                    int c=a/b;
                    label3.setText("Result :"+c);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                    
                }
                
            });

                
            
            setVisible(true);
        }
}   
public class simplecalculator {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
    }
}