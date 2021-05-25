import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MovingObject extends JFrame implements KeyListener {
	Canvas canvas;
	int x, y;
	
	public MovingObject() {

		this.setTitle("moving object");
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setSize(640, 480);
		x = 640 / 2;
		y = 480 / 2;
		canvas = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.setColor(Color.RED);
				g.fillOval(x, y, 15, 15);
			}
		};

		canvas.addKeyListener(this);

		this.add(canvas);

		this.setVisible(true);

	}

	@Override
	public void keyPressed(KeyEvent e) { 
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10; 
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10; 
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10; 
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10; 
		} else {
			return;
		} 
		canvas.repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//canvas.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//canvas.repaint();
	}  
}


