package com.example.tapcontest.ui


import android.os.Bundle
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tapcontest.R
import com.example.tapcontest.data.DataSource
import kotlinx.android.synthetic.main.list_recycler_view.*

/**
 * A simple [Fragment] subclass.
 */
class ContestListFragment : Fragment() {

    private val TAG = "ContestListFragment"

    companion object {
        fun newInstance(): ContestListFragment {
            return ContestListFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        d(TAG, "onCreateView")
        return inflater.inflate(R.layout.list_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        d(TAG, "onViewCreated")
        DataSource.createContestList()
        rv_list.layoutManager = LinearLayoutManager(context)
        rv_list.adapter = CustomAdapterDataBinding(DataSource.getContestList())
    }


}
