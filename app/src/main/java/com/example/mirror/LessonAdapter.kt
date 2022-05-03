package com.example.mirror

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mirror.databinding.ItemBinding
import java.util.ArrayList


class LessonAdapter(private val data: ArrayList<Lesson>) :
    RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(data.get(position))
    }

    override fun getItemCount(): Int = data.size

    inner class LessonViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(lesson: Lesson) {
            if (lesson.color != null) {
                binding.mainLayout.setBackgroundColor(lesson.color!!)
            }
            binding.tvLesson.text=lesson.lesson

            Glide.with(binding.image).load(lesson.image).into(binding.image)
        }

    }
}