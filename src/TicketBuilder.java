import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class TicketBuilder extends JFrame implements ActionListener {

	private JPanel MasterPane; 
	JPanel currentPanel;
	private JTextField textField;
	JButton btnGenerate;
	LTE_SlowConnection LTESlow;
	LTE_NoConnection_CatSix no_Con_SiX;
	LTE_NoConnection_CatFour no_Con_Four;
	LTE_NoConnectionGreen no_Con_Green;
	LTE_IntermittentConnection_CatSix intermittentCon_catSix;
	LTE_IntermitterntConnection_CatFour intermittentCon_catFour;
	JFrame export_Ticket, export_Escalation;
	LTE_NoConnection_Haw NoCon_Haw;
	JTextPane jta;//Escalation Ticket Text pane
	JTextPane UnoTicketExport;//Generate ticket to UNO
	int mine[];
	LTE_IntermittentConnection LTE_Intter;
	public JComboBox 	comboBox_Router;
	public JComboBox 	comboBox_Tech;
	private JPanel 		Builder;
	JComboBox 			comboBox_Type;
	private JLabel lblNewLabel_Quotes;
	String[][] quotes_user;
	private JLabel lblNewQuotes;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketBuilder frame = new TicketBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public TicketBuilder() {
		
		intermittentCon_catFour = new LTE_IntermitterntConnection_CatFour(this);
		NoCon_Haw   			= new LTE_NoConnection_Haw(this);
		no_Con_Four 			= new LTE_NoConnection_CatFour(this);
		no_Con_SiX 				= new LTE_NoConnection_CatSix(this);
		no_Con_Green 			= new LTE_NoConnectionGreen(this);
		intermittentCon_catSix 	= new LTE_IntermittentConnection_CatSix(this);
		quotes_user = new String [1][6];
		//0 = jamie
		quotes_user[0][0] = "Only I can change my life. No one can do it for me.";
		quotes_user[0][1] = "With the new day comes new strength and new thoughts.";
		quotes_user[0][2] = "It always seems impossible until it's done.";
		quotes_user[0][3] = "Quality is not an act, it is a habit.";
		quotes_user[0][4] = "If you can dream it, you can do it.";
		quotes_user[0][5] = "Aim for the moon. If you miss, you may hit a star.";

		super.setTitle("The Evan Experience");


		export_Escalation = new JFrame("Esclation Exporter");
		export_Escalation.setSize(500, 500);
		export_Escalation.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		export_Escalation.setVisible(true);
		
		
		export_Ticket = new JFrame("Uno Ticket exporter");
		export_Ticket.setSize(500, 500);
		export_Ticket.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		export_Ticket.setVisible(true);
		
		jta 			= new JTextPane();
		UnoTicketExport = new JTextPane();
		JPanel testpan 				= new JPanel(new BorderLayout());
		JPanel JP_ExportTicket 		= new JPanel(new BorderLayout());
		//LTESlow
		jta.setContentType("text/html");
		testpan.add(jta);
		
		
		JP_ExportTicket.add(UnoTicketExport);
		
		export_Ticket.getContentPane().add(JP_ExportTicket,BorderLayout.CENTER);
		export_Escalation.getContentPane().add(testpan,BorderLayout.CENTER);
		
		setBounds(100, 100, 944, 1002);
		MasterPane = new JPanel();
		MasterPane.setForeground(Color.LIGHT_GRAY);
		MasterPane.setBackground(Color.LIGHT_GRAY);
		MasterPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MasterPane);
		GridBagLayout gbl_MasterPane = new GridBagLayout();
		gbl_MasterPane.columnWidths = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_MasterPane.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_MasterPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_MasterPane.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		MasterPane.setLayout(gbl_MasterPane);
		
		JPanel JP_Options = new JPanel();
		GridBagConstraints gbc_JP_Options = new GridBagConstraints();
		gbc_JP_Options.fill = GridBagConstraints.HORIZONTAL;
		gbc_JP_Options.gridwidth = 28;
		gbc_JP_Options.insets = new Insets(0, 0, 0, 0);
		gbc_JP_Options.gridx = 0;
		gbc_JP_Options.gridy = 0;
		MasterPane.add(JP_Options, gbc_JP_Options);
		GridBagLayout gbl_JP_Options = new GridBagLayout();
		gbl_JP_Options.columnWidths = new int[] {30, 30, 0, 30, 30, 30, 0, 30, 0, 0, 30, 30, 0, 30, 30, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_JP_Options.rowHeights = new int[] {30, 30, 30, 30, 30, 30};
		gbl_JP_Options.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_JP_Options.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		JP_Options.setLayout(gbl_JP_Options);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel JL_Search = new JLabel("Search By");
		GridBagConstraints gbc_JL_Search = new GridBagConstraints();
		gbc_JL_Search.fill = GridBagConstraints.VERTICAL;
		gbc_JL_Search.gridwidth = 5;
		gbc_JL_Search.insets = new Insets(0, 0, 5, 5);
		gbc_JL_Search.gridx = 1;
		gbc_JL_Search.gridy = 1;
		JP_Options.add(JL_Search, gbc_JL_Search);
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Gem Tech CAT 6");
		ls.add("Gem Tech CAT 4");
		ls.add("Green Packet");
		ls.add("Huawei");
		
		List<String> TicketType = new ArrayList<String>(); 
		TicketType.add("LTE No Connection");
		TicketType.add("LTE Slow Connection");
		TicketType.add("LTE Intermittent Connection");
		TicketType.add("Wifi Range problem");
		TicketType.add("Credit Issue");
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 7;
		gbc_textField.gridy = 1;
		JP_Options.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblRouter = new JLabel("Router");
		GridBagConstraints gbc_lblRouter = new GridBagConstraints();
		gbc_lblRouter.gridwidth = 2;
		gbc_lblRouter.insets = new Insets(0, 0, 5, 5);
		gbc_lblRouter.gridx = 13;
		gbc_lblRouter.gridy = 1;
		JP_Options.add(lblRouter, gbc_lblRouter);
				
				
				comboBox_Router = new JComboBox();
				comboBox_Router.setModel(new DefaultComboBoxModel(ls.toArray()));
				comboBox_Router.addActionListener (new ActionListener () {
				    public void actionPerformed(ActionEvent e) {
				        SwapBuilderTemplate(String.valueOf(comboBox_Type.getSelectedItem()),String.valueOf(comboBox_Router.getSelectedItem()));
				    }
				});
				
				GridBagConstraints gbc_comboBox_Router = new GridBagConstraints();
				gbc_comboBox_Router.fill = GridBagConstraints.BOTH;
				gbc_comboBox_Router.gridwidth = 5;
				gbc_comboBox_Router.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox_Router.gridx = 15;
				gbc_comboBox_Router.gridy = 1;
				JP_Options.add(comboBox_Router, gbc_comboBox_Router);
				System.out.println("Test:  " +  (String)comboBox_Router.getSelectedItem());
				
				JLabel lblWhatTech = new JLabel("What Tech:");
				GridBagConstraints gbc_lblWhatTech = new GridBagConstraints();
				gbc_lblWhatTech.anchor = GridBagConstraints.WEST;
				gbc_lblWhatTech.insets = new Insets(0, 0, 5, 5);
				gbc_lblWhatTech.gridx = 20;
				gbc_lblWhatTech.gridy = 1;
				JP_Options.add(lblWhatTech, gbc_lblWhatTech);
		
		comboBox_Type = new JComboBox();
		comboBox_Type.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		        System.out.println("Changed the box");
		        SwapBuilderTemplate(String.valueOf(comboBox_Type.getSelectedItem()),String.valueOf(comboBox_Router.getSelectedItem()));
		    }
		});
					
		btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(this);
				
		comboBox_Tech = new JComboBox();
		GridBagConstraints gbc_comboBox_Tech = new GridBagConstraints();
		gbc_comboBox_Tech.fill = GridBagConstraints.BOTH;
		gbc_comboBox_Tech.gridwidth = 5;
		gbc_comboBox_Tech.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Tech.gridx = 21;
		gbc_comboBox_Tech.gridy = 1;
		JP_Options.add(comboBox_Tech, gbc_comboBox_Tech);
		GridBagConstraints gbc_btnGenerate = new GridBagConstraints();
		gbc_btnGenerate.gridwidth = 5;
		gbc_btnGenerate.insets = new Insets(0, 0, 5, 5);
		gbc_btnGenerate.gridx = 1;
		gbc_btnGenerate.gridy = 2;
		JP_Options.add(btnGenerate, gbc_btnGenerate);
				
		JButton btnClear = new JButton("Clear");
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.anchor = GridBagConstraints.WEST;
		gbc_btnClear.gridwidth = 5;
		gbc_btnClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnClear.gridx = 7;
		gbc_btnClear.gridy = 2;
		JP_Options.add(btnClear, gbc_btnClear);
		comboBox_Type.setModel(new DefaultComboBoxModel(TicketType.toArray()));
		GridBagConstraints gbc_comboBox_Type = new GridBagConstraints();
		gbc_comboBox_Type.gridwidth = 5;
		gbc_comboBox_Type.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Type.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_Type.gridx = 15;
		gbc_comboBox_Type.gridy = 2;
				
		JP_Options.add(comboBox_Type, gbc_comboBox_Type);
		;
		
		lblNewQuotes = new JLabel("");
		//ImageIcon jamie_II 		= new ImageIcon(TicketBuilder.class.getResource("Images/jamie.png"));
		//lblNewQuotes.setIcon(jamie_II);
		lblNewQuotes.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	Random r = new Random();
		    	int low = 0;
		    	int high = 5;
		    	int Result = r.nextInt(high-low) + low;
		    	lblNewLabel_Quotes.setText(quotes_user[0][Result]);
		    }  
		}); 
		GridBagConstraints gbc_lblNewQuotes = new GridBagConstraints();
		gbc_lblNewQuotes.gridwidth = 2;
		gbc_lblNewQuotes.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewQuotes.gridx = 4;
		gbc_lblNewQuotes.gridy = 4;
		JP_Options.add(lblNewQuotes, gbc_lblNewQuotes);
		
		lblNewLabel_Quotes = new JLabel("Start by doing what's necessary; then do what's possible; and suddenly you are doing the impossible.");
		GridBagConstraints gbc_lblNewLabel_Quotes = new GridBagConstraints();
		gbc_lblNewLabel_Quotes.gridwidth = 22;
		gbc_lblNewLabel_Quotes.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_Quotes.gridx = 6;
		gbc_lblNewLabel_Quotes.gridy = 4;
		JP_Options.add(lblNewLabel_Quotes, gbc_lblNewLabel_Quotes);
		LTESlow = new LTE_SlowConnection(this);
		LTE_Intter = new LTE_IntermittentConnection(this);
		Builder = new JPanel();
		GridBagConstraints gbc_Builder = new GridBagConstraints();
		gbc_Builder.gridheight = 28;
		gbc_Builder.gridwidth = 28;
		gbc_Builder.fill = GridBagConstraints.BOTH;
		gbc_Builder.gridx = 0;
		gbc_Builder.gridy = 1;

		MasterPane.add(Builder, gbc_Builder);
		GridBagLayout gbl_Builder = new GridBagLayout();
		gbl_Builder.columnWidths = new int[] {0};
		gbl_Builder.rowHeights = new int[] {0};
		gbl_Builder.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Builder.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		Builder.setLayout(gbl_Builder);
		
		//Builder.add(NoConGEM);
		currentPanel = no_Con_SiX;
		GridBagConstraints gbc_NoConGEM = new GridBagConstraints();
		gbc_NoConGEM.fill = GridBagConstraints.BOTH;
		gbc_NoConGEM.insets = new Insets(0, 0, 5, 5);
		gbc_NoConGEM.gridwidth = 28;
		gbc_NoConGEM.gridx = 0;
		gbc_NoConGEM.gridheight = 27;
		gbc_NoConGEM.gridy = 1;
		Builder.add(currentPanel, gbc_NoConGEM);
	}

	public void SwapBuilderTemplate(String issue_Type,String router_Type)
	{

		//ls.add("Gem Tech CAT 4");
		//ls.add("Green Packet");
		if (issue_Type.equals("LTE Slow Connection"))
		{
			Builder.remove(currentPanel);
			currentPanel = LTESlow;
			Builder.add(currentPanel);
			Builder.repaint();
			revalidate();
		}
		
		if (issue_Type.equals("LTE No Connection"))
		{
			if (router_Type.equals("Gem Tech CAT 6"))
			{
				Builder.remove(currentPanel);
				currentPanel = no_Con_SiX;
				Builder.add(currentPanel);
				Builder.repaint();
				revalidate();
			}else if (router_Type.equals("Gem Tech CAT 4"))
			{
				Builder.remove(currentPanel);
				currentPanel = no_Con_Four;
				Builder.add(currentPanel);
				Builder.repaint();
				revalidate();
			}else if (router_Type.equals("Huawei"))
			{
				Builder.remove(currentPanel);
				currentPanel = 	NoCon_Haw;
				Builder.add(currentPanel);
				Builder.repaint();
				revalidate();
			}else if (router_Type.equals("Green Packet"))
			{
				Builder.remove(currentPanel);
				currentPanel = 	no_Con_Green;
				Builder.add(currentPanel);
				Builder.repaint();
				revalidate();
			}
		}

		if (issue_Type.equals("LTE Intermittent Connection"))
		{
			if (router_Type.equals("Gem Tech CAT 6"))
			{
				
				Builder.remove(currentPanel);
				currentPanel = LTE_Intter;
				Builder.add(currentPanel);
				Builder.repaint();
				revalidate();
			}else if (router_Type.equals("Gem Tech CAT 4"))
			{
				Builder.remove(currentPanel);
				currentPanel = intermittentCon_catFour;
				Builder.add(currentPanel);
				Builder.repaint();
				revalidate();
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{

			JButton source = (JButton)e.getSource();
			if (source.getText() == "Generate")
			{
				//If the it's a no connection issue
				if (comboBox_Type.getSelectedItem().toString().equals("LTE No Connection")) 
				{
					//If the router is a cat 4
					if (comboBox_Router.getSelectedItem().toString().equals("Gem Tech CAT 4"))
					{
						UnoTicketExport.setText(no_Con_Four.exportUnoTicket());
						System.out.println(no_Con_Four.exportUnoTicket());
						jta.setText(no_Con_Four.generateEscalation());
					}else if (comboBox_Router.getSelectedItem().toString().equals("Gem Tech CAT 6"))
					{
						UnoTicketExport.setText(no_Con_SiX.exportUnoTicket());
						//System.out.println(no_Con_SiX.exportUnoTicket());
						jta.setText(no_Con_SiX.generateEscalation());
					}else if (comboBox_Router.getSelectedItem().toString().equals("Huawei"))
					{
						UnoTicketExport.setText(NoCon_Haw.exportUnoTicket());
						//System.out.println(no_Con_SiX.exportUnoTicket());
						jta.setText(NoCon_Haw.generateEscalation());
					}else if (comboBox_Router.getSelectedItem().toString().equals("Green Packet"))
					{
						
						UnoTicketExport.setText(no_Con_Green.exportUnoTicket());
						jta.setText(no_Con_Green.generateEscalation());
					}

				}else if (comboBox_Type.getSelectedItem().toString().equals("LTE Slow Connection"))
				{
					
					System.out.println("Clicked" + source.getText());
					jta.setText(LTESlow.generateEscalation());
					UnoTicketExport.setText(LTESlow.exportUnoTicket());
				}else if (comboBox_Type.getSelectedItem().toString().equals("LTE Intermittent Connection"))
				{
					if (comboBox_Router.getSelectedItem().toString().equals("Gem Tech CAT 4")) {
						jta.setText(intermittentCon_catFour.generateEscalation());
						UnoTicketExport.setText(intermittentCon_catFour.exportUnoTicket());
					}
					
				} 
			}
	}

	public String getTech()
	{
		return "Manual input for now";
	}
	public JPanel getCurrentBuilder()
	{
		return currentPanel;
	}

	public String getDevice() {
		return comboBox_Router.getSelectedItem().toString();
	}
}
