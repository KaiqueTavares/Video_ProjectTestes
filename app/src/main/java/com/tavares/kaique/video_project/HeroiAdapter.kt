package com.tavares.kaique.video_project

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.meu_jogo_item.view.*

/**
 * Created by kaiqu on 15/06/2018.
 */
class HeroiAdapter (val herois: List<HeroiObjeto>,
                    val context : Context,
                    val listener:(HeroiObjeto) -> Unit): RecyclerView.Adapter<HeroiAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val note = herois[position]
        holder?.let {
            it.bindView(note,listener)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.meu_jogo_item, parent, false)
        return ViewHolder(view)
    }
    //Método que deverá retornar quantos itens há na lista.
    override fun getItemCount(): Int {
        return herois.size
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindView(heroi : HeroiObjeto,
                     listener: (HeroiObjeto) -> Unit) = with(itemView){
            val ivHeroi = ivHeroiLista
            val tvTitulo = tvTituloHeroiLista
            val tvDescricao = tvDescricaoLista

            ivHeroi.setImageDrawable(ContextCompat.getDrawable(context,heroi.foto))
            tvTitulo.text = heroi.titulo
            tvDescricao.text = heroi.descricao

            setOnClickListener { listener(heroi) }
        }
    }
}