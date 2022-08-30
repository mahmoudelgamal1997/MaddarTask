package com.example.maddartask

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.maddartask.databinding.ActivityInfromationBinding

class InfromationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfromationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInfromationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            nameView.text="Name: ${SharedHelper.getString(this@InfromationActivity,SharedHelper.NAME)}"
            genderView.text="Gender : ${SharedHelper.getString(this@InfromationActivity,SharedHelper.GENDER)}"
            ageView.text="Age: ${SharedHelper.getString(this@InfromationActivity,SharedHelper.AGE)}"
            JobView.text="Job: ${SharedHelper.getString(this@InfromationActivity,SharedHelper.JOB)}"
        }

    }
}