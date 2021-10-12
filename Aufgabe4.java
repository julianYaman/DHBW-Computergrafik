import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aufgabe4 {

  JLabel labelA;
  JLabel labelB;
  int labelB_Counter = 0;

  public static void main(String[] args){
    Aufgabe4 gui = new Aufgabe4();
    gui.initializeFrame();
  }

  public void initializeFrame(){

    // Setup default frame
    JFrame frame = new JFrame("My Menu Button App");
    frame.setSize(480,480);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create MenuBar elements and and the menuBar to the frame
    JMenuBar menuBar = new JMenuBar();

    JMenu menuFile = new JMenu("File");
    JMenu menuHelp = new JMenu("Help");
    
    menuBar.add(menuFile);
    menuBar.add(menuHelp);

    JMenuItem menuFileItemOpen = new JMenuItem("Open");
    menuFile.add(menuFileItemOpen);

    frame.setJMenuBar(menuBar);

    // Layout

    // Create/Setup panel
    JPanel content = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    // Setup labels and a button (=elements)
    labelA = new JLabel("Ich kann zeichnen ...", SwingConstants.CENTER);
    labelA.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    labelB = new JLabel("Du hast mich zum 0-mal gedrückt!", SwingConstants.CENTER);
    labelB.setAlignmentX(JLabel.LEFT_ALIGNMENT);
    
    JButton button = new JButton("Drücke mich!");
    button.setAlignmentX(JButton.LEFT_ALIGNMENT);
    button.addActionListener(new ClickListener());

    // Layout + Adding components to the "content" panel
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;
    content.add(labelA, gbc);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 1;
    content.add(button, gbc);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 2;
    content.add(labelB, gbc);

    // Add panel to the frame and make it visible
    frame.add(content);
    // THIS MUST STAY AT THE VERY END111!!
    frame.setVisible(true);
  }

  class ClickListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
        labelB_Counter += 1;
        labelB.setText("Du hast mich zum " + String.valueOf(labelB_Counter) +"-mal gedrückt!");
    }
}
}