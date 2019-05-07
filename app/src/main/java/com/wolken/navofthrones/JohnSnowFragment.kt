package com.wolken.navofthrones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.john_snow_fragment.*

class JohnSnowFragment : Fragment() {
    companion object {
        fun newInstanc() = JohnSnowFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.john_snow_fragment,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        arguments?.let {

            val safeArgs = JohnSnowFragmentArgs.fromBundle(it)
            whoAmI.text = safeArgs.whoAmI
        }
    }
}