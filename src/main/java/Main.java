public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        Employee ivanov = new Employee("ivanov", "ivan", 1, 50_000);
        Employee sidorov = new Employee("Sidorov", "Ivan", 2, 80_000);
        Employee petrova = new Employee("Petrova", "Inna", 3, 130_000);

        employees[0] = ivanov;
        employees[1] = sidorov;
        employees[2] = petrova;

        System.out.println(employees[0]);
    }

    public static void allEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int allSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int minSalary() {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static int maxSalary() {
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static int mediumSalary() {
        double mediumSalary = 0;
        for (Employee employee : employees) {
            mediumSalary += (double) employee.getSalary();
        }
        mediumSalary = mediumSalary / employees.length;
        return (int) mediumSalary;
    }


}

