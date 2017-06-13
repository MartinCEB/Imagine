import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class TicketBuilder extends JFrame implements ActionListener {

	private JPanel MasterPane;
	private JTextField textField;
	JButton btnGenerate;
	NoConnection_GEM NoConGEM;
	JFrame export_Ticket, export_Escalation;
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public TicketBuilder() {
		
		//Set up Jframes for showing exports
		export_Escalation = new JFrame();
		export_Escalation.setSize(500, 500);
		export_Escalation.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		export_Escalation.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		NoConGEM = new NoConnection_GEM();
		
		setBounds(100, 100, 922, 900);
		MasterPane = new JPanel();
		MasterPane.setForeground(Color.LIGHT_GRAY);
		MasterPane.setBackground(Color.LIGHT_GRAY);
		MasterPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MasterPane);
		GridBagLayout gbl_MasterPane = new GridBagLayout();
		gbl_MasterPane.columnWidths = new int[] {0, 0};
		gbl_MasterPane.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_MasterPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_MasterPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		MasterPane.setLayout(gbl_MasterPane);
		
		JPanel JP_Options = new JPanel();
		GridBagConstraints gbc_JP_Options = new GridBagConstraints();
		gbc_JP_Options.gridwidth = 24;
		gbc_JP_Options.insets = new Insets(0, 0, 5, 0);
		gbc_JP_Options.fill = GridBagConstraints.HORIZONTAL;
		gbc_JP_Options.gridx = 0;
		gbc_JP_Options.gridy = 0;
		MasterPane.add(JP_Options, gbc_JP_Options);
		GridBagLayout gbl_JP_Options = new GridBagLayout();
		gbl_JP_Options.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_JP_Options.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_JP_Options.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_JP_Options.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		JP_Options.setLayout(gbl_JP_Options);
		
		JLabel JL_Search = new JLabel("Search By");
		GridBagConstraints gbc_JL_Search = new GridBagConstraints();
		gbc_JL_Search.anchor = GridBagConstraints.WEST;
		gbc_JL_Search.gridwidth = 3;
		gbc_JL_Search.insets = new Insets(0, 0, 5, 5);
		gbc_JL_Search.gridx = 1;
		gbc_JL_Search.gridy = 1;
		JP_Options.add(JL_Search, gbc_JL_Search);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		JP_Options.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblRouter = new JLabel("Router");
		GridBagConstraints gbc_lblRouter = new GridBagConstraints();
		gbc_lblRouter.anchor = GridBagConstraints.WEST;
		gbc_lblRouter.insets = new Insets(0, 0, 5, 5);
		gbc_lblRouter.gridx = 8;
		gbc_lblRouter.gridy = 1;
		JP_Options.add(lblRouter, gbc_lblRouter);
		
		JComboBox comboBox_Router = new JComboBox();
		GridBagConstraints gbc_comboBox_Router = new GridBagConstraints();
		gbc_comboBox_Router.fill = GridBagConstraints.BOTH;
		gbc_comboBox_Router.gridwidth = 5;
		gbc_comboBox_Router.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Router.gridx = 10;
		gbc_comboBox_Router.gridy = 1;
		JP_Options.add(comboBox_Router, gbc_comboBox_Router);
		
		JButton btnSubmitBuilder = new JButton("Change");
		btnSubmitBuilder.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_btnSubmitBuilder = new GridBagConstraints();
		gbc_btnSubmitBuilder.anchor = GridBagConstraints.WEST;
		gbc_btnSubmitBuilder.gridwidth = 3;
		gbc_btnSubmitBuilder.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubmitBuilder.gridx = 1;
		gbc_btnSubmitBuilder.gridy = 2;
		JP_Options.add(btnSubmitBuilder, gbc_btnSubmitBuilder);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 2;
		JP_Options.add(comboBox, gbc_comboBox);
		
		JLabel lblWhatTech = new JLabel("What Tech:");
		GridBagConstraints gbc_lblWhatTech = new GridBagConstraints();
		gbc_lblWhatTech.anchor = GridBagConstraints.WEST;
		gbc_lblWhatTech.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhatTech.gridx = 8;
		gbc_lblWhatTech.gridy = 2;
		JP_Options.add(lblWhatTech, gbc_lblWhatTech);
		
		JComboBox comboBox_Tech = new JComboBox();
		GridBagConstraints gbc_comboBox_Tech = new GridBagConstraints();
		gbc_comboBox_Tech.fill = GridBagConstraints.BOTH;
		gbc_comboBox_Tech.gridwidth = 5;
		gbc_comboBox_Tech.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_Tech.gridx = 10;
		gbc_comboBox_Tech.gridy = 2;
		JP_Options.add(comboBox_Tech, gbc_comboBox_Tech);
		
		btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(this);
		GridBagConstraints gbc_btnGenerate = new GridBagConstraints();
		gbc_btnGenerate.gridwidth = 3;
		gbc_btnGenerate.insets = new Insets(0, 0, 5, 5);
		gbc_btnGenerate.gridx = 1;
		gbc_btnGenerate.gridy = 3;
		JP_Options.add(btnGenerate, gbc_btnGenerate);
		
		JButton btnExportEsc = new JButton("Export ESC");
		GridBagConstraints gbc_btnExportEsc = new GridBagConstraints();
		gbc_btnExportEsc.insets = new Insets(0, 0, 5, 5);
		gbc_btnExportEsc.gridx = 8;
		gbc_btnExportEsc.gridy = 3;
		JP_Options.add(btnExportEsc, gbc_btnExportEsc);
		btnExportEsc.addActionListener(this);
		
		JPanel Builder = new JPanel();
		GridBagConstraints gbc_Builder = new GridBagConstraints();
		gbc_Builder.gridheight = 12;
		gbc_Builder.gridwidth = 24;
		gbc_Builder.insets = new Insets(0, 0, 5, 5);
		gbc_Builder.fill = GridBagConstraints.BOTH;
		gbc_Builder.gridx = 0;
		gbc_Builder.gridy = 1;

		Builder.add(NoConGEM);
		MasterPane.add(Builder, gbc_Builder);
		GridBagLayout gbl_Builder = new GridBagLayout();
		gbl_Builder.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Builder.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Builder.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Builder.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Builder.setLayout(gbl_Builder);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			if (source.getText() == "Generate")
			{
				System.out.println("Clicked" + source.getText());
				System.out.println(NoConGEM.exportUnoTicket());
			}
			if (source.getText()=="Export ESC")
			{
				System.out.println("dfasfsadasdsssssss");
			}
	}
	private JPanel getCurrentBuilder()
	{
		return NoConGEM.getJpanel();
	}
}
