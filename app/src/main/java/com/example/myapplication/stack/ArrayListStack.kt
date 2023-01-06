package com.example.myapplication.stack

import java.util.EmptyStackException

class ArrayListStack <E : Any>: Stack<E>{


    private var stack: ArrayList<E> = ArrayList()
    override fun push(element: E) {
        stack.add(element)
    }

    override fun pop(): E {
        var poppedelement =top()
        stack.remove(poppedelement)
        return poppedelement
    }

    override fun top(): E {
        if(stack.isEmpty()){
            throw EmptyStackException()
        }
        return stack[stack.lastIndex]
    }

    override fun isEmpty(): Boolean {
        return isEmpty()
    }

    override fun size(): Int {
        return stack.size
    }

}