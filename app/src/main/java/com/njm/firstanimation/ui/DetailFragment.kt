package com.njm.firstanimation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.card.MaterialCardView
import com.njm.firstanimation.R
import com.njm.firstanimation.databinding.FragmentDetailBinding
import com.njm.firstanimation.model.Place
import de.hdodenhof.circleimageview.CircleImageView

class DetailFragment() : Fragment() {

    private val args : DetailFragmentArgs by navArgs()
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        setView()
        setAnimation()
        backFragment()
        return view
    }

    private fun setView() {
        val placeDetail = args.place
        binding.imageDetailMain.setImageResource(placeDetail.imgPlace[0])
        binding.imagePerfil.setImageResource(placeDetail.author.imgProfile)
        binding.titlePlace.text = placeDetail.name
        binding.descriptionPlace.text = placeDetail.description
        binding.titleDato1.text = "Ubicación"
        binding.titleDato2.text = "Población"
        binding.titleDato3.text = "Superficie"
        binding.dato1.text = placeDetail.ubicacion
        binding.dato2.text = placeDetail.poblacion
        binding.dato3.text = placeDetail.superficie
        binding.detailImagenSecundaria.setImageResource(placeDetail.imgPlace[1])
        binding.detailImagenTercera.setImageResource(placeDetail.imgPlace[2])
    }

    private fun setAnimation() {
        //declare animation
        val upToDown = AnimationUtils.loadAnimation(context, R.anim.up_to_down)
        val slideIn = AnimationUtils.loadAnimation(context, R.anim.slide_in)
        val downToUp = AnimationUtils.loadAnimation(context, R.anim.down_to_up_1)
        //set animation
        binding.detailCardPrincipal.startAnimation(upToDown)
        binding.titlePlace.startAnimation(slideIn)
        binding.descriptionPlace.startAnimation(slideIn)
        binding.titleDato1.startAnimation(slideIn)
        binding.titleDato2.startAnimation(slideIn)
        binding.titleDato3.startAnimation(slideIn)
        binding.dato1.startAnimation(slideIn)
        binding.dato2.startAnimation(slideIn)
        binding.dato3.startAnimation(slideIn)
        binding.tileDivider.startAnimation(slideIn)
        binding.titleSecundario.startAnimation(downToUp)
        binding.detailCardSecundaria.startAnimation(downToUp)
        binding.detailCardTercera.startAnimation(downToUp)
    }

    private fun backFragment(){
        binding.btnBack.setOnClickListener {
            val action = DetailFragmentDirections.actionDetailFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}