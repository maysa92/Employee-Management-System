
package frame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import employee_mgm.*;

/**
 *
 * @author Sheryl
 */
public class Menu extends JFrame implements ActionListener, ItemListener{
    
    //field
    Checkbox cb1 = new Checkbox("Register"); 
    Checkbox cb2 = new Checkbox("Search"); 
    Checkbox cb3 = new Checkbox("Count"); 
    Checkbox cb4 = new Checkbox("Employee List"); 
    Checkbox cb5 = new Checkbox("Exit"); 
    Button btn = new Button("Continue");
    String option = "";
    Crud crud;
    Employee tmp;
    //method
    @Override
    public void actionPerformed(ActionEvent e) {
        if(cb1.getState() == true){
            new Register(crud);
        }else if (cb2.getState() == true){
            new Search(crud,tmp);
        }else if (cb3.getState() == true){
            new Count(crud);
        }else if (cb4.getState() == true){
            new Print(crud);
        }else if (cb5.getState() == true){
            System.exit(0);
        }      
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
    
    
    }
    
    public Menu(Crud crud) throws HeadlessException {
        // 1. container
        this.crud = crud;
        JFrame f = new JFrame();
        f.setBounds(100,100,500,500);
        f.setTitle("EMS Menu");
    
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
        Label lm1 = new Label(" ======MENU======", Label.CENTER);
        lm1.setFont(font2);
        f.add(lm1);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);
        btn.addActionListener(this);
        pm.add(cb1);
        pm.add(cb2);
        pm.add(cb3);
        pm.add(cb4);
        pm.add(cb5);
        pm.add(btn);
        f.add(pm);
        
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
