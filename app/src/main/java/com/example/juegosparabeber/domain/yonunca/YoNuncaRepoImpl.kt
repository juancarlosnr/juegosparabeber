package com.example.juegosparabeber.domain.yonunca

import com.example.juegosparabeber.core.Result
import com.example.juegosparabeber.data.model.yonunca.VersionFiesta
import com.example.juegosparabeber.data.model.yonunca.VersionPicante
import com.example.juegosparabeber.data.model.yonunca.VersionTinderPeip
import com.example.juegosparabeber.data.remote.yonunca.YoNuncaDataSource

class YoNuncaRepoImpl(private val dataSource: YoNuncaDataSource): YoNuncaRepo {
    override suspend fun versionFiesta(): Result<List<VersionFiesta>> = dataSource.versionFiesta()

    override suspend fun versionPicante(): Result<List<VersionPicante>> = dataSource.versionPicante()

    override suspend fun versionTinderPeip(): Result<List<VersionTinderPeip>> = dataSource.versionTinderPeip()
}