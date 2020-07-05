package com.seif.quraan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quraan_source.*

class quraan_source : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quraan_source)
        var int= intent.extras!!.getString("quraan")
        var quran2=int
        var inten= intent.extras!!.getString("quraan2")
         quran2+=inten
        txt_quran.text=quran2
        var inte= intent.extras!!.getString("bsmlah")
        txt_bsmlah.text=inte

    }
}