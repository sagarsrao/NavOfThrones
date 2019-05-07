package com.wolken.navofthrones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.lyanna_fragment.*

class LyannaFragment : Fragment() {
    companion object {
        fun newInstanc() = LyannaFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.lyanna_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button.setOnClickListener {

            view?.let {
                val action = LyannaFragmentDirections.actionLyannaFragmentToJohnSnowFragment()
                action.setWhoAmI(getString(R.string.jon_snow))
                Navigation.findNavController(it).navigate(action)
            }

        }
    }
}