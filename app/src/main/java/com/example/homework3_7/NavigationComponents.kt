package com.example.homework3_7
import java.io.Serializable

data class NavigationComponents(
    var live:String?=null,
    var picture:String?=null,
    var name:String?=null,
    var positionNum:Int?=null
):Serializable
