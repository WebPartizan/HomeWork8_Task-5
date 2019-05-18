package accessLogger;

import employee.Employee;

import java.util.LinkedList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessLogger that = (AccessLogger) o;
        return list.equals(that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
