package com.androiddevs.mvvmnewsapp.myApp.adapters

import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.androiddevs.mvvmnewsapp.myApp.ui.fragments.BreakingNewsFragment
import com.androiddevs.mvvmnewsapp.myApp.ui.fragments.SavedNewsFragment
import com.androiddevs.mvvmnewsapp.myApp.ui.fragments.SearchNewsFragment


class ParentFragmentAdapter(
    fragmentActivity: FragmentActivity
): FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> BreakingNewsFragment()
            1 -> SearchNewsFragment()
            else -> SavedNewsFragment()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }


}


