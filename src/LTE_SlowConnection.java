import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;

public class LTE_SlowConnection extends JPanel {
	private JTextField textField_ISMI;
	private JTextField textField_HighSite;
	private JTextField textField_Issue;
	private JTextField textField_CurrentMetrics;
	private JTextField textField_DeviceTime;
	private JTextField textField_ConnectionTime;
	private JTextField textField_Download;
	private JTextField textField_Upload;
	private JTextField textField_Ping;
	JCheckBox chckbxYes_routerAccess;
	JCheckBox chckbxNo_routerAccess;
	JCheckBox chckbxDone_DirectConnect;
	JCheckBox chckbxDone_DisableWifi;
	JCheckBox chckbxDone_PCAfterWifi;
	JCheckBox chckbxDone_WAN;
	private JLabel lblTicketNumber;
	private JTextField textField_TicketNumber;
	private JLabel lblCurrentEnodeb;
	private JTextField textField_CEnodeB;
	private JLabel lblNewLabel;
	private JTextField textField_Cell;
	private JLabel lblWhenDidThe;
	private JTextField textField_DateIssueStarted;
	private JButton btnCurrentDate;
	private JTextPane txtpnExtraInformation;
	private JLabel lblNewLabel_2;
	private JCheckBox chckbxYes_30;
	private JCheckBox chckbxNo_30;
	private JLabel lblNewLabel_3;
	private JTextField textField_CurrentFirmware;
	private JLabel lblNewLabel_4;
	private JTextField textField_TrafficCounters;
	private JLabel lblNewLabel_5_Callout;
	private JCheckBox chckbxYes_DaysNotice;
	private JCheckBox chckbxNo_DaysNotice;
	private JLabel lblHowManyServices;
	private JTextField textField_ServiceCalls;
	private JLabel lblLabel_TraficCounters;
	private JTextField textField_TraficCounters;
	private JLabel lblDhcpList;
	private JTextField textField_DHCPLIST;
	private JLabel lblIsUserRate;
	private JCheckBox chckbxYes_RateLimited;
	private JCheckBox chckbxNo_RateLimited;
	private JLabel lblPingCpeFrom;
	private JTextField textField_PuttyPing;
	private JLabel lblUserPingRouter;
	private JTextField textField_UserPingRouter;
	TicketBuilder TB;
	private JLabel lblNewLabel_Address;
	private JCheckBox chckbxDone_ConfirmIPAddress;
	private JLabel lblNewLabel_5;
	private JCheckBox chckbx_MetricsAcceptable;
	private JLabel lblOduToGoogle;
	private JTextField textField_ODUToGoogle;
	/**
	 * Create the panel.
	 */
	public LTE_SlowConnection(TicketBuilder TB) {
		this.TB = TB; 
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 30, 30, 30, 30, 0, 0, 30, 0, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblIsmi = new JLabel("ISMI");
		GridBagConstraints gbc_lblIsmi = new GridBagConstraints();
		gbc_lblIsmi.anchor = GridBagConstraints.WEST;
		gbc_lblIsmi.insets = new Insets(0, 0, 5, 5);
		gbc_lblIsmi.gridx = 1;
		gbc_lblIsmi.gridy = 0;
		add(lblIsmi, gbc_lblIsmi);
		
		textField_ISMI = new JTextField();
		GridBagConstraints gbc_textField_ISMI = new GridBagConstraints();
		gbc_textField_ISMI.gridwidth = 2;
		gbc_textField_ISMI.insets = new Insets(0, 0, 5, 5);
		gbc_textField_ISMI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_ISMI.gridx = 2;
		gbc_textField_ISMI.gridy = 0;
		add(textField_ISMI, gbc_textField_ISMI);
		textField_ISMI.setColumns(10);
		
		lblCurrentEnodeb = new JLabel("Current EnodeB");
		GridBagConstraints gbc_lblCurrentEnodeb = new GridBagConstraints();
		gbc_lblCurrentEnodeb.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentEnodeb.gridwidth = 5;
		gbc_lblCurrentEnodeb.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentEnodeb.gridx = 7;
		gbc_lblCurrentEnodeb.gridy = 0;
		add(lblCurrentEnodeb, gbc_lblCurrentEnodeb);
		
		textField_CEnodeB = new JTextField();
		GridBagConstraints gbc_textField_CEnodeB = new GridBagConstraints();
		gbc_textField_CEnodeB.gridwidth = 2;
		gbc_textField_CEnodeB.insets = new Insets(0, 0, 5, 5);
		gbc_textField_CEnodeB.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_CEnodeB.gridx = 12;
		gbc_textField_CEnodeB.gridy = 0;
		add(textField_CEnodeB, gbc_textField_CEnodeB);
		textField_CEnodeB.setColumns(10);
		
		lblNewLabel = new JLabel("Current Cell");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 14;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		textField_Cell = new JTextField();
		GridBagConstraints gbc_textField_Cell = new GridBagConstraints();
		gbc_textField_Cell.gridwidth = 3;
		gbc_textField_Cell.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Cell.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Cell.gridx = 17;
		gbc_textField_Cell.gridy = 0;
		add(textField_Cell, gbc_textField_Cell);
		textField_Cell.setColumns(10);
		
		JLabel lblHighSite = new JLabel("High Site");
		GridBagConstraints gbc_lblHighSite = new GridBagConstraints();
		gbc_lblHighSite.anchor = GridBagConstraints.WEST;
		gbc_lblHighSite.insets = new Insets(0, 0, 5, 5);
		gbc_lblHighSite.gridx = 1;
		gbc_lblHighSite.gridy = 1;
		add(lblHighSite, gbc_lblHighSite);
		
		textField_HighSite = new JTextField();
		GridBagConstraints gbc_textField_HighSite = new GridBagConstraints();
		gbc_textField_HighSite.gridwidth = 2;
		gbc_textField_HighSite.insets = new Insets(0, 0, 5, 5);
		gbc_textField_HighSite.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_HighSite.gridx = 2;
		gbc_textField_HighSite.gridy = 1;
		add(textField_HighSite, gbc_textField_HighSite);
		textField_HighSite.setColumns(10);
		
		lblNewLabel_2 = new JLabel("30 Day notice given");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridwidth = 6;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 7;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		chckbxYes_30 = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxYes_30 = new GridBagConstraints();
		gbc_chckbxYes_30.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxYes_30.gridx = 13;
		gbc_chckbxYes_30.gridy = 1;
		add(chckbxYes_30, gbc_chckbxYes_30);
		
		chckbxNo_30 = new JCheckBox("No");
		GridBagConstraints gbc_chckbxNo_30 = new GridBagConstraints();
		gbc_chckbxNo_30.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNo_30.gridx = 14;
		gbc_chckbxNo_30.gridy = 1;
		add(chckbxNo_30, gbc_chckbxNo_30);
		
		JLabel lblIssue = new JLabel("Issue");
		GridBagConstraints gbc_lblIssue = new GridBagConstraints();
		gbc_lblIssue.anchor = GridBagConstraints.WEST;
		gbc_lblIssue.insets = new Insets(0, 0, 5, 5);
		gbc_lblIssue.gridx = 1;
		gbc_lblIssue.gridy = 2;
		add(lblIssue, gbc_lblIssue);
		
		textField_Issue = new JTextField();
		GridBagConstraints gbc_textField_Issue = new GridBagConstraints();
		gbc_textField_Issue.gridwidth = 2;
		gbc_textField_Issue.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Issue.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Issue.gridx = 2;
		gbc_textField_Issue.gridy = 2;
		add(textField_Issue, gbc_textField_Issue);
		textField_Issue.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Current Firmware");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridwidth = 6;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 7;
		gbc_lblNewLabel_3.gridy = 2;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_CurrentFirmware = new JTextField();
		GridBagConstraints gbc_textField_CurrentFirmware = new GridBagConstraints();
		gbc_textField_CurrentFirmware.gridwidth = 2;
		gbc_textField_CurrentFirmware.insets = new Insets(0, 0, 5, 5);
		gbc_textField_CurrentFirmware.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_CurrentFirmware.gridx = 13;
		gbc_textField_CurrentFirmware.gridy = 2;
		add(textField_CurrentFirmware, gbc_textField_CurrentFirmware);
		textField_CurrentFirmware.setColumns(10);
		
		lblTicketNumber = new JLabel("Ticket Number");
		GridBagConstraints gbc_lblTicketNumber = new GridBagConstraints();
		gbc_lblTicketNumber.anchor = GridBagConstraints.WEST;
		gbc_lblTicketNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblTicketNumber.gridx = 1;
		gbc_lblTicketNumber.gridy = 3;
		add(lblTicketNumber, gbc_lblTicketNumber);
		
		textField_TicketNumber = new JTextField();
		GridBagConstraints gbc_textField_TicketNumber = new GridBagConstraints();
		gbc_textField_TicketNumber.gridwidth = 2;
		gbc_textField_TicketNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textField_TicketNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_TicketNumber.gridx = 2;
		gbc_textField_TicketNumber.gridy = 3;
		add(textField_TicketNumber, gbc_textField_TicketNumber);
		textField_TicketNumber.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Trafic counters");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridwidth = 6;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 7;
		gbc_lblNewLabel_4.gridy = 3;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_TrafficCounters = new JTextField();
		GridBagConstraints gbc_textField_TrafficCounters = new GridBagConstraints();
		gbc_textField_TrafficCounters.gridwidth = 2;
		gbc_textField_TrafficCounters.insets = new Insets(0, 0, 5, 5);
		gbc_textField_TrafficCounters.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_TrafficCounters.gridx = 13;
		gbc_textField_TrafficCounters.gridy = 3;
		add(textField_TrafficCounters, gbc_textField_TrafficCounters);
		textField_TrafficCounters.setColumns(10);
		
		JLabel lblDoYouHave = new JLabel("Do you have router access");
		GridBagConstraints gbc_lblDoYouHave = new GridBagConstraints();
		gbc_lblDoYouHave.anchor = GridBagConstraints.WEST;
		gbc_lblDoYouHave.insets = new Insets(0, 0, 5, 5);
		gbc_lblDoYouHave.gridx = 1;
		gbc_lblDoYouHave.gridy = 4;
		add(lblDoYouHave, gbc_lblDoYouHave);
		
		chckbxYes_routerAccess = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxYes_routerAccess = new GridBagConstraints();
		gbc_chckbxYes_routerAccess.fill = GridBagConstraints.BOTH;
		gbc_chckbxYes_routerAccess.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxYes_routerAccess.gridx = 2;
		gbc_chckbxYes_routerAccess.gridy = 4;
		add(chckbxYes_routerAccess, gbc_chckbxYes_routerAccess);
		
		chckbxNo_routerAccess = new JCheckBox("No");
		GridBagConstraints gbc_chckbxNo_routerAccess = new GridBagConstraints();
		gbc_chckbxNo_routerAccess.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNo_routerAccess.gridx = 3;
		gbc_chckbxNo_routerAccess.gridy = 4;
		add(chckbxNo_routerAccess, gbc_chckbxNo_routerAccess);
		
		JLabel lblDirectConnnectTo = new JLabel("Direct connnect to router");
		GridBagConstraints gbc_lblDirectConnnectTo = new GridBagConstraints();
		gbc_lblDirectConnnectTo.anchor = GridBagConstraints.WEST;
		gbc_lblDirectConnnectTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDirectConnnectTo.gridx = 1;
		gbc_lblDirectConnnectTo.gridy = 5;
		add(lblDirectConnnectTo, gbc_lblDirectConnnectTo);
		
		chckbxDone_DirectConnect = new JCheckBox("Done");
		GridBagConstraints gbc_chckbxDone_DirectConnect = new GridBagConstraints();
		gbc_chckbxDone_DirectConnect.gridwidth = 2;
		gbc_chckbxDone_DirectConnect.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDone_DirectConnect.gridx = 2;
		gbc_chckbxDone_DirectConnect.gridy = 5;
		add(chckbxDone_DirectConnect, gbc_chckbxDone_DirectConnect);
		
		lblNewLabel_5_Callout = new JLabel("30 days notice given?");
		GridBagConstraints gbc_lblNewLabel_5_Callout = new GridBagConstraints();
		gbc_lblNewLabel_5_Callout.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5_Callout.gridwidth = 6;
		gbc_lblNewLabel_5_Callout.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_Callout.gridx = 7;
		gbc_lblNewLabel_5_Callout.gridy = 5;
		add(lblNewLabel_5_Callout, gbc_lblNewLabel_5_Callout);
		
		chckbxYes_DaysNotice = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxYes_DaysNotice = new GridBagConstraints();
		gbc_chckbxYes_DaysNotice.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxYes_DaysNotice.gridx = 13;
		gbc_chckbxYes_DaysNotice.gridy = 5;
		add(chckbxYes_DaysNotice, gbc_chckbxYes_DaysNotice);
		
		chckbxNo_DaysNotice = new JCheckBox("No");
		GridBagConstraints gbc_chckbxNo_DaysNotice = new GridBagConstraints();
		gbc_chckbxNo_DaysNotice.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNo_DaysNotice.gridx = 14;
		gbc_chckbxNo_DaysNotice.gridy = 5;
		add(chckbxNo_DaysNotice, gbc_chckbxNo_DaysNotice);
		
		JLabel lblNewLabel_1 = new JLabel("Disable wifi:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 6;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		chckbxDone_DisableWifi = new JCheckBox("Done");
		GridBagConstraints gbc_chckbxDone_DisableWifi = new GridBagConstraints();
		gbc_chckbxDone_DisableWifi.gridwidth = 2;
		gbc_chckbxDone_DisableWifi.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDone_DisableWifi.gridx = 2;
		gbc_chckbxDone_DisableWifi.gridy = 6;
		add(chckbxDone_DisableWifi, gbc_chckbxDone_DisableWifi);
		
		lblHowManyServices = new JLabel("How Many services calls");
		GridBagConstraints gbc_lblHowManyServices = new GridBagConstraints();
		gbc_lblHowManyServices.gridwidth = 7;
		gbc_lblHowManyServices.insets = new Insets(0, 0, 5, 5);
		gbc_lblHowManyServices.gridx = 6;
		gbc_lblHowManyServices.gridy = 6;
		add(lblHowManyServices, gbc_lblHowManyServices);
		
		textField_ServiceCalls = new JTextField();
		GridBagConstraints gbc_textField_ServiceCalls = new GridBagConstraints();
		gbc_textField_ServiceCalls.gridwidth = 3;
		gbc_textField_ServiceCalls.insets = new Insets(0, 0, 5, 5);
		gbc_textField_ServiceCalls.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_ServiceCalls.gridx = 13;
		gbc_textField_ServiceCalls.gridy = 6;
		add(textField_ServiceCalls, gbc_textField_ServiceCalls);
		textField_ServiceCalls.setColumns(10);
		
		JLabel lblNewLabel_DisableWifi = new JLabel("Power Cycle");
		GridBagConstraints gbc_lblNewLabel_DisableWifi = new GridBagConstraints();
		gbc_lblNewLabel_DisableWifi.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_DisableWifi.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_DisableWifi.gridx = 1;
		gbc_lblNewLabel_DisableWifi.gridy = 7;
		add(lblNewLabel_DisableWifi, gbc_lblNewLabel_DisableWifi);
		
		chckbxDone_PCAfterWifi = new JCheckBox("Done");
		GridBagConstraints gbc_chckbxDone_PCAfterWifi = new GridBagConstraints();
		gbc_chckbxDone_PCAfterWifi.gridwidth = 2;
		gbc_chckbxDone_PCAfterWifi.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDone_PCAfterWifi.gridx = 2;
		gbc_chckbxDone_PCAfterWifi.gridy = 7;
		add(chckbxDone_PCAfterWifi, gbc_chckbxDone_PCAfterWifi);
		
		lblLabel_TraficCounters = new JLabel("Trafic Counters");
		GridBagConstraints gbc_lblLabel_TraficCounters = new GridBagConstraints();
		gbc_lblLabel_TraficCounters.anchor = GridBagConstraints.WEST;
		gbc_lblLabel_TraficCounters.gridwidth = 5;
		gbc_lblLabel_TraficCounters.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_TraficCounters.gridx = 7;
		gbc_lblLabel_TraficCounters.gridy = 7;
		add(lblLabel_TraficCounters, gbc_lblLabel_TraficCounters);
		
		textField_TraficCounters = new JTextField();
		GridBagConstraints gbc_textField_TraficCounters = new GridBagConstraints();
		gbc_textField_TraficCounters.gridwidth = 3;
		gbc_textField_TraficCounters.insets = new Insets(0, 0, 5, 5);
		gbc_textField_TraficCounters.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_TraficCounters.gridx = 13;
		gbc_textField_TraficCounters.gridy = 7;
		add(textField_TraficCounters, gbc_textField_TraficCounters);
		textField_TraficCounters.setColumns(10);
		
		JLabel lblIsWanMtu = new JLabel("Check if WAN is 1500");
		GridBagConstraints gbc_lblIsWanMtu = new GridBagConstraints();
		gbc_lblIsWanMtu.anchor = GridBagConstraints.WEST;
		gbc_lblIsWanMtu.insets = new Insets(0, 0, 5, 5);
		gbc_lblIsWanMtu.gridx = 1;
		gbc_lblIsWanMtu.gridy = 8;
		add(lblIsWanMtu, gbc_lblIsWanMtu);
		
		chckbxDone_WAN = new JCheckBox("Done");
		GridBagConstraints gbc_chckbxDone_WAN = new GridBagConstraints();
		gbc_chckbxDone_WAN.gridwidth = 2;
		gbc_chckbxDone_WAN.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDone_WAN.gridx = 2;
		gbc_chckbxDone_WAN.gridy = 8;
		add(chckbxDone_WAN, gbc_chckbxDone_WAN);
		
		lblDhcpList = new JLabel("DHCP List");
		GridBagConstraints gbc_lblDhcpList = new GridBagConstraints();
		gbc_lblDhcpList.anchor = GridBagConstraints.WEST;
		gbc_lblDhcpList.gridwidth = 5;
		gbc_lblDhcpList.insets = new Insets(0, 0, 5, 5);
		gbc_lblDhcpList.gridx = 7;
		gbc_lblDhcpList.gridy = 8;
		add(lblDhcpList, gbc_lblDhcpList);
		
		textField_DHCPLIST = new JTextField();
		GridBagConstraints gbc_textField_DHCPLIST = new GridBagConstraints();
		gbc_textField_DHCPLIST.gridwidth = 3;
		gbc_textField_DHCPLIST.insets = new Insets(0, 0, 5, 5);
		gbc_textField_DHCPLIST.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_DHCPLIST.gridx = 13;
		gbc_textField_DHCPLIST.gridy = 8;
		add(textField_DHCPLIST, gbc_textField_DHCPLIST);
		textField_DHCPLIST.setColumns(10);
		
		JLabel lblCurrentMetrics = new JLabel("Current metrics");
		GridBagConstraints gbc_lblCurrentMetrics = new GridBagConstraints();
		gbc_lblCurrentMetrics.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentMetrics.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrentMetrics.gridx = 1;
		gbc_lblCurrentMetrics.gridy = 9;
		add(lblCurrentMetrics, gbc_lblCurrentMetrics);
		
		textField_CurrentMetrics = new JTextField();
		GridBagConstraints gbc_textField_CurrentMetrics = new GridBagConstraints();
		gbc_textField_CurrentMetrics.gridwidth = 2;
		gbc_textField_CurrentMetrics.insets = new Insets(0, 0, 5, 5);
		gbc_textField_CurrentMetrics.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_CurrentMetrics.gridx = 2;
		gbc_textField_CurrentMetrics.gridy = 9;
		add(textField_CurrentMetrics, gbc_textField_CurrentMetrics);
		textField_CurrentMetrics.setColumns(10);
		
		lblIsUserRate = new JLabel("Is user rate Limited");
		GridBagConstraints gbc_lblIsUserRate = new GridBagConstraints();
		gbc_lblIsUserRate.anchor = GridBagConstraints.WEST;
		gbc_lblIsUserRate.gridwidth = 6;
		gbc_lblIsUserRate.insets = new Insets(0, 0, 5, 5);
		gbc_lblIsUserRate.gridx = 7;
		gbc_lblIsUserRate.gridy = 9;
		add(lblIsUserRate, gbc_lblIsUserRate);
		
		chckbxYes_RateLimited = new JCheckBox("Yes");
		GridBagConstraints gbc_chckbxYes_RateLimited = new GridBagConstraints();
		gbc_chckbxYes_RateLimited.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxYes_RateLimited.gridx = 13;
		gbc_chckbxYes_RateLimited.gridy = 9;
		add(chckbxYes_RateLimited, gbc_chckbxYes_RateLimited);
		
		chckbxNo_RateLimited = new JCheckBox("No");
		GridBagConstraints gbc_chckbxNo_RateLimited = new GridBagConstraints();
		gbc_chckbxNo_RateLimited.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNo_RateLimited.gridx = 14;
		gbc_chckbxNo_RateLimited.gridy = 9;
		add(chckbxNo_RateLimited, gbc_chckbxNo_RateLimited);
		
		JLabel lblDeviceTime = new JLabel("Device Time");
		GridBagConstraints gbc_lblDeviceTime = new GridBagConstraints();
		gbc_lblDeviceTime.anchor = GridBagConstraints.WEST;
		gbc_lblDeviceTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeviceTime.gridx = 1;
		gbc_lblDeviceTime.gridy = 10;
		add(lblDeviceTime, gbc_lblDeviceTime);
		
		textField_DeviceTime = new JTextField();
		GridBagConstraints gbc_textField_DeviceTime = new GridBagConstraints();
		gbc_textField_DeviceTime.gridwidth = 2;
		gbc_textField_DeviceTime.insets = new Insets(0, 0, 5, 5);
		gbc_textField_DeviceTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_DeviceTime.gridx = 2;
		gbc_textField_DeviceTime.gridy = 10;
		add(textField_DeviceTime, gbc_textField_DeviceTime);
		textField_DeviceTime.setColumns(10);
		
		lblPingCpeFrom = new JLabel("Ping CPE from putty");
		GridBagConstraints gbc_lblPingCpeFrom = new GridBagConstraints();
		gbc_lblPingCpeFrom.anchor = GridBagConstraints.WEST;
		gbc_lblPingCpeFrom.gridwidth = 6;
		gbc_lblPingCpeFrom.insets = new Insets(0, 0, 5, 5);
		gbc_lblPingCpeFrom.gridx = 7;
		gbc_lblPingCpeFrom.gridy = 10;
		add(lblPingCpeFrom, gbc_lblPingCpeFrom);
		
		textField_PuttyPing = new JTextField();
		GridBagConstraints gbc_textField_PuttyPing = new GridBagConstraints();
		gbc_textField_PuttyPing.gridwidth = 3;
		gbc_textField_PuttyPing.insets = new Insets(0, 0, 5, 5);
		gbc_textField_PuttyPing.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_PuttyPing.gridx = 13;
		gbc_textField_PuttyPing.gridy = 10;
		add(textField_PuttyPing, gbc_textField_PuttyPing);
		textField_PuttyPing.setColumns(10);
		
		JLabel lblConnectionTime = new JLabel("Connection Time");
		GridBagConstraints gbc_lblConnectionTime = new GridBagConstraints();
		gbc_lblConnectionTime.anchor = GridBagConstraints.WEST;
		gbc_lblConnectionTime.insets = new Insets(0, 0, 5, 5);
		gbc_lblConnectionTime.gridx = 1;
		gbc_lblConnectionTime.gridy = 11;
		add(lblConnectionTime, gbc_lblConnectionTime);
		
		textField_ConnectionTime = new JTextField();
		GridBagConstraints gbc_textField_ConnectionTime = new GridBagConstraints();
		gbc_textField_ConnectionTime.gridwidth = 2;
		gbc_textField_ConnectionTime.insets = new Insets(0, 0, 5, 5);
		gbc_textField_ConnectionTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_ConnectionTime.gridx = 2;
		gbc_textField_ConnectionTime.gridy = 11;
		add(textField_ConnectionTime, gbc_textField_ConnectionTime);
		textField_ConnectionTime.setColumns(10);
		
		lblUserPingRouter = new JLabel("User Ping router");
		GridBagConstraints gbc_lblUserPingRouter = new GridBagConstraints();
		gbc_lblUserPingRouter.anchor = GridBagConstraints.WEST;
		gbc_lblUserPingRouter.gridwidth = 5;
		gbc_lblUserPingRouter.insets = new Insets(0, 0, 5, 5);
		gbc_lblUserPingRouter.gridx = 7;
		gbc_lblUserPingRouter.gridy = 11;
		add(lblUserPingRouter, gbc_lblUserPingRouter);
		
		textField_UserPingRouter = new JTextField();
		GridBagConstraints gbc_textField_UserPingRouter = new GridBagConstraints();
		gbc_textField_UserPingRouter.gridwidth = 3;
		gbc_textField_UserPingRouter.insets = new Insets(0, 0, 5, 5);
		gbc_textField_UserPingRouter.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_UserPingRouter.gridx = 13;
		gbc_textField_UserPingRouter.gridy = 11;
		add(textField_UserPingRouter, gbc_textField_UserPingRouter);
		textField_UserPingRouter.setColumns(10);
		
		JLabel lblDownloaduploadping = new JLabel("Download:Upload:Ping");
		GridBagConstraints gbc_lblDownloaduploadping = new GridBagConstraints();
		gbc_lblDownloaduploadping.anchor = GridBagConstraints.WEST;
		gbc_lblDownloaduploadping.insets = new Insets(0, 0, 5, 5);
		gbc_lblDownloaduploadping.gridx = 1;
		gbc_lblDownloaduploadping.gridy = 12;
		add(lblDownloaduploadping, gbc_lblDownloaduploadping);
		
		textField_Download = new JTextField();
		GridBagConstraints gbc_textField_Download = new GridBagConstraints();
		gbc_textField_Download.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Download.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Download.gridx = 2;
		gbc_textField_Download.gridy = 12;
		add(textField_Download, gbc_textField_Download);
		textField_Download.setColumns(10);
		
		textField_Upload = new JTextField();
		GridBagConstraints gbc_textField_Upload = new GridBagConstraints();
		gbc_textField_Upload.gridwidth = 2;
		gbc_textField_Upload.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Upload.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Upload.gridx = 3;
		gbc_textField_Upload.gridy = 12;
		add(textField_Upload, gbc_textField_Upload);
		textField_Upload.setColumns(10);
		
		textField_Ping = new JTextField();
		GridBagConstraints gbc_textField_Ping = new GridBagConstraints();
		gbc_textField_Ping.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Ping.gridwidth = 3;
		gbc_textField_Ping.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Ping.gridx = 5;
		gbc_textField_Ping.gridy = 12;
		add(textField_Ping, gbc_textField_Ping);
		textField_Ping.setColumns(10);
		
		lblNewLabel_Address = new JLabel("Confirm IP address");
		GridBagConstraints gbc_lblNewLabel_Address = new GridBagConstraints();
		gbc_lblNewLabel_Address.gridwidth = 5;
		gbc_lblNewLabel_Address.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_Address.gridx = 8;
		gbc_lblNewLabel_Address.gridy = 12;
		add(lblNewLabel_Address, gbc_lblNewLabel_Address);
		
		chckbxDone_ConfirmIPAddress = new JCheckBox("Done");
		GridBagConstraints gbc_chckbxDone_ConfirmIPAddress = new GridBagConstraints();
		gbc_chckbxDone_ConfirmIPAddress.gridwidth = 2;
		gbc_chckbxDone_ConfirmIPAddress.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDone_ConfirmIPAddress.gridx = 13;
		gbc_chckbxDone_ConfirmIPAddress.gridy = 12;
		add(chckbxDone_ConfirmIPAddress, gbc_chckbxDone_ConfirmIPAddress);
		
		JLabel lblAllTpLinkswifi = new JLabel("All TP links,Wifi extenders etc. disabled");
		GridBagConstraints gbc_lblAllTpLinkswifi = new GridBagConstraints();
		gbc_lblAllTpLinkswifi.anchor = GridBagConstraints.EAST;
		gbc_lblAllTpLinkswifi.insets = new Insets(0, 0, 5, 5);
		gbc_lblAllTpLinkswifi.gridx = 1;
		gbc_lblAllTpLinkswifi.gridy = 13;
		add(lblAllTpLinkswifi, gbc_lblAllTpLinkswifi);
		
		JCheckBox chckbxDone_ExtendersDisabled = new JCheckBox("Done");
		GridBagConstraints gbc_chckbxDone_ExtendersDisabled = new GridBagConstraints();
		gbc_chckbxDone_ExtendersDisabled.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDone_ExtendersDisabled.gridx = 2;
		gbc_chckbxDone_ExtendersDisabled.gridy = 13;
		add(chckbxDone_ExtendersDisabled, gbc_chckbxDone_ExtendersDisabled);
		
		lblNewLabel_5 = new JLabel("Metrics above min level");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 6;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 6;
		gbc_lblNewLabel_5.gridy = 13;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		chckbx_MetricsAcceptable = new JCheckBox("Done");
		GridBagConstraints gbc_chckbx_MetricsAcceptable = new GridBagConstraints();
		gbc_chckbx_MetricsAcceptable.gridwidth = 2;
		gbc_chckbx_MetricsAcceptable.insets = new Insets(0, 0, 5, 5);
		gbc_chckbx_MetricsAcceptable.gridx = 13;
		gbc_chckbx_MetricsAcceptable.gridy = 13;
		add(chckbx_MetricsAcceptable, gbc_chckbx_MetricsAcceptable);
		
		lblWhenDidThe = new JLabel("When did the Issue start");
		GridBagConstraints gbc_lblWhenDidThe = new GridBagConstraints();
		gbc_lblWhenDidThe.anchor = GridBagConstraints.WEST;
		gbc_lblWhenDidThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblWhenDidThe.gridx = 1;
		gbc_lblWhenDidThe.gridy = 14;
		add(lblWhenDidThe, gbc_lblWhenDidThe);
		
		textField_DateIssueStarted = new JTextField();
		GridBagConstraints gbc_textField_DateIssueStarted = new GridBagConstraints();
		gbc_textField_DateIssueStarted.gridwidth = 2;
		gbc_textField_DateIssueStarted.insets = new Insets(0, 0, 5, 5);
		gbc_textField_DateIssueStarted.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_DateIssueStarted.gridx = 2;
		gbc_textField_DateIssueStarted.gridy = 14;
		add(textField_DateIssueStarted, gbc_textField_DateIssueStarted);
		textField_DateIssueStarted.setColumns(10);
		
		btnCurrentDate = new JButton("Current");
		btnCurrentDate.addActionListener(
				new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				  Date date = new Date();
				  textField_DateIssueStarted.setText(dateFormat.format(date)); //2016/11/16 12:08:43
				  } 
				}
				);
		GridBagConstraints gbc_btnCurrent = new GridBagConstraints();
		gbc_btnCurrent.gridwidth = 6;
		gbc_btnCurrent.insets = new Insets(0, 0, 5, 5);
		gbc_btnCurrent.gridx = 4;
		gbc_btnCurrent.gridy = 14;
		add(btnCurrentDate, gbc_btnCurrent);
		
		lblOduToGoogle = new JLabel("ODU to google");
		GridBagConstraints gbc_lblOduToGoogle = new GridBagConstraints();
		gbc_lblOduToGoogle.gridwidth = 2;
		gbc_lblOduToGoogle.insets = new Insets(0, 0, 5, 5);
		gbc_lblOduToGoogle.gridx = 10;
		gbc_lblOduToGoogle.gridy = 14;
		add(lblOduToGoogle, gbc_lblOduToGoogle);
		
		textField_ODUToGoogle = new JTextField();
		GridBagConstraints gbc_textField_ODUToGoogle = new GridBagConstraints();
		gbc_textField_ODUToGoogle.gridwidth = 3;
		gbc_textField_ODUToGoogle.insets = new Insets(0, 0, 5, 5);
		gbc_textField_ODUToGoogle.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_ODUToGoogle.gridx = 13;
		gbc_textField_ODUToGoogle.gridy = 14;
		add(textField_ODUToGoogle, gbc_textField_ODUToGoogle);
		textField_ODUToGoogle.setColumns(10);
		
		txtpnExtraInformation = new JTextPane();
		txtpnExtraInformation.setText("Extra Information");
		GridBagConstraints gbc_txtpnExtraInformation = new GridBagConstraints();
		gbc_txtpnExtraInformation.gridheight = 4;
		gbc_txtpnExtraInformation.gridwidth = 9;
		gbc_txtpnExtraInformation.insets = new Insets(0, 0, 0, 5);
		gbc_txtpnExtraInformation.fill = GridBagConstraints.BOTH;
		gbc_txtpnExtraInformation.gridx = 1;
		gbc_txtpnExtraInformation.gridy = 15;
		add(txtpnExtraInformation, gbc_txtpnExtraInformation);
	}
	
	public String generateEscalation()
	{
		
		
		String accessToRouter = "", directConnect= "",disableWifi="", PC_afterWifi = "",WANCheck = "",daysNotice ="",isRateLimited = "",confirmedIPAddress="", metricsAcceptable="";
		
		if (chckbxYes_routerAccess.isSelected()) 		{accessToRouter 	= "I have access to the router.";}else if (chckbxNo_routerAccess.isSelected()) {accessToRouter = "I don't have access to the router.";}else {accessToRouter ="";}
		if (chckbxDone_DirectConnect.isSelected()) 		{directConnect		= "The customer has directly connected his laptop/PC to the router.";}
		if (chckbxDone_DisableWifi.isSelected()) 		{disableWifi 		= "I have disabled the wifi on the router.";}
		if (chckbxDone_PCAfterWifi.isSelected()) 		{PC_afterWifi 		= "I have power cycled the router after i turned off the wifi.";};
		if (chckbxDone_WAN.isSelected()) 				{WANCheck 			= "The WAN MTU is set to 1500.";}
		if (chckbxYes_DaysNotice.isSelected()) 			{daysNotice 		= "30 days notice has been given to the user.";}else if (chckbxNo_DaysNotice.isSelected()) {daysNotice 		= "30 days notice has not been given to the user.";}
		if (chckbxNo_RateLimited.isSelected())			{isRateLimited 		= "The customer is not rate limited.";}else if (chckbxNo_RateLimited.isSelected()) {isRateLimited = "Customer is rate limited, I can't do speed tests until he is reset";}
		if (chckbxDone_ConfirmIPAddress.isSelected()) 	{confirmedIPAddress = "Ip address is confirmed with user.";}
		if (chckbx_MetricsAcceptable.isSelected())		{metricsAcceptable = "Metrics are above the minimum standard.";}
		
		
		String esclation = "TRN:"+textField_TicketNumber.getText() + "IMSI:" +textField_ISMI.getText() +  "Enodb:" + "Cell:" +  textField_Cell.getText()  + "ISSUE: " + textField_Issue.getText() + "<br>"
			+ "<h2>Issue Description</h2><br>"
			+ txtpnExtraInformation.getText() + "<br>"
			+ PC_afterWifi + "<br>"
			+ WANCheck 		+ "<br>"
			+ directConnect + "<br>"
			+ isRateLimited + "<br>"
			+ "<h2>What service/s is affected by the issue</h2><br>"
			+ "<h2>Is the Slow Speed issue occuring over Wifi Connection or Direct Connection</h2>"
			+ directConnect + "<br>"
			+ "<h2>Paste here a screenshot of the DHCP Client list at the time customer running speedtest with 1 device connected only</h2><br>" 
			+ textField_DHCPLIST.getText() + "<br>"
			+ "<h2>What the speed the customer is getting over direct connection with only 1 device connected</h2><br>"
			+ "Download: " + textField_Download.getText() + "MBps<br>"
			+ "Update: " + textField_Upload.getText() + "MBps<br>"
			+ "Ping: " + textField_Ping.getText() + "ms<br>"
			+ "<h2>Provide the speed results LINK from perf.imagine.ie or speedtest.imagine.ie</h2><br>"
			+ "<br><br>"
			+ "<h2>Technology</h2><br>"
			+ TB. getTech() + "<br>"
			+ "<h2>Provide Enodb and Cell ID information</h2><br>"
			+ "Current Enodeb: " 	+ textField_CEnodeB.getText() + "<br>"
			+ "Current Cell: " 		+ textField_Cell.getText() + "<br>"
			+ "<h2>Device Type</h2><br>"
			+ TB.getDevice() + "<br>"
			+ "<b>Installation CPE Signal Stats</b><br>"
			+ ""
			+ "<b>Current CPE Signal Stats</b><br>"
			+ textField_CurrentMetrics.getText() + "<br>"
			+ "<h3>Affected Firmware</h3><br>"
			+ textField_CurrentFirmware.getText() + "<br>"
			+ "<h2>Provide how many service calls received so far since installation</h2><br>"
			+ "<b>" + textField_ServiceCalls.getText() + "</b><br>"
			+ "<h2>Was 30 days notice given to customer in the past</h2><br>"
			+ "<b> " + daysNotice + "</b><br>"
			+ "<h3>Prior to any TS-ing of slow speed issue with customer<h3><br>"
			+ "1. Confirm with customer when this issue started and/or what times is the issue occuring<br>"
			+ "<b>" + textField_DateIssueStarted.getText() + "</b><br>"
			+ "2. Confirm device up time in GUI : <b>" + textField_DeviceTime.getText() + "</b><br>"
			+ "3. Confirm connection up time in GUI :<b>" +textField_ConnectionTime.getText() + "</b><br>"
			+ "4. Check and note down the traffic counters on the CPE<br>"
			+ "<br><b>"+ textField_TraficCounters.getText() +"</b><br>"
			+ "4. Check and note down the traffic counters on the CPE"
			+ "<br>Check and confirm management of IDU and list all active MAC addresses present on the DHCP list<br>"
			+ textField_DHCPLIST.getText()  + "<br>"
			+ "6. Confirm if the customer hasn’t been rate limited in WG:"+ isRateLimited + "<br>"
			+ "7. Confirm with the customer what IP address he is getting - go to http://whatismyipaddress.com<br>"
			+ "<b>" + confirmedIPAddress + "</b><br>"
			+ "8. Check the CPE signal metrics if they are within acceptable metrics<br><br>"
			+ "<b>" + metricsAcceptable + "</b>"
			+ "<h3>TS-ing with customer - Record all steps below.</h3><br>"
			+ "1. To get the most accurate speed test results, ensure the Wi-Fi is turned off on the router and the one computer you are testing on is plug in to the router via an ethernet cable along with any applications and programs on customer computer are shut down."
			+ disableWifi + "<br>"
			+ directConnect + "<br>"
			+ "Speed over direct connection with only 1 device connected:<br>"
			+ "Download: <b>" + textField_Download.getText() + "MBps</b><br>"
			+ "Update: <b>" + textField_Upload.getText() + "MBps</b><br>"
			+ "Ping: <b>" + textField_Ping.getText() + "ms</b><br>"
			+ "2. Use the http://perf.imagine.ie/ or http://speedtest.imagine.ie to check if your Internet connection speed is within acceptable limits of the package you are subscribed to."
			+ "3. Ping the customers public IP address 100 times from your Putty on your computer" 
			+ textField_PuttyPing.getText() + "<br>"
			+ "4. Ping CPE(ODU) from customer's PC connected with DC to IDU 100 times<br>"
			+ "5. Ping google.ie from customer's PC connected with DC to IDU 100 times<br>"
			+ "6. Ping from ODU to google.ie - performed over the remote access with 10 ping and MTU size 1500 or alternatively 1480 packet size 10 times"
			+ "<br>"
			+ "7. Traceroute to google.ie from customer's PC connected with DC to IDU<br>"
			+ "8. Traceroute from ODU to google.ie<br>"
			+ "9. Test the throughput again and provide details<br>"
			+ "10. Get all above details listed in your escalation with screenshots and send it to 2nd line Support";
		
		return esclation;
	}
	
	
	public String exportUnoTicket()
	{

		String accessToRouter = "", directConnect= "",disableWifi="", PC_afterWifi = "",WANCheck = "",daysNotice ="",isRateLimited = "",confirmedIPAddress="", metricsAcceptable="";
		

		if (chckbxYes_routerAccess.isSelected()) 	{accessToRouter 	= "I have access to the router.";}else if (chckbxNo_routerAccess.isSelected()) {accessToRouter = "I don't have access to the router.";}else {accessToRouter ="";}
		if (chckbxDone_DirectConnect.isSelected()) 	{directConnect		= "The customer has directly connected his laptop/PC to the router.";}
		if (chckbxDone_DisableWifi.isSelected()) 	{disableWifi 		= "I have disabled the wifi on the router.";}
		if (chckbxDone_PCAfterWifi.isSelected()) 	{PC_afterWifi 		= "I have power cycled the router after i turned off the wifi.";};
		if (chckbxDone_WAN.isSelected())			{WANCheck = "The WAN MTU is set to 1500.";}
		
		
		
		if (chckbxYes_routerAccess.isSelected()) 	{accessToRouter 	= "I have access to the router.";}else if (chckbxNo_routerAccess.isSelected()) {accessToRouter = "I don't have access to the router.";}else {accessToRouter ="";}
		if (chckbxDone_DirectConnect.isSelected()) 	{directConnect		= "The customer has directly connected his laptop/PC to the router.";}
		if (chckbxDone_DisableWifi.isSelected()) 	{disableWifi 		= "I have disabled the wifi on the router.";}
		if (chckbxDone_PCAfterWifi.isSelected()) 	{PC_afterWifi 		= "I have power cycled the router after i turned off the wifi.";};
		if (chckbxDone_WAN.isSelected()) 			{WANCheck 			= "The WAN MTU is set to 1500.";}
		if (chckbxYes_DaysNotice.isSelected()) 		{daysNotice 		= "30 days notice has been given to the user.";}else if (chckbxNo_DaysNotice.isSelected()) {daysNotice 		= "30 days notice has not been given to the user.";}
		if (chckbxNo_RateLimited.isSelected())		{isRateLimited 		= "The customer is not rate limited.";}else if (chckbxNo_RateLimited.isSelected()) {isRateLimited = "Customer is rate limited, I can't do speed tests until he is reset";}
		if (chckbxDone_ConfirmIPAddress.isSelected()) {confirmedIPAddress = "Ip address is confirmed with user.";}
		if (chckbx_MetricsAcceptable.isSelected())	{metricsAcceptable = "Metrics are above the minimum standard.";}
		
		
		String esclation = textField_ISMI.getText() + " - " + textField_HighSite.getText() +  " - " +  textField_Issue.getText() + "\n\n"
			+ "Customer has reported that he is experiencing slow speeds."
			+ txtpnExtraInformation.getText() + "\n"
			+ accessToRouter 	+ "\n"
			+ directConnect 	+ "\n"
			+ disableWifi  		+ "\n"
			+ PC_afterWifi 		+ "\n"
			+ WANCheck			+ "\n"
			+ daysNotice 		+ "\n"
			+ isRateLimited 	+ "\n"
			+ confirmedIPAddress + "\n"
			+ metricsAcceptable + "\n"
			+ textField_PuttyPing.getText() + "\n"
			+ "DHCP LIst: \n" + textField_DHCPLIST.getText() + "\n"
			+ "Current metrics: " 		+ textField_CurrentMetrics.getText() 	+ "\n"
			+ "Device uptime: " 		+ textField_DeviceTime.getText() 		+ "\n"
			+ "Connection time: " 		+ textField_ConnectionTime.getText()  + "\n"
			+ "Speed tests show: \nDownload: \t" +  textField_Download.getText() + "\nUpload: \t" + textField_Upload.getText() + "\nPing: \t" + textField_Ping.getText() + "\n"
			+ textField_PuttyPing.getText() ;
		
		return esclation;		
	}

}
