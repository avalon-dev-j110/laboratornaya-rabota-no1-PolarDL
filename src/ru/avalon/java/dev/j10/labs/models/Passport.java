package ru.avalon.java.dev.j10.labs.models;

import java.util.Objects;

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
    
    private String passNumber;
    private String passName;
    private String passSurname;
    private String passFathername;
    private String passSecondname;
    private String passBirthday;
    private String passIssueDate;
    private String passIssueAuthority;
    
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
        
        String fullname;
        
        if (passSecondname.equals("") && passFathername.equals("")) {
            fullname = passName + " " + passSurname;
        } else if (passFathername.equals("")) {
            fullname = passName + " " + passSecondname.substring(0,1) + "." + " " +  passSurname;
        } else {
            fullname = passSurname + " " + passName + " " + passFathername;
        }
        
        return fullname;
    }

    public String getPassSurname() {
        return passSurname;
    }
}
