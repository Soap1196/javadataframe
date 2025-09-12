


"wget https://dlcdn.apache.org/spark/spark-4.0.1/spark-4.0.1-bin-hadoop3.tgz"

"tar xvf spark-$VER-bin-hadoop3.tgz"

"sudo mv spark-4.0.1-bin-hadoop3 /opt/spark"

"nano ~/.bashrc" # Or your preferred text editor

add these lines to the end of the file
"export SPARK_HOME=/opt/spark"
"export PATH=$PATH:$SPARK_HOME/bin"

Test the spark installation