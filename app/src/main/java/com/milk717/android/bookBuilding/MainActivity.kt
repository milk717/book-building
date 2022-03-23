package com.milk717.android.bookBuilding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.milk717.android.bookBuilding.databinding.ActivityMainBinding
import com.milk717.android.bookBuilding.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBinding()
    }

    private fun initBinding() {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.viewModel = viewModel       //layout의 viewModel변수와 ViewModel을 연결
        binding.lifecycleOwner = this       //LiveData를 Databinding으로 쓸 경우 써줘야함.
    }
}