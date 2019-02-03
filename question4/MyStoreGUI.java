package question4;

/**
 * A class to create a GUI that Calculates a customers total at the book store.
 * @author Justin Kord
 * Student number 0360764
 *
 */

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyStoreGUI extends javax.swing.JFrame{

double TotalCost=0.0;
  
JPanel jp = new JPanel();
JPanel jp2 = new JPanel();
JPanel jp3 = new JPanel();
  
JButton btnCalc = new JButton("Calculate Charges");
JButton btnExit = new JButton("Exit");
  
JLabel partCost = new JLabel("Part Cost:");
JLabel hoursOfLab = new JLabel("Hours of Labour:");
  

JTextField txtPartCost = new JTextField();
JTextField txtHoursOfLab = new JTextField();
  
JCheckBox chHdd = new JCheckBox("Install Hard Drive ($25.00)");
JCheckBox chRam = new JCheckBox("Install RAM ($15.00)");
JCheckBox chVirus = new JCheckBox("Remove Virus ($50.00)");
JCheckBox chFormatHd = new JCheckBox("Format Hardrive ($80.00)");
JCheckBox chHourlyLabour = new JCheckBox("Quote Hourly Labour ($10.00)");
  
public MyStoreGUI() {
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
getContentPane().setLayout(new java.awt.GridLayout(3, 1));

setSize(300, 400);
jp.setBorder(BorderFactory.createTitledBorder("Standard Service"));
jp2.setBorder(BorderFactory.createTitledBorder("Hourly Service"));
// getContentPane().setLayout(new java.awt.GridLayout(3, 1));
jp.setLayout(new GridLayout(5,1));
jp2.setLayout(new GridLayout(2, 2));
jp3.setLayout(new GridLayout(1, 2));
jp2.add(partCost);
jp2.add(txtPartCost);
jp2.add(hoursOfLab);
jp2.add(txtHoursOfLab);
  
jp.add(chHdd);
jp.add(chRam);
jp.add(chVirus);
jp.add(chFormatHd);
jp.add(chHourlyLabour);   
  
jp3.add(btnCalc);
jp3.add(btnExit);
  
btnCalc.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
btnCalcActionPerformed(evt);
}
});

btnExit.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {

System.exit(0);
}
});


getContentPane().add(jp);
getContentPane().add(jp2);
getContentPane().add(jp3);
  
  
}

  
private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {   
// TODO add your handling code here:
  
TotalCost = 0.0;
if(txtPartCost.getText().length()>0)
{
try
{
TotalCost += Double.parseDouble(txtPartCost.getText());
  
if(txtHoursOfLab.getText().length()>0)
{
try
{
TotalCost += (Double.parseDouble(txtHoursOfLab.getText())*25);   
  
if(chHdd.isSelected())
TotalCost += 25.00;
if(chRam.isSelected())
TotalCost += 15.00;
if(chVirus.isSelected())
TotalCost += 50.00;
if(chFormatHd.isSelected())
TotalCost += 80.00;
if(chHourlyLabour.isSelected())
TotalCost += 10.00;
  
JOptionPane.showMessageDialog(partCost, "Total Cost = $" +String.format( "%.2f", TotalCost ));
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(partCost, "Please enter a valid part cost");
}
}
else
JOptionPane.showMessageDialog(partCost, "Enter Hourly cost if none type 0");    
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(partCost, "Please enter a valid part cost");
}
}
else
JOptionPane.showMessageDialog(partCost, "Enter Part Cost if none type 0");  
}

public static void main(String args[]) {  
  
// LOOK AND FEEL CODE

try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
if ("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(MyStoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(MyStoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(MyStoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(MyStoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
// END OF LOOK AND FEEL


JFrame frame = new MyStoreGUI();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("LU Computer Store");
frame.setVisible(true);
  
}

  
}