/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author DANIC
 */
public class MyCanvas extends JPanel{
    public MyCanvas () {
       setPreferredSize(new Dimension(400,300));
       setBackground(Color.GRAY);
   }
   @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //make sky
        
        g.setColor(new Color (127,233,245));
        g.fillRect(0,0, 400, 100);
        //make sun

        g.setColor(Color.YELLOW);
        g.fillOval(60, 60, 30, 30);
    }

}
