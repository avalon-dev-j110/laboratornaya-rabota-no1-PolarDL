package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    
    public static void main(String[] args) {
        
        Person ivanov = null;
        Person green = null;       
       
        //Passport(passNumber, passName, passSurname, passFathername, passSecondname, passBirthday, passIssueDate, passIssueAuthority)
        
        Passport passport1 = new Passport("40056723458", "Иван", "Иванов", "Иванович", "", "01.01.1980", "01.01.2000", "OVD 1275");
        Address address1 = new Address("Russia", "Murmansk", "Lenina", "12/4", "323");
        ivanov = new Person(passport1, address1);
        String ivanovAddress = ivanov.getAddress();
        String ivanovPassName = passport1.getFullName();
        
        System.out.println(ivanovPassName);
        System.out.println(ivanovAddress + "\n");
        
        
        Passport passport2 = new Passport("USA_351654", "Michael", "Green", "", "", "12.12.1975", "24.02.2020", "US Embassy 12");
        Address address2 = new Address("USA", "Alpharetta", "1st Avenue", "35", "4b");
        green = new Person(passport2, address2);
        String greenAddress = green.getAddress();
        String greenPassName = passport2.getFullName();
        
        System.out.println(greenPassName);
        System.out.println(greenAddress + "\n");
        
        
        Passport passport3 = new Passport("GB_194658", "John", "Smith", "", "Edvard", "06.06.1957", "27.04.1983", "Royal Service 12/5");
        Address address3 = new Address("UK", "London", "Downing", "10", "K");
        Person smith = new Person(passport3, address3);
        String smithAddress = smith.getAddress();
        String smithPassName = passport3.getFullName();
        
        System.out.println(smithPassName);
        System.out.println(smithAddress + "\n");
        
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
