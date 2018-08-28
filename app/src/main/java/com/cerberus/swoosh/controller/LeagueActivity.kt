package com.cerberus.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cerberus.swoosh.R
import com.cerberus.swoosh.model.Player
import com.cerberus.swoosh.utilities.PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {


    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null)
        {
            player = savedInstanceState.getParcelable(PLAYER)
        }
    }


    fun onMensClick(view: View)
    {
        womensbtn.isChecked = false
        coedbtn.isChecked=false

        player.league = "Mens"

    }

    fun onWomensClick(view: View)
    {
        mensbtn.isChecked = false
        coedbtn.isChecked = false

        player.league ="Womens"

    }

    fun  onCoedClick(view: View)
    {

        mensbtn.isChecked = false
        womensbtn.isChecked=false

        player.league = "Co-Ed"
    }

    fun Next(view: View)
    {
        if(player.league != "")
        {
            val n =Intent(this, SkillActivity::class.java)
            n.putExtra(PLAYER,player)
            startActivity(n)
        }else
        {
            Toast.makeText(this,"Please select a League.",Toast.LENGTH_SHORT).show()
        }

    }
}
