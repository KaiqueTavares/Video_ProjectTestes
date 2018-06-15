package com.tavares.kaique.video_project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    val duracaoAnimacao = 2000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    fun carregar (){
        val anim = AnimationUtils.loadAnimation(this,R.anim.animacao_splash)
        ivLogo.startAnimation(anim)
        tvDev.startAnimation(anim)

        Handler().postDelayed({
            val proximatela = Intent(this,Lista_Jogos_Activity::class.java)
            startActivity(proximatela)
        },duracaoAnimacao)
    }
}
