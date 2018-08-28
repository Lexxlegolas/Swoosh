package com.cerberus.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)


    }


    fun onMensClick(view: View)
    {
        womensbtn.isChecked = false
        coedbtn.isChecked=false

        selectedLeague = "Mens"

    }

    fun onWomensClick(view: View)
    {
        mensbtn.isChecked = false
        coedbtn.isChecked = false

        selectedLeague ="Womens"

    }

    fun  onCoedClick(view: View)
    {

        mensbtn.isChecked = false
        womensbtn.isChecked=false

        selectedLeague = "Co-Ed"
    }

    fun Next(view: View)
    {
        if(selectedLeague != "")
        {
            val n =Intent(this,SkillActivity::class.java)
            n.putExtra(EXTRA,selectedLeague)
            startActivity(n)
        }else
        {
            Toast.makeText(this,"Please select a League.",Toast.LENGTH_SHORT).show()
        }

    }
}
