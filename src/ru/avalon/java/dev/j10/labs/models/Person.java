package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.*;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    Address personAddress;
    Passport personPassport;
    
    public Person (Passport personPassport, Address personAddress){
        this.personAddress = personAddress;
        this.personPassport = personPassport;
    }
    
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        String fullname = "default";
        
        //if (personPassport.passSecondname == "" && personPassport.passFathername == "") {
        if (personPassport.passFathername == "") {
            fullname =  personPassport.passName + " " + personPassport.passSurname;
        } else if (personPassport.passFathername == "" && personPassport.passFathername != "") {
            fullname = personPassport.passName + " " + personPassport.passSecondname + " " +  personPassport.passSurname;
        } else {
            fullname = personPassport.passSurname + " " + personPassport.passName + " " + personPassport.passFathername;
        }
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        return fullname;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return "Person address is " + personAddress;
    }
}