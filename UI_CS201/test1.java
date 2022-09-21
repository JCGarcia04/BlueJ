
/**
 * Write a description of class test1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test1 extends JFrame 
{
    JButton okButton = new JButton();
    JButton exitButton = new JButton();
    
    JLabel fNameLabel = new JLabel();
    JLabel lNameLabel = new JLabel();
    JLabel sectionLabel = new JLabel();
    
    JTextField fNameTextField = new JTextField();
    JTextField lNameTextField = new JTextField();
    JTextField sectionTextField = new JTextField();
    
    String fName;
    String lName;
    String section;
    public test1()
    {
        setTitle("Enter Information");
        
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints ();
             
        fNameLabel.setText("Enter First Name");
        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        getContentPane().add(fNameLabel,gridConstraints);
        
        lNameLabel.setText("Enter Last Name");
        gridConstraints.gridx=0;
        gridConstraints.gridy=2;
        getContentPane().add(lNameLabel,gridConstraints);
        
        sectionLabel.setText("Enter Section");
        gridConstraints.gridx=0;
        gridConstraints.gridy=4;
        getContentPane().add(sectionLabel,gridConstraints);
        
        fNameTextField.setText("          ");
        gridConstraints.gridx=2;
        gridConstraints.gridy=0;
        getContentPane().add(fNameTextField,gridConstraints);
        
        lNameTextField.setText("          ");
        gridConstraints.gridx=2;
        gridConstraints.gridy=2;
        getContentPane().add(lNameTextField,gridConstraints);
        
        sectionTextField.setText("          ");
        gridConstraints.gridx=2;
        gridConstraints.gridy=4;
        getContentPane().add(sectionTextField,gridConstraints);
        
        okButton.setText("OK");
        gridConstraints.gridx=0;
        gridConstraints.gridy=6;
        getContentPane().add(okButton,gridConstraints);
        
        okButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                okButtonActionPerformed(e);
            }
        });     
               
        exitButton.setText("Exit");
        gridConstraints.gridx=2;
        gridConstraints.gridy=6;
        getContentPane().add(exitButton,gridConstraints);
        
        exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                exitButtonActionPerformed(e);
            }
        });
        
        /*addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                exitForm(e);
            }
        });*/
        
        
        pack();
        
    }
    private void okButtonActionPerformed(ActionEvent e)
    {
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Good Morning! " + fName + lName + " and \n Welcome to! " + section);
    }
    
    private void exitButtonActionPerformed(ActionEvent e)
    {
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Thanks!");
    }
    
    
    public static void main(String[] args)
    {
        new test1().show();
    }
}
