package com.iav.intentexplisitimplisit

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pub.devrel.easypermissions.EasyPermissions
import pub.devrel.easypermissions.PermissionRequest
import android.Manifest.permission
import android.Manifest.permission.ACCESS_FINE_LOCATION




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ketik disini

        btnPindahActivityExplisit.setOnClickListener {
            startActivity(Intent(this, ExplisitIntentActivity::class.java))
        }

        btnPindahActivityImplisit.setOnClickListener {
            startActivity(Intent(this, ImplisitIntentActivity::class.java))
        }

    }

}
