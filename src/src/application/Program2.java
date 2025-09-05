package application;

import model.dao.DepartmentDao;
import model.dao.factory.DaoFactory;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Teste 1 -> Busca por ID");
        Department department = departmentDao.findById(4);
        System.out.println(department);

        System.out.println("Teste 2 -> Busca tudo (all)");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
    }
}