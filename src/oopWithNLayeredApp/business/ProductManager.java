package oopWithNLayeredApp.business;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;	
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception {
		//is kurallari
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyati 1000 dan kucuk olamamz");
		}
		
		productDao.add(product);
	}
}
