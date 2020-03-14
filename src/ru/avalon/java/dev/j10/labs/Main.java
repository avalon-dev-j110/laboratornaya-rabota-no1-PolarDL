package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

//test
//dfghdfghdfgh

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    
    public static void main(String[] args) {
        

        Person ivanov = null;
        Person smith = null;
        
        
       
        //Passport passport2 = new Passport(passNumber, passName, passSurname, passFathername, passSecondname, passBirthday, passIssueDate, passIssueAuthority)
        
        Passport passport1 = new Passport("40056723458", "Ivan", "Ivanov", "Ivanovich", "", "01.01.1980", "01.01.2000", "OVD 1275");
        Address address1 = new Address("Lenina", "12a", "323");
        ivanov = new Person(passport1, address1);
        String ivanovAddress = ivanov.getAddress();
        String ivanovName = ivanov.getFullName();
        
        System.out.println(ivanovAddress);
        System.out.println(ivanovName);
        
        Passport passport2 = new Passport("USA_351654", "John", "Smith", "", "Eduard", "12.12.1975", "24.02.2020", "US Embassy 12");
        Address address2 = new Address("1st Avenue", "35", "4b");
        smith = new Person(passport2, address2);
        String smithAddress = smith.getAddress();
        String smithName = smith.getFullName();
        
        System.out.println(smithAddress);
        System.out.println(smithName);
        
        
       

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
