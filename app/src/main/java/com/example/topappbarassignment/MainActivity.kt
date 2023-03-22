package com.example.topappbarassignment

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
     var jambaView= false
     var pokeView=false
     var cookieView=false
     lateinit var jambaPic: ImageView
     lateinit var pokePic: ImageView
     lateinit var cookiePic: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jambaPic = findViewById(R.id.jamba)
        pokePic = findViewById(R.id.pokeball)
        cookiePic = findViewById(R.id.cookie_monster)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.favorite_menu_item -> {
                Toast.makeText(
                    this, "My Beloved Jamba <3", Toast.LENGTH_SHORT
                ).show()

                jambaVisability()

            }
            R.id.cookie_menu_item -> {
                Toast.makeText(
                    this, "COOKIE", Toast.LENGTH_SHORT
                ).show()

                cookieVisability()

            }
            R.id.pokemon_menu_item -> {
                Toast.makeText(
                    this, "Gotta Catch 'em All B)", Toast.LENGTH_SHORT
                ).show()

                pokeVisability()

            }
            R.id.close_menu_item -> {
                finish()
            }
        }
        return true
    }

    private fun cookieVisability() {
        if(cookieView == false){
            cookiePic.visibility = View.VISIBLE
            cookieView = true
        } else{
            cookiePic.visibility = View.GONE
            cookieView = false
        }
    }

    private fun pokeVisability() {
        if(pokeView == false){
            pokePic.visibility = View.VISIBLE
            pokeView = true
        } else{
            pokePic.visibility = View.GONE
            pokeView = false
        }
    }

    private fun jambaVisability() {
        if(jambaView == false){
            jambaPic.visibility = View.VISIBLE
            jambaView = true
        }
        else{
            jambaPic.visibility = View.GONE
            jambaView = false
        }

    }

}