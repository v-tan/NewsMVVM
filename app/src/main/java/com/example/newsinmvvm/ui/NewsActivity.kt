package com.example.newsinmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsinmvvm.R
import com.example.newsinmvvm.databinding.ActivityNewsBinding
import com.example.newsinmvvm.db.ArticlesDatabase
import com.example.newsinmvvm.repository.NewsRepository
import com.example.newsinmvvm.util.extensions.viewBinding

class NewsActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityNewsBinding::inflate)

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //creation of objects inside a class can be avoided using DI
        val newsRepository = NewsRepository(ArticlesDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = viewModelProviderFactory.create(NewsViewModel::class.java)

        val fragment = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment)
        fragment?.let { navHostFragment ->
            binding.bottomNavigationView.setupWithNavController(navHostFragment.findNavController())
        }
    }
}