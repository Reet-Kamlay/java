import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    Container c;
    JLabel name,mobile,gender,dob,address,msg;
    JTextField t1,t2;
    JComboBox day,month,year;
    JRadioButton male,female;
    JCheckBox terms;
    JTextArea txt,screen;
    JButton but;
    MyFrame(){
        setTitle("Registration Form");
        setBounds(100,100,900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);

        name = new JLabel("Name");
        name.setBounds(30, 50, 100, 30);
        c.add(name);

        t1=new JTextField();
        t1.setBounds(120, 50, 100, 30);
        c.add(t1);

        mobile = new JLabel("Mobile");
        mobile.setBounds(30, 100, 100, 30);
        c.add(mobile);
        
        t2=new JTextField();
        t2.setBounds(120, 100, 100, 30);
        c.add(t2);

        gender=new JLabel("Gender");
        gender.setBounds(30, 150, 100, 30);
        c.add(gender);
        male = new JRadioButton("Male");
        female =new JRadioButton("Female");
        male.setBounds(90, 150, 100, 30);
        female.setBounds(190, 150, 100, 30);
        c.add(male);
        c.add(female);
        ButtonGroup btn=new ButtonGroup();
        btn.add(male);
        btn.add(female);
        dob=new JLabel("DOB");
        dob.setBounds(30, 200, 100, 30);
        c.add(dob);
        String [] days={"Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
        String [] months={"January","Feburuary","March","April","May","June","July","August","September","October","November","December"};
        String [] years={"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
        day=new JComboBox(days);
        day.setBounds(90, 200, 100, 30);
        c.add(day);
        month=new JComboBox(months);
        month.setBounds(210, 200, 100, 30);
        c.add(month);
        year=new JComboBox(years);
        year.setBounds(340, 200, 100, 30);
        c.add(year);
        address =new JLabel("Address");
        address.setBounds(30,250,100,30);
        c.add(address);
        txt=new JTextArea();
        txt.setBounds(90, 250, 200, 80);
        c.add(txt);
        txt.setLineWrap(true);
        terms =new JCheckBox("Please accept terms and conditions");
        terms.setBounds(70, 350, 300, 30);
        c.add(terms);
        but=new JButton("Submit");
        but.setBounds(120, 400, 100, 30);
        c.add(but);
        but.addActionListener(this);
        screen=new JTextArea();
        screen.setBounds(500,50,300,300);
        c.add(screen);
        msg=new JLabel("");
        msg.setBounds(20, 450, 250, 20);
        c.add(msg);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(terms.isSelected()){
            msg.setText("Regisrtration Succesful");
            String name=t1.getText();
            String mobile = t2.getText();
            String gender="male";
            if(female.isSelected()){
                gender="female";
            }
            String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
            String address=txt.getText();
            screen.setText("Name: "+name+"\n"+"Mobile :"+"\n"+"Gender :"+gender+"\n"+"DOB :"+dob+"\n"+"Address :"+address);
        }
        else{
            msg.setText("accept terms and conditions to submit");
            screen.setText("");
        }
    }
}
public class registrationform {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
    }
}
