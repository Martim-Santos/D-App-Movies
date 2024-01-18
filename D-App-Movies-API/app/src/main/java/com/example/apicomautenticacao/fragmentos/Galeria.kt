package com.example.apicomautenticacao.fragmentos

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.apicomautenticacao.model.Fotos
import com.example.apicomautenticacao.service.RetrofitInitializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Galeria: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.galeria)

        listNotes()

    }

        private fun listNotes() {

            val call = RetrofitInitializer().imageService().list()
            call.enqueue(object : Callback<Fotos> {
                override fun onResponse(call: Call<Fotos>,
                                        response: Response<Fotos>) {
                    response?.body()?.let {
                        val fotos: Fotos = it
                        //configureList(notes)
                        Log.i("---->",fotos.fotos.get(0).nome)
                    }
                }

                override fun onFailure(call: Call<Fotos>?, t: Throwable?) {
                    t?.message?.let { Log.e("onFailure error", it) }
                }
            })

        }

}

