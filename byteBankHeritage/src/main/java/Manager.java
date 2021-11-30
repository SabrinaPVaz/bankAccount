public class Manager extends Employee implements Autenticable {

    private int password;

    public int Password() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int password) {

        return false;
    }

    public boolean authenticates(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }

    }

    public double getBonus() {
        return getBonus() + super.getSalary();
    }
}