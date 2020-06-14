//
// Created by Administrator on 2020-06-04.
//

#include "com_plkj_crazydemo_Hello.h"

JNIEXPORT jstring JNICALL Java_com_plkj_crazydemo_Hello_sayHello(JNIEnv * env, jclass jclass1){

    return env->NewStringUTF("from C")

  }