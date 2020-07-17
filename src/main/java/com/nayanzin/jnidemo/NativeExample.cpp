#include "com_nayanzin_jnidemo_NativeExample.h"
#include <ctype.h>
#include <string.h>

/*
 * Class:     com_nayanzin_jnidemo_NativeExample
 * Method:    square
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_nayanzin_jnidemo_NativeExample_square
  (JNIEnv* env, jobject obj, jint num) {
    return num * num;
  }