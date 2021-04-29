package com.project.soccerteams.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.soccerteams.R
import com.project.soccerteams.model.Championship

class FragmentSecondAdapter(
    val idItemBottomView: Int,
    val listChampionship: List<Championship>
) :
    RecyclerView.Adapter<ViewHolderSecond>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderSecond {
        return ViewHolderSecond(
            LayoutInflater.from(parent.context).inflate(R.layout.item_soccerteams, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderSecond, position: Int) {
        var championship = listChampionship[idItemBottomView].listSoccerTeams[position]
        holder.txName.text = championship.name
    }

    override fun getItemCount(): Int = listChampionship[idItemBottomView].listSoccerTeams.size
}

class ViewHolderSecond(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var txName = itemView.findViewById<TextView>(R.id.name_team)

}