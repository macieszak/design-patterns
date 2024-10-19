package transport;

import visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor visitor);

}
