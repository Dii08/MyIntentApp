package com.example.tugas12k23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity : Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity : Button = findViewById(R.id.btn_data_activity)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone : Button = findViewById(R.id.btn_number_activity)
        btnDialPhone.setOnClickListener(this)

        val btnMoveWithObject : Button = findViewById(R.id.btn_object_activity)
        btnMoveWithObject.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

    }
}