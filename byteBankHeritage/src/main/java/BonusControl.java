public class BonusControl {

    public double sum;

    public double getSum() {

        return sum;
    }

    public void register(Employee e) {
        double bonus = e.getBonus();
        this.sum = this.sum + bonus;
    }

}
