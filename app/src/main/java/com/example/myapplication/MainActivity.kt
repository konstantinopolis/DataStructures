package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.View.inflate
import android.view.inputmethod.InputBinding
import android.widget.Toast
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val list:Any?= null

        val list2 = Node(5, Node(7, Node(8)))

        println(list2)

    }

   /* fun VeriyiAl(){
     binding.button.setOnClickListener(){
         var text=binding.editTextTextPersonName

     }



    }*/
}