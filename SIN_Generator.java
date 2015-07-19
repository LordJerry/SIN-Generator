import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//WRITTEN BY JERRY, ADVISED UPON BY DUSTEN
//ALL PARTS OF SHADOWRUN ARE PROPERTY OF TOPPS COMPANY INC.
//THIS IS A FAN MADE SUPPLAMENT FOR THE GAME, NO MONEY WAS MADE IN IT'S PRODUCTION OR DISTRIBUTION
//SHOOT STRAIGHT, CONSERVE AMMO, AND NEVER CUT A DEAL WITH A DRAGON OMAE

public class SIN_Generator {
	public static Object SINType = "";
	public static String SINTypeS="";
	public static Object SINTypeCorp = "";
	public static Object SINTypeNational="";
	public static Object SINTypeCriminal;
	public static String Prefix ="";
	public static String Suffix ="";
	public static int charcount=0;
	public static int SINGen=0;
	public static String Block1="";
	public static String Block2="";
	public static String Block3="";
	public static Random rand = new Random();		
	
	static JComboBox SINTypeSelect, CorpSINType, NationalSINType, CriminalSINType;

	public static void main(String[] args){
	
		   final JButton update = new JButton("Update");
			update.setSize(120,25);
			update.setLocation(280,245);
			update.setEnabled(true);
			update.setVisible(true); 
		
	
		final JButton generate = new JButton("Generate SIN");
			generate.setSize(120,25);
			generate.setLocation(160,245);
			generate.setEnabled(true);
			generate.setVisible(true);
			
		final JFrame SINSelection = new JFrame("System Identification Number");
			SINSelection.setSize(400,300);
			SINSelection.setLocationRelativeTo(null);
			SINSelection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		final JLabel SIN = new JLabel("");
			SIN.setEnabled(true);
			SIN.setVisible(true);
			SIN.setLocation(100,200);
			SIN.setSize(300,25);

	
			SINTypeSelect = new JComboBox();
				SINTypeSelect.setSize(120,25);
				SINTypeSelect.setLocation(52,10);
				SINTypeSelect.setEnabled(true);
				SINTypeSelect.setVisible(true);				
				SINTypeSelect.addItem("Choose...");
				SINTypeSelect.addItem("Corprate");
				SINTypeSelect.addItem("National");
				SINTypeSelect.addItem("Criminal");
			
			CorpSINType = new JComboBox();
				CorpSINType.setSize(120,25);
				CorpSINType.setLocation(6.65,12.52);
				CorpSINType.setEnabled(true);
				CorpSINType.setVisible(true);
				
				CorpSINType.addItem("Choose...");
				CorpSINType.addItem("Aegis");
				CorpSINType.addItem("Aérospatiale SA");
				CorpSINType.addItem("AG Chemi");
				CorpSINType.addItem("Apep Consortium");
				CorpSINType.addItem("Apple");
				CorpSINType.addItem("Ares Macrotechnology");
				CorpSINType.addItem("Atlantean Foundation");
				CorpSINType.addItem("Aztechnology");
				CorpSINType.addItem("Chalmers & Cole");
				CorpSINType.addItem("Cord Mutual Insurance");
				CorpSINType.addItem("Daiatsu");
				CorpSINType.addItem("DocWagon");
				CorpSINType.addItem("Dow Chemical");
				CorpSINType.addItem("Draco Foundation");
				CorpSINType.addItem("Eastern Tiger Corporation");
				CorpSINType.addItem("European Unified Shuttle Services");
				CorpSINType.addItem("Evo");
				CorpSINType.addItem("Federated-Boeing");
				CorpSINType.addItem("Ford Motor Company");
				CorpSINType.addItem("Frankfurter Bankverein AG");
				CorpSINType.addItem("Gaeatronics");
				CorpSINType.addItem("Genesis Consortium");
				CorpSINType.addItem("Global Sandstorm");	
				CorpSINType.addItem("Hildebrandt-Kleinfort-Bernal");
				CorpSINType.addItem("Horizon Group");
				CorpSINType.addItem("Index-AXA");
				CorpSINType.addItem("Integrated Weapon Systems PLC");
				CorpSINType.addItem("Kolkota Integrated Talent and Technologies");
				CorpSINType.addItem("KondOrchid");
				CorpSINType.addItem("Korporacja Opatrznosci Bozej");
				CorpSINType.addItem("Kwonsham Industries");
				CorpSINType.addItem("Lami Look Pagkaon");
				CorpSINType.addItem("Lockheed Corporation");
				CorpSINType.addItem("Lone Star Security Services");
				CorpSINType.addItem("Lusiada");
				CorpSINType.addItem("Maersk Incorporated Assets");
				CorpSINType.addItem("Manadyne Corporation");
				CorpSINType.addItem("Meridional Agronomics");
				CorpSINType.addItem("Mesametric");
				CorpSINType.addItem("Microdeck");
				CorpSINType.addItem("Mitsuhama Computer Technologies");
				CorpSINType.addItem("Monobe International");
				CorpSINType.addItem("NeoNET");
				CorpSINType.addItem("Pacific Rim Bank & Financial Services");
				CorpSINType.addItem("Pacific Rim Communications Unlimited");
				CorpSINType.addItem("Phoenix Biotechnologies");
				CorpSINType.addItem("Prometheus Engineering");
				CorpSINType.addItem("Proteus AG");
				CorpSINType.addItem("Providence Corporation");
				CorpSINType.addItem("Regency Mega Media");
				CorpSINType.addItem("Regulus Joint Industries");
				CorpSINType.addItem("Renault Fiat");
				CorpSINType.addItem("Renraku Computer Systems");
				CorpSINType.addItem("Saeder-Krupp Heavy Industries Company");
				CorpSINType.addItem("Shiawase Corporation");	
				CorpSINType.addItem("Singapore Incorporated");
				CorpSINType.addItem("Sol Media Group");
				CorpSINType.addItem("Sony Corporation");
				CorpSINType.addItem("Spinrad Industries");
				CorpSINType.addItem("Tablelands Software");
				CorpSINType.addItem("Tan Tien");
				CorpSINType.addItem("Tanamyre Resources");
				CorpSINType.addItem("Telestrian Industries");
				CorpSINType.addItem("UCAS Online");
				CorpSINType.addItem("Universal Omnitech");
				CorpSINType.addItem("Virtual Reality Inc.");
				CorpSINType.addItem("VisionQuest");
				CorpSINType.addItem("Warpdrive Systems");
				CorpSINType.addItem("Winter Systems");
				CorpSINType.addItem("Wuxing Incorporated");
				CorpSINType.addItem("Yakashima Technologies");
				CorpSINType.addItem("Yamaha Corporation");
				CorpSINType.addItem("Zeta-ImpChem");
				CorpSINType.addItem("Zurich-Orbital Gemeinshaft Bank");
				
					
				
			NationalSINType = new JComboBox();
				NationalSINType.setSize(120,25);
				NationalSINType.setLocation(52,70);
				NationalSINType.setEnabled(true);
				NationalSINType.setVisible(true);
				NationalSINType.addItem("Choose...");
				NationalSINType.addItem("Afghanistan, Islamic Republic of");
				NationalSINType.addItem("Albania, Republic of");
				NationalSINType.addItem("Algonkian-Manitou Council");
				NationalSINType.addItem("Allied German States");
				NationalSINType.addItem("Amazonia");
				NationalSINType.addItem("Arabian Caliphate");
				NationalSINType.addItem("Argentine Republic");
				NationalSINType.addItem("Asante Nation");
				NationalSINType.addItem("Athabaskan Council");
				NationalSINType.addItem("Australian Republic");
				NationalSINType.addItem("Austria, Republic of");
				NationalSINType.addItem("Azanian Confederation");
				NationalSINType.addItem("Aztlan, Federal Republic of");				
				NationalSINType.addItem("Bangla Commonwealth");
				NationalSINType.addItem("Beijing, Imperial Kingdom of");
				NationalSINType.addItem("Belarus, Republic of");
				NationalSINType.addItem("Bolivia, Communist Republic of");
				NationalSINType.addItem("Brasov-Covasna Enclavce");
				NationalSINType.addItem("Brussels, Independent City of");
				NationalSINType.addItem("Bulgaria, Republic of ");			
				NationalSINType.addItem("California Free State");
				NationalSINType.addItem("Cambodia, Kingdom of");
				NationalSINType.addItem("Canton Confederation");
				NationalSINType.addItem("Caracas, Independent City of");
				NationalSINType.addItem("Caribbean League");
				NationalSINType.addItem("Chile, Republic of");
				NationalSINType.addItem("China, Republic of");
				NationalSINType.addItem("Confederate American States");
				NationalSINType.addItem("Constantinople");
				NationalSINType.addItem("Corsica, Free");
				NationalSINType.addItem("Croatia, Republic of");
				NationalSINType.addItem("Cyprus, Republic of");
				NationalSINType.addItem("Czech Republic");				
				NationalSINType.addItem("Dalmatia");			
				NationalSINType.addItem("Ecuador, Republic of");
				NationalSINType.addItem("Egypt, Arab Republic of");
				NationalSINType.addItem("Estonia, Republic of");
				NationalSINType.addItem("Euskal Herria");			
				NationalSINType.addItem("Fiji, Republic of");
				NationalSINType.addItem("France, Sixth Republic of");
				NationalSINType.addItem("French Guiana");
				NationalSINType.addItem("Gansu");
				NationalSINType.addItem("Guangxi");
				NationalSINType.addItem("Hainan");
				NationalSINType.addItem("Hawai’i, Kingdom of");
				NationalSINType.addItem("Hellas, Federal Republic of");
				NationalSINType.addItem("Henan");
				NationalSINType.addItem("Hong Kong Free Enterprise Zone");
				NationalSINType.addItem("Hungary");	
				NationalSINType.addItem("Indian Union");
				NationalSINType.addItem("Iran, Islamic Republic of");
				NationalSINType.addItem("Iraq, Federal Republic of");
				NationalSINType.addItem("Israel, State of");
				NationalSINType.addItem("Italian Confederation");	
				NationalSINType.addItem("Japanese Imperial State");		
				NationalSINType.addItem("Kenya, Republic of");
				NationalSINType.addItem("Konigsberg, Free State of");
				NationalSINType.addItem("Korea, Republic of");
				NationalSINType.addItem("Kosovo, Republic of");
				NationalSINType.addItem("Kurdistan Autonomous Zone");				
				NationalSINType.addItem("Lao People's Democratic Republic");
				NationalSINType.addItem("Latvia, Republic of");
				NationalSINType.addItem("Lithuania, Republic of");				
				NationalSINType.addItem("Malaysia");
				NationalSINType.addItem("Malta, Republic of");
				NationalSINType.addItem("Manchuria, Republic of");
				NationalSINType.addItem("Manitou Council");
				NationalSINType.addItem("Mongolia");
				NationalSINType.addItem("Montenegro");
				NationalSINType.addItem("Myanmar, Republic of the Union of");				
				NationalSINType.addItem("Nepal, Federal Democratic Republic of");
				NationalSINType.addItem("New Monaco");
				NationalSINType.addItem("New Zealand");
				NationalSINType.addItem("Nice");
				NationalSINType.addItem("Ningxia");
				NationalSINType.addItem("Novi Pazar, Enclave of");		
				NationalSINType.addItem("Pakistan, Islamic Republic of");
				NationalSINType.addItem("Palestine");
				NationalSINType.addItem("Panama Pan-Corprate Zone");
				NationalSINType.addItem("Papua New Guinea, Independent State of");
				NationalSINType.addItem("Paraguay, Republic of");
				NationalSINType.addItem("Peru, Republic of");
				NationalSINType.addItem("Philippines, Republic of the");
				NationalSINType.addItem("Portuguese Republic");
				NationalSINType.addItem("Pueblo Corporate Council");	
				NationalSINType.addItem("Quebec, Republic of");	
				NationalSINType.addItem("Romania");
				NationalSINType.addItem("Russian Republic");	
				NationalSINType.addItem("Salish-Shidhe Council");
				NationalSINType.addItem("San Marino, Republic of");
				NationalSINType.addItem("Sarajevo Enclave");
				NationalSINType.addItem("Scandinavian Union");
				NationalSINType.addItem("Serbia, Republic of");
				NationalSINType.addItem("Shaanxi, Kingdom of");
				NationalSINType.addItem("Shan State");
				NationalSINType.addItem("Sichuan, Constitutional Republic of");
				NationalSINType.addItem("Singapore");
				NationalSINType.addItem("Sioux Nation");
				NationalSINType.addItem("Slovak Republic");
				NationalSINType.addItem("Slovenia, Republic of");
				NationalSINType.addItem("Solomon Islands");
				NationalSINType.addItem("Spain, Kingdom of");
				NationalSINType.addItem("Sri Lanka, Democratic Socialist Republic of");
				NationalSINType.addItem("Srpska, Republic of");
				NationalSINType.addItem("Swiss Confederation");
				NationalSINType.addItem("Syrian Arab Republic");			
				NationalSINType.addItem("Thailand, Kingdom of");
				NationalSINType.addItem("Tibet");
				NationalSINType.addItem("Tír Na NÓg");
				NationalSINType.addItem("Tir Tangire");
				NationalSINType.addItem("Transcaucasian Federation");
				NationalSINType.addItem("Trans-Polar Aleut Nation");
				NationalSINType.addItem("Trieste, Independent city of");
				NationalSINType.addItem("Turkestan, Commonwealth of");
				NationalSINType.addItem("Turkey, Secular Republic of");			
				NationalSINType.addItem("Ukraine");
				NationalSINType.addItem("United Canadian American States");
				NationalSINType.addItem("United Kingdom of Great Britain");
				NationalSINType.addItem("United Netherlands");
				NationalSINType.addItem("Uruguay, Eastern Republic of");
				NationalSINType.addItem("Vanuatu, Republic of");
				NationalSINType.addItem("Vietnam, Socialist Republic of");
				NationalSINType.addItem("Vojvodina, Autonomous Province of");
				NationalSINType.addItem("Yakut");
				NationalSINType.addItem("Yucatan Autonomous Zone");
				NationalSINType.addItem("Yunnan");
		
			//Adds main box asking what type of SIN to generate
				SINSelection.add(update);
				SINSelection.add(generate);
				SINSelection.add(SIN);
				SINSelection.add(SINTypeSelect);
				SINSelection.add(CorpSINType);
				SINSelection.add(CriminalSINType);
				SINSelection.add(NationalSINType);
				SINSelection.add(new JLabel(""));
				SINSelection.setPreferredSize(new Dimension(SINSelection.getWidth(), SINSelection.getHeight()));
				SINSelection.pack();
				SINSelection.setResizable(false);
				SINSelection.setVisible(true);
		
	update.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			SINType=SINTypeSelect.getSelectedItem();
			SINTypeS=SINType.toString();
			//The Corporate drop box
			if(SINType=="Corprate"){
					//Allows you to select which corp you have a SIN generated for
					SINTypeCorp=CorpSINType.getSelectedItem();
					SINTypeCorp=SINTypeCorp.toString();
					Suffix="";
					if(SINTypeCorp=="Aegis"){ 
							Prefix="AGS";
						}
						if(SINTypeCorp=="Aérospatiale SA"){ 
							Prefix="AESA";
						}
						if(SINTypeCorp=="AG Chemi"){ 
							Prefix= "AGC";
						}
						if(SINTypeCorp=="Atlantean Foundation"){ 
							Prefix= "ATF";
						}
						if(SINTypeCorp=="Apep Consortium"){ 
							Prefix="APC";
						}
						if(SINTypeCorp=="Apple"){ 
							Prefix="APL";
						}
						if(SINTypeCorp=="Aztechnology"){
							Prefix="AZT";
						}
						if(SINTypeCorp=="Chalmers & Cole"){ 
							Prefix="CHC";
						}
						if(SINTypeCorp=="Cord Mutual Insurance"){ 
							Prefix="CORD";
						}
						if(SINTypeCorp=="Daiatsu"){ 
							Prefix="DTSU";
						}
						if(SINTypeCorp=="DocWagon"){ 
							Prefix="DWGN";
						}
						if(SINTypeCorp=="Dow Chemical"){ 
							Prefix="DWC";
						}
						if(SINTypeCorp=="Draco Foundation"){
							Prefix="DRAC";
						}
						if(SINTypeCorp=="Eastern Tiger Corporation"){
							Prefix="ETC";
						}
						if(SINTypeCorp=="European Unified Shuttle Services"){
							Prefix="EUSS";
						}
						if(SINTypeCorp=="Evo"){
							Prefix="EVO";
						}
						if(SINTypeCorp=="Federated-Boeing"){
							Prefix="FEDB";
						}
						if(SINTypeCorp=="Ford Motor Company"){
							Prefix="FORD";
						}
						if(SINTypeCorp=="Frankfurter Bankverein AG"){
							Prefix="FBV";
						}
						if(SINTypeCorp=="Gaeatronics"){
							Prefix="GAE";
						}
						if(SINTypeCorp=="Genesis Consortium"){
							Prefix="GEC";
						}
						if(SINTypeCorp=="Global Sandstorm"){
							Prefix="GSS";
						}	
						if(SINTypeCorp=="Hildebrandt-Kleinfort-Bernal"){
							Prefix="HKB";
						}
						if(SINTypeCorp=="Index-AXA"){
							Prefix="IAXA";
						}
						if(SINTypeCorp=="Integrated Weapon Systems PLC"){
							Prefix="IWS";
						}
						if(SINTypeCorp=="Kolkota Integrated Talent and Technologies"){
							Prefix="KITT";
						}
						if(SINTypeCorp=="KondOrchid"){
							Prefix="KOND";
						}
						if(SINTypeCorp=="Korporacja Opatrznosci Bozej"){
							Prefix="KOB";
						}
						if(SINTypeCorp=="Kwonsham Industries"){
							Prefix="KSI";
						}
						if(SINTypeCorp=="Lami Look Pagkaon"){
							Prefix="LLP";
						}
						if(SINTypeCorp=="Lockheed Corporation"){
							Prefix="LHM";
						}
						if(SINTypeCorp=="Lone Star Security Services"){
							Prefix="LSSS";
						}
						if(SINTypeCorp=="Lusiada"){
							Prefix="LUS";
						}
						if(SINTypeCorp=="Maersk Incorporated Assets"){
							Prefix="MIA";
						}
						if(SINTypeCorp=="Manadyne Corporation"){
							Prefix="MDN";
						}
						if(SINTypeCorp=="Meridional Agronomics"){
							Prefix="MERA";
						}
						if(SINTypeCorp=="Mesametric"){
							Prefix="MSM";
						}
						if(SINTypeCorp=="Microdeck"){
							Prefix="MCD";
						}
						if(SINTypeCorp=="Monobe International"){
							Prefix="MONI";
						}
						if(SINTypeCorp=="NeoNET"){
							Prefix="NEO";
						}
						if(SINTypeCorp=="Pacific Rim Bank & Financial Services"){
							Prefix="PRFS";
						}
						if(SINTypeCorp=="Pacific Rim Communications Unlimited"){
							Prefix="PRCU";
						}
						if(SINTypeCorp=="Phoenix Biotechnologies"){
							Prefix="PHBT";
						}
						if(SINTypeCorp=="Prometheus Engineering"){
							Prefix="PENG";
						}
						if(SINTypeCorp=="Proteus AG"){
							Prefix="PRO";
						}
						if(SINTypeCorp=="Providence Corporation"){
							Prefix="PROV";
						}
						if(SINTypeCorp=="Regency Mega Media"){
							Prefix="RMM";
						}
						if(SINTypeCorp=="Regulus Joint Industries"){
							Prefix="RJI";
						}
						if(SINTypeCorp=="Renault Fiat"){
							Prefix="RFI";
						}
						if(SINTypeCorp== "Renraku Computer Systems"){
							Prefix="REN";
						}
						if(SINTypeCorp=="Saeder-Krupp Heavy Industries Company"){
							Prefix="SKH";
						}
						if(SINTypeCorp== "Shiawase Corporation"){
							Prefix="SHI";
						}
						if(SINTypeCorp=="Singapore Incorporated"){
							Prefix="SING";
						}
						if(SINTypeCorp=="Sol Media Group"){
							Prefix="SMG";
						}
						if(SINTypeCorp=="Sony Corporation"){
							Prefix="SNY";
						}
						if(SINTypeCorp=="Spinrad Industries"){
							Prefix="SRI";
						}
						if(SINTypeCorp=="Tablelands Software"){
							Prefix="TLS";
						}
						if(SINTypeCorp=="Tan Tien"){
							Prefix="TTN";
						}
						if(SINTypeCorp=="Tanamyre Resources"){
							Prefix="TANR";
						}
						if(SINTypeCorp=="Telestrian Industries"){
							Prefix="TELI";
						}
						if(SINTypeCorp=="UCAS Online"){
							Prefix="UOL";
						}
						if(SINTypeCorp=="Universal Omnitech"){
							Prefix="UOT";
						}
						if(SINTypeCorp=="Virtual Reality Inc."){
							Prefix="VRI";
						}
						if(SINTypeCorp=="VisionQuest"){
							Prefix="VQU";
						}
						if(SINTypeCorp=="Warpdrive Systems"){
							Prefix="WDS";
						}
						if(SINTypeCorp=="Winter Systems"){
							Prefix="WINS";
						}
						if(SINTypeCorp== "Wuxing Incorporated"){
							Prefix="WUX";
						}
						if(SINTypeCorp=="Yakashima Technologies"){
							Prefix="YKST";
						}
						if(SINTypeCorp=="Yamaha Corporation"){
							Prefix="YMHA";
						}
						if(SINTypeCorp=="Zeta-ImpChem"){
							Prefix="ZIC";
						}
						if(SINTypeCorp=="Zurich-Orbital Gemeinshaft Bank"){
							Prefix="ZOGB";
						}
							
			}// End of the Corprate Dropbox
			
			//Begining of the National Drop box, for selecting a National for your National SIN
			if(SINType=="National"){
				//Allows you to select which country you have a SIN for
				SINSelection.add(NationalSINType);
				NationalSINType.setEnabled(true);
				NationalSINType.setVisible(true);
				Suffix="";
				SINTypeNational=NationalSINType.getSelectedItem();
				SINTypeNational=SINTypeNational.toString();
				
				if(SINTypeNational=="Islamic Republic of Afghanistan"){ 
					Prefix="AFG";
				}
				if(SINTypeNational=="Republic of Albania"){ 
					Prefix="ALB";
				}
				if(SINTypeNational=="Algonkian-Manitou Council"){ 
					Prefix="AMC";
				}
				if(SINTypeNational=="Amazonia"){ 
					Prefix="AMZ";
				}
				if(SINTypeNational=="Arabian Caliphate"){ 
					Prefix="ARB";
				}
				if(SINTypeNational=="Argentine Republic"){ 
					Prefix="ARG";
				}
				if(SINTypeNational=="Asante Nation"){ 
					Prefix="ASN";
				}
				if(SINTypeNational=="Athabaskan Council"){ 
					Prefix="ATH";
				}
				if(SINTypeNational=="Australian Republic"){ 
					Prefix="AUS";
				}
				if(SINTypeNational=="Republic of Austria"){ 
					Prefix="AUT";
				}
				if(SINTypeNational=="Azanian Confederation"){ 
					Prefix="AZN";
				}
				if(SINTypeNational=="Federal Republic of Aztlan"){ 
					Prefix="AZT";
				}
				if(SINTypeNational=="Bangla Commonwealth"){ 
					Prefix="BGD";
				}
				if(SINTypeNational=="Imperial Kingdom of Beijing"){ 
					Prefix="BJI";
				}
				if(SINTypeNational=="Republic of Belarus"){ 
					Prefix="BLR";
				}
				if(SINTypeNational=="Communist Republic of Bolivia"){ 
					Prefix="BOL";
				}
				if(SINTypeNational=="Brasov-Covasna Enclavce"){ 
					Prefix="BCE";
				}
				if(SINTypeNational=="Independent City of Brussels"){ 
					Prefix="BRUS";
				}
				if(SINTypeNational=="Republic of Bulgaria"){ 
					Prefix="BGR";
				}
				if(SINTypeNational=="California Free State"){ 
					Prefix="CFS";
				}
				if(SINTypeNational=="Kingdom of Cambodia"){ 
					Prefix="CAM";
				}
				if(SINTypeNational=="Canton Confederation"){ 
					Prefix="CTN";
				}
				if(SINTypeNational=="Independent City of Caracas"){ 
					Prefix="CRC";
				}
				if(SINTypeNational=="Caribbean League"){ 
					Prefix="CRB";
				}
				if(SINTypeNational=="Republic of Chile"){ 
					Prefix="CHL";
				}
				if(SINTypeNational=="Republic of China"){ 
					Prefix="CHN";
				}
				if(SINTypeNational=="Confederate American States"){ 
					Prefix="CAS";
				}
				if(SINTypeNational=="Constantinople"){ 
					Prefix="CTP";
				}
				if(SINTypeNational=="Free Corsica"){ 
					Prefix="CSC";
				}
				if(SINTypeNational=="Republic of Croatia"){ 
					Prefix="HRV";
				}
				if(SINTypeNational=="Republic of Cyprus"){ 
					Prefix="CYP";
				}
				if(SINTypeNational=="Czech Republic"){ 
					Prefix="CZE";
				}
				if(SINTypeNational=="Dalmatia"){ 
					Prefix="DMT";
				}
				if(SINTypeNational=="Republic of Ecuador"){ 
					Prefix="ECU";
				}
				if(SINTypeNational=="Arab Republic of Egypt"){ 
					Prefix="EGY";
				}
				if(SINTypeNational=="Republic of Estonia"){ 
					Prefix="EST";
				}
				if(SINTypeNational=="Euskal Herria"){ 
					Prefix="EKH";
				}
				if(SINTypeNational=="Republic of Fiji"){ 
					Prefix="FJI";
				}
				if(SINTypeNational=="Sixth Republic of France"){ 
					Prefix="FRA";
				}
				if(SINTypeNational=="Gansu"){ 
					Prefix="GSU";
				}
				if(SINTypeNational=="Allied German States"){ 
					Prefix="AGS";
				}
				if(SINTypeNational=="Guangxi"){ 
					Prefix="GXI";
				}
				if(SINTypeNational=="French Guiana"){ 
					Prefix="GUI";
				}
				if(SINTypeNational=="Hainan"){ 
					Prefix="HAI";
				}
				if(SINTypeNational=="Kingdom of Hawai’i"){ 
					Prefix="HWI";
				}
				if(SINTypeNational=="Federal Republic of Hellas"){ 
					Prefix="GRC";
				}
				if(SINTypeNational=="Henan"){ 
					Prefix="HAN";
				}
				if(SINTypeNational=="Hong Kong Free Enterprise Zone"){ 
					Prefix="HKG";
				}
				if(SINTypeNational=="Hungary"){ 
					Prefix="HUN";
				}
				if(SINTypeNational=="Indian Union"){ 
					Prefix="IND";
				}
				if(SINTypeNational=="Islamic Republic of Iran"){ 
					Prefix="IRN";
				}
				if(SINTypeNational=="Federal Republic of Iraq"){ 
					Prefix="IRQ";
				}
				if(SINTypeNational=="State of Israel"){ 
					Prefix="ISR";
				}
				if(SINTypeNational=="Italian Confederation"){ 
					Prefix="ITA";
				}
				if(SINTypeNational=="Japanese Imperial State"){ 
					Prefix="JPN";
				}
				if(SINTypeNational=="Republic of Kenya"){ 
					Prefix="KEN";
				}
				if(SINTypeNational=="Free State of Konigsberg"){ 
					Prefix="KIB";
				}
				if(SINTypeNational=="Republic of Korea"){ 
					Prefix="KOR";
				}
				if(SINTypeNational=="Republic of Kosovo"){ 
					Prefix="KOS";
				}
				if(SINTypeNational=="Kurdistan Autonomous Zone"){ 
					Prefix="KAZ";
				}
				if(SINTypeNational=="Lao People's Democratic Republic"){ 
					Prefix="LAO";
				}
				if(SINTypeNational=="Republic of Latvia"){ 
					Prefix="LVA";
				}
				if(SINTypeNational=="Republic of Lithuania"){ 
					Prefix="LTU";
				}
				if(SINTypeNational=="Malaysia"){ 
					Prefix="MYS";
				}
				if(SINTypeNational=="Republic of Malta"){ 
					Prefix="MLT";
				}
				if(SINTypeNational=="Republic of Manchuria"){ 
					Prefix="MCR";
				}
				if(SINTypeNational=="Manitou Council"){ 
					Prefix="MTU";
				}
				if(SINTypeNational=="New Monaco"){ 
					Prefix="MCO";
				}
				if(SINTypeNational=="Mongolia"){ 
					Prefix="MNG";
				}
				if(SINTypeNational=="Montenegro"){ 
					Prefix="MNE";
				}
				if(SINTypeNational=="Republic of the Union of Myanmar"){ 
					Prefix="MMR";
				}
				if(SINTypeNational=="Federal Democratic Republic of Nepal"){ 
					Prefix="NPL";
				}
				if(SINTypeNational=="Nice"){ 
					Prefix="NCE";
				}
				if(SINTypeNational=="Ningxia"){ 
					Prefix="NXA";
				}
				if(SINTypeNational=="Enclave of Novi Pazar"){ 
					Prefix="NPZ";
				}
				if(SINTypeNational=="Islamic Republic of Pakistan"){ 
					Prefix="PAK";
				}
				if(SINTypeNational=="Palestine"){ 
					Prefix="PST";
				}
				if(SINTypeNational=="Panama Pan-Corprate Zone"){ 
					Prefix="PAN";
				}
				if(SINTypeNational=="Independent State of Papua New Guinea"){ 
					Prefix="PNG";
				}
				if(SINTypeNational=="Republic of Paraguay"){ 
					Prefix="PRY";
				}
				if(SINTypeNational=="Republic of Peru"){ 
					Prefix="PER";
				}
				if(SINTypeNational=="Republic of the Philippines"){ 
					Prefix="PHL";
				}
				if(SINTypeNational=="Portuguese Republic"){ 
					Prefix="PRT";
				}
				if(SINTypeNational=="Pueblo Corporate Council"){ 
					Prefix="PCC";
				}
				if(SINTypeNational=="Republic of Quebec"){ 
					Prefix="QBC";
				}
				if(SINTypeNational=="Romania"){ 
					Prefix="ROM";
				}
				if(SINTypeNational=="Russian Republic"){ 
					Prefix="RUS";
				}
				if(SINTypeNational=="Salish-Shidhe Council"){ 
					Prefix="SSC";
				}
				if(SINTypeNational=="Republic of San Marino"){ 
					Prefix="SMR";
				}
				if(SINTypeNational=="Sarajevo Enclave"){ 
					Prefix="SJE";
				}
				if(SINTypeNational=="Scandinavian Union"){ 
					Prefix="SVU";
				}
				if(SINTypeNational=="Republic of Serbia"){ 
					Prefix="SRB";
				}
				if(SINTypeNational=="Kingdom of Shaanxi"){ 
					Prefix="SNX";
				}
				if(SINTypeNational=="Shan State"){ 
					Prefix="SHN";
				}
				if(SINTypeNational=="Constitutional Republic of Sichuan"){ 
					Prefix="CRS";
				}
				if(SINTypeNational=="Singapore"){ 
					Prefix="SNG";
				}
				if(SINTypeNational=="Sioux Nation"){ 
					Prefix="SUX";
				}
				if(SINTypeNational=="Slovak Republic"){ 
					Prefix="SVK";
				}
				if(SINTypeNational=="Republic of Slovenia"){ 
					Prefix="SVN";
				}
				if(SINTypeNational=="Solomon Islands"){ 
					Prefix="SLI";
				}
				if(SINTypeNational=="Kingdom of Spain"){ 
					Prefix="ESP";
				}
				if(SINTypeNational=="Democratic Socialist Republic of Sri Lanka"){ 
					Prefix="LNK";
				}
				if(SINTypeNational=="Republic of Srpska"){ 
					Prefix="SRP";
				}
				if(SINTypeNational=="Swiss Confederation"){ 
					Prefix="SWS";
				}
				if(SINTypeNational=="Syrian Arab Republic"){ 
					Prefix="SAR";
				}
				if(SINTypeNational=="Kingdom of Thailand"){ 
					Prefix="THI";
				}
				if(SINTypeNational=="Tibet"){ 
					Prefix="TBT";
				}
				if(SINTypeNational=="Tír Na NÓg"){ 
					Prefix="TNN";
				}
				if(SINTypeNational=="Tir Tangire"){ 
					Prefix="TTG";
				}
				if(SINTypeNational=="Transcaucasian Federation"){ 
					Prefix="TCC";
				}
				if(SINTypeNational=="Trans-Polar Aleut Nation"){ 
					Prefix="TPAN";
				}
				if(SINTypeNational=="Independent City of Trieste"){ 
					Prefix="ICT";
				}
				if(SINTypeNational=="Commonwealth of Turkestan"){
					Prefix="TRK";
				}
				if(SINTypeNational=="Secular Republic of Turkey"){ 
					Prefix="TUR";
				}
				if(SINTypeNational=="Ukraine"){ 
					Prefix="UKR";
				}
				if(SINTypeNational=="United Canadian American States"){ 
					Prefix="UCAS";
				}
				if(SINTypeNational=="United Kingdom of Great Britain"){ 
					Prefix="UKGB";
				}
				if(SINTypeNational=="United Netherlands"){ 
					Prefix="UNL";
				}
				if(SINTypeNational=="Eastern Republic of Uruguay"){ 
					Prefix="URU";
				}
				if(SINTypeNational=="Republic of Vanuatu"){ 
					Prefix="VUT";
				}
				if(SINTypeNational=="Socialist Republic of Vietnam"){ 
					Prefix="VNM";
				}
				if(SINTypeNational=="Autonomous Province of Vojvodina"){ 
					Prefix="APV";
				}
				if(SINTypeNational=="Yakut"){ 
					Prefix="YKT";
				}
				if(SINTypeNational=="Yucatan Autonomous Zone"){ 
					Prefix="YAZ";
				}
				if(SINTypeNational=="Yunnan"){ 
					Prefix="YNN";
				}
				if(SINTypeNational=="New Zealand"){ 
					Prefix="NZE";
				}

			} //END OF THE NATIONAL DROP BOX
			if (SINType=="Criminal"){
				
				CriminalSINType = new JComboBox();
					CriminalSINType.setSize(120,25);
					CriminalSINType.setLocation(52,100);
					CriminalSINType.setEnabled(true);	
					CriminalSINType.setVisible(false);
					CriminalSINType.addItem("Choose...");
					CriminalSINType.addItem("Interpol Criminal SIN");
					CriminalSINType.addItem("National Criminal SIN");
					CriminalSINType.addItem("Corprate Court Criminal SIN"); //By this point, your in some pretty deep dreck chummer
				CorpSINType.setVisible(false);
				CriminalSINType.setVisible(true);
				CriminalSINType.setEnabled(true);
				NationalSINType.setVisible(false);
				
				SINTypeCriminal=CriminalSINType.getSelectedItem();
				SINTypeCriminal=SINTypeCriminal.toString();
				
				if (SINTypeCriminal=="Interpol Criminal SIN"){
					Prefix="IPOL";
					Suffix="C";
				}
				if (SINTypeCriminal=="Corprate Court Criminal SIN"){
					Prefix="CC";
					Suffix="C";
				}
				if (SINTypeCriminal=="National Criminal SIN"){
					SINType="National";
					SINSelection.add(NationalSINType);
					SINTypeNational=NationalSINType.getSelectedItem();
					SINTypeNational=SINTypeNational.toString();
					
					if(SINTypeNational=="Islamic Republic of Afghanistan"){ 
						Prefix="AFG";
					}
					if(SINTypeNational=="Republic of Albania"){ 
						Prefix="ALB";
					}
					if(SINTypeNational=="Algonkian-Manitou Council"){ 
						Prefix="AMC";
					}
					if(SINTypeNational=="Amazonia"){ 
						Prefix="AMZ";
					}
					if(SINTypeNational=="Arabian Caliphate"){ 
						Prefix="ARB";
					}
					if(SINTypeNational=="Argentine Republic"){ 
						Prefix="ARG";
					}
					if(SINTypeNational=="Asante Nation"){ 
						Prefix="ASN";
					}
					if(SINTypeNational=="Athabaskan Council"){ 
						Prefix="ATH";
					}
					if(SINTypeNational=="Australian Republic"){ 
						Prefix="AUS";
					}
					if(SINTypeNational=="Republic of Austria"){ 
						Prefix="AUT";
					}
					if(SINTypeNational=="Azanian Confederation"){ 
						Prefix="AZN";
					}
					if(SINTypeNational=="Federal Republic of Aztlan"){ 
						Prefix="AZT";
					}
					if(SINTypeNational=="Bangla Commonwealth"){ 
						Prefix="BGD";
					}
					if(SINTypeNational=="Imperial Kingdom of Beijing"){ 
						Prefix="BJI";
					}
					if(SINTypeNational=="Republic of Belarus"){ 
						Prefix="BLR";
					}
					if(SINTypeNational=="Communist Republic of Bolivia"){ 
						Prefix="BOL";
					}
					if(SINTypeNational=="Brasov-Covasna Enclavce"){ 
						Prefix="BCE";
					}
					if(SINTypeNational=="Independent City of Brussels"){ 
						Prefix="BRUS";
					}
					if(SINTypeNational=="Republic of Bulgaria"){ 
						Prefix="BGR";
					}
					if(SINTypeNational=="California Free State"){ 
						Prefix="CFS";
					}
					if(SINTypeNational=="Kingdom of Cambodia"){ 
						Prefix="CAM";
					}
					if(SINTypeNational=="Canton Confederation"){ 
						Prefix="CTN";
					}
					if(SINTypeNational=="Independent City of Caracas"){ 
						Prefix="CRC";
					}
					if(SINTypeNational=="Caribbean League"){ 
						Prefix="CRB";
					}
					if(SINTypeNational=="Republic of Chile"){ 
						Prefix="CHL";
					}
					if(SINTypeNational=="Republic of China"){ 
						Prefix="CHN";
					}
					if(SINTypeNational=="Confederate American States"){ 
						Prefix="CAS";
					}
					if(SINTypeNational=="Constantinople"){ 
						Prefix="CTP";
					}
					if(SINTypeNational=="Free Corsica"){ 
						Prefix="CSC";
					}
					if(SINTypeNational=="Republic of Croatia"){ 
						Prefix="HRV";
					}
					if(SINTypeNational=="Republic of Cyprus"){ 
						Prefix="CYP";
					}
					if(SINTypeNational=="Czech Republic"){ 
						Prefix="CZE";
					}
					if(SINTypeNational=="Dalmatia"){ 
						Prefix="DMT";
					}
					if(SINTypeNational=="Republic of Ecuador"){ 
						Prefix="ECU";
					}
					if(SINTypeNational=="Arab Republic of Egypt"){ 
						Prefix="EGY";
					}
					if(SINTypeNational=="Republic of Estonia"){ 
						Prefix="EST";
					}
					if(SINTypeNational=="Euskal Herria"){ 
						Prefix="EKH";
					}
					if(SINTypeNational=="Republic of Fiji"){ 
						Prefix="FJI";
					}
					if(SINTypeNational=="Sixth Republic of France"){ 
						Prefix="FRA";
					}
					if(SINTypeNational=="Gansu"){ 
						Prefix="GSU";
					}
					if(SINTypeNational=="Allied German States"){ 
						Prefix="AGS";
					}
					if(SINTypeNational=="Guangxi"){ 
						Prefix="GXI";
					}
					if(SINTypeNational=="French Guiana"){ 
						Prefix="GUI";
					}
					if(SINTypeNational=="Hainan"){ 
						Prefix="HAI";
					}
					if(SINTypeNational=="Kingdom of Hawai’i"){ 
						Prefix="HWI";
					}
					if(SINTypeNational=="Federal Republic of Hellas"){ 
						Prefix="GRC";
					}
					if(SINTypeNational=="Henan"){ 
						Prefix="HAN";
					}
					if(SINTypeNational=="Hong Kong Free Enterprise Zone"){ 
						Prefix="HKG";
					}
					if(SINTypeNational=="Hungary"){ 
						Prefix="HUN";
					}
					if(SINTypeNational=="Indian Union"){ 
						Prefix="IND";
					}
					if(SINTypeNational=="Islamic Republic of Iran"){ 
						Prefix="IRN";
					}
					if(SINTypeNational=="Federal Republic of Iraq"){ 
						Prefix="IRQ";
					}
					if(SINTypeNational=="State of Israel"){ 
						Prefix="ISR";
					}
					if(SINTypeNational=="Italian Confederation"){ 
						Prefix="ITA";
					}
					if(SINTypeNational=="Japanese Imperial State"){ 
						Prefix="JPN";
					}
					if(SINTypeNational=="Republic of Kenya"){ 
						Prefix="KEN";
					}
					if(SINTypeNational=="Free State of Konigsberg"){ 
						Prefix="KIB";
					}
					if(SINTypeNational=="Republic of Korea"){ 
						Prefix="KOR";
					}
					if(SINTypeNational=="Republic of Kosovo"){ 
						Prefix="KOS";
					}
					if(SINTypeNational=="Kurdistan Autonomous Zone"){ 
						Prefix="KAZ";
					}
					if(SINTypeNational=="Lao People's Democratic Republic"){ 
						Prefix="LAO";
					}
					if(SINTypeNational=="Republic of Latvia"){ 
						Prefix="LVA";
					}
					if(SINTypeNational=="Republic of Lithuania"){ 
						Prefix="LTU";
					}
					if(SINTypeNational=="Malaysia"){ 
						Prefix="MYS";
					}
					if(SINTypeNational=="Republic of Malta"){ 
						Prefix="MLT";
					}
					if(SINTypeNational=="Republic of Manchuria"){ 
						Prefix="MCR";
					}
					if(SINTypeNational=="Manitou Council"){ 
						Prefix="MTU";
					}
					if(SINTypeNational=="New Monaco"){ 
						Prefix="MCO";
					}
					if(SINTypeNational=="Mongolia"){ 
						Prefix="MNG";
					}
					if(SINTypeNational=="Montenegro"){ 
						Prefix="MNE";
					}
					if(SINTypeNational=="Republic of the Union of Myanmar"){ 
						Prefix="MMR";
					}
					if(SINTypeNational=="Federal Democratic Republic of Nepal"){ 
						Prefix="NPL";
					}
					if(SINTypeNational=="Nice"){ 
						Prefix="NCE";
					}
					if(SINTypeNational=="Ningxia"){ 
						Prefix="NXA";
					}
					if(SINTypeNational=="Enclave of Novi Pazar"){ 
						Prefix="NPZ";
					}
					if(SINTypeNational=="Islamic Republic of Pakistan"){ 
						Prefix="PAK";
					}
					if(SINTypeNational=="Palestine"){ 
						Prefix="PST";
					}
					if(SINTypeNational=="Panama Pan-Corprate Zone"){ 
						Prefix="PAN";
					}
					if(SINTypeNational=="Independent State of Papua New Guinea"){ 
						Prefix="PNG";
					}
					if(SINTypeNational=="Republic of Paraguay"){ 
						Prefix="PRY";
					}
					if(SINTypeNational=="Republic of Peru"){ 
						Prefix="PER";
					}
					if(SINTypeNational=="Republic of the Philippines"){ 
						Prefix="PHL";
					}
					if(SINTypeNational=="Portuguese Republic"){ 
						Prefix="PRT";
					}
					if(SINTypeNational=="Pueblo Corporate Council"){ 
						Prefix="PCC";
					}
					if(SINTypeNational=="Republic of Quebec"){ 
						Prefix="QBC";
					}
					if(SINTypeNational=="Romania"){ 
						Prefix="ROM";
					}
					if(SINTypeNational=="Russian Republic"){ 
						Prefix="RUS";
					}
					if(SINTypeNational=="Salish-Shidhe Council"){ 
						Prefix="SSC";
					}
					if(SINTypeNational=="Republic of San Marino"){ 
						Prefix="SMR";
					}
					if(SINTypeNational=="Sarajevo Enclave"){ 
						Prefix="SJE";
					}
					if(SINTypeNational=="Scandinavian Union"){ 
						Prefix="SVU";
					}
					if(SINTypeNational=="Republic of Serbia"){ 
						Prefix="SRB";
					}
					if(SINTypeNational=="Kingdom of Shaanxi"){ 
						Prefix="SNX";
					}
					if(SINTypeNational=="Shan State"){ 
						Prefix="SHN";
					}
					if(SINTypeNational=="Constitutional Republic of Sichuan"){ 
						Prefix="CRS";
					}
					if(SINTypeNational=="Singapore"){ 
						Prefix="SNG";
					}
					if(SINTypeNational=="Sioux Nation"){ 
						Prefix="SUX";
					}
					if(SINTypeNational=="Slovak Republic"){ 
						Prefix="SVK";
					}
					if(SINTypeNational=="Republic of Slovenia"){ 
						Prefix="SVN";
					}
					if(SINTypeNational=="Solomon Islands"){ 
						Prefix="SLI";
					}
					if(SINTypeNational=="Kingdom of Spain"){ 
						Prefix="ESP";
					}
					if(SINTypeNational=="Democratic Socialist Republic of Sri Lanka"){ 
						Prefix="LNK";
					}
					if(SINTypeNational=="Republic of Srpska"){ 
						Prefix="SRP";
					}
					if(SINTypeNational=="Swiss Confederation"){ 
						Prefix="SWS";
					}
					if(SINTypeNational=="Syrian Arab Republic"){ 
						Prefix="SAR";
					}
					if(SINTypeNational=="Kingdom of Thailand"){ 
						Prefix="THI";
					}
					if(SINTypeNational=="Tibet"){ 
						Prefix="TBT";
					}
					if(SINTypeNational=="Tír Na NÓg"){ 
						Prefix="TNN";
					}
					if(SINTypeNational=="Tir Tangire"){ 
						Prefix="TTG";
					}
					if(SINTypeNational=="Transcaucasian Federation"){ 
						Prefix="TCC";
					}
					if(SINTypeNational=="Trans-Polar Aleut Nation"){ 
						Prefix="TPAN";
					}
					if(SINTypeNational=="Independent City of Trieste"){ 
						Prefix="ICT";
					}
					if(SINTypeNational=="Commonwealth of Turkestan"){
						Prefix="TRK";
					}
					if(SINTypeNational=="Secular Republic of Turkey"){ 
						Prefix="TUR";
					}
					if(SINTypeNational=="Ukraine"){ 
						Prefix="UKR";
					}
					if(SINTypeNational=="United Canadian American States"){ 
						Prefix="UCAS";
					}
					if(SINTypeNational=="United Kingdom of Great Britain"){ 
						Prefix="UKGB";
					}
					if(SINTypeNational=="United Netherlands"){ 
						Prefix="UNL";
					}
					if(SINTypeNational=="Eastern Republic of Uruguay"){ 
						Prefix="URU";
					}
					if(SINTypeNational=="Republic of Vanuatu"){ 
						Prefix="VUT";
					}
					if(SINTypeNational=="Socialist Republic of Vietnam"){ 
						Prefix="VNM";
					}
					if(SINTypeNational=="Autonomous Province of Vojvodina"){ 
						Prefix="APV";
					}
					if(SINTypeNational=="Yakut"){ 
						Prefix="YKT";
					}
					if(SINTypeNational=="Yucatan Autonomous Zone"){ 
						Prefix="YAZ";
					}
					if(SINTypeNational=="Yunnan"){ 
						Prefix="YNN";
					}
					if(SINTypeNational=="New Zealand"){ 
						Prefix="NZE";
					}

					Suffix="C";
				}
			} //END CRIMINAL
		} //END OF THE ACTION PREFORMED EVENT LISTENER BUTTON
	}); //END OF THE ACTION LISTENER GROUP
	
	generate.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			while(Block1.length()<4){
				int randNum = rand.nextInt(36);
				if(randNum>=10 && randNum<=36){
					if(randNum>=10 && randNum<=20){
						if(randNum==10){
							Block1=Block1+"A";
						}
						if(randNum==11){
							Block1=Block1+"B";
						}
						if(randNum==12){
							Block1=Block1+"C";
						}
						if(randNum==13){
							Block1=Block1+"D";
						}
						if(randNum==14){
							Block1=Block1+"E";
						}
						if(randNum==15){
							Block1=Block1+"F";
						}
						if(randNum==16){
							Block1=Block1+"G";
						}
						if(randNum==17){
							Block1=Block1+"H";
						}
						if(randNum==18){
							Block1=Block1+"I";
						}
						if(randNum==19){
							Block1=Block1+"J";
						}
						if(randNum==20){
							Block1=Block1+"K";
						}
					} //END 10-20
					if(randNum>=21 && randNum<=35){
						if(randNum==21){
							Block1=Block1+"L";
						}
						if (randNum==22){
							Block1=Block1+"M";
						}
						if (randNum==23){
							Block1=Block1+"N";
						}
						if (randNum==24){
							Block1=Block1+"O";
						}
						if (randNum==25){
							Block1=Block1+"P";
						}
						if (randNum==26){
							Block1=Block1+"Q";
						}
						if (randNum==27){
							Block1=Block1+"R";
						}
						if (randNum==28){
							Block1=Block1+"S";
						}
						if (randNum==29){
							Block1=Block1+"T";
						}
						if (randNum==30){
							Block1=Block1+"U";
						}
						if (randNum==31){
							Block1=Block1+"V";
						}
						if (randNum==32){
							Block1=Block1+"W";
						}
						if (randNum==33){
							Block1=Block1+"W";
						}
						if (randNum==34){
							Block1=Block1+"X";
						}
						if (randNum==35){
							Block1=Block1+"Y";
						}
						if (randNum==36){
							Block1=Block1+"Z";
						}
					} //END OF 21-34
				}//END OF LETTERS
				if(randNum<=9){
					Block1=Block1+randNum;
				}//END OF NUMBERS
			}//END BLOCK 1
			
			while(Block2.length()<4){ //BEGIN BLOCK 2
				int randNum = rand.nextInt(36);
				if(randNum>=10 && randNum<=36){
					if(randNum>=10 && randNum<=20){
						if(randNum==10){
							Block2=Block2+"A";
						}
						if(randNum==11){
							Block2=Block2+"B";
						}
						if(randNum==12){
							Block2=Block2+"C";
						}
						if(randNum==13){
							Block2=Block2+"D";
						}
						if(randNum==14){
							Block2=Block2+"E";
						}
						if(randNum==15){
							Block2=Block2+"F";
						}
						if(randNum==16){
							Block2=Block2+"G";
						}
						if(randNum==17){
							Block2=Block2+"H";
						}
						if(randNum==18){
							Block2=Block2+"I";
						}
						if(randNum==19){
							Block2=Block2+"J";
						}
						if(randNum==20){
							Block2=Block2+"K";
						}
					} //END 10-20
					if(randNum>=21 && randNum<=36){
						if(randNum==21){
							Block2=Block2+"L";
						}
						if (randNum==22){
							Block2=Block2+"M";
						}
						if (randNum==23){
							Block2=Block2+"N";
						}
						if (randNum==24){
							Block2=Block2+"O";
						}
						if (randNum==25){
							Block2=Block2+"P";
						}
						if (randNum==26){
							Block2=Block2+"Q";
						}
						if (randNum==27){
							Block2=Block2+"R";
						}
						if (randNum==28){
							Block2=Block2+"S";
						}
						if (randNum==29){
							Block2=Block2+"T";
						}
						if (randNum==30){
							Block2=Block2+"U";
						}
						if (randNum==31){
							Block2=Block2+"V";
						}
						if (randNum==32){
							Block2=Block2+"W";
						}
						if (randNum==33){
							Block2=Block2+"W";
						}
						if (randNum==34){
							Block2=Block2+"X";
						}
						if (randNum==35){
							Block2=Block2+"Y";
						}
						if (randNum==36){
							Block2=Block2+"Z";
						}
					} //END OF 21-36
				}//END OF LETTERS
				if(randNum<=9){
					Block2=Block2+randNum;
				}//END OF NUMBERS
			}//END BLOCK 2
			
			while(Block3.length()<4){//BEGIN BLOCK3
				int randNum = rand.nextInt(36);
				if(randNum>=10 && randNum<=36){
					if(randNum>=10 && randNum<=20){
						if(randNum==10){
							Block3=Block3+"A";
						}
						if(randNum==11){
							Block3=Block3+"B";
						}
						if(randNum==12){
							Block3=Block3+"C";
						}
						if(randNum==13){
							Block3=Block3+"D";
						}
						if(randNum==14){
							Block3=Block3+"E";
						}
						if(randNum==15){
							Block3=Block3+"F";
						}
						if(randNum==16){
							Block3=Block3+"G";
						}
						if(randNum==17){
							Block3=Block3+"H";
						}
						if(randNum==18){
							Block3=Block3+"I";
						}
						if(randNum==19){
							Block3=Block3+"J";
						}
						if(randNum==20){
							Block3=Block3+"K";
						}
					} //END 10-20
					if(randNum>=21 && randNum<=36){
						if(randNum==21){
							Block3=Block3+"L";
						}
						if (randNum==22){
							Block3=Block3+"M";
						}
						if (randNum==23){
							Block3=Block3+"N";
						}
						if (randNum==24){
							Block3=Block3+"O";
						}
						if (randNum==25){
							Block3=Block3+"P";
						}
						if (randNum==26){
							Block3=Block3+"Q";
						}
						if (randNum==27){
							Block3=Block3+"R";
						}
						if (randNum==28){
							Block3=Block3+"S";
						}
						if (randNum==29){
							Block3=Block3+"T";
						}
						if (randNum==30){
							Block3=Block3+"U";
						}
						if (randNum==31){
							Block3=Block3+"V";
						}
						if (randNum==32){
							Block3=Block3+"W";
						}
						if (randNum==33){
							Block3=Block3+"W";
						}
						if (randNum==34){
							Block3=Block3+"X";
						}
						if (randNum==35){
							Block3=Block3+"Y";
						}
						if (randNum==36){
							Block3=Block3+"Z";
						}
					} //END OF 21-36
				}//END OF LETTERS
				if(randNum<=9){
					Block3=Block3+randNum;
				}//END OF NUMBERS
			}//END BLOCK 3
			if(Suffix==""){
				SIN.setText(Prefix+"-"+Block1+"-"+Block2+"-"+Block3);
			}
			else{
				SIN.setText(Prefix+"-"+Block1+"-"+Block2+"-"+Block3+"-"+Suffix);
			}
			CorpSINType.setSelectedItem("Choose...");
			NationalSINType.setSelectedItem("Choose...");
			SINTypeSelect.setSelectedItem("Choose...");
			
			
		} //END OF THE ACTION PREFORMED EVENT LISTENER BUTTON
	}); //END OF THE ACTION LISTENER GROUP
} //END OF PUBLIC STATIC VOID MAIN

} //END OF PUBLIC CLASS SIN_GENERATOR