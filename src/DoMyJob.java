import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class DoMyJob extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoMyJob frame = new DoMyJob();
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
	public DoMyJob() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{141, 46, 86, 4, 1, 0, 0};
		gbl_contentPane.rowHeights = new int[]{22, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblUnoMac = new JLabel("UnoMac");
		GridBagConstraints gbc_lblUnoMac = new GridBagConstraints();
		gbc_lblUnoMac.anchor = GridBagConstraints.WEST;
		gbc_lblUnoMac.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnoMac.gridx = 0;
		gbc_lblUnoMac.gridy = 0;
		contentPane.add(lblUnoMac, gbc_lblUnoMac);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JPanel MasterPanel = new JPanel();
		GridBagConstraints gbc_MasterPanel = new GridBagConstraints();
		gbc_MasterPanel.insets = new Insets(0, 0, 5, 5);
		gbc_MasterPanel.anchor = GridBagConstraints.WEST;
		gbc_MasterPanel.gridx = 4;
		gbc_MasterPanel.gridy = 0;
		contentPane.add(MasterPanel, gbc_MasterPanel);
		GridBagLayout gbl_MasterPanel = new GridBagLayout();
		gbl_MasterPanel.columnWidths = new int[]{0};
		gbl_MasterPanel.rowHeights = new int[]{0};
		gbl_MasterPanel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_MasterPanel.rowWeights = new double[]{Double.MIN_VALUE};
		MasterPanel.setLayout(gbl_MasterPanel);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridheight = 4;
		gbc_textArea.gridwidth = 7;
		gbc_textArea.anchor = GridBagConstraints.NORTHWEST;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 2;
		contentPane.add(textArea, gbc_textArea);
	}

}
