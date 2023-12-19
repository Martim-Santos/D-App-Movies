package com.example.apicomautenticacao.Autenticacao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apicomautenticacao.databinding.RegisterBinding
import com.google.firebase.auth.FirebaseAuth


class Register: AppCompatActivity() {

    private lateinit var binding: RegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance();

        binding.textView.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        binding.btRegister.setOnClickListener {
            val email = binding.RegisterEmail.text.toString()
            val pass = binding.RegisterPassword.text.toString()
            val confirmPass = binding.RepeatRegisterPass.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
                if(pass == confirmPass) {

                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, Login::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }
                }else{
                    Toast.makeText(this, "As Passwords não são iguais", Toast.LENGTH_SHORT).show()

                }
            }else{
                Toast.makeText(this, "Email e Password não podem estar vazios", Toast.LENGTH_SHORT).show()
            }
        }
    }
}