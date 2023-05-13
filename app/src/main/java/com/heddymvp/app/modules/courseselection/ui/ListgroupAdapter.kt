package com.heddymvp.app.modules.courseselection.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.heddymvp.app.R
import com.heddymvp.app.databinding.RowListgroupBinding
import com.heddymvp.app.modules.courseselection.`data`.model.ListgroupRowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupAdapter(
  var list: List<ListgroupRowModel>
) : RecyclerView.Adapter<ListgroupAdapter.RowListgroupVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup,parent,false)
    return RowListgroupVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupVH, position: Int) {
    val listgroupRowModel = list[position]
    holder.binding.listgroupRowModel = listgroupRowModel

    holder.itemView.setOnClickListener {
      clickListener
    }
  }

  override fun getItemCount(): Int {
    return list.size
  }
  // TODO uncomment following line after integration with data source return list.size

  public fun updateData(newData: List<ListgroupRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListgroupRowModel
    )
  }

  inner class RowListgroupVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupBinding = RowListgroupBinding.bind(itemView)
  }
}
