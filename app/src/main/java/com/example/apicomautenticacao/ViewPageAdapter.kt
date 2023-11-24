package com.example.apicomautenticacao

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.apicomautenticacao.fragmentos.*


class ViewPageAdapter(fragmentActivity:FragmentActivity): FragmentStateAdapter(fragmentActivity)  {

    override fun getItemCount(): Int{
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return menu_principal()
            1 -> return camera()
            2 -> return galeria()
            3 -> return creditos()
            else -> return menu_principal()
        }
    }
}