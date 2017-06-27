#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_jesusherrera_botondestruirmundo_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hola Sr. Presidente";
    return env->NewStringUTF(hello.c_str());
}
