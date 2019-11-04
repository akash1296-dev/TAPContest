package com.example.tapcontest.data

class DataSource {
    /*private var contestList: List<ContestModel> = listOf(ContestModel(1,"Title of the Contest id-1","Small description of Contest Small description of Contest 1",0),
                                                            ContestModel(1,"Title of the Contest id-2","Small description of Contest Small description of Contest 2",0))

    fun getContentList(): List<ContestModel> {
        return contestList
    }*/

    companion object {
        private val contestList = ArrayList<ContestModel>()
        fun createContestList() {
            contestList.add(ContestModel(1,"Title of the Contest id-1","Small description of Contest Small description of Contest 1",0))
            contestList.add(ContestModel(2,"Title of the Contest id-2","Small description of Contest Small description of Contest 2",0))
            contestList.add(ContestModel(3,"Title of the Contest id-3","Small description of Contest Small description of Contest 3",0))
            contestList.add(ContestModel(4,"Title of the Contest id-4","Small description of Contest Small description of Contest 4",0))
        }

        fun getContestList(): List<ContestModel> {
            return contestList
        }
    }
}