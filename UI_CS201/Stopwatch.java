
/**
 * Write a description of class Stopwatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
public class Stopwatch extends JFrame
{
    JButton startButton = new JButton();
    JButton stopButton = new JButton();
    JButton exitButton = new JButton();
    
    JLabel startLabel = new JLabel();
    JLabel stopLabel = new JLabel();
    JLabel exitLabel = new JLabel();
    
    JTextField startTextField = new JTextField();
    JTextField stopTextField = new JTextField();
    JTextField exitTextField = new JTextField();
    
    public Stopwatch()
    {
        setTitle("Stopwatch Application");
        
        
        getContentPane().setLayout(new GridBagLayout());
        
        GridBagConstraints gridConstraints = new GridBagConstraints ();
        startButton.setText("Start");
        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        getContentPane().add(startButton,gridConstraints);
        
        stopButton.setText("Stop");
        gridConstraints.gridx=0;
        gridConstraints.gridy=1;
        getContentPane().add(stopButton,gridConstraints);
        
        exitButton.setText("Exit");
        gridConstraints.gridx=0;
        gridConstraints.gridy=2;
        getContentPane().add(exitButton,gridConstraints);
        
        startLabel.setText("Start Timing");
        gridConstraints.gridx=2;
        gridConstraints.gridy=0;
        getContentPane().add(startLabel,gridConstraints);
        
        stopLabel.setText("Stop Timing");
        gridConstraints.gridx=2;
        gridConstraints.gridy=1;
        getContentPane().add(stopLabel,gridConstraints);
                
        startTextField.setText("  Start  ");
        gridConstraints.gridx=4;
        gridConstraints.gridy=0;
        getContentPane().add(startTextField,gridConstraints);
        
        stopTextField.setText("  Stop  ");
        gridConstraints.gridx=4;
        gridConstraints.gridy=1;
        getContentPane().add(stopTextField,gridConstraints);
                
        pack();
    }
    
    public static void main(String[] args)
    {
        new Stopwatch().show();
    }
}
