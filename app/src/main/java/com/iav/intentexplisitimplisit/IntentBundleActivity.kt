package com.iav.intentexplisitimplisit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class IntentBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val namaku = intent.getStringExtra("NAMAKU")
        val sekolahku = intent.getStringExtra("SEKOLAHKU")
        val npm = intent.getStringExtra("NPM")
        val foto_url = intent.getStringExtra("FOTO_URL")
        val foto = intent.getStringExtra("FOTO")
        val jk = intent.getStringExtra("JK")


    }
}
