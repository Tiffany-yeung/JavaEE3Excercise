import Maven2.Excercises.Account;
import Maven2.Excercises.Service;
import junit.framework.Assert;
import junit.framework.TestCase;

public class MainTest extends TestCase {

	private Service service = new Service();
	
    public void AddAccountTest() {
    		
    		int expected = 1;
    		String actual = service.addAccount("Tiffany", "Yeung", "00001");
    		Assert.assertEquals(expected, actual);
    		
    }
    
    public void GetAccountTest() {
    		int actual = 1;
		Account expected = service.getAccount(1);
		Assert.assertEquals(expected, actual);
    }
}
