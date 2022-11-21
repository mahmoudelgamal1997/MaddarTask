package com.example.maddartask

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.maddartask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var genderType= "male"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initSpinner()
        binding.apply {

            save.setOnClickListener {
                if (!name.text.toString().isNullOrEmpty()
                    && !age.text.toString().isNullOrEmpty()
                    && !jobTitle.text.toString().isNullOrEmpty()){

                    SharedHelper.saveString(this@MainActivity,SharedHelper.NAME,name.text.toString())
                    SharedHelper.saveString(this@MainActivity,SharedHelper.AGE,age.text.toString())
                    SharedHelper.saveString(this@MainActivity,SharedHelper.JOB,jobTitle.text.toString())
                    SharedHelper.saveString(this@MainActivity,SharedHelper.GENDER,genderType.toString())

                    Intent(this@MainActivity,InfromationActivity::class.java).let {
                        startActivity(it)
                    }

                    }
            }
        }


    }

    fun initSpinner(){
    val genderList = arrayListOf<String>("male","female")
            val adapter = ArrayAdapter(this,
                R.layout.simple_spinner_item, genderList)
            binding.gender.adapter = adapter
        binding.gender.onItemSelectedListener = object: AdapterView.OnItemClickListener,
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                genderType=genderList[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

        }
    }





// new commit



}