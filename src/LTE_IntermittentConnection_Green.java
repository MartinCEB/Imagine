

import javax.swing.JCheckBox;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.*;
import java.awt.Color;

public class LTE_IntermittentConnection_Green extends JPanel {
	
	
	private String esclation,unoTicket;
	private JTextField textField_DateIssueStarted;
	JCheckBox checkBox_PowerOn;
	JCheckBox checkBox_Off_Power;
	JCheckBox checkBox_AccessRouterYes;
	JCheckBox checkBox_AccessRouterNo;
	JCheckBox chckbxOn_WAN;
	JCheckBox checkBox_SystemOn;
	JCheckBox checkBox_SystemOff;
	JCheckBox checkBox_Lan1On;
	JCheckBox checkBox_Lan1Off;
	JCheckBox checkBox_Lan2_On;
	JCheckBox checkBox_Lan2_Off;
	JCheckBox checkBox_WAN_On;
	JCheckBox checkBox_WAN_Off;
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
	private JPanel IntermittentCon_Gem;
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
	private JLabel lblNewLongitudeLatitude;
	private JTextField textField_DeviceTime;
	private JLabel lblNewMoveConnection;
	private JCheckBox chckbxYes_ConnectionMoved;
	private JCheckBox chckbxNo_ConnectionMoved;
	private JLabel lblCurrentEnode;
	private JLabel lblCurrentCellId;
	private JTextField textField_CurrentENode;
	private JTextField textFieldCurrentCellID;
	TicketBuilder TB;
	private JCheckBox chckbxDone_ResetCable;
	private JCheckBox chckbxDone_FiddleWithCable;
	private JCheckBox chckbxWifiChannelYes;
	private JButton btnCurrentDate;
	private JTextField textField_ISMI;
	private JTextField textField_Installed_HighSite;
	private JTextField textField_Issue;
	private JLabel lblIpAddressOn;
	private JLabel lblIpAddressOn_1;
	private JCheckBox chckbxNo_WG;
	private JCheckBox chckbxYes_CSR;
	private JCheckBox chckbxNo_CSR;
	private JCheckBox chckbxYes_WallGarden;
	private JLabel lblDidCustomerFd;
	private JCheckBox chckbxFDYes;
	private JCheckBox chckbxFDNo;
	private JLabel lblCanPingFrom;
	private JCheckBox chckbxRadioToRouterYes;
	private JCheckBox chckbxRadioToRouterNo;
	private JTextPane txtpnExtraInformation;
	private JTextField textField_TicketNumber;
	private JLabel lblHowManyService;
	private JTextField textField_AmtServiceCall;
	private JLabel lblDayNotice;
	private JCheckBox chckbxYesNotice;
	private JCheckBox chckbxNoNotice;
	private JLabel lblConnectionTime_1;
	private JTextField textField_ConnectionTime;
	private JLabel lblIntermittentStatus;
	private JComboBox comboBox_ConnectionStatus;
	private JLabel lblCurrentFirmware;
	private JTextField textField_CurrentFirmware;
	private JLabel lblLan;
	private JCheckBox chckbxOn_Lan4;
	private JCheckBox chckbxOff_Off;
	private JCheckBox chckbxOff;
	
	public LTE_IntermittentConnection_Green(TicketBuilder TB) {
		
		this.TB = TB;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {1000, 0};
		gridBagLayout.rowHeights = new int[] {1000, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		IntermittentCon_Gem = new JPanel();
		GridBagConstraints gbc_IntermittentCon_Gem = new GridBagConstraints();
		gbc_IntermittentCon_Gem.gridwidth = 28;
		gbc_IntermittentCon_Gem.gridheight = 28;
		gbc_IntermittentCon_Gem.gridx = 0;
		gbc_IntermittentCon_Gem.gridy = 0;
		add(IntermittentCon_Gem, gbc_IntermittentCon_Gem);
		GridBagLayout gbl_IntermittentCon_Gem = new GridBagLayout();
		gbl_IntermittentCon_Gem.columnWidths = new int[] {30, 30, 30, 30, 30, 30, 30, 0, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_IntermittentCon_Gem.rowHeights = new int[] {20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 0, 20, 0, 20, 20, 20, 20};
		gbl_IntermittentCon_Gem.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gbl_IntermittentCon_Gem.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0};
		IntermittentCon_Gem.setLayout(gbl_IntermittentCon_Gem);
		
		textField_TicketNumber = new JTextField();
		textField_TicketNumber.setToolTipText("TicketNumber");
		GridBagConstraints gbc_textField_TicketNumber = new GridBagConstraints();
		gbc_textField_TicketNumber.gridwidth = 5;
		gbc_textField_TicketNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textField_TicketNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_TicketNumber.gridx = 1;
		gbc_textField_TicketNumber.gridy = 0;
		IntermittentCon_Gem.add(textField_TicketNumber, gbc_textField_TicketNumber);
		textField_TicketNumber.setColumns(10);
		
		textField_ISMI = new JTextField();
		textField_ISMI.setToolTipText("ISMI");
		GridBagConstraints gbc_textField_ISMI = new GridBagConstraints();
		gbc_textField_ISMI.gridwidth = 5;
		gbc_textField_ISMI.insets = new Insets(0, 0, 5, 5);
		gbc_textField_ISMI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_ISMI.gridx = 6;
		gbc_textField_ISMI.gridy = 0;
		IntermittentCon_Gem.add(textField_ISMI, gbc_textField_ISMI);
		textField_ISMI.setColumns(10);
		
		textField_Installed_HighSite = new JTextField();
		textField_Installed_HighSite.setToolTipText("Installed_HighSite");
		GridBagConstraints gbc_textField_Installed_HighSite = new GridBagConstraints();
		gbc_textField_Installed_HighSite.gridwidth = 2;
		gbc_textField_Installed_HighSite.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Installed_HighSite.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Installed_HighSite.gridx = 11;
		gbc_textField_Installed_HighSite.gridy = 0;
		IntermittentCon_Gem.add(textField_Installed_HighSite, gbc_textField_Installed_HighSite);
		textField_Installed_HighSite.setColumns(10);
		textField_Issue = new JTextField();
		textField_Issue.setToolTipText("Issue");
		GridBagConstraints gbc_textField_Issue = new GridBagConstraints();
		gbc_textField_Issue.gridwidth = 9;
		gbc_textField_Issue.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Issue.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Issue.gridx = 13;
		gbc_textField_Issue.gridy = 0;
		IntermittentCon_Gem.add(textField_Issue, gbc_textField_Issue);
		textField_Issue.setColumns(10);
		
		JLabel label_IssueStarted = new JLabel("Date Issue Started");
		GridBagConstraints gbc_label_IssueStarted = new GridBagConstraints();
		gbc_label_IssueStarted.anchor = GridBagConstraints.EAST;
		gbc_label_IssueStarted.insets = new Insets(0, 0, 5, 5);
		gbc_label_IssueStarted.gridx = 2;
		gbc_label_IssueStarted.gridy = 2;
		IntermittentCon_Gem.add(label_IssueStarted, gbc_label_IssueStarted);
		
		textField_DateIssueStarted = new JTextField();
		textField_DateIssueStarted.setColumns(10);
		GridBagConstraints gbc_textField_DateIssueStarted = new GridBagConstraints();
		gbc_textField_DateIssueStarted.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_DateIssueStarted.gridwidth = 5;
		gbc_textField_DateIssueStarted.insets = new Insets(0, 0, 5, 5);
		gbc_textField_DateIssueStarted.gridx = 5;
		gbc_textField_DateIssueStarted.gridy = 2;
		IntermittentCon_Gem.add(textField_DateIssueStarted, gbc_textField_DateIssueStarted);
		
		btnCurrentDate = new JButton("Current Date");
		btnCurrentDate.addActionListener(
				new ActionListener() { 
				  public void actionPerformed(ActionEvent e) { 
					  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
					  Date date = new Date();
					  textField_DateIssueStarted.setText(dateFormat.format(date)); //2016/11/16 12:08:43
				  } 
				}
				);
		GridBagConstraints gbc_btnCurrentDate = new GridBagConstraints();
		gbc_btnCurrentDate.insets = new Insets(0, 0, 5, 5);
		gbc_btnCurrentDate.gridx = 11;
		gbc_btnCurrentDate.gridy = 2;
		IntermittentCon_Gem.add(btnCurrentDate, gbc_btnCurrentDate);
		
		JLabel lblLightsOnRouter = new JLabel("Lights when down");
		GridBagConstraints gbc_lblLightsOnRouter = new GridBagConstraints();
		gbc_lblLightsOnRouter.gridwidth = 4;
		gbc_lblLightsOnRouter.insets = new Insets(0, 0, 5, 5);
		gbc_lblLightsOnRouter.gridx = 2;
		gbc_lblLightsOnRouter.gridy = 3;
		IntermittentCon_Gem.add(lblLightsOnRouter, gbc_lblLightsOnRouter);
		
		JLabel label_2 = new JLabel("Power");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 4;
		IntermittentCon_Gem.add(label_2, gbc_label_2);
		
		checkBox_PowerOn = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_PowerOn = new GridBagConstraints();
		gbc_checkBox_PowerOn.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PowerOn.gridx = 3;
		gbc_checkBox_PowerOn.gridy = 4;
		IntermittentCon_Gem.add(checkBox_PowerOn, gbc_checkBox_PowerOn);
		
		checkBox_Off_Power = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_Off_Power = new GridBagConstraints();
		gbc_checkBox_Off_Power.gridwidth = 2;
		gbc_checkBox_Off_Power.fill = GridBagConstraints.BOTH;
		gbc_checkBox_Off_Power.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Off_Power.gridx = 5;
		gbc_checkBox_Off_Power.gridy = 4;
		IntermittentCon_Gem.add(checkBox_Off_Power, gbc_checkBox_Off_Power);
		
		JLabel label_Login = new JLabel("Can you log into their router");
		GridBagConstraints gbc_label_Login = new GridBagConstraints();
		gbc_label_Login.anchor = GridBagConstraints.WEST;
		gbc_label_Login.insets = new Insets(0, 0, 5, 5);
		gbc_label_Login.gridx = 11;
		gbc_label_Login.gridy = 4;
		IntermittentCon_Gem.add(label_Login, gbc_label_Login);
		
		checkBox_AccessRouterYes = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_LoginYes = new GridBagConstraints();
		gbc_checkBox_LoginYes.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_LoginYes.gridx = 12;
		gbc_checkBox_LoginYes.gridy = 4;
		IntermittentCon_Gem.add(checkBox_AccessRouterYes, gbc_checkBox_LoginYes);
		
		checkBox_AccessRouterNo = new JCheckBox("No");
		GridBagConstraints gbc_checkBox_AccessRouterNo = new GridBagConstraints();
		gbc_checkBox_AccessRouterNo.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_AccessRouterNo.gridx = 13;
		gbc_checkBox_AccessRouterNo.gridy = 4;
		IntermittentCon_Gem.add(checkBox_AccessRouterNo, gbc_checkBox_AccessRouterNo);
		
		JLabel label_4 = new JLabel("System");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 2;
		gbc_label_4.gridy = 5;
		IntermittentCon_Gem.add(label_4, gbc_label_4);
		
		checkBox_SystemOn = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_SystemON = new GridBagConstraints();
		gbc_checkBox_SystemON.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_SystemON.gridx = 3;
		gbc_checkBox_SystemON.gridy = 5;
		IntermittentCon_Gem.add(checkBox_SystemOn, gbc_checkBox_SystemON);
		
		checkBox_SystemOff = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_SystemOff = new GridBagConstraints();
		gbc_checkBox_SystemOff.anchor = GridBagConstraints.WEST;
		gbc_checkBox_SystemOff.gridwidth = 2;
		gbc_checkBox_SystemOff.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_SystemOff.gridx = 5;
		gbc_checkBox_SystemOff.gridy = 5;
		IntermittentCon_Gem.add(checkBox_SystemOff, gbc_checkBox_SystemOff);
		
		JLabel label_WifiOff = new JLabel("Is Wifi Turned off?");
		GridBagConstraints gbc_label_WifiOff = new GridBagConstraints();
		gbc_label_WifiOff.anchor = GridBagConstraints.WEST;
		gbc_label_WifiOff.insets = new Insets(0, 0, 5, 5);
		gbc_label_WifiOff.gridx = 11;
		gbc_label_WifiOff.gridy = 5;
		IntermittentCon_Gem.add(label_WifiOff, gbc_label_WifiOff);
		
		chckbxWifiOn_YES = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxWifiOn_YES = new GridBagConstraints();
		gbc_chckbxWifiOn_YES.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWifiOn_YES.gridx = 12;
		gbc_chckbxWifiOn_YES.gridy = 5;
		IntermittentCon_Gem.add(chckbxWifiOn_YES, gbc_chckbxWifiOn_YES);
		
		chckbxWifiOn_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxWifiOn_No = new GridBagConstraints();
		gbc_chckbxWifiOn_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWifiOn_No.gridx = 13;
		gbc_chckbxWifiOn_No.gridy = 5;
		IntermittentCon_Gem.add(chckbxWifiOn_No, gbc_chckbxWifiOn_No);
		
		JLabel lblWan_1 = new JLabel("WAN");
		GridBagConstraints gbc_lblWan_1 = new GridBagConstraints();
		gbc_lblWan_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblWan_1.gridx = 2;
		gbc_lblWan_1.gridy = 6;
		IntermittentCon_Gem.add(lblWan_1, gbc_lblWan_1);
		
		chckbxOn_WAN = new JCheckBox("On");
		GridBagConstraints gbc_chckbxOn_WAN = new GridBagConstraints();
		gbc_chckbxOn_WAN.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOn_WAN.gridx = 3;
		gbc_chckbxOn_WAN.gridy = 6;
		IntermittentCon_Gem.add(chckbxOn_WAN, gbc_chckbxOn_WAN);
		
		chckbxOff = new JCheckBox("Off");
		GridBagConstraints gbc_chckbxOff = new GridBagConstraints();
		gbc_chckbxOff.anchor = GridBagConstraints.WEST;
		gbc_chckbxOff.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOff.gridx = 5;
		gbc_chckbxOff.gridy = 6;
		IntermittentCon_Gem.add(chckbxOff, gbc_chckbxOff);
		
		lblDevicesOnDHCP = new JLabel("Devices on the DHCP list?");
		GridBagConstraints gbc_lblDevicesOnDHCP = new GridBagConstraints();
		gbc_lblDevicesOnDHCP.anchor = GridBagConstraints.WEST;
		gbc_lblDevicesOnDHCP.insets = new Insets(0, 0, 5, 5);
		gbc_lblDevicesOnDHCP.gridx = 11;
		gbc_lblDevicesOnDHCP.gridy = 6;
		IntermittentCon_Gem.add(lblDevicesOnDHCP, gbc_lblDevicesOnDHCP);
		
		chckbxDHCP_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxDHCP_Yes = new GridBagConstraints();
		gbc_chckbxDHCP_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDHCP_Yes.gridx = 12;
		gbc_chckbxDHCP_Yes.gridy = 6;
		IntermittentCon_Gem.add(chckbxDHCP_Yes, gbc_chckbxDHCP_Yes);
		
		chckbxDHCP_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxDHCP_No = new GridBagConstraints();
		gbc_chckbxDHCP_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDHCP_No.gridx = 13;
		gbc_chckbxDHCP_No.gridy = 6;
		IntermittentCon_Gem.add(chckbxDHCP_No, gbc_chckbxDHCP_No);
		
		JLabel label_7 = new JLabel("Lan1");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 2;
		gbc_label_7.gridy = 7;
		IntermittentCon_Gem.add(label_7, gbc_label_7);
		
		checkBox_Lan1On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_Lan1On = new GridBagConstraints();
		gbc_checkBox_Lan1On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Lan1On.gridx = 3;
		gbc_checkBox_Lan1On.gridy = 7;
		IntermittentCon_Gem.add(checkBox_Lan1On, gbc_checkBox_Lan1On);
		
		checkBox_Lan1Off = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_Lan1Off = new GridBagConstraints();
		gbc_checkBox_Lan1Off.anchor = GridBagConstraints.WEST;
		gbc_checkBox_Lan1Off.gridwidth = 2;
		gbc_checkBox_Lan1Off.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Lan1Off.gridx = 5;
		gbc_checkBox_Lan1Off.gridy = 7;
		IntermittentCon_Gem.add(checkBox_Lan1Off, gbc_checkBox_Lan1Off);
		
		lblRouterPluggegInto = new JLabel("Router into main socket?");
		lblRouterPluggegInto.setToolTipText("Is the socket in an extention lead or a main wall socket");
		GridBagConstraints gbc_lblRouterPluggegInto = new GridBagConstraints();
		gbc_lblRouterPluggegInto.anchor = GridBagConstraints.WEST;
		gbc_lblRouterPluggegInto.insets = new Insets(0, 0, 5, 5);
		gbc_lblRouterPluggegInto.gridx = 11;
		gbc_lblRouterPluggegInto.gridy = 7;
		IntermittentCon_Gem.add(lblRouterPluggegInto, gbc_lblRouterPluggegInto);
		
		chckbxWallSocket_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxWallSocket_Yes = new GridBagConstraints();
		gbc_chckbxWallSocket_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWallSocket_Yes.gridx = 12;
		gbc_chckbxWallSocket_Yes.gridy = 7;
		IntermittentCon_Gem.add(chckbxWallSocket_Yes, gbc_chckbxWallSocket_Yes);
		
		chckbxWallSocket_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxWallSocket_No = new GridBagConstraints();
		gbc_chckbxWallSocket_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWallSocket_No.gridx = 13;
		gbc_chckbxWallSocket_No.gridy = 7;
		IntermittentCon_Gem.add(chckbxWallSocket_No, gbc_chckbxWallSocket_No);
		
		JLabel label_8 = new JLabel("Lan2");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 2;
		gbc_label_8.gridy = 8;
		IntermittentCon_Gem.add(label_8, gbc_label_8);
		
		checkBox_Lan2_On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_Lan2_On = new GridBagConstraints();
		gbc_checkBox_Lan2_On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Lan2_On.gridx = 3;
		gbc_checkBox_Lan2_On.gridy = 8;
		IntermittentCon_Gem.add(checkBox_Lan2_On, gbc_checkBox_Lan2_On);
		
		checkBox_Lan2_Off = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_Lan2_Off = new GridBagConstraints();
		gbc_checkBox_Lan2_Off.anchor = GridBagConstraints.WEST;
		gbc_checkBox_Lan2_Off.gridwidth = 2;
		gbc_checkBox_Lan2_Off.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Lan2_Off.gridx = 5;
		gbc_checkBox_Lan2_Off.gridy = 8;
		IntermittentCon_Gem.add(checkBox_Lan2_Off, gbc_checkBox_Lan2_Off);
		
		lblIsThereAn = new JLabel("Is there an outage?");
		GridBagConstraints gbc_lblIsThereAn = new GridBagConstraints();
		gbc_lblIsThereAn.anchor = GridBagConstraints.WEST;
		gbc_lblIsThereAn.insets = new Insets(0, 0, 5, 5);
		gbc_lblIsThereAn.gridx = 11;
		gbc_lblIsThereAn.gridy = 8;
		IntermittentCon_Gem.add(lblIsThereAn, gbc_lblIsThereAn);
		
		chckbxOutage_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxOutage_Yes = new GridBagConstraints();
		gbc_chckbxOutage_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOutage_Yes.gridx = 12;
		gbc_chckbxOutage_Yes.gridy = 8;
		IntermittentCon_Gem.add(chckbxOutage_Yes, gbc_chckbxOutage_Yes);
		
		chckbxOutage_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxOutage_No = new GridBagConstraints();
		gbc_chckbxOutage_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOutage_No.gridx = 13;
		gbc_chckbxOutage_No.gridy = 8;
		IntermittentCon_Gem.add(chckbxOutage_No, gbc_chckbxOutage_No);
		
		JLabel lblWan = new JLabel("Lan3");
		GridBagConstraints gbc_lblWan = new GridBagConstraints();
		gbc_lblWan.insets = new Insets(0, 0, 5, 5);
		gbc_lblWan.gridx = 2;
		gbc_lblWan.gridy = 9;
		IntermittentCon_Gem.add(lblWan, gbc_lblWan);
		
		checkBox_WAN_On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_WAN_On = new GridBagConstraints();
		gbc_checkBox_WAN_On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_WAN_On.gridx = 3;
		gbc_checkBox_WAN_On.gridy = 9;
		IntermittentCon_Gem.add(checkBox_WAN_On, gbc_checkBox_WAN_On);
		
		checkBox_WAN_Off = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_WAN_Off = new GridBagConstraints();
		gbc_checkBox_WAN_Off.anchor = GridBagConstraints.WEST;
		gbc_checkBox_WAN_Off.gridwidth = 2;
		gbc_checkBox_WAN_Off.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_WAN_Off.gridx = 5;
		gbc_checkBox_WAN_Off.gridy = 9;
		IntermittentCon_Gem.add(checkBox_WAN_Off, gbc_checkBox_WAN_Off);
		
		lblFiddleTheCable = new JLabel("Fiddle the WAN cable");
		GridBagConstraints gbc_lblFiddleTheCable = new GridBagConstraints();
		gbc_lblFiddleTheCable.anchor = GridBagConstraints.WEST;
		gbc_lblFiddleTheCable.insets = new Insets(0, 0, 5, 5);
		gbc_lblFiddleTheCable.gridx = 11;
		gbc_lblFiddleTheCable.gridy = 9;
		IntermittentCon_Gem.add(lblFiddleTheCable, gbc_lblFiddleTheCable);
		
		chckbxDone_FiddleWithCable = new JCheckBox("Done");
		GridBagConstraints gbc_chckbxDone_FiddleWithCable = new GridBagConstraints();
		gbc_chckbxDone_FiddleWithCable.gridwidth = 3;
		gbc_chckbxDone_FiddleWithCable.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDone_FiddleWithCable.gridx = 12;
		gbc_chckbxDone_FiddleWithCable.gridy = 9;
		IntermittentCon_Gem.add(chckbxDone_FiddleWithCable, gbc_chckbxDone_FiddleWithCable);
		
		lblLan = new JLabel("Lan4");
		GridBagConstraints gbc_lblLan = new GridBagConstraints();
		gbc_lblLan.insets = new Insets(0, 0, 5, 5);
		gbc_lblLan.gridx = 2;
		gbc_lblLan.gridy = 10;
		IntermittentCon_Gem.add(lblLan, gbc_lblLan);
		
		chckbxOn_Lan4 = new JCheckBox("On");
		GridBagConstraints gbc_chckbxOn_Lan4 = new GridBagConstraints();
		gbc_chckbxOn_Lan4.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOn_Lan4.gridx = 3;
		gbc_chckbxOn_Lan4.gridy = 10;
		IntermittentCon_Gem.add(chckbxOn_Lan4, gbc_chckbxOn_Lan4);
		
		chckbxOff_Off = new JCheckBox("Off");
		GridBagConstraints gbc_chckbxOff_Off = new GridBagConstraints();
		gbc_chckbxOff_Off.anchor = GridBagConstraints.WEST;
		gbc_chckbxOff_Off.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxOff_Off.gridx = 5;
		gbc_chckbxOff_Off.gridy = 10;
		IntermittentCon_Gem.add(chckbxOff_Off, gbc_chckbxOff_Off);
		
		lblResetTheWan = new JLabel("Reset the WAN cable");
		GridBagConstraints gbc_lblResetTheWan = new GridBagConstraints();
		gbc_lblResetTheWan.anchor = GridBagConstraints.WEST;
		gbc_lblResetTheWan.insets = new Insets(0, 0, 5, 5);
		gbc_lblResetTheWan.gridx = 11;
		gbc_lblResetTheWan.gridy = 10;
		IntermittentCon_Gem.add(lblResetTheWan, gbc_lblResetTheWan);
		
		chckbxDone_ResetCable = new JCheckBox("Done");
		GridBagConstraints gbc_chckbxDone_ResetCable = new GridBagConstraints();
		gbc_chckbxDone_ResetCable.gridwidth = 3;
		gbc_chckbxDone_ResetCable.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDone_ResetCable.gridx = 12;
		gbc_chckbxDone_ResetCable.gridy = 10;
		IntermittentCon_Gem.add(chckbxDone_ResetCable, gbc_chckbxDone_ResetCable);
		
		JLabel label_11 = new JLabel("Phone");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 2;
		gbc_label_11.gridy = 11;
		IntermittentCon_Gem.add(label_11, gbc_label_11);
		
		checkBox_Phone_On = new JCheckBox("On");
		GridBagConstraints gbc_checkBox_Phone_On = new GridBagConstraints();
		gbc_checkBox_Phone_On.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Phone_On.gridx = 3;
		gbc_checkBox_Phone_On.gridy = 11;
		IntermittentCon_Gem.add(checkBox_Phone_On, gbc_checkBox_Phone_On);
		
		checkBox_Phone_Off = new JCheckBox("Off");
		GridBagConstraints gbc_checkBox_Phone_Off = new GridBagConstraints();
		gbc_checkBox_Phone_Off.anchor = GridBagConstraints.WEST;
		gbc_checkBox_Phone_Off.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Phone_Off.gridx = 5;
		gbc_checkBox_Phone_Off.gridy = 11;
		IntermittentCon_Gem.add(checkBox_Phone_Off, gbc_checkBox_Phone_Off);
		
		lblCustomerConnectedWith = new JLabel("User using macs devices?");
		lblCustomerConnectedWith.setToolTipText("Is the user trying to connection with mac devices (Iphone,Ipad, MacBook etc.)");
		GridBagConstraints gbc_lblCustomerConnectedWith = new GridBagConstraints();
		gbc_lblCustomerConnectedWith.anchor = GridBagConstraints.WEST;
		gbc_lblCustomerConnectedWith.insets = new Insets(0, 0, 5, 5);
		gbc_lblCustomerConnectedWith.gridx = 11;
		gbc_lblCustomerConnectedWith.gridy = 11;
		IntermittentCon_Gem.add(lblCustomerConnectedWith, gbc_lblCustomerConnectedWith);
		
		chckbxUsingMacs_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxUsingMacs_Yes = new GridBagConstraints();
		gbc_chckbxUsingMacs_Yes.anchor = GridBagConstraints.WEST;
		gbc_chckbxUsingMacs_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUsingMacs_Yes.gridx = 12;
		gbc_chckbxUsingMacs_Yes.gridy = 11;
		IntermittentCon_Gem.add(chckbxUsingMacs_Yes, gbc_chckbxUsingMacs_Yes);
		
		chckbxUsingMacs_No = new JCheckBox("No");
		GridBagConstraints gbc_chckbxUsingMacs_No = new GridBagConstraints();
		gbc_chckbxUsingMacs_No.gridwidth = 2;
		gbc_chckbxUsingMacs_No.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUsingMacs_No.gridx = 13;
		gbc_chckbxUsingMacs_No.gridy = 11;
		IntermittentCon_Gem.add(chckbxUsingMacs_No, gbc_chckbxUsingMacs_No);
		
		lblChangeWifiChannel = new JLabel("Change wifi channel below 6");
		GridBagConstraints gbc_lblChangeWifiChannel = new GridBagConstraints();
		gbc_lblChangeWifiChannel.anchor = GridBagConstraints.WEST;
		gbc_lblChangeWifiChannel.insets = new Insets(0, 0, 5, 5);
		gbc_lblChangeWifiChannel.gridx = 11;
		gbc_lblChangeWifiChannel.gridy = 12;
		IntermittentCon_Gem.add(lblChangeWifiChannel, gbc_lblChangeWifiChannel);
		
		chckbxWifiChannelYes = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxWifiChannelYes = new GridBagConstraints();
		gbc_chckbxWifiChannelYes.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxWifiChannelYes.gridx = 12;
		gbc_chckbxWifiChannelYes.gridy = 12;
		IntermittentCon_Gem.add(chckbxWifiChannelYes, gbc_chckbxWifiChannelYes);
		
		JLabel label_WanCable_1 = new JLabel("Is WAN cable in the right slot?");
		GridBagConstraints gbc_label_WanCable_1 = new GridBagConstraints();
		gbc_label_WanCable_1.fill = GridBagConstraints.VERTICAL;
		gbc_label_WanCable_1.gridwidth = 2;
		gbc_label_WanCable_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_WanCable_1.gridx = 2;
		gbc_label_WanCable_1.gridy = 13;
		IntermittentCon_Gem.add(label_WanCable_1, gbc_label_WanCable_1);
		
		checkBox_WAN_YES = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_WAN_YES = new GridBagConstraints();
		gbc_checkBox_WAN_YES.anchor = GridBagConstraints.WEST;
		gbc_checkBox_WAN_YES.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_WAN_YES.gridx = 5;
		gbc_checkBox_WAN_YES.gridy = 13;
		IntermittentCon_Gem.add(checkBox_WAN_YES, gbc_checkBox_WAN_YES);
		
		lblConnectionTime_1 = new JLabel("Connection time");
		GridBagConstraints gbc_lblConnectionTime_1 = new GridBagConstraints();
		gbc_lblConnectionTime_1.anchor = GridBagConstraints.WEST;
		gbc_lblConnectionTime_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblConnectionTime_1.gridx = 11;
		gbc_lblConnectionTime_1.gridy = 13;
		IntermittentCon_Gem.add(lblConnectionTime_1, gbc_lblConnectionTime_1);
		
		textField_ConnectionTime 			= new JTextField();
		GridBagConstraints gbc_textField_ConnectionTime = new GridBagConstraints();
		gbc_textField_ConnectionTime.gridwidth = 4;
		gbc_textField_ConnectionTime.insets = new Insets(0, 0, 5, 5);
		gbc_textField_ConnectionTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_ConnectionTime.gridx = 12;
		gbc_textField_ConnectionTime.gridy = 13;
		IntermittentCon_Gem.add(textField_ConnectionTime, gbc_textField_ConnectionTime);
		textField_ConnectionTime.setColumns(10);
		
		JLabel label_PowerCycle_1 = new JLabel("Power Cycle");
		GridBagConstraints gbc_label_PowerCycle_1 = new GridBagConstraints();
		gbc_label_PowerCycle_1.anchor = GridBagConstraints.WEST;
		gbc_label_PowerCycle_1.gridwidth = 2;
		gbc_label_PowerCycle_1.fill = GridBagConstraints.VERTICAL;
		gbc_label_PowerCycle_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_PowerCycle_1.gridx = 2;
		gbc_label_PowerCycle_1.gridy = 14;
		IntermittentCon_Gem.add(label_PowerCycle_1, gbc_label_PowerCycle_1);
		
		checkBox_PC_Done = new JCheckBox("Done");
		GridBagConstraints gbc_checkBox_PC_Done = new GridBagConstraints();
		gbc_checkBox_PC_Done.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PC_Done.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PC_Done.gridx = 5;
		gbc_checkBox_PC_Done.gridy = 14;
		IntermittentCon_Gem.add(checkBox_PC_Done, gbc_checkBox_PC_Done);
		
		lblNewLongitudeLatitude = new JLabel("Device Time");
		GridBagConstraints gbc_lblNewLongitudeLatitude = new GridBagConstraints();
		gbc_lblNewLongitudeLatitude.anchor = GridBagConstraints.WEST;
		gbc_lblNewLongitudeLatitude.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLongitudeLatitude.gridx = 11;
		gbc_lblNewLongitudeLatitude.gridy = 14;
		IntermittentCon_Gem.add(lblNewLongitudeLatitude, gbc_lblNewLongitudeLatitude);
		
		textField_DeviceTime = new JTextField();
		GridBagConstraints gbc_textField_DeviceTime = new GridBagConstraints();
		gbc_textField_DeviceTime.gridwidth = 5;
		gbc_textField_DeviceTime.insets = new Insets(0, 0, 5, 5);
		gbc_textField_DeviceTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_DeviceTime.gridx = 12;
		gbc_textField_DeviceTime.gridy = 14;
		IntermittentCon_Gem.add(textField_DeviceTime, gbc_textField_DeviceTime);
		textField_DeviceTime.setColumns(10);
		
		JLabel label_PowerCycle_l_1 = new JLabel("User Direct connect");
		GridBagConstraints gbc_label_PowerCycle_l_1 = new GridBagConstraints();
		gbc_label_PowerCycle_l_1.anchor = GridBagConstraints.WEST;
		gbc_label_PowerCycle_l_1.gridwidth = 2;
		gbc_label_PowerCycle_l_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_PowerCycle_l_1.gridx = 2;
		gbc_label_PowerCycle_l_1.gridy = 15;
		IntermittentCon_Gem.add(label_PowerCycle_l_1, gbc_label_PowerCycle_l_1);
		
		checkBox_DirectCon_Done = new JCheckBox("Done");
		GridBagConstraints gbc_checkBox_DirectCon_Done = new GridBagConstraints();
		gbc_checkBox_DirectCon_Done.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_DirectCon_Done.gridx = 5;
		gbc_checkBox_DirectCon_Done.gridy = 15;
		IntermittentCon_Gem.add(checkBox_DirectCon_Done, gbc_checkBox_DirectCon_Done);
		
		lblNewMoveConnection = new JLabel("Customer move Connection?");
		GridBagConstraints gbc_lblNewMoveConnection = new GridBagConstraints();
		gbc_lblNewMoveConnection.anchor = GridBagConstraints.WEST;
		gbc_lblNewMoveConnection.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewMoveConnection.gridx = 11;
		gbc_lblNewMoveConnection.gridy = 15;
		IntermittentCon_Gem.add(lblNewMoveConnection, gbc_lblNewMoveConnection);
		
		chckbxNo_ConnectionMoved = new JCheckBox("No");
		GridBagConstraints gbc_chckbxNo_ConnectionMoved = new GridBagConstraints();
		gbc_chckbxNo_ConnectionMoved.anchor = GridBagConstraints.WEST;
		gbc_chckbxNo_ConnectionMoved.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNo_ConnectionMoved.gridx = 12;
		gbc_chckbxNo_ConnectionMoved.gridy = 15;
		IntermittentCon_Gem.add(chckbxNo_ConnectionMoved, gbc_chckbxNo_ConnectionMoved);
		
		chckbxYes_ConnectionMoved = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxYes_ConnectionMoved = new GridBagConstraints();
		gbc_chckbxYes_ConnectionMoved.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxYes_ConnectionMoved.gridx = 13;
		gbc_chckbxYes_ConnectionMoved.gridy = 15;
		IntermittentCon_Gem.add(chckbxYes_ConnectionMoved, gbc_chckbxYes_ConnectionMoved);
		
		JLabel label_Pingrouter = new JLabel("Can ping Router");
		GridBagConstraints gbc_label_Pingrouter = new GridBagConstraints();
		gbc_label_Pingrouter.anchor = GridBagConstraints.WEST;
		gbc_label_Pingrouter.gridwidth = 3;
		gbc_label_Pingrouter.insets = new Insets(0, 0, 5, 5);
		gbc_label_Pingrouter.gridx = 2;
		gbc_label_Pingrouter.gridy = 16;
		IntermittentCon_Gem.add(label_Pingrouter, gbc_label_Pingrouter);
		
		checkBox_PingRouter_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_PingRouter_Yes = new GridBagConstraints();
		gbc_checkBox_PingRouter_Yes.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingRouter_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingRouter_Yes.gridx = 5;
		gbc_checkBox_PingRouter_Yes.gridy = 16;
		IntermittentCon_Gem.add(checkBox_PingRouter_Yes, gbc_checkBox_PingRouter_Yes);
		
		checkBox_PingRouter_No = new JCheckBox("No");
		GridBagConstraints gbc_checkBox_PingRouter_No = new GridBagConstraints();
		gbc_checkBox_PingRouter_No.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingRouter_No.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingRouter_No.gridx = 7;
		gbc_checkBox_PingRouter_No.gridy = 16;
		IntermittentCon_Gem.add(checkBox_PingRouter_No, gbc_checkBox_PingRouter_No);
		
		lblCurrentEnode = new JLabel("Current Enode");
		GridBagConstraints gbc_lblCurrentEnode = new GridBagConstraints();
		gbc_lblCurrentEnode.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentEnode.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentEnode.gridx = 11;
		gbc_lblCurrentEnode.gridy = 16;
		IntermittentCon_Gem.add(lblCurrentEnode, gbc_lblCurrentEnode);
		
		textField_CurrentENode = new JTextField();
		GridBagConstraints gbc_textField_CurrentENode = new GridBagConstraints();
		gbc_textField_CurrentENode.gridwidth = 5;
		gbc_textField_CurrentENode.insets = new Insets(0, 0, 5, 5);
		gbc_textField_CurrentENode.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_CurrentENode.gridx = 12;
		gbc_textField_CurrentENode.gridy = 16;
		IntermittentCon_Gem.add(textField_CurrentENode, gbc_textField_CurrentENode);
		textField_CurrentENode.setColumns(10);
		
		JLabel label_CanPingRadio = new JLabel("Can Ping radio");
		GridBagConstraints gbc_label_CanPingRadio = new GridBagConstraints();
		gbc_label_CanPingRadio.anchor = GridBagConstraints.WEST;
		gbc_label_CanPingRadio.gridwidth = 2;
		gbc_label_CanPingRadio.insets = new Insets(0, 0, 5, 5);
		gbc_label_CanPingRadio.gridx = 2;
		gbc_label_CanPingRadio.gridy = 17;
		IntermittentCon_Gem.add(label_CanPingRadio, gbc_label_CanPingRadio);
		
		checkBox_PingRadio_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_PingRadio_Yes = new GridBagConstraints();
		gbc_checkBox_PingRadio_Yes.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingRadio_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingRadio_Yes.gridx = 5;
		gbc_checkBox_PingRadio_Yes.gridy = 17;
		IntermittentCon_Gem.add(checkBox_PingRadio_Yes, gbc_checkBox_PingRadio_Yes);
		
		checkBox_Ping_Radio_No = new JCheckBox("No");
		GridBagConstraints gbc_checkBox_Ping_Radio_No = new GridBagConstraints();
		gbc_checkBox_Ping_Radio_No.anchor = GridBagConstraints.WEST;
		gbc_checkBox_Ping_Radio_No.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_Ping_Radio_No.gridx = 7;
		gbc_checkBox_Ping_Radio_No.gridy = 17;
		IntermittentCon_Gem.add(checkBox_Ping_Radio_No, gbc_checkBox_Ping_Radio_No);
		
		lblCurrentCellId = new JLabel("Current Cell ID");
		GridBagConstraints gbc_lblCurrentCellId = new GridBagConstraints();
		gbc_lblCurrentCellId.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentCellId.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentCellId.gridx = 11;
		gbc_lblCurrentCellId.gridy = 17;
		IntermittentCon_Gem.add(lblCurrentCellId, gbc_lblCurrentCellId);
		
		textFieldCurrentCellID = new JTextField();
		GridBagConstraints gbc_textFieldCurrentCellID = new GridBagConstraints();
		gbc_textFieldCurrentCellID.gridwidth = 5;
		gbc_textFieldCurrentCellID.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCurrentCellID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCurrentCellID.gridx = 12;
		gbc_textFieldCurrentCellID.gridy = 17;
		IntermittentCon_Gem.add(textFieldCurrentCellID, gbc_textFieldCurrentCellID);
		textFieldCurrentCellID.setColumns(10);
		
		JLabel label_PinEight_1 = new JLabel("Can Ping 8.8.8.8");
		GridBagConstraints gbc_label_PinEight_1 = new GridBagConstraints();
		gbc_label_PinEight_1.gridwidth = 2;
		gbc_label_PinEight_1.anchor = GridBagConstraints.WEST;
		gbc_label_PinEight_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_PinEight_1.gridx = 2;
		gbc_label_PinEight_1.gridy = 18;
		IntermittentCon_Gem.add(label_PinEight_1, gbc_label_PinEight_1);
		
		checkBox_PingEight_Yes = new JCheckBox("Yes");
		GridBagConstraints gbc_checkBox_PingEight_Yes = new GridBagConstraints();
		gbc_checkBox_PingEight_Yes.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingEight_Yes.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingEight_Yes.gridx = 5;
		gbc_checkBox_PingEight_Yes.gridy = 18;
		IntermittentCon_Gem.add(checkBox_PingEight_Yes, gbc_checkBox_PingEight_Yes);
		
		checkBox_PingEight_No = new JCheckBox("No");
		GridBagConstraints gbc_checkBox_PingEight_No = new GridBagConstraints();
		gbc_checkBox_PingEight_No.anchor = GridBagConstraints.WEST;
		gbc_checkBox_PingEight_No.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_PingEight_No.gridx = 7;
		gbc_checkBox_PingEight_No.gridy = 18;
		IntermittentCon_Gem.add(checkBox_PingEight_No, gbc_checkBox_PingEight_No);
		
		lblIpAddressOn = new JLabel("Ip address on WG");
		GridBagConstraints gbc_lblIpAddressOn = new GridBagConstraints();
		gbc_lblIpAddressOn.anchor = GridBagConstraints.WEST;
		gbc_lblIpAddressOn.insets = new Insets(0, 0, 5, 5);
		gbc_lblIpAddressOn.gridx = 11;
		gbc_lblIpAddressOn.gridy = 18;
		IntermittentCon_Gem.add(lblIpAddressOn, gbc_lblIpAddressOn);
		
		chckbxYes_WallGarden = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxYes_WallGarden = new GridBagConstraints();
		gbc_chckbxYes_WallGarden.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxYes_WallGarden.gridx = 12;
		gbc_chckbxYes_WallGarden.gridy = 18;
		IntermittentCon_Gem.add(chckbxYes_WallGarden, gbc_chckbxYes_WallGarden);
		
		chckbxNo_WG = new JCheckBox("No");
		GridBagConstraints gbc_chckbxNo_WG = new GridBagConstraints();
		gbc_chckbxNo_WG.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNo_WG.gridx = 13;
		gbc_chckbxNo_WG.gridy = 18;
		IntermittentCon_Gem.add(chckbxNo_WG, gbc_chckbxNo_WG);
		
		JLabel label_GoogleIE = new JLabel("Can Ping google.ie");
		GridBagConstraints gbc_label_GoogleIE = new GridBagConstraints();
		gbc_label_GoogleIE.anchor = GridBagConstraints.WEST;
		gbc_label_GoogleIE.gridwidth = 2;
		gbc_label_GoogleIE.insets = new Insets(0, 0, 5, 5);
		gbc_label_GoogleIE.gridx = 2;
		gbc_label_GoogleIE.gridy = 19;
		IntermittentCon_Gem.add(label_GoogleIE, gbc_label_GoogleIE);
		 
		  checkBox_PingGoogleIE_Yes = new JCheckBox("Yes");
		  GridBagConstraints gbc_checkBox_PingGoogleIE_Yes = new GridBagConstraints();
		  gbc_checkBox_PingGoogleIE_Yes.anchor = GridBagConstraints.WEST;
		  gbc_checkBox_PingGoogleIE_Yes.insets = new Insets(0, 0, 5, 5);
		  gbc_checkBox_PingGoogleIE_Yes.gridx = 5;
		  gbc_checkBox_PingGoogleIE_Yes.gridy = 19;
		  IntermittentCon_Gem.add(checkBox_PingGoogleIE_Yes, gbc_checkBox_PingGoogleIE_Yes);
		 
		 checkBox_PingGoogle_No = new JCheckBox("No");
		 GridBagConstraints gbc_checkBox_PingGoogle_No = new GridBagConstraints();
		 gbc_checkBox_PingGoogle_No.anchor = GridBagConstraints.WEST;
		 gbc_checkBox_PingGoogle_No.insets = new Insets(0, 0, 5, 5);
		 gbc_checkBox_PingGoogle_No.gridx = 7;
		 gbc_checkBox_PingGoogle_No.gridy = 19;
		 IntermittentCon_Gem.add(checkBox_PingGoogle_No, gbc_checkBox_PingGoogle_No);
		 
		 lblIpAddressOn_1 = new JLabel("Ip address on CSR");
		 GridBagConstraints gbc_lblIpAddressOn_1 = new GridBagConstraints();
		 gbc_lblIpAddressOn_1.anchor = GridBagConstraints.WEST;
		 gbc_lblIpAddressOn_1.insets = new Insets(0, 0, 5, 5);
		 gbc_lblIpAddressOn_1.gridx = 11;
		 gbc_lblIpAddressOn_1.gridy = 19;
		 IntermittentCon_Gem.add(lblIpAddressOn_1, gbc_lblIpAddressOn_1);
		 
		 chckbxYes_CSR = new JCheckBox("Yes");
		 GridBagConstraints gbc_chckbxYes_CSR = new GridBagConstraints();
		 gbc_chckbxYes_CSR.insets = new Insets(0, 0, 5, 5);
		 gbc_chckbxYes_CSR.gridx = 12;
		 gbc_chckbxYes_CSR.gridy = 19;
		 IntermittentCon_Gem.add(chckbxYes_CSR, gbc_chckbxYes_CSR);
		 
		 chckbxNo_CSR = new JCheckBox("No");
		 GridBagConstraints gbc_chckbxNo_CSR = new GridBagConstraints();
		 gbc_chckbxNo_CSR.insets = new Insets(0, 0, 5, 5);
		 gbc_chckbxNo_CSR.gridx = 13;
		 gbc_chckbxNo_CSR.gridy = 19;
		 IntermittentCon_Gem.add(chckbxNo_CSR, gbc_chckbxNo_CSR);
		 
		 lblIntermittentStatus = new JLabel("Intermittent status");
		 GridBagConstraints gbc_lblIntermittentStatus = new GridBagConstraints();
		 gbc_lblIntermittentStatus.anchor = GridBagConstraints.WEST;
		 gbc_lblIntermittentStatus.gridwidth = 2;
		 gbc_lblIntermittentStatus.insets = new Insets(0, 0, 5, 5);
		 gbc_lblIntermittentStatus.gridx = 2;
		 gbc_lblIntermittentStatus.gridy = 20;
		 IntermittentCon_Gem.add(lblIntermittentStatus, gbc_lblIntermittentStatus);
		 
		 List<String> ls = new ArrayList<String>(); 
		 ls.add("Once an hour");
		 ls.add("Several times an hour");
		 ls.add("Once a day");
		 ls.add("Several times a day");
		 ls.add("Once a week");
		 ls.add("Several times a week");
		 ls.add("Once a month");
		 ls.add("Several times a month");
		 
		 		 comboBox_ConnectionStatus = new JComboBox();
		 		 comboBox_ConnectionStatus.setModel(new DefaultComboBoxModel(ls.toArray()));
		 		 
		 		 		 GridBagConstraints gbc_comboBox_ConnectionStatus = new GridBagConstraints();
		 		 		 gbc_comboBox_ConnectionStatus.gridwidth = 3;
		 		 		 gbc_comboBox_ConnectionStatus.insets = new Insets(0, 0, 5, 5);
		 		 		 gbc_comboBox_ConnectionStatus.fill = GridBagConstraints.HORIZONTAL;
		 		 		 gbc_comboBox_ConnectionStatus.gridx = 5;
		 		 		 gbc_comboBox_ConnectionStatus.gridy = 20;
		 		 		 IntermittentCon_Gem.add(comboBox_ConnectionStatus, gbc_comboBox_ConnectionStatus);
		 
		 lblDidCustomerFd = new JLabel("Did customer FD:");
		 GridBagConstraints gbc_lblDidCustomerFd = new GridBagConstraints();
		 gbc_lblDidCustomerFd.anchor = GridBagConstraints.WEST;
		 gbc_lblDidCustomerFd.insets = new Insets(0, 0, 5, 5);
		 gbc_lblDidCustomerFd.gridx = 11;
		 gbc_lblDidCustomerFd.gridy = 20;
		 IntermittentCon_Gem.add(lblDidCustomerFd, gbc_lblDidCustomerFd);
		 
		 chckbxFDYes = new JCheckBox("Yes");
		 GridBagConstraints gbc_chckbxFDYes = new GridBagConstraints();
		 gbc_chckbxFDYes.insets = new Insets(0, 0, 5, 5);
		 gbc_chckbxFDYes.gridx = 12;
		 gbc_chckbxFDYes.gridy = 20;
		 IntermittentCon_Gem.add(chckbxFDYes, gbc_chckbxFDYes);
		 
		 chckbxFDNo = new JCheckBox("No");
		 GridBagConstraints gbc_chckbxFDNo = new GridBagConstraints();
		 gbc_chckbxFDNo.insets = new Insets(0, 0, 5, 5);
		 gbc_chckbxFDNo.gridx = 13;
		 gbc_chckbxFDNo.gridy = 20;
		 IntermittentCon_Gem.add(chckbxFDNo, gbc_chckbxFDNo);
		 
		 lblDayNotice = new JLabel("30 Day notice in past");
		 GridBagConstraints gbc_lblDayNotice = new GridBagConstraints();
		 gbc_lblDayNotice.anchor = GridBagConstraints.WEST;
		 gbc_lblDayNotice.gridwidth = 3;
		 gbc_lblDayNotice.insets = new Insets(0, 0, 5, 5);
		 gbc_lblDayNotice.gridx = 2;
		 gbc_lblDayNotice.gridy = 21;
		 IntermittentCon_Gem.add(lblDayNotice, gbc_lblDayNotice);
		 
		 chckbxYesNotice = new JCheckBox("Yes");
		 GridBagConstraints gbc_chckbxYesNotice = new GridBagConstraints();
		 gbc_chckbxYesNotice.anchor = GridBagConstraints.WEST;
		 gbc_chckbxYesNotice.insets = new Insets(0, 0, 5, 5);
		 gbc_chckbxYesNotice.gridx = 5;
		 gbc_chckbxYesNotice.gridy = 21;
		 IntermittentCon_Gem.add(chckbxYesNotice, gbc_chckbxYesNotice);
		 
		 chckbxNoNotice = new JCheckBox("No");
		 GridBagConstraints gbc_chckbxNoNotice = new GridBagConstraints();
		 gbc_chckbxNoNotice.insets = new Insets(0, 0, 5, 5);
		 gbc_chckbxNoNotice.gridx = 7;
		 gbc_chckbxNoNotice.gridy = 21;
		 IntermittentCon_Gem.add(chckbxNoNotice, gbc_chckbxNoNotice);
		 
		 lblCanPingFrom = new JLabel("Can ping from radio to rotuer:");
		 GridBagConstraints gbc_lblCanPingFrom = new GridBagConstraints();
		 gbc_lblCanPingFrom.insets = new Insets(0, 0, 5, 5);
		 gbc_lblCanPingFrom.gridx = 11;
		 gbc_lblCanPingFrom.gridy = 21;
		 IntermittentCon_Gem.add(lblCanPingFrom, gbc_lblCanPingFrom);
		 
		 chckbxRadioToRouterYes = new JCheckBox("Yes");
		 GridBagConstraints gbc_chckbxRadioToRouterYes = new GridBagConstraints();
		 gbc_chckbxRadioToRouterYes.insets = new Insets(0, 0, 5, 5);
		 gbc_chckbxRadioToRouterYes.gridx = 12;
		 gbc_chckbxRadioToRouterYes.gridy = 21;
		 IntermittentCon_Gem.add(chckbxRadioToRouterYes, gbc_chckbxRadioToRouterYes);
		 
		 chckbxRadioToRouterNo = new JCheckBox("No");
		 GridBagConstraints gbc_chckbxRadioToRouterNo = new GridBagConstraints();
		 gbc_chckbxRadioToRouterNo.insets = new Insets(0, 0, 5, 5);
		 gbc_chckbxRadioToRouterNo.gridx = 13;
		 gbc_chckbxRadioToRouterNo.gridy = 21;
		 IntermittentCon_Gem.add(chckbxRadioToRouterNo, gbc_chckbxRadioToRouterNo);
		 
		 lblHowManyService = new JLabel("How many service calls:");
		 GridBagConstraints gbc_lblHowManyService = new GridBagConstraints();
		 gbc_lblHowManyService.anchor = GridBagConstraints.WEST;
		 gbc_lblHowManyService.insets = new Insets(0, 0, 5, 5);
		 gbc_lblHowManyService.gridx = 11;
		 gbc_lblHowManyService.gridy = 22;
		 IntermittentCon_Gem.add(lblHowManyService, gbc_lblHowManyService);
		 
		 textField_AmtServiceCall = new JTextField();
		 GridBagConstraints gbc_textField_AmtServiceCall = new GridBagConstraints();
		 gbc_textField_AmtServiceCall.gridwidth = 4;
		 gbc_textField_AmtServiceCall.insets = new Insets(0, 0, 5, 5);
		 gbc_textField_AmtServiceCall.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_AmtServiceCall.gridx = 12;
		 gbc_textField_AmtServiceCall.gridy = 22;
		 IntermittentCon_Gem.add(textField_AmtServiceCall, gbc_textField_AmtServiceCall);
		 textField_AmtServiceCall.setColumns(10);
		 
		 txtpnExtraInformation = new JTextPane();
		 txtpnExtraInformation.setText("Extra information");
		 GridBagConstraints gbc_txtpnExtraInformation = new GridBagConstraints();
		 gbc_txtpnExtraInformation.gridheight = 4;
		 gbc_txtpnExtraInformation.gridwidth = 9;
		 gbc_txtpnExtraInformation.insets = new Insets(0, 0, 5, 5);
		 gbc_txtpnExtraInformation.fill = GridBagConstraints.BOTH;
		 gbc_txtpnExtraInformation.gridx = 2;
		 gbc_txtpnExtraInformation.gridy = 23;
		 IntermittentCon_Gem.add(txtpnExtraInformation, gbc_txtpnExtraInformation);
		 
		 lblCurrentFirmware = new JLabel("Current Firmware");
		 GridBagConstraints gbc_lblCurrentFirmware = new GridBagConstraints();
		 gbc_lblCurrentFirmware.anchor = GridBagConstraints.WEST;
		 gbc_lblCurrentFirmware.insets = new Insets(0, 0, 5, 5);
		 gbc_lblCurrentFirmware.gridx = 11;
		 gbc_lblCurrentFirmware.gridy = 23;
		 IntermittentCon_Gem.add(lblCurrentFirmware, gbc_lblCurrentFirmware);
		 
		 textField_CurrentFirmware = new JTextField();
		 GridBagConstraints gbc_textField_CurrentFirmware = new GridBagConstraints();
		 gbc_textField_CurrentFirmware.gridwidth = 4;
		 gbc_textField_CurrentFirmware.insets = new Insets(0, 0, 5, 5);
		 gbc_textField_CurrentFirmware.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_CurrentFirmware.gridx = 12;
		 gbc_textField_CurrentFirmware.gridy = 23;
		 IntermittentCon_Gem.add(textField_CurrentFirmware, gbc_textField_CurrentFirmware);
		 textField_CurrentFirmware.setColumns(10);
	}
	
	public JPanel getJpanel()
	{
		return IntermittentCon_Gem;
	}

	public String exportUnoTicket()
	{
		generateOutputs();
		return unoTicket;
						
	}
	public String generateEscalation()
	{
		generateOutputs();
		return esclation;
	}
	
	//generate esclation
	private void generateOutputs()
	{
		String powerLight = "", canLogin = "",Signalstr = "",strOne = "" ,strTwo = "",strThree="",strFour="",strFive="",wifiChannelChanged="";
		//Strings used just for uno export:
		String powerLight_UNO = "",system_UNO = "";
		String system = "", Lan1="",Lan2="",twoG="",fiveG = "",phone="",WAN="",directConnect ="",pingRouter="",pingRadio="",pingEight="",pingGoogle="";
		//If user can log into system.
		String outage = "", customerMoved = "", accessToRouter = "",resetTheWAN = "",userFD ="", pingRouterFromRadio="",powerCycled = "",mainSocket = "",fiddleWithWAN = "";
		//other
		String offlineCSR = "", offlineWallgarden = "",daysNotice = "",ipInWallgarden ="",ipInCSR ="",isWifiON="",WANlight ="";
		
		if (checkBox_WAN_Off.isSelected()) 			{WANlight = "Off";}else if (checkBox_WAN_On.isSelected()) {WANlight = "On";}
		if (chckbxWifiOn_YES.isSelected()) 			{isWifiON = "Wifi is turned On.";}else if(chckbxWifiOn_No.isSelected()) { isWifiON = "Wifi was turned off.";}else {isWifiON = "";}
		if (chckbxYes_CSR.isSelected())				{ipInCSR = "Router is online in CSR.";}else if (chckbxNo_CSR.isSelected()){ipInCSR="Router is offline in CSR.";}
		if (chckbxYes_WallGarden.isSelected())		{ipInWallgarden = "IP address is in wall garden.";}else {ipInWallgarden = "Unit is offline in Wall garden.";}
		if (chckbxOn_WAN.isSelected()){strOne 	= "On";	}else {strOne	= "Off";}
		if (chckbxYesNotice.isSelected()) 		{	daysNotice 				= 	"30 Days notice is not active on the account.";}else if(chckbxNoNotice.isSelected()) {daysNotice = "30 Days notice is active on the account.";}
		if (chckbxOutage_Yes.isSelected()) 			{outage 				= 	"There is an outage in the area.";}else {outage	= "There is no outage in the area.";}
		if (chckbxWallSocket_Yes.isSelected()) 		{mainSocket 			= 	"The router is plugged into the wall socket.";}
		if (chckbxDone_FiddleWithCable.isSelected()){fiddleWithWAN 			= 	"I got the user to fiddle with the wan cable to check for a bad crimp."; }
		if (checkBox_PC_Done.isSelected())			{powerCycled 			= 	"Power cycled the rotuer.";}
		if (chckbxFDYes.isSelected()) 				{userFD					= 	"The user has factory reset the device.";}else if (chckbxFDNo.isSelected()){userFD = "The customer didn't factory reset the router.";}
		if (chckbxDone_ResetCable.isSelected()) 	{resetTheWAN 			= 	"The customer has reset the WAN cable.";}
		if (chckbxYes_CSR.isSelected())				{offlineCSR 			= 	"This user is online in CSR.";}else if(chckbxNo_CSR.isSelected()){offlineCSR = "This user is offline in CSR.";}
		if (chckbxYes_WallGarden.isSelected()) 		{offlineWallgarden 		= 	"There is an IP address on Wallgarden."; }else if (chckbxNo_WG.isSelected()) {offlineWallgarden="Offline on wall garden.";}else {offlineWallgarden ="";}
		if (checkBox_PowerOn.isSelected())			{powerLight 			= 	"On"; powerLight_UNO 	= "On";}
		if (checkBox_Off_Power.isSelected())		{powerLight 			= 	"Off";powerLight_UNO 		= "Off";}
		if (checkBox_AccessRouterYes.isSelected())	{canLogin				=	"I have access to the router.";}else{canLogin			=   "I don't have access to the router.";}
		if (chckbxOn_WAN.isSelected()){Signalstr 						= 	"On";}else{Signalstr 	=	"1 Strength Light are on";}
		if (checkBox_SystemOff.isSelected()){system 						= 	"Off";system_UNO="Off";}
		if (checkBox_SystemOn.isSelected()){system 							= 	"On";system_UNO="On";}
		if (checkBox_Lan1On.isSelected()){Lan1 								= 	"On";}
		if (checkBox_Lan1Off.isSelected()){Lan1 							= 	"Off";}
		if (checkBox_Lan2_On.isSelected()){Lan2 							= 	"On";}
		if (checkBox_Lan2_Off.isSelected()){Lan2 							= 	"Off";}
		if (checkBox_WAN_On.isSelected()){twoG								=	"On";}
		if (checkBox_WAN_Off.isSelected()){twoG								=	"Off";}
		if (checkBox_Phone_On.isSelected()){phone							=	"On";			}
		if (checkBox_Phone_Off.isSelected()){phone							=	"Off";			}
		if (checkBox_WAN_YES.isSelected()){WAN 								=	"WAN cable is in the right slot.";						}
		if (checkBox_PC_Done.isSelected()){WAN 								= 	"Power cycled the rotuer.";								}
		if (checkBox_DirectCon_Done.isSelected()){directConnect 			= 	"The customer is testing with an ethernet connection.";	}
		if (checkBox_PingRouter_Yes.isSelected()){pingRouter 				= 	"Customer can ping router.";							}
		if (checkBox_PingRouter_No.isSelected()){pingRouter 				= 	"Customer can NOT ping the router.";					}
		if (checkBox_PingRadio_Yes.isSelected()){pingRadio 					= 	"User can ping the radio.";								}
		if (checkBox_Ping_Radio_No.isSelected()){pingRadio 					= 	"User can NOT ping the radio.";							}
		if (checkBox_PingEight_Yes.isSelected()){pingEight					= 	"User can ping 8.8.8.8.";								}
		if (checkBox_PingGoogle_No.isSelected()){pingGoogle					= 	"User can Ping Google.ie";								}
		if (checkBox_PingGoogleIE_Yes.isSelected()){pingGoogle				= 	"User can NOT ping google.ie";							}
		if (chckbxOutage_Yes.isSelected()) 		{outage 					= 	"There was an outage in the area.";						}
		if (chckbxOutage_No.isSelected())		{outage 					= 	"There are no outages in the area";						}
		if (chckbxYes_ConnectionMoved.isSelected()) { 	customerMoved		= 	"Customer has moved the cabled around before talking with us.";}
		if (chckbxNo_ConnectionMoved.isSelected() ) { 	customerMoved 		= 	"Customer has NOT moved the cable before talking with us.";}
		if (checkBox_AccessRouterYes.isSelected()){		accessToRouter	 	= 	"I have access to the router.";							}
		if (checkBox_AccessRouterNo.isSelected()){		accessToRouter	 	= 	"I do not have access to the router.";					}
		if (chckbxRadioToRouterNo.isSelected()) {pingRouterFromRadio 		= 	"I can't ping the router from the radio.";				}else if (chckbxRadioToRouterYes.isSelected()) {pingRouterFromRadio = "I can ping the router from the radio.";}
		if (chckbxWifiChannelYes.isSelected())		{wifiChannelChanged 	= "Changed the wifi channel to 6 or below for the Mac devices.";}
		
		
		esclation =   "TRN: " + textField_TicketNumber.getText() + " IMSI: " + textField_ISMI.getText() + "Height Site: " + textField_Installed_HighSite.getText() +  " ISSUE: " + textField_Issue.getText() + "<br>" + txtpnExtraInformation.getText() + "<br>"
		+ "<h2>Issue Description</h2><br>"
		+ "Customer has an intermittent connection issue that started: " + textField_DateIssueStarted.getText() + "</br> " + offlineCSR + "<br>" + offlineWallgarden + "</br>" 
		+ "The customers connection goes down " + comboBox_ConnectionStatus.getSelectedItem().toString() + "<br>"
		+  canLogin + "<br>"
		+ "<h2>What service/s is affected by the issue</h2><br>"
		+  "ANSWER <br>"
		+ "<h2>Technology</h2><br>"
		+ "<b>LTE</b>"
		+ "<h2>Current Enodb & Cell ID</h2><br>"
		+ "Current Enode: " + textField_CurrentENode.getText() + "<br>"+ "Current Cell ID: " + textFieldCurrentCellID.getText()
		+ "<h2>Device Type</h2><br>"
		+ "CAT 6"
		+ "<h2>Connection and Device uptime</h2>"
		+ "Connection Time: " + textField_DeviceTime.getText() + "<br>"
		+ "Device Time: " + textField_ConnectionTime.getText() + "<br>"
		+ "<h2>Installation CPE Signal Stats</h2><br>" 
		+ "<h2>Current Metrics</h2><br>"
		+ "Lights on router when connection is down:"
		+ "<h2>Indoor unit Led Status</h2><br>" 
		+ "Power: " + powerLight + "<br>"
		+ "Lan 1: " + Lan1 + "<br>"
		+ "Lan 2: " + Lan2 + "<br>"
		+ "System:" + system + "<br>"
		+ "LTE str: " + Signalstr + "<br>"
		+ "Phone: " + phone + "<br>"
		+ "WAN: " + WANlight + "<br>"
		+ "<h2>List clear steps taken to resolve the issue</h2>\n"
		+ "-" + powerCycled + "<br>"
		+ "-" + resetTheWAN  + "<br>"
		+ "-" + fiddleWithWAN  + "<br>"		
		+ "<b><u>When the customers connection is down:</b></u><br>"
		+  pingRadio + "</b><br>"
		+  pingRouter + "</b><br>"
		+  pingEight + "</b><br>"
		+  pingGoogle + "</b><br>"
		+ "<h2>Affected Firmware</h2><br>"
		+ textField_CurrentFirmware.getText() + "</br>"
		+ "<h2>ATTACHED XLS FILE OR PNG FILE OF HISTORICAL SIGNAL STATS BOTH RSRP & CINR (SHINY TOOLS)</h2><br><br>"
		+ "<h2>How Many Service Calls did the customer received (excluding install)</h2><br>"
		+ textField_AmtServiceCall.getText() + "<br>"
		+ "<h2>Was 30 days notice given to customer in the past</h2><br>"
		+ "<h2>Ping Tests results from CPE to external sites & from Customer device to CPE & External Sites</h2><br><br>"
		+ "<h3>Resolution Steps</h3><br>"
		+ outage + "<br>"
		+ resetTheWAN + "<br>"
		+ mainSocket + "<br>"
		+ userFD + "<br>";
		
		
		unoTicket =  "Customer is experancing an intermittent connection. \n"
		+ textField_ISMI.getText() + "-" + textField_Installed_HighSite.getText() +  " - " + textField_Issue.getText()
		+ "Date Issue Started: " + textField_DateIssueStarted.getText() + "\n"
		+ "Extra Information: \n" + txtpnExtraInformation.getText() + "\n"
		+ "Lights on router when the connection is down: \n"
		+ "Power: " 		+ powerLight_UNO + "\n"
		+ "System: " 		+ system_UNO + "\n"
		+ "Strength 1: " 	+  strOne + "\n"
		+ "Strength 2: " 	+  strTwo + "\n"
		+ "Strength 3: " 	+  strThree + "\n"
		+ "Lan 1 \t" + Lan1 + "\n"
		+ "Lan 2 \t" + Lan2 + "\n"
		+ "WAN: \t" + WANlight + "\n"
		+ "Phone \t" + phone + "\n"
		+ powerCycled 	+ 	"\n"
		+ WAN 			+	"\n"
		+ wifiChannelChanged + "\n"
		+ ipInWallgarden + "\n"
		+ userFD 		+ "\n"
		+ isWifiON 		+ "\n"
		+ "When the customer's connect is down: \n"
		+ directConnect	+ 	"\n"
		+ pingRouter 	+ 	"\n"
		+ pingEight 	+ 	"\n"
		+ pingGoogle 	+ 	"\n"
		+ canLogin 		+ 	"\n"
		+ fiddleWithWAN + 	"\n"
		+ resetTheWAN 	+   "\n"
		+ mainSocket 	+ 	"\n";
	}

}