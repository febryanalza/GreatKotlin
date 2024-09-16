package com.example.greatkotlin

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.greatkotlin.ui.theme.GreatKotlinTheme
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.example.greatkotlin.ui.fragments.HomeFragment
import com.example.greatkotlin.ui.fragments.SearchFragment
import com.example.greatkotlin.ui.fragments.AddFragment
import com.example.greatkotlin.ui.fragments.GamesFragment
import com.example.greatkotlin.ui.fragments.AccountFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        loadFragment(HomeFragment())

        bottomNavigationView.setOnItemSelectedListener { item ->
            var fragment:Fragment? = null
            when(item.itemId){
                R.id.home_menu -> fragment = HomeFragment()
                R.id.add_menu -> fragment = AddFragment()
                R.id.search_menu -> fragment = SearchFragment()
                R.id.game_menu -> fragment = GamesFragment()
                R.id.account_menu -> fragment = AccountFragment()
            }
            fragment?.let { loadFragment(it) }
            true
        }
    }
    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment,fragment)
            .commit()
    }
}
