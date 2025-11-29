import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class catchMe extends Frame implements MouseMotionListener{

	int circleX = 150, circleY = 150, circleRadius=25;
	
	
	catchMe(){
		addMouseMotionListener(this);
		
		setSize(400, 400);
		setLayout(null);
		setTitle("Catch me");
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
		
	}
	
	public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {
    	
    }

    public void mouseExited(MouseEvent e) {}
	
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		
		if(x < circleX+circleRadius) {
			circleX++;
		}
		if(x > circleX+circleRadius) {
			circleX--;
		}
		repaint();
		
		if(x < circleY+circleRadius) {
			circleY++;
		}
		if(x > circleY+circleRadius) {
			circleY--;
		}
		repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(circleX, circleY, 2 * circleRadius, 2 * circleRadius);
	}
	
	public static void main(String[] args) {
	       new catchMe();

		}

}
