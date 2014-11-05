import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Card extends JPanel{
	
	public static final int SPADE=0;
	public static final int DICE = 1;
	public static final int CLUB =2;
	public static final int HEART =3;
	public static final String[] SUITS = {"spade","dice","club","heart"};
	public BufferedImage image;
	private int n;
	private int color;
	Image img;
	
	public Card(){}
	
	public Card(int n,int color){
		this.n=n;
		this.color = color;
		try{
		image = ImageIO.read(new File(getClass().getResource(SUITS[color]).getFile()));
		setBackground(Color.GREEN);
//		img = new I
		}catch(Exception e){}
	}

	public int getN() {
		return n;
	}

	public int getColor() {
		return color;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	public String getNval(){
		switch(n){
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default:
			return String.valueOf(n);
					
		}
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(65,110);
		
	};
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		
		g2d.setColor((color%2==0)?Color.BLACK:Color.RED);
		g2d.drawString(getNval(), 10, 10);
		g2d.drawString(getNval(), getWidth()-20,getHeight()-15);
		g2d.drawImage(image, null, 20, 10);
		
	}
	
	

}
