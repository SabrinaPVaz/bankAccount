public class Client implements Autenticable {

    private int password;

    @Override
    public void setPassword(int password) {

        this.password = password;
    }

    @Override
    public boolean authenticate(int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }

}
