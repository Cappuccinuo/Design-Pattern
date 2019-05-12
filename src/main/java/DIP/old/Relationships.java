package DIP.old;

import DIP.Person;
import DIP.Relationship;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

public class Relationships {
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<Triplet<Person, Relationship, Person>>();

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<Person, Relationship, Person>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<Person, Relationship, Person>(child, Relationship.CHILD, parent));
    }
}
