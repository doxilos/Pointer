import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Piksel extends JComponent{
	private Color color;
	
    public Piksel(Color color)
    {
        super();
        this.color = color;
    }

    public Piksel()
    {
        this(Color.BLACK);
    }
    /**
     * Pencerede 3*3 piksellik bir alan� boyar.
     * @param g Graphics objesi
     * @param x Fare X
     * @param y	Fare Y
     * @throws NullPointerException Fare pencere �zerinde de�ilse Null g�nderir.
     */
    public void paintComponent(Graphics g,int x,int y){
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(x, y, 3, 3);
        
    }
	
}
