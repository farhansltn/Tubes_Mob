package com.example.splashbejoshop

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

public class HomeActivity {
    class activity2 : Activity() {
        /** Called when the activity is first created.  */
        public override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)
            val next = findViewById<View>(R.id.btn1) as Button
            next.setOnClickListener { view ->
                val myIntent = Intent(view.context, stockbarangActivity::class.java)
                startActivityForResult(myIntent, 0)
            }
        }
    }

    class Activity3 : Activity() {
        /** Called when the activity is first created.  */
        public override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)
            val next = findViewById<View>(R.id.btn2) as Button
            next.setOnClickListener { view ->
                val myIntent = Intent(view.context, stockbarangActivity::class.java)
                startActivityForResult(myIntent, 0)
            }
        }
    }

    class Activity4 : Activity() {
        /** Called when the activity is first created.  */
        public override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)
            val next = findViewById<View>(R.id.btn3) as Button
            next.setOnClickListener { view ->
                val myIntent = Intent(view.context, stockbarangActivity::class.java)
                startActivityForResult(myIntent, 0)
            }
        }
    }

    class Activity5 : Activity() {
        /** Called when the activity is first created.  */
        public override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_home)
            val next = findViewById<View>(R.id.btn4) as Button
            next.setOnClickListener { view ->
                val myIntent = Intent(view.context, stockbarangActivity::class.java)
                startActivityForResult(myIntent, 0)
            }
        }
    }
}