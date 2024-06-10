package test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductsPage;
import pages.TessPage;

public class DemoTest extends BaseTest
{

    @Test
    public void DemoExample() throws InterruptedException
    {
    
    	// Application URL : https://magento.softwaretestingboard.com/
    	    
        HomePage homepage = new HomePage(driver);
        homepage.navigateTo("Women","Tops","Tees");
        
        // 1. Select any product
        TessPage tees = new TessPage(driver);
    	tees.SelectProduct("desiree-fitness-tee");
        
        // 2. Select the size, color and click Add to cart
		// 3. Verify the message "You added <ProdcutName> to your shopping cart.”
    	
    	ProductsPage p = new ProductsPage(driver);
    			p.getSize("XL");
    	        p.getColour("Black");
    	        p.AddtoCart();
    	        p.verifyAdded();
    			
  }
    
    
    
    
    
    
}