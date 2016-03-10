import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Timer;
import java.awt.event.ActionListener;
import java.lang.*;


import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

class Surface extends JPanel {

    private void doDrawing(Graphics g) {

        
        int dimx=600;
        int dimy=400;
        

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Fottiti Coglione", 50, 50);

          g2d.setPaint(new Color(150, 150, 150));

             RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
               RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        
        g2d.fillRect(20, 20, 600, 400);
        g2d.setBackground(new Color(0,0,0));
        g2d.setPaint(new Color(250,250,250));
        g2d.fillRect(20, 20, 600, 400);
        g2d.setPaint(new Color(150, 150, 150));
        g2d.fillRect(20, 20, dimx, dimy);

       
        while(dimx>50){
           /* g2d.setPaint(new Color(250,250,250));
            g2d.fillRect(20, 20, 600, 400);
            dimx-=10;
            dimy-=10;
            g2d.setPaint(new Color(150, 150, 150));
            g2d.fillRect(20, 20, dimx, dimy);
            /*try {
                Thread.sleep(100);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                System.out.println("Errorroror");
                Thread.currentThread().interrupt();

            }*/

        }

        
  		
        

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}


