package MaasHesaplama;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int bonus;
    int year;
    double raiseSalary;
    double subTotal;
    double total;
    double tax;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
    }

    void bonus(int workHours) {
        this.workHours = workHours;
        if (40 < this.workHours) {
            this.bonus = (this.workHours - 40) * 30;
        } else this.bonus = 0;
        System.out.println("Bonus : " + bonus);
    }

    void tax(int salary) {
        this.salary = salary;
        if (this.salary < 0) {
            System.out.println("Hatalı girdiniz. Maaş sıfırdan küçük olamaz !");
        } else {
            if (0 < this.salary && this.salary < 1000) {
                this.tax = 0;
                System.out.println("Vergi : " + this.tax);
            }
            if (1000 < this.salary) {
                this.tax = this.salary * 0.03;
                System.out.println("Vergi : " + this.tax);
            }
        }
    }

    void raiseSalary(int hireYear, int salary) {
        this.hireYear = hireYear;
        this.raiseSalary = salary;
        this.year = (2021 - this.hireYear);

        if (this.year < 10) {
            this.raiseSalary = this.raiseSalary * 0.05;
        }
        if (9 < this.year && this.year < 20) {
            this.raiseSalary = this.raiseSalary * 0.1;
        }
        if (19 < this.year) {
            this.raiseSalary = this.raiseSalary * 0.15;
        }
        System.out.println("Maaş Artışı : " + raiseSalary);
    }

    void total() {
        this.subTotal = this.salary + this.bonus - this.tax;
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + this.subTotal);
        this.total = this.subTotal + this.raiseSalary;
        System.out.println("Toplam Maaş : " + this.total);

    }

}
