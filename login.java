import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JButton login, cancel;
    JTextField tfusername,tfpassword;
    login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblusername = new JLabel("UserName :");
        lblusername.setBounds(60,20,100,20);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(170,20,150,20);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password :");
        lblpassword.setBounds(60,70,100,20);
        add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(170,70,150,20);
        add(tfpassword);

        login = new JButton("Login");
        login.setBounds(60,140,120,30);
        login.setBackground(Color.black );
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma",Font.BOLD,15));
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(200,140,120,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("clgimg/login2.png"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);

        setSize(600,300);
        setLocation(470,240);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            String username  = tfusername.getText();
            String password = tfpassword.getText();

            String query = "select * from login where username = '"+username+"' and Password ='"+password+"' ";
            try{
                connection c = new connection();
                ResultSet rs = c.s.executeQuery(query);

                if(rs.next()){
                    setVisible(false);
                    new project();
                }else{
                    JOptionPane.showMessageDialog(null,"Invailed Username or Password");
                    setVisible(false);
                }
                c.s.close();
            }catch(Exception ae){
                ae.printStackTrace();
            }

        }else if(e.getSource() == cancel){
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new login();
    }
}
