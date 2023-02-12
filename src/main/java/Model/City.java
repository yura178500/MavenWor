package Model;

import java.util.Objects;

public class City {
    private int id;
    private String city;

    public City() {
    }


    public City(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getCity_id() {
        return id;
    }

    public void setCity_id(int city_id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return id == city1.id && city.equals(city1.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city);
    }


}
