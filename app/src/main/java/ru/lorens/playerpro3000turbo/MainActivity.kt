package ru.lorens.playerpro3000turbo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import ru.lorens.playerpro3000turbo.adapters.MainRecyclerAdapter
import ru.lorens.playerpro3000turbo.decorations.SongsItemDecoration
import ru.lorens.playerpro3000turbo.model.SongsRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAdapter = MainRecyclerAdapter(SongsRepository.songsList)
        mainRecycler.adapter = myAdapter
        ContextCompat.getDrawable(this, R.drawable.items_divider)?.let { SongsItemDecoration(it) }?.let { mainRecycler.addItemDecoration(it) }
    }
}
