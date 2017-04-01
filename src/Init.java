import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Init extends JPanel {
	 public Init() {
		 Piksel px = new Piksel();
		 
	      addMouseListener(new MouseAdapter() {
	    	  //Fare bas�ld���nda nokta objesini olu�turur.
	          public void mousePressed(MouseEvent me) {
	        	 /**
	        	  * Graphics objesi JPanelden al�n�r. MouseEvent koordinatlar� g�nderir.
	        	  */
	            px.paintComponent(getGraphics(),me.getX(),me.getY());
	          	}
	          }); 
	  }

	
	
	public static void main(String Args[]){
		JFrame frame = new JFrame();
		frame.getContentPane().add(new Init());
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		
	}
}
