package com.example.pc2fp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pc2fp.R
import com.example.pc2fp.model.EquiposModel

class EquiposAdapter (private var lstEquipo: List<EquiposModel>): RecyclerView.Adapter<EquiposAdapter.ViewHolder>(){

    class ViewHolder {

        val tvEquipo: TextView = itemView.findViewById(R.id.tvEquipo)
        val tvFundacion: TextView = itemView.findViewById(R.id.tvFundacion)
        val tvTitulos: TextView = itemView.findViewById(R.id.tvTitulos)
        val ivImagenEquipo: ImageView = itemView.findViewById(R.id.ivImagenEquipo)
        

    }


}