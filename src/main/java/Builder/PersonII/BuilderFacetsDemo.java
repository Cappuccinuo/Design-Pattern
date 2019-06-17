package Builder.PersonII;

public class BuilderFacetsDemo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                    .at("100 Happy St")
                    .in("Seattle")
                    .withPostcode("12345")
                .works()
                    .asA("SWE")
                    .at("Hulu")
                    .earning(200000)
                .build();
        System.out.println(person);
    }
}
