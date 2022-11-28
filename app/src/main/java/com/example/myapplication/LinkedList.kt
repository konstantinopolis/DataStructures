package com.example.myapplication

class LinkedList <T:Any> {
    private var head : Node<T>? = null
    private var tail : Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean=size==0

    override fun toString(): String {
        if(isEmpty()){
            return "it is empty list"
        }

        else{
            return head.toString()
        }
    }

    fun push(value:T): LinkedList<T> = apply{
        head= Node(value=value, next = head)

        if (tail==null){
            tail=head
        }

        size++

    }
    fun append(value: T):LinkedList<T> = apply{
        if (isEmpty()){
            push(value)
            return this
        }

        val NewNode = Node(value=value)

        tail!!.next = NewNode

        tail = NewNode
    }


}