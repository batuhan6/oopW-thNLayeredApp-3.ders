package oopWithNLayeredApp.business;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	public void add(Product product) throws Exception {
		//is kurallari
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyati 1000 dan kucuk olamamz");
		}
		
		ProductDao productDao = new HibernateProductDao();
		productDao.add(product);
	}
}
