package com.example.juegosparabeber.presentation.yonunca

import android.view.View
import com.example.juegosparabeber.core.Result
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData

import com.example.juegosparabeber.domain.yonunca.YoNuncaRepo
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

class YoNuncaViewModel(private val repo: YoNuncaRepo):ViewModel(){

    fun yoNuncaFiesta() = liveData(Dispatchers.IO) {
        emit(Result.Loading())
        try {
            emit(repo.versionFiesta())
        }catch (e:Exception){
            emit(Result.Failure(e))
        }
    }

    fun yoNuncaPicante() = liveData(Dispatchers.IO) {
        emit(Result.Loading())
        try {
            emit(repo.versionPicante())
        }catch (e:Exception){
            emit(Result.Failure(e))
        }
    }

    fun yoNuncaTinderPeip() = liveData(Dispatchers.IO) {
        emit(Result.Loading())
        try {
            emit(repo.versionTinderPeip())
        }catch (e:Exception){
            emit(Result.Failure(e))
        }
    }
}

class YoNuncaViewModelFactory(private val repo: YoNuncaRepo): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(YoNuncaRepo::class.java).newInstance(repo)
    }

}