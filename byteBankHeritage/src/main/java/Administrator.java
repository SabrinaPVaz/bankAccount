public class Administrator extends Employee implements Autenticable {

    private int password;

    public double getBonus() {

        return 0;
    }

    @Override
    public void setPassword(int password) {
        this.password = this.password;
    }

    @Override
    public boolean
    authenticate(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }

}
