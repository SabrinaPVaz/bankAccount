public class ManagerTest {
    public static void main(String[] args) {

        Manager manager1 = new Manager();

        manager1.setName("Douglas Parnoff");
        manager1.setCpf("01735243-035");
        manager1.setSalary(4000);

        System.out.println(manager1.getName());
        System.out.println(manager1.getCpf());
        System.out.println(manager1.getSalary());

        manager1.setPassword(12345);
        boolean authenticated = manager1.authenticates(12345);
        System.out.println(authenticated);

        System.out.println(manager1.getBonus());

    }
}
