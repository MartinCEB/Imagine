import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JFrame;


public class Main {

	//static TemplateGenerator TG;
	public static void main(String []args) throws  MalformedURLException, IOException
	{

		//JFrame frame = new JFrame("Main Fr name");
		//TG = new TemplateGenerator();
		//System.out.println("Here");
		//InfoGrabber IG = new InfoGrabber("Noi","Martin.Ball@imagine.ie","Imagine\"");
		//Escalation es = new Escalation();
		TicketBuilder no = new TicketBuilder();
		//frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(300,450);
		//frame.add(TG.SlowSpeedTemplate(TG.GenerateSlowSpeed("9999", "2342432", "Customers has slow speeds between 4 and 3")));
	}
}
