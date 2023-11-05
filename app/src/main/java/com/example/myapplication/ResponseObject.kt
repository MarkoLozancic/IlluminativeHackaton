package com.example.myapplication

import android.annotation.SuppressLint

public class ResponseObject {
    private var message: String? = null

    // on below line creating a getter method.
    fun getMessage(): String? {
        return message
    }

    // on below line creating a setter method.
    fun setMessage(message: String?) {
        this.message = message
    }

    // on below line creating a constructor method.l

    fun ResponseObject(message: String?) {
        this.message = message

    }}