package com.dheerajvaddepally.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.dheerajvaddepally.tictactoe.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity() {
    lateinit var mBinding : ActivitySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_select)
        mBinding.x.setOnClickListener(clickListener)
        mBinding.o.setOnClickListener(clickListener)
    }

    private val clickListener: View.OnClickListener = View.OnClickListener { view ->
        val intent = Intent(this@SelectActivity, MainActivity::class.java)
        when (view.id) {
            R.id.x-> {
                intent.putExtra("UserSelection", "X")
            }
            R.id.o-> {
                intent.putExtra("UserSelection", "O")
            }
        }
        startActivity(intent)
    }
}
