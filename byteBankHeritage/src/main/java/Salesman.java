public class Salesman extends Employee {

    public double getBonus() {
        return getBonus() + super.getSalary();
    }
}
