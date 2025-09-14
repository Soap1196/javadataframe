package com.javadataframe;

import org.apache.spark.sql.*;

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

        // Get the first column name
        String firstCol = df.columns()[0];

        // Get the third column name
        String thirdCol = df.columns()[2];

        // Get the fourth column name
        String fourthCol = df.columns()[3];

        // Remove "high" from all entries in the first column
        df = df.withColumn(firstCol, functions.regexp_replace(df.col(firstCol), "high", ""));

        // Replace "big" with "large" in the third column
        df = df.withColumn(thirdCol, functions.regexp_replace(df.col(thirdCol), "big", "large"));

        // Remove "high" from all entries in the fourth column
        df = df.withColumn(fourthCol, functions.regexp_replace(df.col(fourthCol), "high", ""));

        // Export the DataFrame to a CSV file
        df.write()
                .option("header", "true")
                .mode("overwrite")
                .csv("src/main/java/com/javadataframe/fileStore/output_csv");

        // Show the DataFrame contents capatailized
        System.out.println("DataFrame content:");
        df.show();


        // Stop the Spark session
        session.stop();
    }
}