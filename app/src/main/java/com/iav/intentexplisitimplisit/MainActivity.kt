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

        btnPindahActivityIntentBundle.setOnClickListener {
            val intent:Intent = Intent(this, IntentBundleActivity::class.java)
            intent.putExtra("NAMAKU", "Ade Fajr Ariav")
            intent.putExtra("SEKOLAHKU", "UPGRIS")
            intent.putExtra("NPM", "16670025")
            intent.putExtra("FOTO_URL", "https://berajasenja.files.wordpress.com/2019/01/bahasa-mbaknya.jpg?w=503&h=671")
            intent.putExtra("FOTO", android.R.drawable.alert_light_frame)
            intent.putExtra("JK", "MAN")
            startActivity(intent)
        }

    }

}
