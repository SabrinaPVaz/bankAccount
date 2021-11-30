public class EmployeeTest {

    public static void main(String[] args) {

        Employee sabrina = new Manager();

        sabrina.setName("Sabrina Pereira Vaz");
        sabrina.setCpf("010917370-88");
        sabrina.setSalary(1.200);

        System.out.println(sabrina.getName());
        System.out.println(sabrina.getBonus());
    }
}
