package com.example.tapcontest.ui


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.tapcontest.BR
import com.example.tapcontest.CustomViewModel

class CustomAdapterDataBinding(private val listCustomModel: List<CustomViewModel>) :
    RecyclerView.Adapter<CustomAdapterDataBinding.ViewHolder>() {

    class ViewHolder(private val bind: ViewDataBinding) : RecyclerView.ViewHolder(bind.root) {
        fun getBinding(): ViewDataBinding {
            return bind
        }
    }

    override fun getItemViewType(position: Int): Int {
        return listCustomModel[position].layoutIdentifier
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bind = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), viewType, parent, false
        )
        return ViewHolder(bind)
    }

    override fun getItemCount(): Int {
        return listCustomModel.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBinding().setVariable(BR.group, listCustomModel[position])
        holder.getBinding().executePendingBindings()
    }

}