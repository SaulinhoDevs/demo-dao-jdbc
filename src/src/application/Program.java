package application;

import model.dao.SellerDao;
import model.dao.factory.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println("Teste 1 -> Busca por ID");
        System.out.println(seller);

        System.out.println("\nTeste 2 -> Busca por Departamento");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}