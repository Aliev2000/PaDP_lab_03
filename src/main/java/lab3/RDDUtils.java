package lab3;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import scala.Tuple2;

public class RDDUtils {
    private static final String DELIMITER = ",";

    private static final int IS_CANCELLED_COLUMN = 19;
    private static final int AIRPORT_ID_COLUMN = 14;

    private static final int ORIGIN_AIRPORT_ID_COLUMN = 11;
    public static JavaPairRDD<Tuple2<Integer, Integer>, Flight> parseFlightsPairRDD(JavaRDD<String> flights){
        return flights.map(str -> str.split(DELIMITER))
                      .map(str -> new Flight(str[IS_CANCELLED_COLUMN].equals(CANCELLED_FLAG),
                                             Float.parseFloat(str[DELAY_TIME_COLUMN]),
                                             Integer.parseInt(str[ORIGIN_AIRPORT_ID_COLUMN]),
                                             Integer.parseInt(str[AIRPORT_ID_COLUMN])))
                      .mapToPair(f -> new Tuple2<>(new Tuple2<>(f.getAirportId(), f.getDestId()), f));
    }

    public static JavaPairRDD<Integer, Airport> parseAirports(JavaRDD<String> airports){
        return airports.map(str -> str.split(DELIMITER))
                       .mapToPair(str -> {
                           int id = Integer.parseInt(str[AIRPORT_ID_COLUMN]);
                           String name = str[DEST_AIRPORT_NAME_COLUMN];
                           return new Tuple2<>(id, new Airport(id, name));
                       });
}
