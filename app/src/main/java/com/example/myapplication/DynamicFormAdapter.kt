package com.example.myapplication

import android.view.View
import android.view.ViewGroup

class DynamicFormAdapter : FormAdapter {

    // TODO add your custom logic on this adapter

    override fun getItem(parent: ViewGroup, position: Int): View {
        return when(position) {
            0 -> parent.inflate(R.layout.text_item)
            1 -> parent.inflate(R.layout.check_box)
            else -> View(parent.context)
        }
    }

    override fun getCount() = 2

}