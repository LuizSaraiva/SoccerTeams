package com.project.soccerteams.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.soccerteams.R
import com.project.soccerteams.singleton.SingletonChampionship

class FragmentSecond : Fragment() {

    lateinit var rv_second: RecyclerView
    val idItemBottomView: Int = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_second, container, false)

        rv_second = view.findViewById(R.id.rv_second)
        val layoutManager = LinearLayoutManager(view.context)
        rv_second.layoutManager = layoutManager
        rv_second.adapter = FragmentSecondAdapter(idItemBottomView, SingletonChampionship.list)

        return view
    }
}