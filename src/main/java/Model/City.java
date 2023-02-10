package Model;

import java.util.Objects;

public class City {
    private int city_id;
    private String city;

    public City() {
    }


    public City(int city_id, String city) {
        this.city_id = city_id;
        this.city = city;
    }


    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
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
                "city_id=" + city_id +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city_id == city1.city_id && city.equals(city1.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city_id, city);
    }


}
