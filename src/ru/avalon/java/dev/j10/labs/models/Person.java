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

    private Address personAddress;
    private Passport personPassport;
    
    public Person (Passport personPassport, Address personAddress){
        this.personPassport = personPassport;
        this.personAddress = personAddress;
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
        
        return personPassport.getPassSurname() + " address: " + personAddress;
    }
}