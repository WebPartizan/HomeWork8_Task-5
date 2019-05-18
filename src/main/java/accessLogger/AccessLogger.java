package accessLogger;

import employee.Employee;

import java.util.LinkedList;

public class AccessLogger {
    private LinkedList <Employee> list;

    public LinkedList<Employee> getList() {
        return list;
    }

    public AccessLogger(LinkedList list) {
        this.list = list;
    }

    public void logAccess (Employee em) {
        list.add(em);

    }

}
