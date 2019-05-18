package serverAccessApp;

import accessLogger.AccessLogger;
import employee.Employee;

import java.util.LinkedList;
import java.util.List;

public class ServerAccessApp {
    public static void main(String[] args) {

        Employee ivan = new Employee(2343,"Ivan", "Ivanov", "cleaner");
        Employee Petr = new Employee(4475,"Petr", "Petrov", "coder");
        Employee Sergey = new Employee(7896,"Sergey", "Sergeev", "Senior cleaner");
        Employee Olga = new Employee(5696,"Olga", "Smirnova", "manager");
        Employee Boris = new Employee(9611,"Boris", "Elkin", "Junior cleaner");
        Employee Nikolay = new Employee(5544,"Nikolay", "Trudnov", "Security");
        Employee Vadim = new Employee(7210,"Vadim", "Isaev", "Admin");
        Employee Rober = new Employee(0033,"Rober", "Adams", "Electrician");
        Employee Irina = new Employee(1199,"Irina", "Borisova", "Senior admin");
        Employee Marya = new Employee(9513,"Marya", "Komkova", "Director");



        AccessLogger accessLogger = new AccessLogger(new LinkedList());
        accessLogger.logAccess(ivan);
        accessLogger.logAccess(Petr);
        accessLogger.logAccess(Sergey);
        accessLogger.logAccess(Olga);
        accessLogger.logAccess(Boris);
        accessLogger.logAccess(Nikolay);
        accessLogger.logAccess(Vadim);
        accessLogger.logAccess(Rober);
        accessLogger.logAccess(Irina);
        accessLogger.logAccess(Marya);

        for (Employee i : accessLogger.getList()) {
            System.out.println(i);
        }




    }
}
