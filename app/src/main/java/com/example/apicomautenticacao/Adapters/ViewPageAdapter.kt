package com.example.apicomautenticacao.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.apicomautenticacao.fragmentos.*


class ViewPageAdapter(fragmentActivity:FragmentActivity): FragmentStateAdapter(fragmentActivity)  {

    override fun getItemCount(): Int{
        return 1
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return Menu_principal()
            1 -> return Camera()
            2 -> return Galeria()
            3 -> return Creditos()
            else -> return Menu_principal()
        }
    }
}