package com.example.movieapp


data class Movie (
    val id: String,
    val title: String,
    val description: String,
    val imageLink: Multimedia
) {

    data class Multimedia (
        val link: String
    )
}