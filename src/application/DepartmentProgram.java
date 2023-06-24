package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmantDao();
		
		System.out.println("=== TEST Nº1: findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST Nº2: findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST Nº3: findAll ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted successfully! New Id: " + newDepartment.getId());
		
		System.out.println("\n=== TEST Nº4: update ===");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Accounting");
		departmentDao.update(dep2);
		System.out.println("Updated successfully!");
		
		System.out.println("\n=== TEST Nº5: delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted successfully");
			
		sc.close();
	}
}