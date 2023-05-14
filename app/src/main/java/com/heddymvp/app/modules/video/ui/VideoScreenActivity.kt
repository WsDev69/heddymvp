package com.heddymvp.app.modules.video.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.VideoBinding
import com.heddymvp.app.modules.acnefive.ui.AcneFiveActivity
import com.heddymvp.app.modules.acnetwo.ui.AcneTwoActivity
import com.heddymvp.app.modules.homescreeninterests.ui.HomeScreenInterestsActivity
import com.heddymvp.app.modules.video.data.viewmodel.VideoVM

class VideoScreenActivity : BaseActivity<VideoBinding>(R.layout.video) {
    private val viewModel: VideoVM by viewModels()

    private var quiz: Int = 1

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.videoScreenVM = viewModel

        val value = intent.extras?.getInt("quiz", 1)
        if (value != null)  {
            quiz = value
        }

        binding.videoView.setMediaController(MediaController(this));
        binding.videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.acne)
        binding.videoView.requestFocus();
        if (quiz == 1) {
            binding.videoView.start()
        } else {
            binding.videoView.seekTo(1);
            binding.videoView.pause()
        }
    }

    override fun setUpClicks(): Unit {
        binding.imageArrowright.setOnClickListener {
            if (quiz == 1) {
                val destIntent = AcneTwoActivity.getIntent(this, null)
                startActivity(destIntent)
            } else {
                val destIntent = AcneFiveActivity.getIntent(this, null)
                startActivity(destIntent)
            }

        }
    }

    companion object {
        const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, VideoScreenActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }

    }
}
