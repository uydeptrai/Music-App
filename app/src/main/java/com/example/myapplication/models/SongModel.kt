package com.example.myapplication.models

data class SongModel(
    val id : String,
    val title : String,
    val sub_title : String,
    val url : String,
    val coverUrl : String,
) {
    constructor() : this("","","","","")
}
