package com.example.myapplication.queue

interface Queue <E>{
    val count: Int
    val isEmpty: Boolean
    fun peek():E?
    fun dequeue():E?
    fun enqueue(element: E): Boolean
}