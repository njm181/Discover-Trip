package com.njm.firstanimation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.njm.firstanimation.R
import com.njm.firstanimation.databinding.FragmentHomeBinding
import com.njm.firstanimation.model.Place
import com.njm.firstanimation.utils.listOfPlace

class HomeFragment : Fragment(){

    private lateinit var recycler: RecyclerView
    private lateinit var adapterHolder: PlaceAdapterHolder
    private lateinit var title: TextView
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        title = binding.titleMain
        val titleAnim = AnimationUtils.loadAnimation(context, R.anim.slide_in)
        title.startAnimation(titleAnim)
        recycler = binding.recycler
        var layoutManager = LinearLayoutManager(context)
        recycler.layoutManager = layoutManager
        adapterHolder = PlaceAdapterHolder(listOfPlace, requireContext())
        recycler.adapter = adapterHolder
        return view
    }

}