package com.example.radiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.radiogroup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener{ group, checkedID ->
            when(checkedID){
                R.id.bd ->{
                    Toast.makeText(this, "Clicked "+checkedID, Toast.LENGTH_SHORT).show()
                }
                R.id.ENG ->{
                    Toast.makeText(this, "Clicked "+checkedID, Toast.LENGTH_SHORT).show()
                }
                R.id.In ->{
                    Toast.makeText(this, "Clicked "+checkedID, Toast.LENGTH_SHORT).show()
                }
                R.id.Ger ->{
                    Toast.makeText(this, "Clicked "+checkedID, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}