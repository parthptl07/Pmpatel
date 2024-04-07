import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainFrame extends JFrame {
    final private Font maiFont = new Font("Segoe print",Font.BOLD,18);
    JTextField tffirstname,tflastname;
    JLabel lbwelcome;
    

    public void initialize(){
        // form pane
       JLabel lbfirstname = new JLabel("first name");
       lbfirstname.setFont(maiFont);

       tffirstname = new JTextField();
       tffirstname.setFont(maiFont);

       JLabel lblastname = new JLabel("last name");
       lblastname.setFont(maiFont); 
       
       tflastname = new JTextField();
       tflastname.setFont(maiFont);

       JPanel formPanel = new JPanel();
       formPanel.setLayout(new GridLayout(4,1,5,5));
       formPanel.setOpaque(false);
       formPanel.add(lbfirstname);
       formPanel.add(tffirstname);
       formPanel.add(lblastname);
       formPanel.add(tflastname);

    //    welcome panel
    lbwelcome = new JLabel();
    lbwelcome.setFont(maiFont);
    

    // button panel
    JButton btnOK = new JButton("OK");
    btnOK.setFont( maiFont);  
    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Todo auto generate method
            String firstname = tffirstname.getText();
            String lastname = tflastname.getText();
            lbwelcome.setText("HEllo " + firstname + " " + lastname );
        }    

    });
    JButton btnClear = new JButton("Clear");
    btnClear.setFont(maiFont);
    btnClear.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           
        // TODO auto generated method stub
        tffirstname.setText("");
        tflastname.setText("");
        lbwelcome.setText("");
        }
    });

    JPanel buttonsPanel = new JPanel();
    buttonsPanel.setLayout(new GridLayout(1,2,5,5));
    buttonsPanel.setOpaque(false);
    buttonsPanel.add(btnOK);
    buttonsPanel.add(btnClear);
    


         

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formPanel,BorderLayout.NORTH);
        mainPanel.add(lbwelcome,BorderLayout.CENTER);
        mainPanel.add(buttonsPanel,BorderLayout.SOUTH);

        add(mainPanel);


        setTitle("Welcome");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }

     
}