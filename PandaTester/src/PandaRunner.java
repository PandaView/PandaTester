import javax.swing.JFrame;


public class PandaRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PView test = new PView("PandaTester");
		test.revalidate();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
