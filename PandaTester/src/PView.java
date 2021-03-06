import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EventListener;

import javax.imageio.ImageIO;

import PVLib.PVActive;
import PVLib.PVBackground;
import PVLib.PVButton;
import PVLib.PVCoordinate;
import PVLib.PVExistence;
import PVLib.PVGraphical;


public class PView extends PVExistence {
	
	private ArrayList<PVActive> actives;
	private PVBackground		bkg;

	public PView(String appName) {
		super(appName);		
		super.setSize(500, 500);		
	}

	@Override
	protected ArrayList<PVActive> createPVActives() {
		
		actives = new ArrayList<PVActive>();
		
		PVGraphical img_1 = new PVGraphical();
		BufferedImage img_1_img = null;
		BufferedImage img_2_img = null;
		try {
			img_1_img = ImageIO.read(new File("panda1.jpg"));
			img_2_img = ImageIO.read(new File("panda1.jpg"));
			System.out.println("Yes pic");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("no pic");
		}
		
		img_1.setImg(img_1_img);
		PVButton img_2 = new PVButton( img_2_img, "text", new PVCoordinate( 75, 50 ), new PVCoordinate( 10, 10) );
		img_2.setTextColor( Color.red );
		//img_2.enableBackgroundResize();
		img_1.setCoordinate(80, 80);
		
		img_2.setListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				moveImg();
				
			}
			
			
		});
		actives.add(img_2);
		//actives.add(img_1);
		
		
		return actives;
		
	}

	public void moveImg() {
		this.actives.get( 0 ).move(20, 20);
	}
	@Override
	protected PVBackground createPVBackground() {
		
		this.bkg = new PVBackground();
		
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("background1.png"));
			System.out.println("Yes bg");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("no pic");
		}
				
		bkg.setImage(img);
		return bkg;
	}

	
}


