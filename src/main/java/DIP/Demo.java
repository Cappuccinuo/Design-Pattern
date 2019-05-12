package DIP;

// A. High-level modules should not depend on low-level modules.
// Both should depend on abstractions.

// B. Abstractions should not depend on details.
// Details should depend on abstractions.

// Relationships -> low-level
// Research -> high-level

import DIP.old.Relationships;
import DIP.old.Research;

public class Demo {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Fuel");
        Person child2 = new Person("Josh");
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        Research research = new Research(relationships);

        DIP.New.Relationships relationships1 = new DIP.New.Relationships();
        relationships1.addParentAndChild(parent, child1);
        relationships1.addParentAndChild(parent, child2);
        DIP.New.Research research1 = new DIP.New.Research(relationships1);
    }
}
