import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class GUI{
    JFrame frame;
    JMenuBar menubar;
    JMenu m1,m2;
    JPanel panel;
    JTextArea textArea;

    GUI()
    {
       setFrame();
       setMenuBar();
       setPanel();
       setTextArea();
    }

    public void setFrame(){
       //creating the frame
       frame = new JFrame("Chat Frame");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       frame.setBackground(Color.CYAN);

    }
    public void setMenuBar(){
        //creating menubar
        menubar = new JMenuBar();
        m1 = new JMenu("FILE");
        m2 = new JMenu("Help");
        menubar.add(m1);
        menubar.add(m2);

        JMenuItem menuItem = new JMenuItem("Open");
        JMenuItem menuItem2 = new JMenuItem("Save as");
        m1.add(menuItem);
        m1.add(menuItem2);
    }

    public void setPanel(){
        //creating a panel and adding components
        panel = new JPanel(); //not visible in the output
        JLabel label = new JLabel("Enter Text"); //declaring area that we will text
        JTextField textField = new JTextField(10);//accept upto chars
        JButton send = new JButton("Send");
        JButton reset = new JButton("Re-Write");

        //adding compoments to panel
        panel.add(label);
        panel.add(textField);
        panel.add(send);
        panel.add(reset);
    }
    public void setTextArea(){
        //text area at the center of app
        textArea = new JTextArea();

        //adding compoments to the frame
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.getContentPane().add(BorderLayout.NORTH,menubar);
        frame.getContentPane().add(BorderLayout.CENTER,textArea);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}