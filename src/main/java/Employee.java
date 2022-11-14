import org.apache.commons.lang3.StringUtils;

public class Employee {

    private String surname;
    private String name;
    private int group;
    private int salary;
    static int id;


    public Employee(String surname, String name, int group, int salary) {
        setSurname(surname);
        setName(name);
        this.group = group;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (StringUtils.isBlank(surname)) {
            throw new IllegalArgumentException("400 Bad Request");
        } this.surname = StringUtils.capitalize(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("400 Bad Request");
        } this.name = StringUtils.capitalize(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", salary=" + salary +
                '}';
    }

    public int getGroup() {
        return group;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
