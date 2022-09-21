
/**
 * Write a description of class MyFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
public class MyFrame extends JFrame
{
    public MyFrame()
    {
        setSize(640,400);
        setLocation(0,0);
        setTitle("Garcia, John Clarenz C. " + " | " + " CS - 201");
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new MyFrame();
    }
}
