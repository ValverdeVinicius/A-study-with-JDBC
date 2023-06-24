package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST Nº 1: seller findById ===");
		Seller sel = sellerDao.findById(3);
		System.out.println(sel);
		
		System.out.println("\n=== TEST Nº2: seller finByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller seller : list) {
			System.out.println(seller);
		}
		
		System.out.println("\n=== TEST Nº3: seller findAll ===");
		list = sellerDao.findAll();
		for (Seller sell : list) {
			System.out.println(sell);
		}
		
		System.out.println("\n=== TEST Nº4 seller insert ===");
		Seller newSeller = new Seller(null, "Gregório", "gregorio@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST Nº5 seller update ===");
		sel = sellerDao.findById(1);
		sel.setName("Marcio Stutz");
		sellerDao.update(sel);
		System.out.println("Updated successfully!");
	}

}
