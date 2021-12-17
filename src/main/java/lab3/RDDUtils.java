package lab3;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import scala.Tuple2;

public class RDDUtils {
    private static final String DELIMITER = ",";

    private static final int IS_CANCELLED_COLUMN = 19;
    private static final int AIRPORT_ID_COLUMN = 14;

    public static JavaPairRDD<Integer, Airport> parseAirports(JavaRDD<String> airports){
        return airports.map(str -> str.split(DELIMITER))
                       .mapToPair(str -> {
                           int id = Integer.parseInt(str[AIRPORT_ID_COLUMN]);
                           String name = str[DEST_AIRPORT_NAME_COLUMN];
                           return new Tuple2<>(id, new Airport(id, name));
                       });
}
