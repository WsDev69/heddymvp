package com.heddymvp.app.modules.homescreeninterests.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityHomeScreenInterestsBinding
import com.heddymvp.app.modules.homescreeninterests.`data`.viewmodel.HomeScreenInterestsVM
import com.heddymvp.app.modules.onboardingsurveyone.ui.OnboardingSurveyOneActivity
import kotlin.String
import kotlin.Unit

class HomeScreenInterestsActivity :
    BaseActivity<ActivityHomeScreenInterestsBinding>(R.layout.activity_home_screen_interests) {
  private val viewModel: HomeScreenInterestsVM by viewModels()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenInterestsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
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
