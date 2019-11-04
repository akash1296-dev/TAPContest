package com.example.tapcontest.data

import com.example.tapcontest.CustomViewModel
import com.example.tapcontest.R

data class ContestModel(
    val id: Int,
    val title: String,
    val smallDescription: String,
    val isParticipated: Int
) : CustomViewModel() {

    override val layoutIdentifier: Int
        get() = R.layout.row_contest_list
}