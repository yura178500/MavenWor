package Model;

import java.util.Objects;


public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private String gender;
    private int age;
    private int city_id;

    public Employee() {
    }

    public Employee(String first_name, String last_name, String gender, int age, int city_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city_id = city_id;
    }

    public Employee(int id, String first_name, String last_name, String gender, int age, int city_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city_id = city_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }


    public int getId() {
        return id;
    }

    public int getCity_id() {
        return city_id;
    }


    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }


    public String getLast_name() {
        return last_name;
    }


    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && city_id == employee.city_id && first_name.equals(employee.first_name) && last_name.equals(employee.last_name) && gender.equals(employee.gender);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, gender, age, city_id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", city_id=" + city_id +
                '}';
    }
}
