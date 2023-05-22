package com.example.myapplication

class ViewModel(
    val id: Int,
    val name: String
) {

    val base: Int

    init {
        base = 0
    }

    fun provideData(): Int {
        return id
    }
}


