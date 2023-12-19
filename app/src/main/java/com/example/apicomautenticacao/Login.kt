package com.example.apicomautenticacao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apicomautenticacao.databinding.LoginBinding
import com.google.firebase.auth.FirebaseAuth

class Login: AppCompatActivity() {

    private lateinit var binding: LoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(R.layout.login)


        firebaseAuth = FirebaseAuth.getInstance()
        binding.txtReg.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        binding.btLogin.setOnClickListener {
            val email = binding.loginEmail.text.toString()
            val pass = binding.loginPassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()){

                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener{
                    if(it.isSuccessful) {
                        val intent = Intent(this, Register::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this, "Email e Password não podem estar vazios", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser != null){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
