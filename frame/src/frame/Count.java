
package frame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import employee_mgm.*;

/**
 *
 * @author Sheryl
 */
public class Count extends JFrame implements ActionListener{

    //field
    TextField m1 = new TextField(20);
    Button btn2 = new Button("Back to Menu");
    Label success = new Label("Counted",Label.CENTER);
    Crud crud;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back to Menu")){
            new Menu(crud);
        }
    }
    
    
    public Count(Crud crud) throws HeadlessException {
        // 1. container
        this.crud = crud;
        String total = Integer.toString(crud.count());
        Label showTotal = new Label(total, Label.CENTER);
        JFrame f = new JFrame();
        f.setBounds(100,100,500,500);
        f.setTitle("EMS Count");
    
        // 2. layout
        GridLayout g1 = new GridLayout(7, 1);
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
        Label lm1 = new Label(" ======Total Number of Employee======", Label.CENTER);
        lm1.setFont(font2);
        f.add(lm1);
        success.setForeground(Color.red);
        btn2.addActionListener(this);
        pm.add(showTotal);
        f.add(success);
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
