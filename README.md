Example java jar for building apache spark dataframe from a parquet file, manipulating it, and then writing it to a csv file.

to run as long a spark is installed:
spark-submit --class com.javadataframe.Main --master local[*] path/to/jarfile.jar