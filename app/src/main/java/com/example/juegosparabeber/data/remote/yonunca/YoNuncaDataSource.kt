package com.example.juegosparabeber.data.remote.yonunca

import com.example.juegosparabeber.data.model.yonunca.VersionFiesta
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import com.example.juegosparabeber.core.Result
import com.example.juegosparabeber.data.model.yonunca.VersionPicante
import com.example.juegosparabeber.data.model.yonunca.VersionTinderPeip

class YoNuncaDataSource {

    suspend fun versionFiesta(): Result<List<VersionFiesta>>{
        val fiestalist = mutableListOf<VersionFiesta>()
        val querySnapshot = FirebaseFirestore.getInstance().collection("yonuncafiesta").get().await()
        for(yonunca in querySnapshot.documents){
            yonunca.toObject(VersionFiesta::class.java)?.let { preguntas ->
                fiestalist.add(preguntas)
            }
        }
        return Result.Sucess(fiestalist)
    }

    suspend fun versionPicante(): Result<List<VersionPicante>>{
        val picantelist = mutableListOf<VersionPicante>()
        val querySnapshot = FirebaseFirestore.getInstance().collection("yonuncapicante").get().await()
        for(yonunca in querySnapshot.documents){
            yonunca.toObject(VersionPicante::class.java)?.let { preguntas ->
                picantelist.add(preguntas)
            }
        }
        return Result.Sucess(picantelist)
    }

    suspend fun versionTinderPeip(): Result<List<VersionTinderPeip>>{
        val tinderpeiplist = mutableListOf<VersionTinderPeip>()
        val querySnapshot = FirebaseFirestore.getInstance().collection("yonuncatinderpeip").get().await()
        for(yonunca in querySnapshot.documents){
            yonunca.toObject(VersionTinderPeip::class.java)?.let { preguntas ->
                tinderpeiplist.add(preguntas)
            }
        }
        return Result.Sucess(tinderpeiplist)
    }

}