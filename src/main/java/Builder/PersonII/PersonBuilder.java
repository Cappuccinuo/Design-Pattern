package Builder.PersonII;

public class PersonBuilder {
    protected Person person = new Person();

    public Person build() {
        return person;
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }
}
