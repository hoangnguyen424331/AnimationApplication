package com.example.animationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonScale.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            textScale.startAnimation(animation)
        }

        buttonAlpha.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
            textAlpha.startAnimation(animation)
        }

        buttonRotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textRotate.startAnimation(animation)
        }

        buttonTranslate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.translate)
            textTranslate.startAnimation(animation)
        }

        buttonProperty.setOnClickListener {
            Intent(this, InterpolatorActivity::class.java).also {
                startActivity(it)
            }
        }

        buttonDrawable.setOnClickListener {
            Intent(this,DrawableActivity::class.java).also {
                startActivity(it)
            }
        }

        buttonCart.setOnClickListener {
            Intent(this,CartViewActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
