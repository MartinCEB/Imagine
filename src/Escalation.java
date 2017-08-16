import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;

public class Escalation extends JFrame implements ActionListener   {

	private JPanel contentPane;
	private JTextField textFieldSearch;
	JComboBox comboBoxTemplates;
	InfoGrabber IG;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws FailingHttpStatusCodeException 
	 */
	public Escalation() throws MalformedURLException, IOException {
		//IG = new InfoGrabber("Username","password");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblMac = new JLabel("Mac");
		GridBagConstraints gbc_lblMac = new GridBagConstraints();
		gbc_lblMac.gridwidth = 2;
		gbc_lblMac.insets = new Insets(0, 0, 5, 5);
		gbc_lblMac.gridx = 1;
		gbc_lblMac.gridy = 0;
		panel.add(lblMac, gbc_lblMac);
		
		textFieldSearch = new JTextField();
		GridBagConstraints gbc_textFieldSearch = new GridBagConstraints();
		gbc_textFieldSearch.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldSearch.gridwidth = 5;
		gbc_textFieldSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSearch.gridx = 4;
		gbc_textFieldSearch.gridy = 0;
		panel.add(textFieldSearch, gbc_textFieldSearch);
		textFieldSearch.setColumns(10);
		//String[] petStrings = { "Slow speed esclation", "Intermittent connection", "No connection", "Ra", "Pig" };
		comboBoxTemplates = new JComboBox();
		comboBoxTemplates.setModel(new DefaultComboBoxModel(new String[] {"Slow Speed Esclation", "No connection", "Intermittent Connection"}));
		
		GridBagConstraints gbc_comboBoxTemplates = new GridBagConstraints();
		gbc_comboBoxTemplates.gridwidth = 5;
		gbc_comboBoxTemplates.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxTemplates.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTemplates.gridx = 9;
		gbc_comboBoxTemplates.gridy = 0;
		panel.add(comboBoxTemplates, gbc_comboBoxTemplates);
		
		JButton btnGo = new JButton("Go");
		btnGo.addActionListener(this);
		GridBagConstraints gbc_btnGo = new GridBagConstraints();
		gbc_btnGo.insets = new Insets(0, 0, 5, 5);
		gbc_btnGo.gridx = 14;
		gbc_btnGo.gridy = 0;
		panel.add(btnGo, gbc_btnGo);
		
		JEditorPane editorPane = new JEditorPane();
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.gridheight = 2;
		gbc_editorPane.gridwidth = 6;
		gbc_editorPane.insets = new Insets(0, 0, 0, 5);
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridx = 1;
		gbc_editorPane.gridy = 2;
		//editorPane.setText(IG.getInstalledMetrics());
		panel.add(editorPane, gbc_editorPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{130, 164, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{14, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblWarnErr = new JLabel("Warnings, Errors and Optimization");
		GridBagConstraints gbc_lblWarnErr = new GridBagConstraints();
		gbc_lblWarnErr.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarnErr.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblWarnErr.gridx = 1;
		gbc_lblWarnErr.gridy = 0;
		panel_1.add(lblWarnErr, gbc_lblWarnErr);
		
		JLabel lblHelper = new JLabel("Helper");
		lblHelper.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblHelper = new GridBagConstraints();
		gbc_lblHelper.gridheight = 7;
		gbc_lblHelper.gridwidth = 6;
		gbc_lblHelper.gridx = 0;
		gbc_lblHelper.gridy = 1;
		setVisible(true);

		panel_1.add(lblHelper, gbc_lblHelper);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		/*
		String BTN_name = ((JButton) e.getSource()).getText();
		System.out.println(comboBoxTemplates.getSelectedItem());
		if (BTN_name.equals("Go"))
		{
			if (comboBoxTemplates.getSelectedItem().equals("Slow Speed Esclation"))
			{
				try {
					IG.LoginToWallGarden("martin.ball@imagine.ie","Imagine@");
					String routerType = IG.getRouterType(IG.SearchByMAC(textFieldSearch.getText()));
					IG.logIntoRouter(routerType);
					
				} catch (FailingHttpStatusCodeException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Tell em to fuck off");
			}
			System.out.println("");
		}*/
		
	}

}
