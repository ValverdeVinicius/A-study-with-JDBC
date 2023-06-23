package application;

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

	}

}
