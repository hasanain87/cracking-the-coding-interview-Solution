import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ChemCam {

	
	
	public static void Power_on() throws InterruptedException, MalformedURLException, IOException {

		System.out.println("Turned On the ChemCam!");
		Thread.sleep(5000);
		System.out.println("ChemCam is on");
		Laser();
		System.out.println("ChemCam Turned Off");
		Thread.sleep(5000);
		
		Images("https://mars.nasa.gov/system/resources/detail_files/3740_PIA15104-ChemCam-spectrum-full2.jpg");
     
	}


	public static void Cooler() throws InterruptedException {

		System.out.println("Cool down laser for 5 min!");

		Thread.sleep(5000);

	

	}

	public static void Spectrometer() throws InterruptedException {

		System.out.println("Spectrometer Turned On!\n\nAnalysing Spectrograph . . . . ");

		Thread.sleep(2000);

		System.out.println("Spectral Analysis Completed!");

		Thread.sleep(1500);

		System.out.println("Spectrometer Turned Off!");

	}

	
	
	public static void Images(String URL) throws InterruptedException, MalformedURLException, IOException {
	BufferedImage img = ImageIO.read(new URL(URL));
	    ImageIcon icon = new ImageIcon(img);
	    JFrame frame = new JFrame();
	    frame.setLayout(new FlowLayout());
	    frame.setSize(800, 800);
	    JLabel lbl = new JLabel();
	    lbl.setIcon(icon);
	    frame.add(lbl);
	    frame.setVisible(true);
	    Thread.sleep(4000);
	    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
	
	
	public static void RMI() throws InterruptedException, MalformedURLException, IOException {

		System.out.println("RMI Turned On!\n\nCapturing micro-image . . . . ");

		Thread.sleep(2000);

		System.out.println("Image captured!");
		Images("https://thenypost.files.wordpress.com/2018/12/mars-rover-curiosity.jpg?quality=90&strip=all&w=618&h=410&crop=1");

		Thread.sleep(1500);

		

	}

	public static void Laser() throws InterruptedException, MalformedURLException, IOException {

		System.out.println("Laser Turned On!");

		Thread.sleep(1500);

		try {
			RMI();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("check if distance is 7 m from the target!");
		Thread.sleep(2000);
		System.out.println("distance adjusted!");
		
		System.out.println("Firing laser beams!");
		
		Thread.sleep(2000);
		
		Images("http://www.leonarddavid.com/wp-content/uploads/2018/11/Curiosity-ChemCam-Remote-Micro-Imager-Sol-2229-November-13-2018-3.jpg");
		
		Cooler();
		
		Spectrometer();

		Thread.sleep(1500);
		System.out.println("RMI Turned Off!");
		

		Thread.sleep(1500);

		System.out.println("Laser Turned Off!");
               
	}

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		//System.out.print("\033[H\033[2J");

		Power_on() ;

		System.out.println("\n\n\n\n");

	}

}