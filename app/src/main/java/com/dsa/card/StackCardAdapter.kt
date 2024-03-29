package com.dsa.card

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.amyu.sample.CardViewHolder


class StackCardAdapter(context: Context) : ListAdapter<CardViewModel, CardViewHolder>(diffUtil) {
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<CardViewModel>() {
            override fun areItemsTheSame(oldItem: CardViewModel, newItem: CardViewModel): Boolean =
                    oldItem == newItem

            override fun areContentsTheSame(oldItem: CardViewModel, newItem: CardViewModel): Boolean =
                    oldItem == newItem
        }
    }

    private val inflater = LayoutInflater.from(context)

    var onItemClickListener: ((cardView: CardView, cardViewModel: CardViewModel) -> Unit)? = null

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): CardViewHolder = CardViewHolder.create(inflater, parent, false)

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) = holder.bind(getItem(position), onItemClickListener)
}