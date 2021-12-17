package lab3;

import java.io.Serializable;

public class Airport implements Serializable {
    private final int id;
    private final String name;

    public Airport(int id, String name) {

    @Override
    public String toString() {
        return String.format("Airport{id=%d, name='%s'}", id, name);
}
