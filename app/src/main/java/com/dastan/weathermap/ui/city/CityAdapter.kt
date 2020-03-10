package com.dastan.weathermap.ui.city
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dastan.weathermap.model.country.Countries
import com.dastan.weathermap.R
import kotlinx.android.synthetic.main.item_city.view.*

class CityAdapter(private var list: List<Countries>) : RecyclerView.Adapter<CityAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_city,parent,false)
    )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(countries: Countries) {
            itemView.city_name.text = countries.capital
            itemView.country_name.text = countries.name
        }

    }
}