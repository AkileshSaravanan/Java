//How to dropdown in AWT program in java
import java.awt.*;
public class Dropdown
{
    Dropdown()
    {
        Frame f= new Frame(); 
        Choice c=new Choice(); 
        c.setBounds(100,100, 75,75);
        c.add("Item 1 by RMSA"); 
        c.add("Item 2 by RMS"); 
        c.add("Item 3 by RM"); 
        c.add("Item 4 by NR");
        c.add("Item 5 by God"); 
        f.add(c); 
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Dropdown();
    }
}