package com.project.soccerteams.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.project.soccerteams.R
import com.project.soccerteams.mock.MockChampionship

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    lateinit var navBottomMain: BottomNavigationView
    lateinit var fragmentFirst: FragmentFirst
    lateinit var fragmentSecond: FragmentSecond

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MockChampionship.getData()

        navBottomMain = findViewById(R.id.nav_main)
        navBottomMain.setOnNavigationItemSelectedListener(this)

        fragmentFirst = FragmentFirst()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frag_main,fragmentFirst)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.item_europe -> {
                fragmentFirst = FragmentFirst()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frag_main,fragmentFirst)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.item_world_cup ->{
                fragmentSecond = FragmentSecond()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frag_main, fragmentSecond)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
        }
        return true
    }

}