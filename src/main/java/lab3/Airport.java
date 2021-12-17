package lab3;

import java.io.Serializable;

public class Airport implements Serializable {
    private final String name;

    public String toString() {
        return String.format("Airport{id=%d, name='%s'}", id, name);
}
