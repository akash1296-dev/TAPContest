package com.example.tapcontest.ui


import android.database.Observable
import android.os.Bundle
import android.util.Log.d
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tapcontest.R
import com.example.tapcontest.data.ContestModel
import com.example.tapcontest.data.DataSource
import io.reactivex.Observable.*
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * A simple [Fragment] subclass.
 */
class ContestListFragment : Fragment() {

    private val TAG = "ContestListFragment"
    lateinit var contestListObservable : io.reactivex.Observable<ContestModel>

    companion object {
        fun newInstance(): ContestListFragment{
            return ContestListFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contest_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        d(TAG,"onViewCreated")
         contestListObservable = fromIterable(DataSource.getContestList()).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
        loadData()
    }

    private fun loadData() {
        contestListObservable.subscribe(object : Observer<ContestModel> {
            override fun onComplete() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onSubscribe(d: Disposable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onNext(t: ContestModel) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onError(e: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

    }


}
