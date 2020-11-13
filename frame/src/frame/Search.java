
package frame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import employee_mgm.*;
import frame.Register;

/**
 *
 * @author Sheryl
 */
public class Search extends JFrame implements ActionListener, TextListener{

    //field
    TextField m1 = new TextField(20);
    Button btn1 = new Button("Search");
    Button btn2 = new Button("Back to Menu");
    static int ect = 0;
    Label success = new Label("Employee Found! ",Label.CENTER);
    Employee result1;
    Crud crud;
    Label employee = new Label("", Label.CENTER);
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Search")){
            System.out.println(Integer.parseInt(m1.getText()));
            result1 = crud.search(Integer.parseInt(m1.getText()));
            System.out.println(result1.getName());
            ect++;
            new Search(crud, result1);
        }else if (e.getActionCommand().equals("Back to Menu")){
            new Menu(crud);
        }
    }

    @Override
    public void textValueChanged(TextEvent e) {
    }
    
    
    
    public Search(Crud crud, Employee result1) throws HeadlessException {
        this.result1 = result1;
        if(result1 != null){
        employee.setText("Employee: ID: "+result1.getId() +"  Name: "+result1.getName()+"  Dob: "+ result1.getDob());
        }else ect = 0;
        // 1. container
        this.crud = crud;
        JFrame f = new JFrame();
        f.setBounds(100,100,500,500);
        f.setTitle("EMS Search");
    
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
        Label lm1 = new Label(" ======Search by ID======", Label.CENTER);
        lm1.setFont(font2);
        f.add(lm1);
        success.setForeground(Color.red);
        if(ect == 0){
            success.setVisible(false);
            employee.setVisible(false);
        }else {
            success.setVisible(true);
            employee.setVisible(true);
        }
        Label id = new Label("ID: ", Label.CENTER); 
        m1.addTextListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        f.add(success);
        f.add(employee);
        pm.add(id);
        pm.add(m1);
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
