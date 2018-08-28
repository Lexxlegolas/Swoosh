package com.cerberus.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cerberus.swoosh.R
import com.cerberus.swoosh.model.Player
import com.cerberus.swoosh.utilities.PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(PLAYER)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null)
        {
            player = savedInstanceState.getParcelable(PLAYER)
        }
    }

    fun onBeginnerClick(view: View)
    {
        ballerbtn.isChecked = false
        player.skill = "Beginner"
    }

    fun onBallerClick(view: View)
    {
        beginnerbtn.isChecked = false
        player.skill = "Baller"


    }

    fun onFinishClick(view: View)
    {
        if (player.skill != "")
        {
            val f = Intent(this,FinishActivity::class.java)
            f.putExtra(PLAYER,player)

            startActivity(f)
        }
        else
        {
            Toast.makeText(this,"Please select a skill level.",Toast.LENGTH_SHORT).show()
        }

    }
}

