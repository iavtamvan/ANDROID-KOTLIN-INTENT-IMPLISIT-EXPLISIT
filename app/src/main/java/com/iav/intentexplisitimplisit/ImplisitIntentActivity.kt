package com.iav.intentexplisitimplisit

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_implisit_intent.*


class ImplisitIntentActivity : AppCompatActivity() {
    val REQUEST_IMAGE_CAPTURE = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implisit_intent)

        setupPermissions()
        //  ketik disini eaaa
        btnCapture.setOnClickListener {
            dispatchTakePictureIntent()

        }


    }

    private fun setupPermissions() {
        val permission = ContextCompat.checkSelfPermission(this,
            Manifest.permission.CAMERA)
        if (permission != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Permission to camera denied", Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(this, "Permission to camera Acces", Toast.LENGTH_LONG).show()
        }
    }





    fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            iv.setImageBitmap(imageBitmap)
        }
    }


}
