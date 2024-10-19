package visitor;

import transport.Animal;
import transport.Person;
import transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);

}
