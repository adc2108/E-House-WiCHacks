import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class guiTest{

        
    public static void main (String args[]){
        //making the frame
        JFrame frame = new JFrame ("StocksForTots");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        //making a menu bar
        JMenuBar mb = new JMenuBar();
        JMenu home = new JMenu("HOME");
        JMenu parents = new JMenu("PARENTS");
        JMenu user = new JMenu("PLAYER");

        mb.add(home);
        mb.add(parents);
        mb.add(user);

        //bottom panel for user input
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Enter Value");
        JTextField tf = new JTextField(10);

        JButton send = new JButton ("Send");
        JButton reset = new JButton("Reset");

        panel.add(label);
        panel.add(tf);

        panel.add(send);
        panel.add(reset);

        //text at center

        JTextArea ta = new JTextArea();

        //to add components to frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);

        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
