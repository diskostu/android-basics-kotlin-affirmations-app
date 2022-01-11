package de.diskostu.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.diskostu.affirmations.adapter.ItemAdapter
import de.diskostu.affirmations.data.DataSource
import de.diskostu.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val affirmations = DataSource().loadAffirmations()
        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, affirmations)

        // for performance reasons
        recyclerView.setHasFixedSize(true)
    }
}