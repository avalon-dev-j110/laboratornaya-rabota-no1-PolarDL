package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */

public class Passport {
    
    String passNumber;
    String passName;
    String passSurname;
    String passFathername;
    String passSecondname;
    String passBirthday;
    String passIssueDate;
    String passIssueAuthority;
    
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

    public Passport(String passNumber, String passName, String passSurname, String passFathername, String passSecondname, String passBirthday, String passIssueDate, String passIssueAuthority) {
        this.passNumber = passNumber;
        this.passName = passName;
        this.passSurname = passSurname;
        this.passFathername = passFathername;
        this.passSecondname = passSecondname;
        this.passBirthday = passBirthday;
        this.passIssueDate = passIssueDate;
        this.passIssueAuthority = passIssueAuthority;
    }
}
