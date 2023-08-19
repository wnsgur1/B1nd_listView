package kr.hs.dgsw.bind_listview

import kr.hs.dgsw.bind_listview.model.Item

object Util {
    var itemList = arrayListOf<Item>()

    fun addItemFor() {
        for (i in 1..100) {
            itemList.add(
                Item(
                    i,
                    "맥북${i}",
                    "한준혁${i}",
                    R.drawable.macbook,
                    "2012-05-23",
                    "찾아주세요"
                )
            )

        }

    }

}