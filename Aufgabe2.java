import javax.swing.*;  
public class Aufgabe2 {  
  
  public static void main(String[] args) {  
    JFrame frame = new JFrame("My First GUI");
    JLabel label = new JLabel("Hallo Welt, meine erste GUI.", SwingConstants.CENTER);
    frame.getContentPane().add(label);
    frame.setSize(480,480);
    frame.setResizable(false);
    frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}