package com.project.soccerteams.mock

import com.project.soccerteams.R
import com.project.soccerteams.singleton.SingletonChampionship
import com.project.soccerteams.model.Championship
import com.project.soccerteams.model.SoccerTeams

object MockChampionship {

    fun getData() {

        SingletonChampionship.list.add(

            Championship(
                1,
                "UEFA",
                arrayListOf(
                    SoccerTeams(1, "Atletico Madrid", 0),
                    SoccerTeams(2, "Real Madrid", 0),
                    SoccerTeams(3, "Barcelona", 0),
                    SoccerTeams(4, "Sevilha", 0),
                    SoccerTeams(5, "Real Sociedad", 0),
                    SoccerTeams(6, "Betis", 0),
                    SoccerTeams(7, "Villarreal", 0),
                    SoccerTeams(8, "Granada", 0),
                    SoccerTeams(9, "Celta de Vigo", 0),
                    SoccerTeams(10, "Ath. Bilbao", 0)
                )
            )
        )

        SingletonChampionship.list.add(
            Championship(
                2,
                "WorldCup",
                arrayListOf(
                    SoccerTeams(1, "Russia", R.drawable.russia),
                    SoccerTeams(2, "Alemanha", R.drawable.germany),
                    SoccerTeams(3, "Brasil", R.drawable.brazil),
                    SoccerTeams(4, "Portugal", R.drawable.portugal),
                    SoccerTeams(5, "Argentina", R.drawable.argentina),
                    SoccerTeams(6, "Belgica", R.drawable.belgium),
                    SoccerTeams(7, "Polonia", R.drawable.republic_of_poland),
                    SoccerTeams(8, "França", R.drawable.france),
                    SoccerTeams(9, "Espanha", R.drawable.spain),
                    SoccerTeams(10, "Peru", R.drawable.peru)
                )
            )
        )

    }
}