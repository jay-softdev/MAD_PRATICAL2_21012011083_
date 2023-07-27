package com.example.mad_pratical2_21012011083_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("on create method is called")
    }

    override fun onStart() {
        super.onStart("on start method is called")
    }

    override fun onResume() {
        super.onResume("on resume method is called")
    }

    override fun onPause() {
        super.onPause("on pause method is called")
    }

    override fun onStop() {
        super.onStop("on stop method is called")
    }
    fun showMessage(message:String){

        Log.i(TAG, message )
        Toast.makeText(this, message , Toast.LENGTH_SHORT).show()
    }
}