package com.project.soccerteams

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentFirst : Fragment() {

    lateinit var rv_first : RecyclerView
    val idItemBottomView:Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val adapter = FragmentFirstAdapter(idItemBottomView, SingletonChampionship.list)

        rv_first = view.findViewById(R.id.rv_first)
        var layoutManager = LinearLayoutManager(view.context)
        rv_first.layoutManager = layoutManager
        rv_first.adapter = adapter

        return view

    }
}