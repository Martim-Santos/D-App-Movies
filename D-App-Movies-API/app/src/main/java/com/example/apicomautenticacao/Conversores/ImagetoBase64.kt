package com.example.apicomautenticacao.Conversores

import android.graphics.Bitmap
import android.util.Base64
import java.io.ByteArrayOutputStream

class ImagetoBase64 {

    private fun encodeImage(bm: Bitmap): String? {
        val baos = ByteArrayOutputStream()
        bm.compress(Bitmap.CompressFormat.JPEG, 100, baos)
        val b = baos.toByteArray()
        return Base64.encodeToString(b, Base64.DEFAULT)
    }
}