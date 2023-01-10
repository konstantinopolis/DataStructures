package com.example.myapplication.queue

class ArrayListQueue <E>(): Queue<E>{
    private val storage = arrayListOf <E>()

    override val count: Int
      get() = storage.size

    override val isEmpty: Boolean
      get() = count==0


    override fun peek(): E? {
        return storage.getOrNull(0)
    }

    override fun dequeue(): E? {
       return if(isEmpty) null else storage.removeAt(0)
    }

    override fun enqueue(element: E): Boolean {
        return storage.add(element)
    }

}