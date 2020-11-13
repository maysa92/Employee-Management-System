
package frame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import employee_mgm.*;

/**
 *
 * @author Sheryl
 */
public class Register extends JFrame implements ActionListener, TextListener{

    //field
    TextField m1 = new TextField(20);
    TextField m2 = new TextField(20);
    TextField m3 = new TextField(20);
    Button btn1 = new Button("Register");
    Button btn2 = new Button("Back to Menu");
    static int ect = 0;
    Crud crud;
    Label success = new Label("Successful! ",Label.CENTER);
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Register")){
            Employee emp1 = new Employee(m1.getText(), Integer.parseInt(m2.getText()), m3.getText());
            Employee result = crud.register(emp1);
            ect++;
            new Register(crud);
        }else if (e.getActionCommand().equals("Back to Menu")){
            new Menu(crud);
        }
    }

    @Override
    public void textValueChanged(TextEvent e) {
    }
    
    
    public Register(Crud crud) throws HeadlessException {
        // 1. container
        this.crud = crud;
        JFrame f = new JFrame();
        f.setBounds(100,100,500,500);
        f.setTitle("EMS Registration");
    
        // 2. layout
        GridLayout g1 = new GridLayout(6, 1);
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
        Panel pm2 = new Panel();
        Label lm1 = new Label(" ======Registration======", Label.CENTER);
        lm1.setFont(font2);
        f.add(lm1);
        success.setForeground(Color.red);
        if(ect == 0){
            success.setVisible(false);
        }else{
            success.setVisible(true);
        }
        Label name = new Label("Name: ", Label.CENTER); 
        Label id = new Label("ID: ", Label.CENTER); 
        Label dob = new Label("Date of Birth: ", Label.CENTER); 
        m1.addTextListener(this);
        m2.addTextListener(this);
        m3.addTextListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        f.add(success);
        pm.add(name);
        pm.add(m1);
        pm.add(id);
        pm.add(m2);
        pm.add(dob);
        pm.add(m3);
        pm2.add(btn1);
        pm2.add(btn2);
        f.add(pm);
        f.add(pm2);
        
        //bottom block
        Label lb = new Label("okcu.com", Label.CENTER);
        lb.setFont(font2);
        lb.setForeground(Color.LIGHT_GRAY);
        f.add(lb);
        
        //4.event
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    
    
}
