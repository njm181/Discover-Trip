package com.njm.firstanimation.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.njm.firstanimation.R
import com.njm.firstanimation.databinding.ItemDestinoHomeBinding
import com.njm.firstanimation.model.Place


class PlaceAdapterHolder(private var listOfPlace: List<Place>, private var context: Context): RecyclerView.Adapter<PlaceAdapterHolder.PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_destino_home, parent, false)
        return PlaceViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfPlace.size
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.imagenPerfil.setImageResource(listOfPlace[position].author.imgProfile)
        holder.nameAutor.text = listOfPlace[position].author.name
        holder.recommendationAutor.text = listOfPlace[position].author.recommendationPlace
        holder.imagenPrincipal.setImageResource(listOfPlace[position].imgPlace[0])
        holder.imagenSecundaria.setImageResource(listOfPlace[position].imgPlace[1])
        holder.imagenTercera.setImageResource(listOfPlace[position].imgPlace[2])
        holder.tituloPricipal.text = listOfPlace[position].name
        //declare the animation and set animation
        setAnimation(holder)
        setItemsClick(holder, listOfPlace[position])
    }

    private fun setItemsClick(holder: PlaceViewHolder, place: Place) {
        holder.cardAutor.setOnClickListener {
            navigateToDetail(holder, place)
        }
        holder.cardImagenPrincipal.setOnClickListener {
            navigateToDetail(holder, place)
        }
        holder.cardImagenSecundaria.setOnClickListener {
            navigateToDetail(holder, place)
        }
        holder.cardImagenTercera.setOnClickListener {
            navigateToDetail(holder, place)
        }
    }

    private fun navigateToDetail(holder: PlaceViewHolder, place: Place) {
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(place = place)
        holder.itemView.findNavController().navigate(action)
    }

    private fun setAnimation(holder: PlaceViewHolder) {
        //declare
        val titleAnim = AnimationUtils.loadAnimation(context, R.anim.up_to_down)
        val imagelAnim = AnimationUtils.loadAnimation(context, R.anim.image_anim)
        val textAnim = AnimationUtils.loadAnimation(context, R.anim.slide_in)
        //set
        holder.containerMain.startAnimation(titleAnim)
        holder.cardImagenPrincipal.startAnimation(imagelAnim)
        holder.cardImagenSecundaria.startAnimation(imagelAnim)
        holder.cardImagenTercera.startAnimation(imagelAnim)
        holder.tituloPricipal.startAnimation(imagelAnim)
        holder.cardAutor.startAnimation(textAnim)
        holder.nameAutor.startAnimation(textAnim)
        holder.imagenPerfil.startAnimation(imagelAnim)
        holder.recommendationAutor.startAnimation(textAnim)
        holder.cardImagePerfil.startAnimation(textAnim)
    }


    inner class PlaceViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val binding = ItemDestinoHomeBinding.bind(v)
        var containerMain: ConstraintLayout = binding.constraintMain
        var cardAutor: MaterialCardView = binding.materialCardView
        var imagenPerfil: ImageView = binding.perfilAutor
        var cardImagePerfil: MaterialCardView = binding.cardPerfilAutor
        var nameAutor: TextView = binding.nombreAutor
        var recommendationAutor: TextView = binding.descripcionAutor
        var imagenPrincipal: ImageView = binding.imagePrincipal
        var tituloPricipal: TextView = binding.tituloImagenPrincipal
        var imagenSecundaria: ImageView = binding.imagenSecundaria
        var imagenTercera: ImageView = binding.imagenTercera
        var cardImagenPrincipal: MaterialCardView = binding.cardImagenPrincipal
        var cardImagenSecundaria: MaterialCardView = binding.cardImagenSecundaria
        var cardImagenTercera: MaterialCardView = binding.cardImagenTercera

    }


}
