public class InternalSystem {

    private int password = 2222;

    public void authenticate(Autenticable employeeAut) {
        boolean authenticated = employeeAut.authenticate(this.password);

        if (authenticated) {
            System.out.println("authorized to enter the system");
        } else {
            System.out.println("not authorized to enter the system");
        }
    }

}

