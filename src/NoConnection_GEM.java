import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class NoConnection_GEM extends JPanel {
	private JTextField textField_DateIssueStarted;
	JCheckBox checkBox_PowerOn;
	JCheckBox checkBox_Off_Power;
	JCheckBox checkBox_AccessRouterYes;
	JCheckBox checkBox_AccessRouterNo;
	JCheckBox checkBox_LTESTR1;
	JCheckBox checkBox_LTESTR2;
	JCheckBox checkBox_LTESTR3;
	JCheckBox checkBox_LTESTR4;
	JCheckBox checkBox_LTESTR5;
	JCheckBox checkBox_SystemOn;
	JCheckBox checkBox_SystemOff;
	JCheckBox checkBox_Lan1On;
	JCheckBox checkBox_Lan1Off;
	JCheckBox checkBox_Lan2_On;
	JCheckBox checkBox_Lan2_Off;
	JCheckBox checkBox_2G_On;
	JCheckBox checkBox_2GOff;
	JCheckBox checkBox_5G_On;
	JCheckBox checkBox_5G_Off;
	JCheckBox checkBox_Phone_On;
	JCheckBox checkBox_Phone_Off;
	JLabel label_WanCable;
	JCheckBox checkBox_WAN_YES;
	JLabel label_PowerCycle;
	JCheckBox checkBox_PC_Done;
	JLabel label_PowerCycle_l;
	JCheckBox checkBox_DirectCon_Done;
	JCheckBox checkBox_PingRouter_Yes;
	JCheckBox checkBox_PingRouter_No;
	JCheckBox checkBox_PingRadio_Yes;
	JCheckBox checkBox_Ping_Radio_No;
	JLabel label_PinEight;
	JCheckBox checkBox_PingEight_Yes;
	JCheckBox checkBox_PingEight_No;
	JCheckBox checkBox_PingGoogleIE_Yes;
	JCheckBox checkBox_PingGoogle_No;
	/**
	 * Create the panel.
	 */
	private JPanel NoConnection_Gem;
	private JCheckBox chckbxWifiOn_YES;
	private JCheckBox chckbxWifiOn_No;
	private JLabel lblDevicesOnDHCP;
	private JCheckBox chckbxDHCP_Yes;
	private JCheckBox chckbxDHCP_No;
	private JLabel lblRouterPluggegInto;
	private JCheckBox chckbxWallSocket_Yes;
	private JCheckBox chckbxWallSocket_No;
	private JLabel lblIsThereAn;
	private JCheckBox chckbxOutage_Yes;
	private JCheckBox chckbxOutage_No;
	private JLabel lblFiddleTheCable;
	private JLabel lblResetTheWan;
	private JLabel lblCustomerConnectedWith;
	private JLabel lblChangeWifiChannel;
	private JCheckBox chckbxUsingMacs_Yes;
	private JCheckBox chckbxUsingMacs_No;
	private JLabel lblEsclationDetails;
	private JLabel lblNewLongitudeLatitude;
	private JTextField textFieldLatAndLong;
	private JLabel lblNewMoveConnection;
	private JCheckBox chckbxYes_ConnectionMoved;
	private JCheckBox chckbxNo_ConnectionMoved;
	private JLabel lblCurrentEnode;
	private JLabel lblCurrentCellId;
	private JTextField textField_CurrentENode;
	private JTextField textFieldCurrentCellID;
	public NoConnection_GEM() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{769, 0};
		gridBagLayout.rowHeights = new int[]{819, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		NoConnection_Gem = new JPanel();
		GridBagConstraints gbc_NoConnection_Gem = new GridBagConstraints();
		gbc_NoConnection_Gem.fill = GridBagConstraints.BOTH;
		gbc_NoConnection_Gem.gridx = 0;
		gbc_NoConnection_Gem.gridy = 0;
		add(NoConnection_Gem, gbc_NoConnection_Gem);
		GridBagLayout gbl_NoConnection_Gem = new GridBagLayout();
		gbl_NoConnection_Gem.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_NoConnection_Gem.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_NoConnection_Gem.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_NoConnection_Gem.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		NoConnection_Gem.setLayout(gbl_NoConnection_Gem);
		
		JLabel label_IssueStarted = new JLabel("Date Issue Started");
		GridBagConstraints gbc_label_IssueStarted = new GridBagConstraints();
		gbc_label_IssueStarted.anchor = GridBagConstraints.EAST;
		gbc_label_IssueStarted.insets = new Insets(0, 0, 5, 5);
		gbc_label_IssueStarted.gridx = 2;
		gbc_label_IssueStarted.gridy = 2;
		NoConnection_Gem.add(label_IssueStarted, gbc_label_IssueStarted);
		
		textField_DateIssueStarted = new JTextField();
		textField_DateIssueStarted.setColumns(10);
		GridBagConstraints gbc_textField_DateIssueStarted = new GridBagConstraints();
		gbc_textField_DateIssueStarted.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_DateIssueStarted.gridwidth = 5;
		gbc_textField_DateIssueStarted.insets = new Insets(0, 0, 5, 5);
		gbc_textField_DateIssueStarted.gridx = 4;
		gbc_textField_DateIssueStarted.gridy = 2;
		NoConnection_Gem.add(textField_DateIssueStarted, gbc_textField_DateIssueStarted);
		
		JLabel label_1 = new JLabel("Lights On router");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		NoConnection_Gem.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("Power");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 4;
		NoConnection_Gem.add(label_2, gbc_label_2);
		
		checkBox_PowerOn = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_PowerOn = new GridBagConstraints();
		gbc_checkBox_PowerOn.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PowerOn.gridx = 4;
		gbc_checkBox_PowerOn.gridy = 4;
		NoConnection_Gem.add(checkBox_PowerOn, gbc_checkBox_PowerOn);
		
		checkBox_Off_Power = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_Off_Power = new GridBagConstraints();
		gbc_checkBox_Off_Power.gridwidth = 2;
		gbc_checkBox_Off_Power.fill = GridBagConstraints.BOTH;
		gbc_checkBox_Off_Power.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Off_Power.gridx = 5;
		gbc_checkBox_Off_Power.gridy = 4;
		NoConnection_Gem.add(checkBox_Off_Power, gbc_checkBox_Off_Power);
		
		JLabel label_Login = new JLabel("Can you log into their router");
		GridBagConstraints gbc_label_Login = new GridBagConstraints();
		gbc_label_Login.insets = new Insets(0, 0, 5, 5);
		gbc_label_Login.gridx = 12;
		gbc_label_Login.gridy = 4;
		NoConnection_Gem.add(label_Login, gbc_label_Login);
		
		checkBox_AccessRouterYes = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_LoginYes = new GridBagConstraints();
		gbc_checkBox_LoginYes.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_LoginYes.gridx = 14;
		gbc_checkBox_LoginYes.gridy = 4;
		NoConnection_Gem.add(checkBox_AccessRouterYes, gbc_checkBox_LoginYes);
		
		checkBox_AccessRouterNo = new JCheckBox("No");
		GridBagConstraints gbc_checkBox_AccessRouterNo = new GridBagConstraints();
		gbc_checkBox_AccessRouterNo.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_AccessRouterNo.gridx = 16;
		gbc_checkBox_AccessRouterNo.gridy = 4;
		NoConnection_Gem.add(checkBox_AccessRouterNo, gbc_checkBox_AccessRouterNo);
		
		JLabel label_4 = new JLabel("System");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 5;
		NoConnection_Gem.add(label_4, gbc_label_4);
		
		checkBox_SystemOn = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_SystemON = new GridBagConstraints();
		gbc_checkBox_SystemON.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_SystemON.gridx = 4;
		gbc_checkBox_SystemON.gridy = 5;
		NoConnection_Gem.add(checkBox_SystemOn, gbc_checkBox_SystemON);
		
		checkBox_SystemOff = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_SystemOff = new GridBagConstraints();
		gbc_checkBox_SystemOff.gridwidth = 2;
		gbc_checkBox_SystemOff.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_SystemOff.gridx = 5;
		gbc_checkBox_SystemOff.gridy = 5;
		NoConnection_Gem.add(checkBox_SystemOff, gbc_checkBox_SystemOff);
		
		JLabel label_WifiOff = new JLabel("Is Wifi Turned off?");
		GridBagConstraints gbc_label_WifiOff = new GridBagConstraints();
		gbc_label_WifiOff.anchor = GridBagConstraints.WEST;
		gbc_label_WifiOff.insets = new Insets(0, 0, 5, 5);
		gbc_label_WifiOff.gridx = 12;
		gbc_label_WifiOff.gridy = 5;
		NoConnection_Gem.add(label_WifiOff, gbc_label_WifiOff);
		
		chckbxWifiOn_YES = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxWifiOn_YES = new GridBagConstraints();
		gbc_chckbxWifiOn_YES.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWifiOn_YES.gridx = 14;
		gbc_chckbxWifiOn_YES.gridy = 5;
		NoConnection_Gem.add(chckbxWifiOn_YES, gbc_chckbxWifiOn_YES);
		
		chckbxWifiOn_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxWifiOn_No = new GridBagConstraints();
		gbc_chckbxWifiOn_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWifiOn_No.gridx = 16;
		gbc_chckbxWifiOn_No.gridy = 5;
		NoConnection_Gem.add(chckbxWifiOn_No, gbc_chckbxWifiOn_No);
		
		JLabel label_6 = new JLabel("LTE");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 2;
		gbc_label_6.gridy = 6;
		NoConnection_Gem.add(label_6, gbc_label_6);
		
		checkBox_LTESTR1 = new JCheckBox("1");
		GridBagConstraints gbc_checkBox_LTESTR1 = new GridBagConstraints();
		gbc_checkBox_LTESTR1.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_LTESTR1.gridx = 4;
		gbc_checkBox_LTESTR1.gridy = 6;
		NoConnection_Gem.add(checkBox_LTESTR1, gbc_checkBox_LTESTR1);
		
		checkBox_LTESTR2 = new JCheckBox("2");
		GridBagConstraints gbc_checkBox_LTESTR2 = new GridBagConstraints();
		gbc_checkBox_LTESTR2.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_LTESTR2.anchor = GridBagConstraints.WEST;
		gbc_checkBox_LTESTR2.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_LTESTR2.gridx = 6;
		gbc_checkBox_LTESTR2.gridy = 6;
		NoConnection_Gem.add(checkBox_LTESTR2, gbc_checkBox_LTESTR2);
		
		checkBox_LTESTR3 = new JCheckBox("3");
		GridBagConstraints gbc_checkBox_LTESTR3 = new GridBagConstraints();
		gbc_checkBox_LTESTR3.anchor = GridBagConstraints.WEST;
		gbc_checkBox_LTESTR3.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_LTESTR3.gridx = 7;
		gbc_checkBox_LTESTR3.gridy = 6;
		NoConnection_Gem.add(checkBox_LTESTR3, gbc_checkBox_LTESTR3);
		
		checkBox_LTESTR4 = new JCheckBox("4");
		GridBagConstraints gbc_checkBox_LTESTR4 = new GridBagConstraints();
		gbc_checkBox_LTESTR4.anchor = GridBagConstraints.WEST;
		gbc_checkBox_LTESTR4.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_LTESTR4.gridx = 8;
		gbc_checkBox_LTESTR4.gridy = 6;
		NoConnection_Gem.add(checkBox_LTESTR4, gbc_checkBox_LTESTR4);
		
		checkBox_LTESTR5 = new JCheckBox("5");
		GridBagConstraints gbc_checkBox_LTESTR5 = new GridBagConstraints();
		gbc_checkBox_LTESTR5.anchor = GridBagConstraints.WEST;
		gbc_checkBox_LTESTR5.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_LTESTR5.gridx = 10;
		gbc_checkBox_LTESTR5.gridy = 6;
		NoConnection_Gem.add(checkBox_LTESTR5, gbc_checkBox_LTESTR5);
		
		lblDevicesOnDHCP = new JLabel("Devices on the DHCP list?");
		GridBagConstraints gbc_lblDevicesOnDHCP = new GridBagConstraints();
		gbc_lblDevicesOnDHCP.anchor = GridBagConstraints.WEST;
		gbc_lblDevicesOnDHCP.insets = new Insets(0, 0, 5, 5);
		gbc_lblDevicesOnDHCP.gridx = 12;
		gbc_lblDevicesOnDHCP.gridy = 6;
		NoConnection_Gem.add(lblDevicesOnDHCP, gbc_lblDevicesOnDHCP);
		
		chckbxDHCP_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxDHCP_Yes = new GridBagConstraints();
		gbc_chckbxDHCP_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDHCP_Yes.gridx = 14;
		gbc_chckbxDHCP_Yes.gridy = 6;
		NoConnection_Gem.add(chckbxDHCP_Yes, gbc_chckbxDHCP_Yes);
		
		chckbxDHCP_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxDHCP_No = new GridBagConstraints();
		gbc_chckbxDHCP_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDHCP_No.gridx = 16;
		gbc_chckbxDHCP_No.gridy = 6;
		NoConnection_Gem.add(chckbxDHCP_No, gbc_chckbxDHCP_No);
		
		JLabel label_7 = new JLabel("Lan1");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 2;
		gbc_label_7.gridy = 7;
		NoConnection_Gem.add(label_7, gbc_label_7);
		
		checkBox_Lan1On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_Lan1On = new GridBagConstraints();
		gbc_checkBox_Lan1On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Lan1On.gridx = 4;
		gbc_checkBox_Lan1On.gridy = 7;
		NoConnection_Gem.add(checkBox_Lan1On, gbc_checkBox_Lan1On);
		
		checkBox_Lan1Off = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_Lan1Off = new GridBagConstraints();
		gbc_checkBox_Lan1Off.gridwidth = 3;
		gbc_checkBox_Lan1Off.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Lan1Off.gridx = 5;
		gbc_checkBox_Lan1Off.gridy = 7;
		NoConnection_Gem.add(checkBox_Lan1Off, gbc_checkBox_Lan1Off);
		
		lblRouterPluggegInto = new JLabel("Router into main socket?");
		lblRouterPluggegInto.setToolTipText("Is the socket in an extention lead or a main wall socket");
		GridBagConstraints gbc_lblRouterPluggegInto = new GridBagConstraints();
		gbc_lblRouterPluggegInto.insets = new Insets(0, 0, 5, 5);
		gbc_lblRouterPluggegInto.gridx = 12;
		gbc_lblRouterPluggegInto.gridy = 7;
		NoConnection_Gem.add(lblRouterPluggegInto, gbc_lblRouterPluggegInto);
		
		chckbxWallSocket_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxWallSocket_Yes = new GridBagConstraints();
		gbc_chckbxWallSocket_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWallSocket_Yes.gridx = 14;
		gbc_chckbxWallSocket_Yes.gridy = 7;
		NoConnection_Gem.add(chckbxWallSocket_Yes, gbc_chckbxWallSocket_Yes);
		
		chckbxWallSocket_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxWallSocket_No = new GridBagConstraints();
		gbc_chckbxWallSocket_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWallSocket_No.gridx = 16;
		gbc_chckbxWallSocket_No.gridy = 7;
		NoConnection_Gem.add(chckbxWallSocket_No, gbc_chckbxWallSocket_No);
		
		JLabel label_8 = new JLabel("Lan2");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 2;
		gbc_label_8.gridy = 8;
		NoConnection_Gem.add(label_8, gbc_label_8);
		
		checkBox_Lan2_On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_Lan2_On = new GridBagConstraints();
		gbc_checkBox_Lan2_On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Lan2_On.gridx = 4;
		gbc_checkBox_Lan2_On.gridy = 8;
		NoConnection_Gem.add(checkBox_Lan2_On, gbc_checkBox_Lan2_On);
		
		checkBox_Lan2_Off = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_Lan2_Off = new GridBagConstraints();
		gbc_checkBox_Lan2_Off.gridwidth = 3;
		gbc_checkBox_Lan2_Off.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Lan2_Off.gridx = 5;
		gbc_checkBox_Lan2_Off.gridy = 8;
		NoConnection_Gem.add(checkBox_Lan2_Off, gbc_checkBox_Lan2_Off);
		
		lblIsThereAn = new JLabel("Is there an outage?");
		GridBagConstraints gbc_lblIsThereAn = new GridBagConstraints();
		gbc_lblIsThereAn.insets = new Insets(0, 0, 5, 5);
		gbc_lblIsThereAn.gridx = 12;
		gbc_lblIsThereAn.gridy = 8;
		NoConnection_Gem.add(lblIsThereAn, gbc_lblIsThereAn);
		
		chckbxOutage_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxOutage_Yes = new GridBagConstraints();
		gbc_chckbxOutage_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOutage_Yes.gridx = 14;
		gbc_chckbxOutage_Yes.gridy = 8;
		NoConnection_Gem.add(chckbxOutage_Yes, gbc_chckbxOutage_Yes);
		
		chckbxOutage_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxOutage_No = new GridBagConstraints();
		gbc_chckbxOutage_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOutage_No.gridx = 16;
		gbc_chckbxOutage_No.gridy = 8;
		NoConnection_Gem.add(chckbxOutage_No, gbc_chckbxOutage_No);
		
		JLabel label_9 = new JLabel("2G");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 2;
		gbc_label_9.gridy = 9;
		NoConnection_Gem.add(label_9, gbc_label_9);
		
		checkBox_2G_On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_2G_On = new GridBagConstraints();
		gbc_checkBox_2G_On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_2G_On.gridx = 4;
		gbc_checkBox_2G_On.gridy = 9;
		NoConnection_Gem.add(checkBox_2G_On, gbc_checkBox_2G_On);
		
		checkBox_2GOff = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_2GOff = new GridBagConstraints();
		gbc_checkBox_2GOff.gridwidth = 3;
		gbc_checkBox_2GOff.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_2GOff.gridx = 5;
		gbc_checkBox_2GOff.gridy = 9;
		NoConnection_Gem.add(checkBox_2GOff, gbc_checkBox_2GOff);
		
		lblFiddleTheCable = new JLabel("Fiddle the WAN cable");
		GridBagConstraints gbc_lblFiddleTheCable = new GridBagConstraints();
		gbc_lblFiddleTheCable.insets = new Insets(0, 0, 5, 5);
		gbc_lblFiddleTheCable.gridx = 12;
		gbc_lblFiddleTheCable.gridy = 9;
		NoConnection_Gem.add(lblFiddleTheCable, gbc_lblFiddleTheCable);
		
		JLabel label_10 = new JLabel("5G");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 2;
		gbc_label_10.gridy = 10;
		NoConnection_Gem.add(label_10, gbc_label_10);
		
		checkBox_5G_On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_5G_On = new GridBagConstraints();
		gbc_checkBox_5G_On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_5G_On.gridx = 4;
		gbc_checkBox_5G_On.gridy = 10;
		NoConnection_Gem.add(checkBox_5G_On, gbc_checkBox_5G_On);
		
		checkBox_5G_Off = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_5G_Off = new GridBagConstraints();
		gbc_checkBox_5G_Off.gridwidth = 3;
		gbc_checkBox_5G_Off.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_5G_Off.gridx = 5;
		gbc_checkBox_5G_Off.gridy = 10;
		NoConnection_Gem.add(checkBox_5G_Off, gbc_checkBox_5G_Off);
		
		lblResetTheWan = new JLabel("Reset the WAN cable");
		GridBagConstraints gbc_lblResetTheWan = new GridBagConstraints();
		gbc_lblResetTheWan.insets = new Insets(0, 0, 5, 5);
		gbc_lblResetTheWan.gridx = 12;
		gbc_lblResetTheWan.gridy = 10;
		NoConnection_Gem.add(lblResetTheWan, gbc_lblResetTheWan);
		
		JLabel label_11 = new JLabel("Phone");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 2;
		gbc_label_11.gridy = 11;
		NoConnection_Gem.add(label_11, gbc_label_11);
		
		checkBox_Phone_On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_Phone_On = new GridBagConstraints();
		gbc_checkBox_Phone_On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Phone_On.gridx = 4;
		gbc_checkBox_Phone_On.gridy = 11;
		NoConnection_Gem.add(checkBox_Phone_On, gbc_checkBox_Phone_On);
		
		checkBox_Phone_Off = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_Phone_Off = new GridBagConstraints();
		gbc_checkBox_Phone_Off.gridwidth = 3;
		gbc_checkBox_Phone_Off.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Phone_Off.gridx = 5;
		gbc_checkBox_Phone_Off.gridy = 11;
		NoConnection_Gem.add(checkBox_Phone_Off, gbc_checkBox_Phone_Off);
		
		lblCustomerConnectedWith = new JLabel("User using macs devices?");
		lblCustomerConnectedWith.setToolTipText("Is the user trying to connection with mac devices (Iphone,Ipad, MacBook etc.)");
		GridBagConstraints gbc_lblCustomerConnectedWith = new GridBagConstraints();
		gbc_lblCustomerConnectedWith.insets = new Insets(0, 0, 5, 5);
		gbc_lblCustomerConnectedWith.gridx = 12;
		gbc_lblCustomerConnectedWith.gridy = 11;
		NoConnection_Gem.add(lblCustomerConnectedWith, gbc_lblCustomerConnectedWith);
		
		chckbxUsingMacs_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxUsingMacs_Yes = new GridBagConstraints();
		gbc_chckbxUsingMacs_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUsingMacs_Yes.gridx = 14;
		gbc_chckbxUsingMacs_Yes.gridy = 11;
		NoConnection_Gem.add(chckbxUsingMacs_Yes, gbc_chckbxUsingMacs_Yes);
		
		chckbxUsingMacs_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxUsingMacs_No = new GridBagConstraints();
		gbc_chckbxUsingMacs_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUsingMacs_No.gridx = 16;
		gbc_chckbxUsingMacs_No.gridy = 11;
		NoConnection_Gem.add(chckbxUsingMacs_No, gbc_chckbxUsingMacs_No);
		
		lblChangeWifiChannel = new JLabel("Change wifi channel below 6");
		GridBagConstraints gbc_lblChangeWifiChannel = new GridBagConstraints();
		gbc_lblChangeWifiChannel.insets = new Insets(0, 0, 5, 5);
		gbc_lblChangeWifiChannel.gridx = 12;
		gbc_lblChangeWifiChannel.gridy = 12;
		NoConnection_Gem.add(lblChangeWifiChannel, gbc_lblChangeWifiChannel);
		
		JLabel label_WanCable_1 = new JLabel("Is WAN cable in the right slot?");
		GridBagConstraints gbc_label_WanCable_1 = new GridBagConstraints();
		gbc_label_WanCable_1.fill = GridBagConstraints.BOTH;
		gbc_label_WanCable_1.gridwidth = 5;
		gbc_label_WanCable_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_WanCable_1.gridx = 2;
		gbc_label_WanCable_1.gridy = 13;
		NoConnection_Gem.add(label_WanCable_1, gbc_label_WanCable_1);
		
		checkBox_WAN_YES = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_WAN_YES = new GridBagConstraints();
		gbc_checkBox_WAN_YES.anchor = GridBagConstraints.WEST;
		gbc_checkBox_WAN_YES.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_WAN_YES.gridx = 8;
		gbc_checkBox_WAN_YES.gridy = 13;
		NoConnection_Gem.add(checkBox_WAN_YES, gbc_checkBox_WAN_YES);
		
		lblEsclationDetails = new JLabel("Esclation Details");
		GridBagConstraints gbc_lblEsclationDetails = new GridBagConstraints();
		gbc_lblEsclationDetails.gridwidth = 5;
		gbc_lblEsclationDetails.insets = new Insets(0, 0, 5, 5);
		gbc_lblEsclationDetails.gridx = 12;
		gbc_lblEsclationDetails.gridy = 13;
		NoConnection_Gem.add(lblEsclationDetails, gbc_lblEsclationDetails);
		
		JLabel label_PowerCycle_1 = new JLabel("Power Cycle");
		GridBagConstraints gbc_label_PowerCycle_1 = new GridBagConstraints();
		gbc_label_PowerCycle_1.fill = GridBagConstraints.BOTH;
		gbc_label_PowerCycle_1.anchor = GridBagConstraints.WEST;
		gbc_label_PowerCycle_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_PowerCycle_1.gridx = 2;
		gbc_label_PowerCycle_1.gridy = 14;
		NoConnection_Gem.add(label_PowerCycle_1, gbc_label_PowerCycle_1);
		
		checkBox_PC_Done = new JCheckBox("Done");
		GridBagConstraints gbc_checkBox_PC_Done = new GridBagConstraints();
		gbc_checkBox_PC_Done.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PC_Done.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PC_Done.gridx = 8;
		gbc_checkBox_PC_Done.gridy = 14;
		NoConnection_Gem.add(checkBox_PC_Done, gbc_checkBox_PC_Done);
		
		lblNewLongitudeLatitude = new JLabel("Longitude Latitude");
		GridBagConstraints gbc_lblNewLongitudeLatitude = new GridBagConstraints();
		gbc_lblNewLongitudeLatitude.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLongitudeLatitude.gridx = 12;
		gbc_lblNewLongitudeLatitude.gridy = 14;
		NoConnection_Gem.add(lblNewLongitudeLatitude, gbc_lblNewLongitudeLatitude);
		
		textFieldLatAndLong = new JTextField();
		GridBagConstraints gbc_textFieldLatAndLong = new GridBagConstraints();
		gbc_textFieldLatAndLong.gridwidth = 5;
		gbc_textFieldLatAndLong.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldLatAndLong.fill = GridBagConstraints.BOTH;
		gbc_textFieldLatAndLong.gridx = 14;
		gbc_textFieldLatAndLong.gridy = 14;
		NoConnection_Gem.add(textFieldLatAndLong, gbc_textFieldLatAndLong);
		textFieldLatAndLong.setColumns(10);
		
		JLabel label_PowerCycle_l_1 = new JLabel("User Direct connect");
		GridBagConstraints gbc_label_PowerCycle_l_1 = new GridBagConstraints();
		gbc_label_PowerCycle_l_1.anchor = GridBagConstraints.WEST;
		gbc_label_PowerCycle_l_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_PowerCycle_l_1.gridx = 2;
		gbc_label_PowerCycle_l_1.gridy = 15;
		NoConnection_Gem.add(label_PowerCycle_l_1, gbc_label_PowerCycle_l_1);
		
		checkBox_DirectCon_Done = new JCheckBox("Done");
		GridBagConstraints gbc_checkBox_DirectCon_Done = new GridBagConstraints();
		gbc_checkBox_DirectCon_Done.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_DirectCon_Done.gridx = 8;
		gbc_checkBox_DirectCon_Done.gridy = 15;
		NoConnection_Gem.add(checkBox_DirectCon_Done, gbc_checkBox_DirectCon_Done);
		
		lblNewMoveConnection = new JLabel("Customer move Connection?");
		GridBagConstraints gbc_lblNewMoveConnection = new GridBagConstraints();
		gbc_lblNewMoveConnection.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewMoveConnection.gridx = 12;
		gbc_lblNewMoveConnection.gridy = 15;
		NoConnection_Gem.add(lblNewMoveConnection, gbc_lblNewMoveConnection);
		
		chckbxYes_ConnectionMoved = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxYes_ConnectionMoved = new GridBagConstraints();
		gbc_chckbxYes_ConnectionMoved.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxYes_ConnectionMoved.gridx = 16;
		gbc_chckbxYes_ConnectionMoved.gridy = 15;
		NoConnection_Gem.add(chckbxYes_ConnectionMoved, gbc_chckbxYes_ConnectionMoved);
		
		chckbxNo_ConnectionMoved = new JCheckBox("No");
		GridBagConstraints gbc_chckbxNo_ConnectionMoved = new GridBagConstraints();
		gbc_chckbxNo_ConnectionMoved.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNo_ConnectionMoved.gridx = 17;
		gbc_chckbxNo_ConnectionMoved.gridy = 15;
		NoConnection_Gem.add(chckbxNo_ConnectionMoved, gbc_chckbxNo_ConnectionMoved);
		
		JLabel label_Pingrouter = new JLabel("Can ping Router");
		GridBagConstraints gbc_label_Pingrouter = new GridBagConstraints();
		gbc_label_Pingrouter.anchor = GridBagConstraints.WEST;
		gbc_label_Pingrouter.insets = new Insets(0, 0, 5, 5);
		gbc_label_Pingrouter.gridx = 2;
		gbc_label_Pingrouter.gridy = 16;
		NoConnection_Gem.add(label_Pingrouter, gbc_label_Pingrouter);
		
		checkBox_PingRouter_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_PingRouter_Yes = new GridBagConstraints();
		gbc_checkBox_PingRouter_Yes.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingRouter_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingRouter_Yes.gridx = 8;
		gbc_checkBox_PingRouter_Yes.gridy = 16;
		NoConnection_Gem.add(checkBox_PingRouter_Yes, gbc_checkBox_PingRouter_Yes);
		
		checkBox_PingRouter_No = new JCheckBox("No");
		GridBagConstraints gbc_checkBox_PingRouter_No = new GridBagConstraints();
		gbc_checkBox_PingRouter_No.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingRouter_No.gridx = 10;
		gbc_checkBox_PingRouter_No.gridy = 16;
		NoConnection_Gem.add(checkBox_PingRouter_No, gbc_checkBox_PingRouter_No);
		
		lblCurrentEnode = new JLabel("Current Enode");
		GridBagConstraints gbc_lblCurrentEnode = new GridBagConstraints();
		gbc_lblCurrentEnode.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentEnode.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentEnode.gridx = 12;
		gbc_lblCurrentEnode.gridy = 16;
		NoConnection_Gem.add(lblCurrentEnode, gbc_lblCurrentEnode);
		
		textField_CurrentENode = new JTextField();
		GridBagConstraints gbc_textField_CurrentENode = new GridBagConstraints();
		gbc_textField_CurrentENode.gridwidth = 2;
		gbc_textField_CurrentENode.insets = new Insets(0, 0, 5, 5);
		gbc_textField_CurrentENode.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_CurrentENode.gridx = 16;
		gbc_textField_CurrentENode.gridy = 16;
		NoConnection_Gem.add(textField_CurrentENode, gbc_textField_CurrentENode);
		textField_CurrentENode.setColumns(10);
		
		JLabel label_CanPingRadio = new JLabel("Can Ping radio");
		GridBagConstraints gbc_label_CanPingRadio = new GridBagConstraints();
		gbc_label_CanPingRadio.anchor = GridBagConstraints.WEST;
		gbc_label_CanPingRadio.insets = new Insets(0, 0, 5, 5);
		gbc_label_CanPingRadio.gridx = 2;
		gbc_label_CanPingRadio.gridy = 17;
		NoConnection_Gem.add(label_CanPingRadio, gbc_label_CanPingRadio);
		
		checkBox_PingRadio_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_PingRadio_Yes = new GridBagConstraints();
		gbc_checkBox_PingRadio_Yes.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingRadio_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingRadio_Yes.gridx = 8;
		gbc_checkBox_PingRadio_Yes.gridy = 17;
		NoConnection_Gem.add(checkBox_PingRadio_Yes, gbc_checkBox_PingRadio_Yes);
		
		checkBox_Ping_Radio_No = new JCheckBox("No");
		GridBagConstraints gbc_checkBox_Ping_Radio_No = new GridBagConstraints();
		gbc_checkBox_Ping_Radio_No.anchor = GridBagConstraints.WEST;
		gbc_checkBox_Ping_Radio_No.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Ping_Radio_No.gridx = 10;
		gbc_checkBox_Ping_Radio_No.gridy = 17;
		NoConnection_Gem.add(checkBox_Ping_Radio_No, gbc_checkBox_Ping_Radio_No);
		
		lblCurrentCellId = new JLabel("Current Cell ID");
		GridBagConstraints gbc_lblCurrentCellId = new GridBagConstraints();
		gbc_lblCurrentCellId.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentCellId.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentCellId.gridx = 12;
		gbc_lblCurrentCellId.gridy = 17;
		NoConnection_Gem.add(lblCurrentCellId, gbc_lblCurrentCellId);
		
		textFieldCurrentCellID = new JTextField();
		GridBagConstraints gbc_textFieldCurrentCellID = new GridBagConstraints();
		gbc_textFieldCurrentCellID.gridwidth = 2;
		gbc_textFieldCurrentCellID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCurrentCellID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCurrentCellID.gridx = 16;
		gbc_textFieldCurrentCellID.gridy = 17;
		NoConnection_Gem.add(textFieldCurrentCellID, gbc_textFieldCurrentCellID);
		textFieldCurrentCellID.setColumns(10);
		
		JLabel label_PinEight_1 = new JLabel("Can Ping 8.8.8.8");
		GridBagConstraints gbc_label_PinEight_1 = new GridBagConstraints();
		gbc_label_PinEight_1.anchor = GridBagConstraints.WEST;
		gbc_label_PinEight_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_PinEight_1.gridx = 2;
		gbc_label_PinEight_1.gridy = 18;
		NoConnection_Gem.add(label_PinEight_1, gbc_label_PinEight_1);
		
		checkBox_PingEight_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_PingEight_Yes = new GridBagConstraints();
		gbc_checkBox_PingEight_Yes.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingEight_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingEight_Yes.gridx = 8;
		gbc_checkBox_PingEight_Yes.gridy = 18;
		NoConnection_Gem.add(checkBox_PingEight_Yes, gbc_checkBox_PingEight_Yes);
		
		checkBox_PingEight_No = new JCheckBox("No");
		GridBagConstraints gbc_checkBox_PingEight_No = new GridBagConstraints();
		gbc_checkBox_PingEight_No.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingEight_No.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingEight_No.gridx = 10;
		gbc_checkBox_PingEight_No.gridy = 18;
		NoConnection_Gem.add(checkBox_PingEight_No, gbc_checkBox_PingEight_No);
		
		JLabel label_GoogleIE = new JLabel("Can Ping google.ie");
		GridBagConstraints gbc_label_GoogleIE = new GridBagConstraints();
		gbc_label_GoogleIE.anchor = GridBagConstraints.WEST;
		gbc_label_GoogleIE.insets = new Insets(0, 0, 5, 5);
		gbc_label_GoogleIE.gridx = 2;
		gbc_label_GoogleIE.gridy = 19;
		NoConnection_Gem.add(label_GoogleIE, gbc_label_GoogleIE);
		
		 checkBox_PingGoogleIE_Yes = new JCheckBox("Yes");
		 GridBagConstraints gbc_checkBox_PingGoogleIE_Yes = new GridBagConstraints();
		 gbc_checkBox_PingGoogleIE_Yes.anchor = GridBagConstraints.WEST;
		 gbc_checkBox_PingGoogleIE_Yes.insets = new Insets(0, 0, 5, 5);
		 gbc_checkBox_PingGoogleIE_Yes.gridx = 8;
		 gbc_checkBox_PingGoogleIE_Yes.gridy = 19;
		 NoConnection_Gem.add(checkBox_PingGoogleIE_Yes, gbc_checkBox_PingGoogleIE_Yes);
		 
		 checkBox_PingGoogle_No = new JCheckBox("No");
		 GridBagConstraints gbc_checkBox_PingGoogle_No = new GridBagConstraints();
		 gbc_checkBox_PingGoogle_No.anchor = GridBagConstraints.WEST;
		 gbc_checkBox_PingGoogle_No.insets = new Insets(0, 0, 5, 5);
		 gbc_checkBox_PingGoogle_No.gridx = 10;
		 gbc_checkBox_PingGoogle_No.gridy = 19;
		 NoConnection_Gem.add(checkBox_PingGoogle_No, gbc_checkBox_PingGoogle_No);
		 
		 
		 //Don't remove this, it messes with the layout, will remove later
		 JLabel label_19 = new JLabel("New label");
		 GridBagConstraints gbc_label_19 = new GridBagConstraints();
		 gbc_label_19.gridx = 25;
		 gbc_label_19.gridy = 28;
		 NoConnection_Gem.add(label_19, gbc_label_19);
		

	}
	
	public JPanel getJpanel()
	{
		return NoConnection_Gem;
	}

	public String exportUnoTicket()
	{
		String powerLight = "", canLogin = "",strOne = "" ,strTwo = "",strThree="",strFour="",strFive="";
		String system = "", Lan1="",Lan2="",twoG="",fiveG="",phone="",WAN="",directConnect ="",pingRouter="",pingRadio="",pingEight="",pingGoogle="";
		
		
		if (checkBox_PowerOn.isSelected()){powerLight = "On";}
		if (checkBox_Off_Power.isSelected()){powerLight = "Off";}
		if (checkBox_AccessRouterYes.isSelected()){canLogin="I have access to the router.";}else{canLogin="I don't have access to the router.";}
		//Lights:
		if (checkBox_LTESTR1.isSelected()){strOne = "On";}else{strOne ="Off";}
		if (checkBox_LTESTR2.isSelected()){strTwo = "On";}else{strTwo ="Off";}
		if (checkBox_LTESTR3.isSelected()){strThree = "On";}else{strThree ="Off";}
		if (checkBox_LTESTR4.isSelected()){strFour = "On";}else{strFour ="Off";}
		if (checkBox_LTESTR5.isSelected()){strFive = "On";}else{strFive ="Off";}
		if (checkBox_SystemOff.isSelected()){system = "Off";}
		if (checkBox_SystemOn.isSelected()){system = "On";}
		if (checkBox_Lan1On.isSelected()){Lan1 = "On";}
		if (checkBox_Lan1Off.isSelected()){Lan1 = "Off";}
		if (checkBox_Lan2_On.isSelected()){Lan2 = "On";}
		if (checkBox_Lan2_Off.isSelected()){Lan2 = "Off";}
		if (checkBox_2G_On.isSelected()){twoG="On";}
		if (checkBox_2GOff.isSelected()){twoG="Off";}
		if (checkBox_5G_On.isSelected()){fiveG="On";}
		if (checkBox_5G_Off.isSelected()){fiveG="Off";}


		if (checkBox_Phone_On.isSelected()){phone="On";}
		if (checkBox_Phone_Off.isSelected()){phone="Off";}
		if (checkBox_WAN_YES.isSelected()){WAN = "WAN cable is in the right slot.";}
		if (checkBox_PC_Done.isSelected()){WAN = "Power cycled the rotuer.";}
		if (checkBox_DirectCon_Done.isSelected()){directConnect = 	"The customer is testing over direct connection.";}
		if (checkBox_PingRouter_Yes.isSelected()){pingRouter 	= 	"Customer can ping radio.";			}
		if (checkBox_PingRouter_No.isSelected()){pingRouter 	= 	"Customer can NOT ping the radio.";	}
		if (checkBox_PingRadio_Yes.isSelected()){pingRadio 		= 	"User can ping the radio.";			}
		if (checkBox_Ping_Radio_No.isSelected()){pingRadio 		= 	"User can NOT ping the radio.";		}
		if (checkBox_PingEight_Yes.isSelected()){pingEight		=	"User can ping 8.8.8.8.";			}
		if (checkBox_PingGoogle_No.isSelected()){pingGoogle		=	"User can Ping Google.ie";			}
		if (checkBox_PingGoogleIE_Yes.isSelected()){pingGoogle	=	"User can NOT ping google.ie";		}
		
		
		return "Customer is experancing no connection issue \n"
				+ "Date Issue Started: " + textField_DateIssueStarted.getText() + "\n"
				+ "Lights on router: \n"
				+ "Power: " + powerLight + "\n"
				+ "System: " + system + "\n"
				+ "Strenght 1: " +  strOne + "\n"
				+ "Strenght 2: " +  strTwo + "\n"
				+ "Strenght 3: " +  strThree + "\n"
				+ "Strenght 4:" +  strFour + "\n"
				+ "Strenght 5: \t" +  strFive + "\n"
				+ "System \t" + system + "\n"
				+ "Lan 1 \t" + Lan1 + "\n"
				+ "Lan 2 \t" + Lan2 + "\n"
				+ "2 G \t" + twoG + "\n"
				+ "5 G \t" + fiveG + "\n"
				+ "Phone " + phone + "\n"
				+ WAN + "\n"
				+ directConnect+ "\n"
				+ pingRouter + "\n"
				+ pingEight + "\n"
				+ pingGoogle + "\n"
				+ canLogin + "\n";
	}
	
	public String generateUNO()
	{
		String powerLight = "", canLogin = "",strOne = "" ,strTwo = "",strThree="",strFour="",strFive="";
		String system = "", Lan1="",Lan2="",twoG="",fiveG="",phone="",WAN="",directConnect ="",pingRouter="",pingRadio="",pingEight="",pingGoogle="";
		//If user can log into system.
		
		
		if (checkBox_PowerOn.isSelected()){powerLight = "On";}
		if (checkBox_Off_Power.isSelected()){powerLight = "Off";}
		if (checkBox_AccessRouterYes.isSelected()){canLogin="I have access to the router.";}else{canLogin="I don't have access to the router.";}
		if (checkBox_LTESTR1.isSelected()){strOne = "On";}else{strOne ="Off";}
		if (checkBox_LTESTR2.isSelected()){strTwo = "On";}else{strTwo ="Off";}
		if (checkBox_LTESTR3.isSelected()){strThree = "On";}else{strThree ="Off";}
		if (checkBox_LTESTR4.isSelected()){strFour = "On";}else{strFour ="Off";}
		if (checkBox_LTESTR5.isSelected()){strFive = "On";}else{strFive ="Off";}
		if (checkBox_SystemOff.isSelected()){system = "Off";}
		if (checkBox_SystemOn.isSelected()){system = "On";}
		if (checkBox_Lan1On.isSelected()){Lan1 = "On";}
		if (checkBox_Lan1Off.isSelected()){Lan1 = "Off";}
		if (checkBox_Lan2_On.isSelected()){Lan2 = "On";}
		if (checkBox_Lan2_Off.isSelected()){Lan2 = "Off";}
		if (checkBox_2G_On.isSelected()){twoG="On";}
		if (checkBox_2GOff.isSelected()){twoG="Off";}
		if (checkBox_5G_On.isSelected()){fiveG="On";}
		if (checkBox_5G_Off.isSelected()){fiveG="Off";}
		
		

		//+ "Phone: " + ;
		

		if (checkBox_Phone_On.isSelected()){phone="On";}
		if (checkBox_Phone_Off.isSelected()){phone="Off";}
		if (checkBox_WAN_YES.isSelected()){WAN = "WAN cable is in the right slot.";}
		if (checkBox_PC_Done.isSelected()){WAN = "Power cycled the rotuer.";}
		if (checkBox_DirectCon_Done.isSelected()){directConnect = 	"The customer is testing over direct connection.";}
		if (checkBox_PingRouter_Yes.isSelected()){pingRouter 	= 	"Customer can ping radio.";			}
		if (checkBox_PingRouter_No.isSelected()){pingRouter 	= 	"Customer can NOT ping the radio.";	}
		if (checkBox_PingRadio_Yes.isSelected()){pingRadio 		= 	"User can ping the radio.";			}
		if (checkBox_Ping_Radio_No.isSelected()){pingRadio 		= 	"User can NOT ping the radio.";		}
		if (checkBox_PingEight_Yes.isSelected()){pingEight		=	"User can ping 8.8.8.8.";			}
		if (checkBox_PingGoogle_No.isSelected()){pingGoogle		=	"User can Ping Google.ie";			}
		if (checkBox_PingGoogleIE_Yes.isSelected()){pingGoogle	=	"User can NOT ping google.ie";		}
		
		return "<h2>Issue Description</h2>"
		+ "Customer has a no connection issue that started: " + textField_DateIssueStarted.getText() + "</br>"
		+ directConnect + "</br>"
		+ "\nTechnology:\n" + "LTE\n"
		+ "<h2>Device Type</h2>\n"
		+ "Gemtek WLTSS-114"
		+ "\nEnodb & Cell ID\n"
		+ "<h2>Current Enodb & Cell ID</h2>\n"
		+ "<h2>Longitude & Latitude</h2>\n"
		+ textFieldLatAndLong.getText()
		+ "<h2>Indoor unit Led Status</h2>"
		+ "Power: " + powerLight + "\n"
		+ "Lan 1: " + Lan1 + "\n"
		+ "Lan 2: " + Lan2 + "\n"
		+ "System:" + Lan2 + "\n"
		+ "LTE str:" + Lan2 + "\n"
		+ "Phone: " + phone + "\n"
		+ "<h3>List clear steps taken to resolve the issue</h3>\n"
		+ "-" +  WAN
		+ "-" + pingRouter + "<br>\n"
		+ "-" + pingRadio  + "<br>\n"
		+ "-" + pingEight  + "<br>\n"
		+ "-" + pingGoogle + "<br>\n";
		

		
/*
		

		LTE NO CONNECTION – CPE NOT ACCESSIBLE REMOTELY

		1. Identify customer CPE type

		2. Ask customer when the service went down

		3. Check if there is any Outage

		4. Ask customer if any cables was moved

		5. Ask customer what the lights status on the indoor unit

		6. Check in WG if CPE is returning an IP address

		7. Check if CPE is accessible

		8. CPE not accessible remotely – Reseat the radio cable and powercycle indoor unit

		9. Wait for few minutes for the CPE to make a Network Entry

		10. If Still Offline – Ask customer to ping the indoor router and Outdoor CPE

		11. If reply from indoor and Outdoor – CPE is still offline escalate to 2nd Line

		LTE NO CONNECTION – CPE ACCESSIBLE REMOTELY

		1. Ask the customer to ping the indoor router

		2. Ask the customer to ping the outdoor CPE

		3. Ask the customer to ping 8.8.8.8

		4. Check if you can access the indoor CPE remotely

		5. Get customer to logon to the indoor router (if Greenpacket) and set the WAN IP and DNS

		6. From the CPE ping the indoor router

		7. If pings fail from outdoor to indoor it’s most likely a crimp issue and callout required – escalate to 2nd line for callout approval
		*/


	}
}
