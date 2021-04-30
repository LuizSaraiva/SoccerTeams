package com.project.soccerteams

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.project.soccerteams.model.Championship

class FragmentFirstAdapter(
    val idItemBottomView: Int,
    val listChampionship: List<Championship>,
    private val onClick: ((Int) -> Unit)
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
        holder.image.load(championship.image) {
            placeholder(R.drawable.ic_image)
            fallback(R.drawable.ic_image)
            error(R.drawable.ic_image)
        }
        holder.layout.setOnClickListener { onClick(championship.id) }
    }

    override fun getItemCount(): Int = listChampionship[idItemBottomView].listSoccerTeams.size
}

class ViewHolderFirst(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var txName = itemView.findViewById<TextView>(R.id.name_team)
    var image = itemView.findViewById<ImageView>(R.id.image_item)
    var layout = itemView.findViewById<CardView>(R.id.layoutItem)

}