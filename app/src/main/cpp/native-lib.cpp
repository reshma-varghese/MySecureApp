#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_reshma_mysecureapp_MyKeys_getBaseUrl(JNIEnv *env, jobject thiz) {
    std::string encrypted_key = "https://availwe.com/";
    return env->NewStringUTF(encrypted_key.c_str());
}
