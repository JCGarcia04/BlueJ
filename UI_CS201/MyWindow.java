
/**
 * Write a description of class MyWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
public class MyWindow
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setTitle("My Window");
        window.setVisible(true);
        //window.setSize(800,300);
        //window.setLocation(5,0);
        window.setBounds(0,0,800,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
