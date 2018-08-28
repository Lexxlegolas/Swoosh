package com.cerberus.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cerberus.swoosh.utilities.EXTRA
import com.cerberus.swoosh.R
import com.cerberus.swoosh.utilities.SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league= ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA)

    }

    fun onBeginnerClick(view: View)
    {
        ballerbtn.isChecked = false
        skill = "Beginner"
    }

    fun onBallerClick(view: View)
    {
        beginnerbtn.isChecked = false
        skill = "Baller"


    }

    fun onFinishClick(view: View)
    {
        if (skill != "")
        {
            val f = Intent(this,FinishActivity::class.java)
            f.putExtra(EXTRA,league)
            f.putExtra(SKILL,skill)
            startActivity(f)
        }
        else
        {
            Toast.makeText(this,"Please select a skill level.",Toast.LENGTH_SHORT).show()
        }

    }
}

