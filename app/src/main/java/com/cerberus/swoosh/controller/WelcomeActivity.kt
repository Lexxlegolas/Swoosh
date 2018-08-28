package com.cerberus.swoosh.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.cerberus.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val league = Intent(this, LeagueActivity::class.java)
            startActivity(league)
        }
    }
}
