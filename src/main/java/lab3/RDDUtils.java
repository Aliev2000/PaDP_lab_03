package lab3;

import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import scala.Tuple2;

public class RDDUtils {
    private static final String DELIMITER = ",";

    private static final int IS_CANCELLED_COLUMN = 19;
    public static JavaPairRDD<Integer, Airport> parseAirports(JavaRDD<String> airports){
}
