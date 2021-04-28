package com.project.soccerteams.mock

import com.project.soccerteams.SingletonChampionship
import com.project.soccerteams.model.Championship
import com.project.soccerteams.model.SoccerTeams

object MockChampionship {

    fun getData() {

        SingletonChampionship.list.add(

            Championship(
                1,
                "UEFA",
                arrayListOf<SoccerTeams>(
                    SoccerTeams(7, "Villarreal"),
                    SoccerTeams(8, "Granada"),
                    SoccerTeams(9, "Celta de Vigo"),
                    SoccerTeams(10, "Ath. Bilbao"),
                    SoccerTeams(11, "Osasuna"),
                    SoccerTeams(12, "Levante"),
                    SoccerTeams(13, "Cadiz"),
                    SoccerTeams(14, "Valencia"),
                    SoccerTeams(15, "Getafe"),
                    SoccerTeams(16, "Alaves"),
                    SoccerTeams(17, "Elche"),
                    SoccerTeams(18, "Real Valladolid"),
                    SoccerTeams(19, "Huesca"),
                    SoccerTeams(20, "Eibar")
                )
            )

        )
    }
}