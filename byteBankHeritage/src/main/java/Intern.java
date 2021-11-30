public class Intern extends Employee {

    public double getBonus() {

        return getBonus() + super.getSalary();
    }
}