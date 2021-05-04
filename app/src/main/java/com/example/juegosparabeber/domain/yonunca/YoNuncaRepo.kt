package com.example.juegosparabeber.domain.yonunca

import com.example.juegosparabeber.core.Result
import com.example.juegosparabeber.data.model.yonunca.VersionFiesta
import com.example.juegosparabeber.data.model.yonunca.VersionPicante
import com.example.juegosparabeber.data.model.yonunca.VersionTinderPeip

interface YoNuncaRepo {
    suspend fun versionFiesta(): Result<List<VersionFiesta>>
    suspend fun versionPicante(): Result<List<VersionPicante>>
    suspend fun versionTinderPeip(): Result<List<VersionTinderPeip>>
}