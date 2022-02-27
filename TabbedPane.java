import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TabbedPane extends JFrame {
    JTabbedPane tabs;
    CoursePanel cource;
    SelectCoursePanel selectCourse;

    TabbedPane() {
        super("Tabbed Pane Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Setting the JTabbedPane Position and Layout as Wrap
        tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);

        cource = new CoursePanel();
        selectCourse = new SelectCoursePanel();
        // Adding user defined pannels to JTabbedPane
        tabs.addTab("HOME", cource);
        tabs.addTab("PLAYERS", selectCourse);
        
        // Adding JPanels to JTabbedPane
        tabs.addTab("PARENTS", new JPanel());
        //tabs.addTab("Comment", new JTextArea(10, 40));

        getContentPane().add(tabs);
    }
}

/*Creating CoursePanel by extending JPanel*/
class CoursePanel extends JPanel {
    JButton parents, players;

    CoursePanel() {
        parents = new JButton("Parents");
        players = new JButton("Players");

        setLayout(new FlowLayout());

        add(parents);
        add(players);


    
    }
}
/*Creating SelectCoursePanel by extending JPanel*/
class SelectCoursePanel extends JPanel {
    JButton bank, investments;

    SelectCoursePanel() {
        bank = new JButton("Bank");
        investments = new JButton("investments");

        setLayout(new FlowLayout());

        add(bank);
        add(investments);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Enter Investment Value");
        JTextField tf = new JTextField(10);



        panel.add(label);
        panel.add(BorderLayout.SOUTH, tf);
       
    }
}

class JTabbedPaneDemo {
    public static void main(String args[]) throws Exception {
        TabbedPane frame = new TabbedPane();
        frame.setSize(400, 400);
        frame.setVisible(true);


    }
}
