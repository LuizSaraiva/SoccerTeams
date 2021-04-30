package com.project.soccerteams

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import coil.load
import com.project.soccerteams.model.Championship
import com.project.soccerteams.model.SoccerTeams
import com.project.soccerteams.singleton.SingletonChampionship
import org.w3c.dom.Text

class ActivityDestailsTeams : AppCompatActivity() {

    lateinit var imageTeam:ImageView
    lateinit var nameTeam:TextView
    lateinit var descTeam:TextView

    var idChampionship:Int = 0
    var idTeam:Int = 0

    val championship = SingletonChampionship


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_teams)
        initComponents()
        getExtra()
        applyDatailsTeam()
    }

    private fun getExtra(){
        idChampionship = intent.getIntExtra("idChamphionship",0)
        idTeam = intent.getIntExtra("idTeam",0)
    }

    private fun initComponents(){
        nameTeam = findViewById(R.id.name_team)
        imageTeam = findViewById(R.id.image_team_detail)
        descTeam = findViewById(R.id.desc_team)
    }

    private fun applyDatailsTeam(){

        var soccerTeams = championship.list[idChampionship].listSoccerTeams[idTeam-1]

        nameTeam.text = soccerTeams.name
        descTeam.text = soccerTeams.info
        imageTeam.load(soccerTeams.image)
    }

}