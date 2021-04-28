package com.project.soccerteams

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.project.soccerteams.model.Championship

class FragmentFirstAdapter(
    val idItemBottomView: Int,
    val listChampionship: List<Championship>
) :
    RecyclerView.Adapter<ViewHolderFirst>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderFirst {
        return ViewHolderFirst(
            LayoutInflater.from(parent.context).inflate(R.layout.item_soccerteams, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderFirst, position: Int) {
        var championship = listChampionship[idItemBottomView].listSoccerTeams[position]
        holder.txName.text = championship.name
    }

    override fun getItemCount(): Int = listChampionship[idItemBottomView].listSoccerTeams.size
}

class ViewHolderFirst(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var txName = itemView.findViewById<TextView>(R.id.name_team)

}