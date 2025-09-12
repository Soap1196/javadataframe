Instructions for creating a native spark installation within WSL.
Please note user made need to install the proper company certificates to use distro package managers inside proxy.

update system

"wget https://dlcdn.apache.org/spark/spark-4.0.1/spark-4.0.1-bin-hadoop3.tgz"

"tar xvf spark-4.0.1-bin-hadoop3.tgz"

"sudo mv spark-4.0.1-bin-hadoop3 /opt/spark"

"nano ~/.bashrc" # Or your preferred text editor

add these lines to the end of the file
"export SPARK_HOME=/opt/spark"
"export PATH=$PATH:$SPARK_HOME/bin"

Test the spark installation

"./spark-shell"