package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickableViews: List<View> = listOf(idBoxOne,idBoxTwo,idBoxThree,idBoxFour,idBoxFive,constraint_layout)
        for(item in clickableViews){
            item.setOnClickListener {
                makecolor(it)
            }
        }

    }

    private fun makecolor(view: View){
        when(view.id){
            R.id.idBoxOne -> view.setBackgroundColor(Color.DKGRAY)
            R.id.idBoxTwo -> view.setBackgroundColor(Color.GRAY)
            R.id.idBoxThree -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.idBoxFour -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.idBoxFive -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.GREEN)


        }
    }
}
