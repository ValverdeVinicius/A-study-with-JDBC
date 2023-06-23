package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST Nº 1: seller findById ===");
		Seller sel = sellerDao.findById(3);
		
		System.out.println(sel);

	}

}
