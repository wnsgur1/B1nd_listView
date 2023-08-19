package kr.hs.dgsw.bind_listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kr.hs.dgsw.bind_listview.Util.itemList
import kr.hs.dgsw.bind_listview.adapter.Adapter
import kr.hs.dgsw.bind_listview.databinding.ActivityMainBinding
import kr.hs.dgsw.bind_listview.model.Item

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Util.addItemFor()

        val itemAdapter = Adapter(this, itemList, callback = {
            val intent = Intent(this, DetailPageActivity::class.java)
            intent.putExtra("index", it)
            startActivity(intent)
        })

        val mainListView = findViewById<ListView>(R.id.mainListView)
        mainListView.adapter = itemAdapter


    }
}
