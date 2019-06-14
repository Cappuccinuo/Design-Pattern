package Builder.Person;

public class Demo {
    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder()
                .withName("Yuan")
                .worksAs("SWE");
        System.out.println(eb.build());
    }
}
