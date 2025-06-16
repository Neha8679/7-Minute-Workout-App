package com.neha.a7minuteworkoutapp

import android.content.Intent
import android.content.IntentSender.OnFinished
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.neha.a7minuteworkoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private var binding : ActivityMainBinding?= null
//    private var countDownTimer: CountDownTimer? = null
//    private var timerDuration: Long = 60000
//    private var pauseOffset: Long = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding?.root)
//        setSupportActionBar(toolbar )
//        tvTimer.text = "${(timerDuration/1000).toString()}"

        val flStartButton : FrameLayout = findViewById(R.id.flStart)
//        btnStart.setOnClickListener{
//            startTimer(pauseOffset)
//        }
        binding?.flStart?.setOnClickListener {
            val intent =Intent(this,ExerciseActivity::class.java)
            startActivity(intent)

        }
//        btnPause.setOnClickListener{
//            pauseTimer()
//        }
//
//        btnStop.setOnClickListener{
//            resetTimer()
//        }
    }

//    private fun startTimer(pauseOffsetL: Long){
//        countDownTimer = object : CountDownTimer(timerDuration - pauseOffsetL,1000){
//            override fun onTick(millisUnitFinished: Long) {
//                pauseOffset=timerDuration - millisUnitFinished
//                tvTimer.text = (millisUnitFinished/1000).toString()
//            }
//
//            override fun onFinish() {
//                Toast.makeText(this@MainActivity,"Timer is finished.",Toast.LENGTH_SHORT).show()
//            }
//        }.start()
//    }

//    private fun pauseTimer(){
//        if(countDownTimer!=null){
//            countDownTimer!!.cancel()
//        }
//    }


//    private fun resetTimer(){
//        if(countDownTimer !=null){
//            countDownTimer!!.cancel()
//            tvTimer.text="${(timerDuration/1000).toString()}"
//            countDownTimer = null
//            pauseOffset =0
//        }
//    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}

