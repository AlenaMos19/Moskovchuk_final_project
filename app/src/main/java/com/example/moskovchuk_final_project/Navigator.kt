package com.example.moskovchuk_final_project

import androidx.fragment.app.Fragment

fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}

interface Navigator {

    fun showPersonageFragment()

    fun showLocationFragment()

    fun showEpisodesFragment()

}