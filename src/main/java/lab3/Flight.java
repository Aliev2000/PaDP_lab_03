package lab3;

public class Flight {
    private final float delayTime;
    public Flight(boolean isCancelled, float delayTime, int airportId, int destId) {
        this.isCancelled = isCancelled;
        this.delayTime = delayTime;
        this.airportId = airportId;
        this.destId = destId;

    public int getAirportId() {
        return airportId;

    public String toString() {
        return String.format("Flight{isCancelled=%s, delayTime=%s, airportId=%d, destId=%d}",
                isCancelled,
                delayTime,
                airportId,
                destId);
}
