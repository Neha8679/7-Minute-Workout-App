package com.neha.a7minuteworkoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import com.neha.a7minuteworkoutapp.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {
    private var binding : ActivityExerciseBinding ? = null
    private var restTimer : CountDownTimer? =null
    private var restProgress =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarExercise)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolbarExercise?.setNavigationOnClickListener{
            onBackPressed()
        }
        setUpRestView()

    }

    private fun setUpRestView(){
        if(restTimer != null){
            restTimer?.cancel()
            restProgress=0
        }

        setRestProgressBar()

    }
    private fun setRestProgressBar(){
        binding?.ProgressBar?.progress = restProgress
         restTimer = object: CountDownTimer(10000, 1000){
             override fun onTick(millisUntilFinished: Long) {
                 restProgress++
                 binding?.ProgressBar?.progress = 10 - restProgress
                 binding?.tvTimer?.text = (10 - restProgress).toString()
             }

             override fun onFinish() {
                 Toast.makeText(
                     this@ExerciseActivity,"Here now we will start the exercise.",Toast.LENGTH_SHORT
                 ).show()
             }

         }.start()
    }

    override fun onDestroy() {
        super.onDestroy()

        if(restTimer != null){
            restTimer?.cancel()
            restProgress=0
        }
        binding=null
    }
}