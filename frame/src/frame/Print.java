
package frame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import employee_mgm.*;

/**
 *
 * @author Sheryl
 */
public class Print extends JFrame implements ActionListener{

    //field
    TextField m1 = new TextField(20);
    Button btn2 = new Button("Back to Menu");
    Label success = new Label("-End of List-",Label.CENTER);
    Crud crud;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back to Menu")){
            new Menu(crud);
        }
    }
    
    
    public Print(Crud crud) throws HeadlessException {
        // 1. container
        this.crud = crud;
        Employee list[] = crud.print();
        Label e1 = new Label("", Label.CENTER);
        Label e2 = new Label("", Label.CENTER);
        Label e3 = new Label("", Label.CENTER);
        Label e4 = new Label("", Label.CENTER);
        Label e5 = new Label("", Label.CENTER);
        Label e6 = new Label("", Label.CENTER);
        Label e7 = new Label("", Label.CENTER);
        Label e8 = new Label("", Label.CENTER);
        Label e9 = new Label("", Label.CENTER);
        Label e10 = new Label("", Label.CENTER);
        if(list[0] != null)e1.setText("ID: "+list[0].getId() +" Name: "+list[0].getName()+" DoB: "+ list[0].getDob());
        else e1.setText("The Database is empty.");
        if(list[1] != null)e2.setText("ID: "+list[1].getId() +" Name: "+list[1].getName()+" DoB: "+ list[1].getDob());
        if(list[2] != null)e3.setText("ID: "+list[2].getId() +" Name: "+list[2].getName()+" DoB: "+ list[2].getDob());
        if(list[3] != null)e4.setText("ID: "+list[3].getId() +" Name: "+list[3].getName()+" DoB: "+ list[3].getDob());
        if(list[4] != null)e5.setText("ID: "+list[4].getId() +" Name: "+list[4].getName()+" DoB: "+ list[4].getDob());
        if(list[5] != null)e6.setText("ID: "+list[5].getId() +" Name: "+list[5].getName()+" DoB: "+ list[5].getDob());
        if(list[6] != null)e7.setText("ID: "+list[6].getId() +" Name: "+list[6].getName()+" DoB: "+ list[6].getDob());
        if(list[7] != null)e8.setText("ID: "+list[7].getId() +" Name: "+list[7].getName()+" DoB: "+ list[7].getDob());
        if(list[8] != null)e9.setText("ID: "+list[8].getId() +" Name: "+list[8].getName()+" DoB: "+ list[8].getDob());
        if(list[9] != null)e10.setText("ID: "+list[9].getId() +" Name: "+list[9].getName()+" DoB: "+ list[9].getDob());
        JFrame f = new JFrame();
        f.setBounds(100,100,500,500);
        f.setTitle("EMS Print List");
    
        // 2. layout
        GridLayout g1 = new GridLayout(16, 1);
        f.setLayout(g1);
        Font font1 = new Font("Times New Romans", Font.BOLD, 24);
        Font font2 = new Font("Times New Romans", Font.BOLD, 14);
        //top block
        Label lt = new Label(" Employment Management System", Label.CENTER);
        lt.setFont(font1);
        lt.setForeground(Color.DARK_GRAY);
        f.add(lt);
        //middle block
        
        Panel pm2 = new Panel();
        Label lm1 = new Label(" ======List of Employee======", Label.CENTER);
        lm1.setFont(font2);
        f.add(lm1);
        success.setForeground(Color.red);
        btn2.addActionListener(this);
        f.add(e1);
        f.add(e2);
        f.add(e3);
        f.add(e4);
        f.add(e5);
        f.add(e6);
        f.add(e7);
        f.add(e8);
        f.add(e9);
        f.add(e10);
        f.add(success);
        pm2.add(btn2);
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
