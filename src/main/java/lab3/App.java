package lab3;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;
import scala.Tuple2;

import java.util.Map;

public class App {
    private final SparkConf conf;
    private static final String AIRPORTS_DATA_FILENAME="airports.csv";
    private static final String FLIGHTS_DATA_FILENAME="flights.csv";

    public App(SparkConf conf){
        this.conf = conf;

    public void run(){
        JavaPairRDD<Integer, Airport> airports;
        JavaPairRDD<Tuple2<Integer, Integer>, Flight> flights;
        JavaSparkContext sc = new JavaSparkContext(conf);

    }
}
