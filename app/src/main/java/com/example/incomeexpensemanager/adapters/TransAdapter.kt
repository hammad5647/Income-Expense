package com.example.incomeexpensemanager.adapters

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.SurfaceControl.Transaction
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.incomeexpensemanager.R
import com.example.incomeexpensemanager.databinding.EntrySampleBinding
import com.example.incomeexpensemanager.entity.Entity

class TransAdapter(private val transaction: MutableList<Entity>) :
    RecyclerView.Adapter<TransAdapter.TransViewHolder>() {
    class TransViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding = EntrySampleBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.entry_sample, parent, false)
        return TransViewHolder(view)

    }

    override fun getItemCount(): Int {
        return transaction.size
    }

    override fun onBindViewHolder(holder: TransViewHolder, position: Int) {

    }
}