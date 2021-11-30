public class SystemTest {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setPassword(2222);

        InternalSystem si = new InternalSystem();

        si.authenticate(manager);

    }
}
