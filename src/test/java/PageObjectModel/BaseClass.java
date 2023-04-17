package PageObjectModel;

	import org.openqa.selenium.WebDriver;
	import org.apache.logging.log4j.Logger;
	import Utility.Helper;
	
	public class BaseClass 
	{
		public WebDriver driver;
		public RegisterPOM Rp;
		public HomePOM Hp;
	    public SignINPOM Sp;
	    public DataStructurePOM DSp;
	    public ArrayPOM Ap;
	    public LinkedListPOM ll;
	    public StackPOM st;
	    public QueuePOM qp;
	    public TreePOM tp;
	    public GraphPOM gp;
	    public Logger log;
	    
	    
   
	    public BaseClass() {
	    	driver = Helper.getDriver();
	    
	    }

	    
	}

