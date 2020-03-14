/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
    String street;
    String building;
    String apartment;

    public Address(String street, String building, String apartment) {
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }
    
    
    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartment() {
        return apartment;
    }
        

    
    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", building=" + building + ", apartment=" + apartment + '}';
    }
    
    
}
