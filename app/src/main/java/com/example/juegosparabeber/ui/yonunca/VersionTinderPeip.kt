package com.example.juegosparabeber.ui.yonunca

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.juegosparabeber.R
import com.example.juegosparabeber.core.Result
import com.example.juegosparabeber.data.remote.yonunca.YoNuncaDataSource
import com.example.juegosparabeber.databinding.FragmentVersionPicanteBinding
import com.example.juegosparabeber.databinding.FragmentVersionTinderPeipBinding
import com.example.juegosparabeber.domain.yonunca.YoNuncaRepoImpl
import com.example.juegosparabeber.presentation.yonunca.YoNuncaViewModel
import com.example.juegosparabeber.presentation.yonunca.YoNuncaViewModelFactory


class VersionTinderPeip : Fragment(R.layout.fragment_version_tinder_peip) {
    private lateinit var binding: FragmentVersionTinderPeipBinding
    private val viewModel by viewModels<YoNuncaViewModel> {
        YoNuncaViewModelFactory(
            YoNuncaRepoImpl(
                YoNuncaDataSource()
            )
        )
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentVersionTinderPeipBinding.bind(view)

        viewModel.yoNuncaTinderPeip().observe(viewLifecycleOwner, Observer { result ->
            when(result) {
                is Result.Loading -> {

                }
                is Result.Sucess -> {

                }
                is Result.Failure -> {
                    Toast.makeText(requireContext(), "Ocurrio un error ${result.exception}", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}