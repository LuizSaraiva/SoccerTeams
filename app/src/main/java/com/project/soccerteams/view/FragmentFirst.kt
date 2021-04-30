package com.project.soccerteams.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.soccerteams.ActivityDestailsTeams
import com.project.soccerteams.FragmentFirstAdapter
import com.project.soccerteams.R
import com.project.soccerteams.singleton.SingletonChampionship

class FragmentFirst : Fragment() {

    lateinit var rv_first: RecyclerView
    val idItemBottomView: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        rv_first = view.findViewById(R.id.rv_first)
        var layoutManager = LinearLayoutManager(view.context)
        rv_first.layoutManager = layoutManager
        rv_first.adapter = FragmentFirstAdapter(
            idItemBottomView,
            SingletonChampionship.list
        ) { onClickItemRecycleView(view.context, 0, it) }

        return view
    }

    private fun onClickItemRecycleView(context: Context, idChampionship: Int, idTeam: Int) {
        var intent = Intent(context, ActivityDestailsTeams::class.java)
            .putExtra("idChamphionship", idChampionship)
            .putExtra("idTeam", idTeam)
        startActivity(intent)
    }

}