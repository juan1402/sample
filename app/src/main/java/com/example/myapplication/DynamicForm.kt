package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.ScrollView
import com.hurtado.forms.directives.Field
import com.hurtado.forms.directives.FormResult
import com.hurtado.forms.widget.base.FormGroup

class DynamicForm<TypeResult : FormResult>(
    context: Context,
    attrs: AttributeSet?
) : FormGroup<TypeResult>(context, attrs) {

    fun setAdapter(adapter: FormAdapter) {
        val container = findViewById<ScrollView>(R.id.scrollView)

        val content = LinearLayout(context)
        content.orientation = LinearLayout.VERTICAL

        repeat(adapter.getCount()) { position ->
            val child = adapter.getItem(this, position)
            content.addView(child)
            if (child is Field<*, *>) {
                controllers.add(child.controller(inputChangeCallback))
            }
        }

        container.addView(content)
        onFinishInflate()
    }
}