package com.wolken.navofthrones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.rhegar_fragment.*

class RhegarFragment : Fragment() {
    companion object {
        fun newInstance() = RhegarFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.rhegar_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button.setOnClickListener {


            view?.let {
                val action = RhegarFragmentDirections.actionRhegarFragmentToJohnSnowFragment()
                action.setWhoAmI(getString(R.string.prince))
                Navigation.findNavController(it).navigate(action)
            }

        }

    }
}