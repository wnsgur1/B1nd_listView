package kr.hs.dgsw.bind_listview.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kr.hs.dgsw.bind_listview.R
import kr.hs.dgsw.bind_listview.model.Item

class Adapter (
    val context: Context,
    val itemList: ArrayList<Item>,
    val callback: (Int) -> Unit
) : BaseAdapter() {

    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): Any {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item, null)
        val itemPhoto = view.findViewById<ImageView>(R.id.imageView)
        val itemTitle = view.findViewById<TextView>(R.id.title)
        val itemName = view.findViewById<TextView>(R.id.name)



        val item = itemList[position]
//        val resourceId = context.resources.getIdentifier(item.image, "drawable", context.packageName)
        itemPhoto.setImageResource(item.image)
        itemTitle.text = item.title
        itemName.hint = item.name

        view.setOnClickListener {
            callback(item.index)
        }

        return view
    }

}