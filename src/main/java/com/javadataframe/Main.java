package com.javadataframe;

import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class Main {
    public static void main(String[] args) {
        SparkSession session = SparkSession.builder()
                .appName("TouristDataFrameExample")
                .master("local[2]")
                .getOrCreate();

        // String parquetPath = args[0];

        // Load data from a Parquet file
        // Replace "path/to/your/file.parquet" with the actual file path
        Dataset<Row> df = session.read().parquet("src/main/java/com/javadataframe/fileStore/data.parquet");

        // Show the DataFrame contents
        System.out.println("DataFrame content:");
        df.show();

        // Stop the Spark session
        session.stop();
    }
}