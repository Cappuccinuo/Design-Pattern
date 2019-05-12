package DIP.old;

import DIP.Person;
import DIP.Relationship;
import org.javatuples.Triplet;

import java.util.List;

public class Research {
    public Research(Relationships relationships) {
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations.stream()
                .filter(x -> x.getValue0().name.equals("John") &&
                        x.getValue1() == Relationship.PARENT)
                .forEach(ch -> System.out.println("John has a child called " + ch.getValue2().name));
    }
}
