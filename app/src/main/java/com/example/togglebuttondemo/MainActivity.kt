package com.example.togglebuttondemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton
import androidx.databinding.DataBindingUtil
import com.example.togglebuttondemo.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        toggleID.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked){
                toggleID.setTextColor(Color.GREEN)
            } else{
                toggleID.setTextColor(Color.RED)
            }
        }
    }
}


