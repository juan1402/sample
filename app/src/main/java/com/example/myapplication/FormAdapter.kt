package com.example.myapplication

import android.view.View
import android.view.ViewGroup

interface FormAdapter {

    fun getItem(parent: ViewGroup, position: Int): View

    fun getCount(): Int
}

