package com.example.mirror

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mirror.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: LessonAdapter
    private val data = arrayListOf<Lesson>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(LayoutInflater.from(requireContext()),container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter= LessonAdapter(data)
        binding.recycler.layoutManager= GridLayoutManager(requireContext(),2)
        binding.recycler.adapter=adapter
    }

    private fun loadData() {
        data.add(Lesson("History",R.color.purple_200,"https://gogeticon.net/files/2097675/e7dcaeb11dc3b9ea3b99495a57f53896.png"))
    }

}