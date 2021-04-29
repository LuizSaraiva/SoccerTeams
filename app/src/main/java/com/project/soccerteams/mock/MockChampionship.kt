package com.project.soccerteams.mock

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
                    SoccerTeams(1, "Atletico Madrid"),
                    SoccerTeams(2, "Real Madrid"),
                    SoccerTeams(3, "Barcelona"),
                    SoccerTeams(4, "Sevilha"),
                    SoccerTeams(5, "Real Sociedad"),
                    SoccerTeams(6, "Betis"),
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

        SingletonChampionship.list.add(
            Championship(
                2,
                "WorldCup",
                arrayListOf(
                    SoccerTeams(1, "Russia"),
                    SoccerTeams(2, "Alemanha"),
                    SoccerTeams(3, "Brasil"),
                    SoccerTeams(4, "Portugal"),
                    SoccerTeams(5, "Argentina"),
                    SoccerTeams(6, "Belgica"),
                    SoccerTeams(7, "Polonia"),
                    SoccerTeams(8, "França"),
                    SoccerTeams(9, "Espanha"),
                    SoccerTeams(10, "Peru"),
                    SoccerTeams(11, "Suiça"),
                    SoccerTeams(12, "Inglaterra"),
                    SoccerTeams(13, "Colombia"),
                    SoccerTeams(14, "Mexico"),
                    SoccerTeams(15, "Uruguai"),
                    SoccerTeams(16, "Croacia"),
                    SoccerTeams(17, "Dinamarca"),
                    SoccerTeams(18, "Islandia"),
                    SoccerTeams(19, "Costa Rica"),
                    SoccerTeams(20, "Suecia"),
                    SoccerTeams(21, "Tunisia"),
                    SoccerTeams(22, "Egito"),
                    SoccerTeams(23, "Senegal"),
                    SoccerTeams(24, "Ira"),
                    SoccerTeams(25, "Servia"),
                    SoccerTeams(26, "Nigeria"),
                    SoccerTeams(27, "Australia"),
                    SoccerTeams(28, "Japao"),
                    SoccerTeams(29, "Marrocos"),
                    SoccerTeams(30, "Panama"),
                    SoccerTeams(31, "Coreia do Sul"),
                    SoccerTeams(31, "Arabia Saudita"),
                )
            )
        )

    }
}