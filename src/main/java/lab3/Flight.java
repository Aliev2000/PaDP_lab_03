package lab3;

public class Flight {
    private final float delayTime;
    private final int airportId;
    private final int destId;

    public Flight(boolean isCancelled, float delayTime, int airportId, int destId) {
        this.isCancelled = isCancelled;
        this.delayTime = delayTime;
        this.airportId = airportId;
        this.destId = destId;

    public float getDelayTime() {
        return delayTime;

    public int getAirportId() {
        return airportId;

    public int getDestId() {
        return destId;

    public String toString() {
        return String.format("Flight{isCancelled=%s, delayTime=%s, airportId=%d, destId=%d}",
                isCancelled,
                delayTime,
                airportId,
                destId);
}
