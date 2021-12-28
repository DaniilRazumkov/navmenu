package com.example.draver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.draver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            navigation.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.item1 -> Toast.makeText(this@MainActivity,"Item 1",Toast.LENGTH_SHORT).show()
                    R.id.item2-> Toast.makeText(this@MainActivity,"Item 2",Toast.LENGTH_SHORT).show()
                    R.id.item3-> Toast.makeText(this@MainActivity,"Item 3",Toast.LENGTH_SHORT).show()
                    R.id.item4-> Toast.makeText(this@MainActivity,"Item 4",Toast.LENGTH_SHORT).show()
                    R.id.item21-> Toast.makeText(this@MainActivity,"Item 2-1",Toast.LENGTH_SHORT).show()
                    R.id.item22-> Toast.makeText(this@MainActivity,"Item 2-2",Toast.LENGTH_SHORT).show()
                    R.id.item23-> Toast.makeText(this@MainActivity,"Item 2-3",Toast.LENGTH_SHORT).show()
                    R.id.item24-> Toast.makeText(this@MainActivity,"Item 2-4",Toast.LENGTH_SHORT).show()
                }
                drawer.closeDrawer(GravityCompat.START)
                true
            }
            oppen.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }
}