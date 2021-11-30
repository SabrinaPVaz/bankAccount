public class TestReferences {

    public static void main(String[] args) {

        Manager manager1 = new Manager();
        manager1.setName("Maria");
        manager1.setSalary(5000.0);

        Salesman salesman1 = new Salesman();
        salesman1.setName("joão");
        salesman1.setSalary(2500.0);

        Intern intern1 = new Intern();
        intern1.setName("sabrina");
        intern1.setSalary(1000.0);


        BonusControl control = new BonusControl();
        control.register(manager1);
        control.register(salesman1);
        control.register(intern1);

        System.out.println(control.getSum());
    }
}
