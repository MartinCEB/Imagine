import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.InteractivePage;
import com.gargoylesoftware.htmlunit.ScriptException;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomAttr;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlLink;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;
import com.gargoylesoftware.htmlunit.javascript.JavaScriptErrorListener;
import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class InfoGrabber {
	WebClient webClient = new WebClient(BrowserVersion.CHROME);
	
	String routerType;
	String [] Usernames;
	String [] Passwords;
	String username,password;
	int usernamesSize = 3;
	int passwordsSize = 3;
	HtmlPage installPage;
	//Needed to build compare
	private String install_download,install_reciever_1_sinr,install_reciever_1_rsrq,install_reciever_1_rsrp,install_upload_speed,install_reciever_2_sinr,install_reciever_2_rsrq,install_average_ping;
	private String current_download,current_reciever_1_sinr,current_reciever_1_rsrq,current_reciever_1_rsrp,current_upload_speed,current_reciever_2_sinr,current_reciever_2_rsrq,current_average_ping;
	
	public HtmlPage getServiceList(String unoOrMac) throws FailingHttpStatusCodeException, MalformedURLException, IOException
	{
		HtmlPage serviceList = (HtmlPage) webClient.getPage("https://wprovisioning.imagine.ie/agent-install/search?q="+ unoOrMac +"&searchCatagory=All");
		System.out.println("https://wprovisioning.imagine.ie/agent-install/search?q="+ unoOrMac +"&searchCatagory=All");
		////tr[td/text()[contains(., 'Install')]]//td/a[text()='view']  works!!!
		//[text()='view']
		ArrayList installPage =  (ArrayList) serviceList.getByXPath("//tr[td/text()[contains(., 'Install')]]//td/a[text()='view']");

		//for (int i=0;i<installPage.size();i++)
		//{
		if (installPage.size() > 0)
		{
			System.out.println("install page: " + installPage.get(0).toString());
			HtmlAnchor fuck = (HtmlAnchor)installPage.get(0);
			HtmlPage f = fuck.click();
			this.installPage = f;
			System.out.println("Base link: " + f.getWebResponse().getContentAsString());

		}else{
			System.out.println("Trying again");
			 getServiceList(unoOrMac);
		}
		//}
			

		//System.out.println(installPage.toString());
		//System.out.println(installPage.toString());
		//tr/td[normalize-space(text())="Install"]
		//HtmlLink installedMetricsPage = (HtmlLink) installPage.click();


		//System.out.println(serviceList.asText());
		return serviceList;
	}
	public static void main(String args[]) throws FailingHttpStatusCodeException, MalformedURLException, IOException
	{
		new  InfoGrabber("martinballireland@gmail.com","7ymer5og");
	}
	public InfoGrabber(String username,String password) throws FailingHttpStatusCodeException, MalformedURLException, IOException
	{
		/*
		Usernames = new String [usernamesSize];
		Passwords = new String[passwordsSize];
		//init UNPW array
		Usernames[0] = "Username1";
		Usernames[1] = "Username2";
		Usernames[2] = "Username3";
		
		Passwords[0] = "Pass1";
		Passwords[1] = "Pass2";
		Passwords[2] = "Pass3";
		
		for (int UN = 0 ; UN < usernamesSize; UN++)
		{
			for (int PW = 0; PW < passwordsSize; PW++ )
			{
				//System.out.println("Username: " + Usernames[UN] + " Password: " + Passwords[PW] );
			}
		}
		*/
		//webClient = setBrowserOptions(webClient);
		
		//HtmlPage wallgarden = LoginToWallGarden("martin.ball","Imagine\"");
		//getServiceList("30338719");

		//HtmlPage WGRouterPage = SearchByMAC(mac);
		
		//String routerType = getRouterType(WGRouterPage);
		//System.out.println("Router Type: " + routerType);
		//logIntoRouter("Gemtech6");
		
		
		loginToTornCity();
		//final HtmlPage page = webClient.getPage("https://www.google.ie");
        //final HtmlDivision div = page.getHtmlElementById("some_div_id");
       // final HtmlAnchor anchor = page.getAnchorByName("anchor_name");
		//System.out.print(page.getWebResponse().getContentAsString());
		//
		
	}
	public WebClient setBrowserOptions(WebClient webClient)
	{
		java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		webClient.setCssErrorHandler(new SilentCssErrorHandler());    
		webClient.setJavaScriptErrorListener(new JavaScriptErrorListener(){

			@Override
			public void loadScriptError(InteractivePage arg0, URL arg1, Exception arg2) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void malformedScriptURL(InteractivePage arg0, String arg1, MalformedURLException arg2) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void scriptException(InteractivePage arg0, ScriptException arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void timeoutError(InteractivePage arg0, long arg1, long arg2) {
				// TODO Auto-generated method stub
				
			}});
		 webClient.getOptions().setUseInsecureSSL(true); //ignore SSL certificate
		    webClient.getOptions().setThrowExceptionOnScriptError(false);
		    webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
		return webClient;
	}

	public HtmlPage LoginToWallGarden(String username,String password) throws FailingHttpStatusCodeException, MalformedURLException, IOException
	{
		System.out.println(username + password);
		HtmlPage page = (HtmlPage) webClient.getPage("https://wprovisioning.imagine.ie/login/");
		 //System.out.println(page.getWebResponse().getContentAsString());
		//Get form Username input, password input,Submit button
		//HtmlForm form = page.getFormByName("login");
		//System.out.println(page.getFirstByXPath("//a[@id='login-button']").toString());
		//HtmlAnchor htmlAnchor = (HtmlAnchor) page.getFirstByXPath("//a[@id='login-button']");
		//HtmlPage test = htmlAnchor.click();
		//System.out.println("test:: " + page.getWebResponse().getContentAsString());

		//HtmlPage loginResponce = page.getFirstByXPath("//a[@id='login-button']").click(); 

		
		HtmlForm loginForm = (HtmlForm) page.getFirstByXPath("//form");
		//set username
		loginForm.getInputByName("login").setValueAttribute(username); 

		//set password
		loginForm.getInputByName("passwd").setValueAttribute(password); 
		//HTMLpage = submit button 
		//How do we save cookies?
		HtmlPage loginResponce = loginForm.getInputByName("submit").click(); 


		return null;
	}

	public HtmlPage SearchByMAC(String mac) throws FailingHttpStatusCodeException, MalformedURLException, IOException
	{
		//set attribute
		 HtmlPage page = (HtmlPage) webClient.getPage("https://wprovisioning.imagine.ie/obtain/by-mac/mac/" + mac);
		 return page;
	}
	
	//SearchByMac function should be the input here
	public String getRouterType(HtmlPage WGR_Page)
	{
		//Page that has the IP address of the unit
		String wallgardenRouterPage = WGR_Page.getWebResponse().getContentAsString();
		if (wallgardenRouterPage.contains("GP LTE Outdoor CPE Dual Mode") )
		{
			return "GP LTE Outdoor CPE Dual Mode";
		}else if (wallgardenRouterPage.contains("")){
			return "GemtechCat4";
		}else if(wallgardenRouterPage.contains("Gemtek WLTSS-114")){
			return "Gemtek WLTSS-114";
		}else if(wallgardenRouterPage.contains("CPEi35775")){
			return "CPEi35775";
		}else if(wallgardenRouterPage.contains(""))
		{
			return "Wimax outdoor";
		}else if (wallgardenRouterPage.contains("Huawei LTE Outdoor CPE"))
		{
			return "Huawei LTE Outdoor CPE";
		}
		return null;
		//Convert page to string
		
		//If the string contains the word for XYZ router : Set router Type on class level
	}
	
	//Return the router page when logged in
	public HtmlPage logIntoRouter(String router) throws FailingHttpStatusCodeException, MalformedURLException, IOException //!! Change the names to the exact ones you see on the wall garden
	{
		if (router.equals("GreenPacket")){
			
		}else if(router.equals("Gemtech"))
		{
			this.routerType = "";
		}else if (router.equals("Hawii"))
		{
			
		}else if (router.equals("Gemtech6")){
			
			HtmlPage page = (HtmlPage) webClient.getPage("https://wprovisioning.imagine.ie");
			//Get form Username input, password input,Submit button
			//HtmlForm form = page.getFormByName("login");
			HtmlForm loginForm = page.getFormByName("login");
			//set username
			loginForm.getInputByName("login").setValueAttribute(username); 

			//set password
			loginForm.getInputByName("passwd").setValueAttribute(password); 
			//HTMLpage = submit button 
			//How do we save cookies?
			HtmlPage loginResponce = loginForm.getInputByName("submit").click(); 
				
			//output
			System.out.println(loginResponce.getWebResponse().getContentAsString());
			return null;
		}
		return null;
	}
	
	//For greenpackets
	//public HTMLPage
	
	public String getCurrentMetrics()
	{
		//current_download,current_reciever_1_sinr,current_reciever_1_rsrq,current_reciever_1_rsrp,current_upload_speed,current_reciever_2_sinr,current_reciever_2_rsrq,current_average_ping;
		return null;
	}
	//Get the customer installed metrics 
	public String getInstalledMetrics() throws FailingHttpStatusCodeException, MalformedURLException, IOException
	{

		HtmlForm installForm = (HtmlForm) this.installPage.getElementById("genericForm");
    	//install_reciever_1_sinr   = (DomAttr) this.installPage.getByXPath("//input[@name='reciever_1_rssi']/@value").get(0);//.getElementByName("download_speed").toString();
    	
    	install_download 		  = installForm.getInputByName("download_speed").getValueAttribute();
		install_reciever_1_sinr   = installForm.getInputByName("reciever_1_sinr").getValueAttribute();
    	install_reciever_1_rsrq   = installForm.getInputByName("reciever_1_rsrq").getValueAttribute();
    	install_reciever_1_rsrp   = installForm.getInputByName("reciever_1_rsrp").getValueAttribute();
    	install_upload_speed	  = installForm.getInputByName("upload_speed").getValueAttribute();
    	install_reciever_2_sinr   = installForm.getInputByName("reciever_2_sinr").getValueAttribute();
    	install_reciever_2_rsrq   = installForm.getInputByName("reciever_2_rsrq").getValueAttribute();
    	install_average_ping   	  = installForm.getInputByName("average_ping").getValueAttribute();
    	
    	String installedhightsite = installForm.getByXPath("//select/option[@selected='selected']").toString();
    	System.out.println("install_average_ping: " + install_average_ping );
    	System.out.println("install_reciever_1_rsrq: " + install_reciever_1_rsrq );
    	System.out.println("install_reciever_1_rsrp: " + install_reciever_1_rsrp );
    	System.out.println("install_upload_speed: " + install_upload_speed );
    	System.out.println("install_reciever_2_sinr: " + install_reciever_2_sinr );
    	System.out.println("install_reciever_2_rsrq: " + install_reciever_2_rsrq );
    	System.out.println("installedhightsite: " + installedhightsite );

    	
    	return install_download + install_upload_speed;
	}
	
	public void loginToTornCity() throws FailingHttpStatusCodeException, MalformedURLException, IOException
	{
		 HtmlPage page = (HtmlPage) webClient.getPage("http://www.torn.com");
	     HtmlForm form = page.getFormByName("login");
	     form.getInputByName("player").setValueAttribute("martinballireland@gmail.com"); 
	     HtmlInput passWordInput = form.getInputByName("password");
	     //passWordInput.removeAttribute("disabled");
	     passWordInput.setValueAttribute("poc6gzbk"); 
	     page = form.getInputByName("btnLogin").click(); // works fine
	     System.out.println(page.getWebResponse().getContentAsString());
	}
}
