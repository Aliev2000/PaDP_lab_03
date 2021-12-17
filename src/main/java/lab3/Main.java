package lab3;

import org.apache.spark.SparkConf;

public class Main {
    public static void main(String[] args){
        SparkConf conf = new SparkConf().setAppName(APP_NAME);
        new App(conf).run();
}
