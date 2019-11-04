package com.example.tapcontest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import com.example.tapcontest.R

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        d(TAG,"InMainActivity")
        setContentView(R.layout.activity_main)
        setupListFragment()
    }

    private fun setupListFragment() {
        d(TAG,"setupListFragment")
        val contestListFragment = ContestListFragment.newInstance()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.content_main,contestListFragment)
        fragmentTransaction.commit()
    }
}
