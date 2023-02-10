package Dao;

import Model.Employee;

public interface EmployeeDAO {

    // Добавление объекта
    void create(Employee employee);

    // Получение объекта по id
    Employee readById(int id);

    // Получение всех объектов
    java.awt.List readAll();


    // Изменение объекта по id
    void updateAgeById(int id, int amount);

    // Удаление объекта по id
    void deleteById(int id);
}