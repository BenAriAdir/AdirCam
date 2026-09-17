package com.adir.cam.camera
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "AdirCam Camera - Ready! Pair code will be here"
        tv.textSize = 20f
        setContentView(tv)
    }
}
