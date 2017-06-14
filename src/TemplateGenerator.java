import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JPanel;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;

import javax.swing.*;
public class TemplateGenerator  implements ActionListener{

	JButton BTN_gather;
	public TemplateGenerator(String mac,String username,String password) throws FailingHttpStatusCodeException, MalformedURLException, IOException 
	{
		//(String mac,String username,String password)
		InfoGrabber IG = new InfoGrabber(username,password);
		
	}
	
	
	public String GenerateSlowSpeed(String ticketNumber, String Uno,String description)
	{
		return "TRN:" + ticketNumber + " IMSI:XXXXXXXXXXXXXXX Enodb:XX Cell:XX ISSUE: Slow Connection";
	}
	
	//Sets up the GUI for the script
	public JPanel SlowSpeedTemplate(String filledTemplate)
	{
		BTN_gather  = new JButton("Gather Information");
		JPanel all 			= new JPanel(new GridLayout(2,2));
		JLabel L_Uno 		= new JLabel("UNO Account Number");
		JTextField TF_Uno 	= new JTextField(10);
		all.add(L_Uno);
		all.add(TF_Uno);
		
		return all;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BTN_gather)
		{
			System.out.println("Button works");
		}
	}
	
	
}
