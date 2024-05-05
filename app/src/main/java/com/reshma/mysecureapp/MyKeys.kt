package com.reshma.mysecureapp

object MyKeys {
    init {
        System.loadLibrary("native-lib")
    }
    external fun getBaseUrl(): String
}
