package com.androiddevs.mvvmnewsapp.myApp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.myApp.adapters.ParentFragmentAdapter
import com.androiddevs.mvvmnewsapp.myApp.db.ArticleDataBase
import com.androiddevs.mvvmnewsapp.myApp.repository.NewsRepository
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        val tabLayout: TabLayout = findViewById(R.id.tab_layout)

        val pagerAdapter = ParentFragmentAdapter(this)
        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager){tab, position ->

        val tabNames = listOf("Breaking News","Search News","Saved News")
        tab.text = tabNames[position]

        }.attach()

       val newsRepository =  NewsRepository(ArticleDataBase(this))
        val viewModelProvideFactory = NewsViewModelProvideFactory(newsRepository)
        viewModel = ViewModelProvider(this,viewModelProvideFactory).get(NewsViewModel::class.java)


    }

}
