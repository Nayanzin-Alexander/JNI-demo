# JNI learning demo project

### Used materials
* https://medium.com/@bschlining/a-simple-java-native-interface-jni-example-in-java-and-scala-68fdafe76f5f


g++ -shared \
    -I/usr/include \
    -I$JAVA_HOME/include \
    -I$JAVA_HOME/include/linux \
    NativeExample.cpp -o NativeExample.so