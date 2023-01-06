package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.linkedlist.Node
import com.example.myapplication.stack.ArrayListStack
import com.example.myapplication.stack.Stack

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

        var stringstack: Stack<String> = ArrayListStack()

    }


}