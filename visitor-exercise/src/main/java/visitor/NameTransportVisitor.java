package visitor;

import transport.Animal;
import transport.Person;
import transport.Shipment;

public class NameTransportVisitor implements  TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println("Typ przewożoneggo zwięrzęcia: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Imię i nazwisko przewożonej osoby: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Prefix oraz numer seryjny przewożonej wysyłki: " + shipment.getPrefix() + ", " + shipment.getSerialNumber());
    }

}
