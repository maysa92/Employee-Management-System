
package frame;
import employee_mgm.Crud;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * @author Sheryl
 */
public class Graphic1 extends JFrame implements ActionListener, TextListener{

    //field
    //the interfaces need to reference them
    Button btm = new Button("login");
    TextField tfm1 = new TextField(10);
    TextField tfm2 = new TextField(10);
    Label error = new Label("Invalid Input!", Label.CENTER);
    static int ect = 0;
    Crud crud = new Crud();
    //method
        @Override
    public void actionPerformed(ActionEvent e) {
        if(tfm1.getText().equals("oop")&& tfm2.getText().equals("123")){
            new Menu(crud);
        }else{
            ect++;
            new Graphic1();
            //JOptionPane.showMessageDialog(this, "Invalid input","ERROR", JOptionPane.ERROR_MESSAGE); 
        }   
    }
    
    @Override
    public void textValueChanged(TextEvent e) {  
    }
    
    //constructor
    //coding shoulde be only inside contructor
    public Graphic1(){
        // 1. container
        JFrame f = new JFrame();
        f.setBounds(100,100,500,500);
        f.setTitle("Login");
        
        // 2. layout
        GridLayout g1 = new GridLayout(4, 1);
        f.setLayout(g1);
        
        Font font1 = new Font("Times New Romans", Font.BOLD, 24);
        Font font2 = new Font("Times New Romans", Font.BOLD, 14);
        //top block
        Label lt = new Label(" Employment Management System", Label.CENTER);
        lt.setFont(font1);
        lt.setForeground(Color.DARK_GRAY);
        f.add(lt);
        //middle block
        Panel pm = new Panel();
        Label lm = new Label(" Username: ", Label.CENTER);
        tfm1.addTextListener(this);
        pm.add(lm);
        lm.setFont(font2);
        pm.add(tfm1);
        Label lm2 = new Label(" Password: ", Label.CENTER);
        tfm2.addTextListener(this);
        tfm2.setEchoChar('*');
        pm.add(lm2);
        lm2.setFont(font2);
        pm.add(tfm2);
        btm.addActionListener(this);
        pm.add(btm);
        f.add(pm);
        
        //bottom block
        Panel pb = new Panel();
        error.setForeground(Color.red);
        if(ect == 0){
            error.setVisible(false);
        }else{
            error.setVisible(true);
        }
        Label lb = new Label("okcu.com", Label.CENTER);
        lb.setFont(font2);
        lb.setForeground(Color.LIGHT_GRAY);
        f.add(error);
        pb.add(lb);
        f.add(pb);
      
        //4. event
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    


}
