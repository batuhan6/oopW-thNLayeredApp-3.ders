package oopWithNLayeredApp;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception{
		Product product1 = new Product(1, "Iphone", 9000);
				
		ProductManager productManager = new ProductManager();
		productManager.add(product1);


	}

}
