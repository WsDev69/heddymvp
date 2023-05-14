package com.heddymvp.app.modules.homescreeninterests.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityHomeScreenInterestsBinding

import com.heddymvp.app.modules.homescreeninterests.`data`.viewmodel.HomeScreenInterestsVM
import com.heddymvp.app.modules.video.ui.VideoScreenActivity
import kotlin.String
import kotlin.Unit

class HomeScreenInterestsActivity :
    BaseActivity<ActivityHomeScreenInterestsBinding>(R.layout.activity_home_screen_interests) {
  private val viewModel: HomeScreenInterestsVM by viewModels()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenInterestsVM = viewModel


    val sharedPreference =  getSharedPreferences("FINISHED_1ST",Context.MODE_PRIVATE)
    val is1stFinished = sharedPreference.getBoolean("finished", false)

    if (is1stFinished) {
      binding.imageImageThirteen.setImageResource(R.drawable.img_image8)
      binding.viewWhiteButton.setBackgroundResource(R.drawable.img_image11)
    }

  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }

    binding.imageImageThirteen.setOnClickListener {
      val destIntent = VideoScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    binding.viewWhiteButton.setOnClickListener {
      val intent =  VideoScreenActivity.getIntent(this, null)
      intent.putExtra("quiz", 2)

      startActivity(intent)
    }


  }

  companion object {

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeScreenInterestsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }

    const val TAG: String = "HOME_SCREEN_INTERESTS_ACTIVITY"

  }
}
