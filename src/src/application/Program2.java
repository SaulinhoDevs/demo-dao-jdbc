package application;

import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.factory.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Teste 1 -> Busca por ID");
        Department department = departmentDao.findById(4);
        System.out.println(department);
        
    }
}