package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun ViewGroup.inflate(@LayoutRes layoutId: Int, addContainer: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, addContainer)
}