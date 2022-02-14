package com.example.newsinmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsinmvvm.R
import com.example.newsinmvvm.databinding.ActivityNewsBinding
import com.example.newsinmvvm.util.extensions.viewBinding

class NewsActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityNewsBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragment = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment)
        fragment?.let { navHostFragment ->
            binding.bottomNavigationView.setupWithNavController(navHostFragment.findNavController())
        }
    }
}