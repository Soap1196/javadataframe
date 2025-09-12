package com.javadataframe;

import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.SparkSession;

public class Main {
    public static void main(String[] args) {
        SparkSession session = SparkSession.builder()
            .appName("TouristDataFrameExample")
            .master("local[*]")
            .getOrCreate();

        DataFrameReader dataFrameReader = session.read();
    }
}