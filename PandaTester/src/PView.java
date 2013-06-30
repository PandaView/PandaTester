import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EventListener;

import javax.imageio.ImageIO;

import PVLib.PVActive;
import PVLib.PVBackground;
import PVLib.PVCoordinate;
import PVLib.PVExistence;
import PVLib.PVGraphical;


public class PView extends PVExistence {
	
	private ArrayList<PVActive> actives;
	private PVBackground		bkg;

	public PView(String appName) {
		super(appName);		
		super.setSize(500, 800);
		
		
		
	}

	@Override
	protected ArrayList<PVActive> createPVActives() {
		
		actives = new ArrayList<PVActive>();
		
		PVGraphical img_1 = new PVGraphical();
		BufferedImage img_1_img = null;
		
		try {
			img_1_img = ImageIO.read(new File("panda1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("no pic");
		}
		
		img_1.setImg(img_1_img);
		
		img_1.setCoordinate(20, 20);
			
		actives.add(img_1);
		return actives;
		
	}

	@Override
	protected PVBackground createPVBackground() {
		
		this.bkg = new PVBackground();
		
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("background1.png"));
			System.out.println("Yes pic");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("no pic");
		}
		
		System.out.print(" oh hai ");
		
		bkg.setImage(img);
		return bkg;
	}

}
