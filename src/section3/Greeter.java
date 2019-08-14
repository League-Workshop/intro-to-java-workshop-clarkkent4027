package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name=JOptionPane.showInputDialog("Whatisyourname");
JOptionPane.showMessageDialog(null,"Hello" +name);
}
}