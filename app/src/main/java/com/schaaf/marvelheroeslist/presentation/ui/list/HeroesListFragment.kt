package com.schaaf.marvelheroeslist.presentation.ui.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.schaaf.marvelheroeslist.R

class HeroesListFragment : Fragment() {

    companion object {
        fun newInstance() = HeroesListFragment()
    }

    private lateinit var viewModel: HeroesListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_heroes_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HeroesListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}