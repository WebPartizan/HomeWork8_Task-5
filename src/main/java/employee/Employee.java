package employee;

public class Employee {
    private int idNumber;
    private String name;
    private String surname;
    private String position;

    public Employee(int idNumber, String name, String surname, String position) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void add(Employee list) {
    }
}
