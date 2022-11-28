package com.example.myapplication

data class Node<T:Any>(var value: T, var next: Node<T>? = null){

    override fun toString(): String {

       return if(next == null){
             "$value"
        }
        else{

            "$value --> ${next.toString()}"
        }

    }
}