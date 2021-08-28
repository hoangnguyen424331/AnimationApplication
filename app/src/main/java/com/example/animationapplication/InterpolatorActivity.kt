package com.example.animationapplication

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import kotlinx.android.synthetic.main.activity_interpolator.*

class InterpolatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interpolator)

        //toc do ko thay doi
        linear.setOnClickListener {
            ObjectAnimator.ofFloat(linear, "translationX", 300f).apply {
                interpolator = LinearInterpolator()
                duration = ANIMATION_DURATION
                start()
            }
        }

        //bat dau tu tu va sau do tang toc
        accelerate.setOnClickListener {
            ObjectAnimator.ofFloat(accelerate, "translationX", 300f).apply {
                interpolator = AccelerateInterpolator()
                duration = ANIMATION_DURATION
                start()
            }
        }

        //bat dau nhanh va cham lai
        decelerate.setOnClickListener {
            ObjectAnimator.ofFloat(decelerate, "translationX", 300f).apply {
                interpolator = DecelerateInterpolator()
                duration = ANIMATION_DURATION
                start()
            }
        }

        //toa hoat anh tra lai truoc khi ket thuc
        bounce.setOnClickListener {
            ObjectAnimator.ofFloat(bounce, "translationX", 300f).apply {
                interpolator = BounceInterpolator()
                duration = ANIMATION_DURATION
                start()
            }
        }
    }

    companion object {
        private const val ANIMATION_DURATION = 5000L
    }
}
