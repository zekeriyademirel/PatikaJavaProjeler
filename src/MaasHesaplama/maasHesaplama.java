package MaasHesaplama;

public class maasHesaplama {
    public static void main(String[] args) {
        Employee emp = new Employee("Kemal", 2000, 45, 1985);
        emp.print();
        emp.tax(emp.salary);
        emp.bonus(emp.workHours);
        emp.raiseSalary(emp.hireYear, emp.salary);
        emp.total();
    }
}
