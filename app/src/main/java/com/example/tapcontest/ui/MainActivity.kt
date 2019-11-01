package com.example.tapcontest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tapcontest.R
import com.example.tapcontest.data.ContestViewModel

class MainActivity : AppCompatActivity() {

    private val contestViewModel = ContestViewModel()
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListFragment()
    }

    private fun setupListFragment() {
        val contestListFragment = ContestListFragment.newInstance()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.content_main,contestListFragment)
        fragmentTransaction.commit()
    }
}
