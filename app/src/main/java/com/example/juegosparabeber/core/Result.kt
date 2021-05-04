package com.example.juegosparabeber.core

import java.lang.Exception

sealed class Result<out T>{
    class Loading<out T>: Result<T>()
    data class Sucess<out T>(val data: T): Result<T>()
    data class Failure(val exception: Exception): Result<Nothing>()
}