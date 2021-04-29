package com.project.soccerteams.view

import android.graphics.drawable.Drawable
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.project.soccerteams.R
import com.project.soccerteams.model.Championship

class FragmentSecondAdapter(
    val idItemBottomView: Int,
    val listChampionship: List<Championship>,
    private val onClick: ((Int) -> Unit)
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
        holder.image.load(championship.image)
        holder.layout.setOnClickListener { onClick(championship.id) }
    }

    override fun getItemCount(): Int = listChampionship[idItemBottomView].listSoccerTeams.size
}

class ViewHolderSecond(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val image = itemView.findViewById<ImageView>(R.id.image_item)
    val txName = itemView.findViewById<TextView>(R.id.name_team)
    val layout = itemView.findViewById<CardView>(R.id.layoutItem)
}