package com.iav.intentexplisitimplisit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_intent_bundle.*

class IntentBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_bundle)

        val namaku = intent.getStringExtra("NAMAKU")
        val sekolahku = intent.getStringExtra("SEKOLAHKU")
        val npm = intent.getStringExtra("NPM")
        val foto_url = intent.getStringExtra("FOTO_URL")
        val jk = intent.getStringExtra("JK")

        tvNama.text = namaku
        Glide.with(this).load(foto_url).override(512, 512).into(ivFotoku)
        tvSekolahku.text = sekolahku
        tvNpm.text = npm
        tvJk.text = jk

    }
}
