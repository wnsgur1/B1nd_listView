package kr.hs.dgsw.bind_listview

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageButton
import kr.hs.dgsw.bind_listview.adapter.Adapter
import kr.hs.dgsw.bind_listview.databinding.ActivityDetailPageBinding
//import kr.hs.dgsw.bind_listview.model.DetailItem

class DetailPageActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        initBackBtn()
        initData()

    }


    @SuppressLint("WrongViewCast")
    private fun initBackBtn() {
        val backBtn = findViewById<AppCompatImageButton>(R.id.imageButton)
        backBtn.setOnClickListener {
            finish()
        }
    }

    private fun initData(){
        val intent = intent
        val index = intent.getIntExtra("index", 0)
        val item = Util.itemList[index]

        val detailImg = findViewById<ImageView>(R.id.imageView2)
        val detailTitle = findViewById<TextView>(R.id.Dtitle)
        val detailName = findViewById<TextView>(R.id.Dname)
        val detailDay = findViewById<TextView>(R.id.day)
        val detailCuntent = findViewById<TextView>(R.id.cuntent)



        detailImg.setImageResource(item.image)
        detailTitle.text = item.title
        detailName.text = item.name
        detailDay.text = item.day
        detailCuntent.text = item.cuntent
    }
}