package com.tavares.kaique.video_project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_lista__jogos_.*

class Lista_Jogos_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista__jogos_)

        rvHeroi.adapter = HeroiAdapter(herois(),this,{
            val telaDetalhe = Intent(this,DetalheActivity::class.java)
            telaDetalhe.putExtra("heroi",it)
            startActivity(telaDetalhe)
        })

        val layourManager = LinearLayoutManager(this)
        rvHeroi.layoutManager = layourManager
    }

    fun herois ():List<HeroiObjeto>{
        return  listOf(
                HeroiObjeto(
                        getString(R.string.desenvolvido),
                        R.drawable.ironman_header,
                        getString(R.string.descriptionIronMan),
                        3,5
                )
        )
    }
}
