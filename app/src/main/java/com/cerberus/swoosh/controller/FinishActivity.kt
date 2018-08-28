package com.cerberus.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.cerberus.swoosh.R
import com.cerberus.swoosh.utilities.EXTRA
import com.cerberus.swoosh.utilities.SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA)
        val skill = intent.getStringExtra(SKILL)

        searchtxt.text = "Looking for $league $skill league near you ..."
    }
}
