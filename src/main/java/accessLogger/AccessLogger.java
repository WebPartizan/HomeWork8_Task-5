package accessLogger;

import employee.Employee;

import java.util.LinkedList;

public class AccessLogger {
    private LinkedList <Employee> list;

    public AccessLogger(LinkedList<Employee> list) {
        this.list = list;
    }

    private void logAccess (Employee list) {
        list.add(list);

    }

}
