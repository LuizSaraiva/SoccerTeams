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
                    SoccerTeams(
                        1, "Atletico Madrid", R.drawable.atletico_madrid, "" +
                                "O Club Atlético de Madrid é um clube de futebol espanhol, sediado na cidade de Madrid, " +
                                "fundado em 26 de abril de 1903. Foi fundado como Athletic Club de Madrid por estudantes bascos " +
                                "simpatizantes do Athletic Bilbao"
                    ),
                    SoccerTeams(
                        2, "Real Madrid", R.drawable.real_madrid, "" +
                                "O Real Madrid Club de Fútbol, mais conhecido como Real Madrid ou simplesmente Real, é um clube " +
                                "polidesportivo espanhol, com sede em Madrid. Foi fundado oficialmente no dia 6 de março de 1902 " +
                                "pelos irmãos Juan Padrós e Carlos Padrós, com o nome de Madrid Foot-Ball Club"
                    ),
                    SoccerTeams(
                        3, "Barcelona", R.drawable.barcelona, "" +
                                "Futbol Club Barcelona, também conhecido como Barcelona e popularmente como Barça, é um clube de futebol " +
                                "profissional, com sede em Barcelona, Catalunha. Para a temporada 2020/2021, a equipe joga a La Liga, na Espanha. " +
                                "Fundado em 1899 por um grupo de futebolistas suíços, ingleses e catalães."
                    ),
                    SoccerTeams(
                        4, "Sevilha", R.drawable.sevillha, "" +
                                "O Sevilla Fútbol Club é um clube de futebol espanhol fundado em 25 de janeiro de 1890, na cidade de Sevilha. " +
                                "Manda seus jogos no Estádio Ramón Sánchez Pizjuán, localizado no bairro de Nervíon, tendo capacidade para 43.883 espectadores."
                    ),
                    SoccerTeams(
                        5, "Real Sociedad", R.drawable.real_sociedad, "" +
                                "A Real Sociedad de Fútbol é um clube de futebol localizado em San Sebastián, Guipúzcoa, mais especificamente em Paseo de Anoeta 1 20014 " +
                                "Donostia-San Sebastián. Fundado em 1909 e com quase 30.000 sócios, atualmente joga na Primeira Divisão Espanhola"
                    ),
                    SoccerTeams(
                        6, "Betis", R.drawable.betis, "" +
                                "O Real Betis Balompié é uma equipe de futebol espanhola da cidade de Sevilha. Está classificado na 10ª posição do ranking " +
                                "histórico da 1ª Divisão Espanhola, com 51 temporadas na divisão principal do futebol espanhol. Já ganhou uma vez a Liga, " +
                                "na temporada 1934/1935, e duas vezes a Copa del Rey, em 1977 e 2005"
                    ),
                    SoccerTeams(
                        7, "Villarreal", R.drawable.villarreal, "" +
                                "O Villarreal Club de Fútbol, também conhecido como submarino amarelo, é um clube de futebol espanhol, da cidade de " +
                                "Villarreal, na Província de Castellón. Foi fundado em 10 de março de 1923 e participa atualmente da Primeira Divisão Espanhola"
                    ),
                    SoccerTeams(
                        8, "Granada", R.drawable.granada, "" +
                                "O Granada Club de Fútbol, ou simplesmente Granada CF, é uma equipe espanhola de sociedade anônima " +
                                "da cidade de Granada, na Andaluzia. Seu acionista majoritário é o grupo chinês Desport e seu presidente" +
                                " é o chinês Jiang Lizhang"
                    ),
                    SoccerTeams(
                        9, "Celta de Vigo", R.drawable.celta_vigo, "" +
                                "O Real Club Celta de Vigo é um clube de futebol sediado na cidade de Vigo, na Galiza. Foi fundado em 23 de agosto de 1923 com a " +
                                "fusão de dois clubes, o Real Vigo Sporting e o Real Fortuna. Atualmente disputa a Primeira Divisão Espanhola"
                    ),
                    SoccerTeams(
                        10, "Ath. Bilbao", R.drawable.ath_bilbao, "" +
                                "O Athletic Club, mais conhecido na mídia lusófona como Athletic Bilbao, é um clube de futebol espanhol da cidade de Bilbau, " +
                                "e é um símbolo emblemático da identidade basca, por não permitir que atletas não nascidos, não desenvolvidos ou sem ascendência no " +
                                "País Basco possam vestir sua camisa"
                    )
                )
            )
        )

        SingletonChampionship.list.add(
            Championship(
                2,
                "WorldCup",
                arrayListOf(
                    SoccerTeams(
                        1, "Russia", R.drawable.russia,
                        "A Seleção Russa de Futebol representa a Rússia nas competições de futebol da FIFA. " +
                                "Surgiu após a dissolução da Seleção da CEI, criada apenas para disputar a Eurocopa de 1992, " +
                                "para a qual a seleção da URSS, extinta juntamente com o país no ano anterior, já estava classificada"
                    ),
                    SoccerTeams(
                        2, "Alemanha", R.drawable.germany,
                        "A Seleção Alemã de Futebol, é organizada pela Federação Alemã de Futebol, instituição que administra o " +
                                "futebol na Alemanha, e representa o país nas competições de futebol da UEFA e FIFA."
                    ),
                    SoccerTeams(
                        3, "Brasil", R.drawable.brazil, "" +
                                "A Seleção Brasileira de Futebol é o time nacional do Brasil de futebol masculino, gerido pela Confederação Brasileira " +
                                "de Futebol, que representa o país nas competições de futebol organizadas pela CONMEBOL e pela FIFA"
                    ),
                    SoccerTeams(
                        4, "Portugal", R.drawable.portugal, "" +
                                "A Seleção Portuguesa de Futebol é a equipa nacional de Portugal e representa o país nas competições internacionais de futebol. " +
                                "É gerida pela Federação Portuguesa de Futebol. A seleção estreou-se oficialmente a 18 de dezembro de 1921 contra a Espanha, " +
                                "jogo que acabou 3-1 a favor dos espanhóis."
                    ),
                    SoccerTeams(
                        5, "Argentina", R.drawable.argentina, "" +
                                "A Seleção Argentina de Futebol representa na Associação do Futebol Argentino nas competições de futebol da CONMEBOL e FIFA"
                    ),
                    SoccerTeams(
                        6, "Belgica", R.drawable.belgium, "" +
                                "A Seleção Belga de Futebol representa a Bélgica nas competições de futebol da Federação Internacional de Futebol. É organizada " +
                                "pela Real Associação Belga de Futebol"
                    ),
                    SoccerTeams(
                        7, "Polonia", R.drawable.republic_of_poland, "" +
                                "A Seleção Polonesa de Futebol ou Selecção Polaca de Futebol AO 1945: representa a Polônia nas competições de futebol da UEFA e FIFA"
                    ),
                    SoccerTeams(
                        8, "França", R.drawable.france, "" +
                                "A Seleção Francesa de Futebol representa a França nas competições de futebol da UEFA e FIFA."
                    ),
                    SoccerTeams(
                        9, "Espanha", R.drawable.spain, "" +
                                "A Seleção Espanhola de Futebol é organizada pela Real Federação Espanhola de Futebol. É uma das confederações fundadoras da FIFA e um " +
                                "dos países com mais participações em Copas do Mundo."
                    ),
                    SoccerTeams(
                        10, "Peru", R.drawable.peru, "" +
                                "A Seleção Peruana de Futebol representa o Peru nas competições de futebol da FIFA"
                    )
                )
            )
        )
    }
}