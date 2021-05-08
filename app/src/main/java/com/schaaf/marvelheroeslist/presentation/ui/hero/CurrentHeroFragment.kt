package com.schaaf.marvelheroeslist.presentation.ui.hero

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.schaaf.marvelheroeslist.R

class CurrentHeroFragment : Fragment() {

    companion object {
        fun newInstance() = CurrentHeroFragment()
    }

    private lateinit var viewModel: CurrentHeroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_current_hero, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrentHeroViewModel::class.java)
        // TODO: Use the ViewModel
    }

}