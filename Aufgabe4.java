import javax.swing.*; 
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
    JFrame frame = new JFrame("My First GUI");
    frame.setSize(480,480);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create MenuBar elements and and the menuBar to the frame
    JMenuBar menuBar = new JMenuBar();

    JMenu menuFile = 
      new JMenu("File");
    JMenu menuHelp = 
      new JMenu("Help");
    
    menuBar.add(menuFile);
    menuBar.add(menuHelp);

    JMenuItem menuFileItemOpen = 
		new JMenuItem("Open");
	
	  menuFile.add(menuFileItemOpen);

    frame.setJMenuBar(menuBar);

    // Setup labels and a button (=elements)
    labelA = new JLabel("Ich kann zeichnen ...", SwingConstants.CENTER);
    labelA.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    labelB = new JLabel("Du hast mich zum 0-mal gedrückt!", SwingConstants.CENTER);
    labelB.setAlignmentX(JLabel.LEFT_ALIGNMENT);
    
    JButton button = new JButton("Drücke mich!");
    button.setAlignmentX(JButton.LEFT_ALIGNMENT);
    button.addActionListener(new ClickListener());

    // Create/Setup panel and add elements to it -> Add panel to frame
    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    panel.add(labelA);
    panel.add(button);
    panel.add(labelB);
  
    frame.add(panel);
  }

  class ClickListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
        labelB.setText("Du hast mich zum " + String.valueOf(labelB_Counter) +"-mal gedrückt!");
        labelB_Counter += 1;
    }
}
}