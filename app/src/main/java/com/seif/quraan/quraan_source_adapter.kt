package com.seif.quraan

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_quraan_source.view.*
import kotlinx.android.synthetic.main.design_swr.view.*

class quraan_source_adapter(var userlist2:ArrayList<MainActivity.data2>):RecyclerView.Adapter<quraan_source_adapter.veiwHold>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): veiwHold {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.design_swr,parent,false)
        return veiwHold(v)
    }

    override fun getItemCount(): Int {
        return userlist2.size
    }

    override fun onBindViewHolder(holder: veiwHold, position: Int) {
        val data: MainActivity.data2=userlist2[position]
        holder.bind(data)

    }

    class veiwHold(itemveiw: View): RecyclerView.ViewHolder(itemveiw) {
        fun bind(mydata: MainActivity.data2){
            val txt_name=itemView.txt_name as TextView
            txt_name.text=mydata.soraName
            val txt_num=itemView.txt_num as TextView
            txt_num.text=mydata.num.toString()
            val txt_ayat=itemView.txt_ayat as TextView
            txt_ayat.text=mydata.ayat
            val txt_tyb=itemView.txt_tyb as TextView
            txt_tyb.text=mydata.tyb



            itemView.setOnClickListener {
                var inten= Intent(itemView.context,
                    quraan_source::class.java)
                inten.putExtra("quraan",mydata.quran)
                inten.putExtra("quraan2",mydata.quran2)
                inten.putExtra("bsmlah",mydata.bsmlah)
                itemView.context.startActivity(inten)

            }
        }
    }

}