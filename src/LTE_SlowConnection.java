import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class LTE_SlowConnection extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public LTE_SlowConnection() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblWhatServicesAre = new JLabel("What services are being affected");
		GridBagConstraints gbc_lblWhatServicesAre = new GridBagConstraints();
		gbc_lblWhatServicesAre.anchor = GridBagConstraints.WEST;
		gbc_lblWhatServicesAre.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhatServicesAre.gridx = 3;
		gbc_lblWhatServicesAre.gridy = 2;
		add(lblWhatServicesAre, gbc_lblWhatServicesAre);
		
		JLabel lblSlowSpeedHapping = new JLabel("Slow speed happing over Wireless or wired?");
		GridBagConstraints gbc_lblSlowSpeedHapping = new GridBagConstraints();
		gbc_lblSlowSpeedHapping.insets = new Insets(0, 0, 5, 5);
		gbc_lblSlowSpeedHapping.gridx = 3;
		gbc_lblSlowSpeedHapping.gridy = 3;
		add(lblSlowSpeedHapping, gbc_lblSlowSpeedHapping);
		
		JLabel lblSpeedAfterDirect = new JLabel("Speed after direct connect, wifi Off");
		GridBagConstraints gbc_lblSpeedAfterDirect = new GridBagConstraints();
		gbc_lblSpeedAfterDirect.anchor = GridBagConstraints.WEST;
		gbc_lblSpeedAfterDirect.insets = new Insets(0, 0, 5, 5);
		gbc_lblSpeedAfterDirect.gridx = 3;
		gbc_lblSpeedAfterDirect.gridy = 4;
		add(lblSpeedAfterDirect, gbc_lblSpeedAfterDirect);
		
		JLabel lblEnodeCell = new JLabel("Enode & cell ID:");
		GridBagConstraints gbc_lblEnodeCell = new GridBagConstraints();
		gbc_lblEnodeCell.anchor = GridBagConstraints.WEST;
		gbc_lblEnodeCell.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnodeCell.gridx = 3;
		gbc_lblEnodeCell.gridy = 5;
		add(lblEnodeCell, gbc_lblEnodeCell);
		
		JLabel lblCurrentFirmware = new JLabel("Current Firmware:");
		GridBagConstraints gbc_lblCurrentFirmware = new GridBagConstraints();
		gbc_lblCurrentFirmware.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentFirmware.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentFirmware.gridx = 3;
		gbc_lblCurrentFirmware.gridy = 6;
		add(lblCurrentFirmware, gbc_lblCurrentFirmware);
		
		JLabel lblDidYouPower = new JLabel("Did you power Cycle:");
		GridBagConstraints gbc_lblDidYouPower = new GridBagConstraints();
		gbc_lblDidYouPower.anchor = GridBagConstraints.WEST;
		gbc_lblDidYouPower.insets = new Insets(0, 0, 5, 5);
		gbc_lblDidYouPower.gridx = 3;
		gbc_lblDidYouPower.gridy = 7;
		add(lblDidYouPower, gbc_lblDidYouPower);
		
		JLabel lblHowTheMetrics = new JLabel("How the Metrics degraded?");
		GridBagConstraints gbc_lblHowTheMetrics = new GridBagConstraints();
		gbc_lblHowTheMetrics.anchor = GridBagConstraints.WEST;
		gbc_lblHowTheMetrics.insets = new Insets(0, 0, 5, 5);
		gbc_lblHowTheMetrics.gridx = 3;
		gbc_lblHowTheMetrics.gridy = 8;
		add(lblHowTheMetrics, gbc_lblHowTheMetrics);
		
		JCheckBox chckbxYes_DegradedMetrics = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxYes_DegradedMetrics = new GridBagConstraints();
		gbc_chckbxYes_DegradedMetrics.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxYes_DegradedMetrics.gridx = 4;
		gbc_chckbxYes_DegradedMetrics.gridy = 8;
		add(chckbxYes_DegradedMetrics, gbc_chckbxYes_DegradedMetrics);
		
		JCheckBox chckbxNo_DegradedMetrics = new JCheckBox("No");
		GridBagConstraints gbc_chckbxNo_DegradedMetrics = new GridBagConstraints();
		gbc_chckbxNo_DegradedMetrics.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNo_DegradedMetrics.gridx = 5;
		gbc_chckbxNo_DegradedMetrics.gridy = 8;
		add(chckbxNo_DegradedMetrics, gbc_chckbxNo_DegradedMetrics);
		
		JLabel lblCurrentMetrics = new JLabel("Current Metrics");
		GridBagConstraints gbc_lblCurrentMetrics = new GridBagConstraints();
		gbc_lblCurrentMetrics.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentMetrics.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentMetrics.gridx = 3;
		gbc_lblCurrentMetrics.gridy = 9;
		add(lblCurrentMetrics, gbc_lblCurrentMetrics);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 9;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblWanMtuSet = new JLabel("WAN MTU set to 1500");
		GridBagConstraints gbc_lblWanMtuSet = new GridBagConstraints();
		gbc_lblWanMtuSet.anchor = GridBagConstraints.WEST;
		gbc_lblWanMtuSet.insets = new Insets(0, 0, 5, 5);
		gbc_lblWanMtuSet.gridx = 3;
		gbc_lblWanMtuSet.gridy = 10;
		add(lblWanMtuSet, gbc_lblWanMtuSet);
		
		JLabel lblDeviceTime = new JLabel("Device Time:");
		GridBagConstraints gbc_lblDeviceTime = new GridBagConstraints();
		gbc_lblDeviceTime.anchor = GridBagConstraints.WEST;
		gbc_lblDeviceTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeviceTime.gridx = 3;
		gbc_lblDeviceTime.gridy = 11;
		add(lblDeviceTime, gbc_lblDeviceTime);
		
		JLabel lblConnection = new JLabel("Connection  Time:");
		GridBagConstraints gbc_lblConnection = new GridBagConstraints();
		gbc_lblConnection.anchor = GridBagConstraints.WEST;
		gbc_lblConnection.insets = new Insets(0, 0, 5, 5);
		gbc_lblConnection.gridx = 3;
		gbc_lblConnection.gridy = 12;
		add(lblConnection, gbc_lblConnection);
		
		JLabel lblIsTheCustomer = new JLabel("Is the Customer rate Limited?");
		GridBagConstraints gbc_lblIsTheCustomer = new GridBagConstraints();
		gbc_lblIsTheCustomer.anchor = GridBagConstraints.WEST;
		gbc_lblIsTheCustomer.insets = new Insets(0, 0, 5, 5);
		gbc_lblIsTheCustomer.gridx = 3;
		gbc_lblIsTheCustomer.gridy = 13;
		add(lblIsTheCustomer, gbc_lblIsTheCustomer);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 20;
		gbc_lblNewLabel.gridy = 17;
		add(lblNewLabel, gbc_lblNewLabel);

	}

}
