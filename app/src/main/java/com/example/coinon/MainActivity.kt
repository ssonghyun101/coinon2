package com.example.coinon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coinon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ViewPagerFragment = ViewPagerFragment()

        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.veiwpager_space,ViewPagerFragment())
        transaction.commit()




    }
}