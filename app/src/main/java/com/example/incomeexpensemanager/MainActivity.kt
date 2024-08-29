package com.example.incomeexpensemanager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.incomeexpensemanager.databinding.ActivityMainBinding
import com.example.incomeexpensemanager.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clickInit()
    }

    private fun clickInit() {
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.homeViewBtn -> loadFragment(HomeFragment())
                else -> loadFragment(HomeFragment())
            }
            false
        }
    }

    private fun loadFragment(fragment : Fragment){
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView,fragment)
        transaction.commit()
    }
}