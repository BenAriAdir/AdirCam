package com.adir.cam.viewer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "AdirCam Viewer - Ready!"
        tv.textSize = 20f
        setContentView(tv)
    }
}
