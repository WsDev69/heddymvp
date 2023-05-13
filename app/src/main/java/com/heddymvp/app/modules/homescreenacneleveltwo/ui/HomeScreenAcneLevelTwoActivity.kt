package com.heddymvp.app.modules.homescreenacneleveltwo.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityHomeScreenAcneLevelTwoBinding
import com.heddymvp.app.modules.homescreenacneleveltwo.`data`.viewmodel.HomeScreenAcneLevelTwoVM
import kotlin.String
import kotlin.Unit

class HomeScreenAcneLevelTwoActivity :
    BaseActivity<ActivityHomeScreenAcneLevelTwoBinding>(R.layout.activity_home_screen_acne_level_two)
    {
  private val viewModel: HomeScreenAcneLevelTwoVM by viewModels<HomeScreenAcneLevelTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenAcneLevelTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ACNE_LEVEL_TWO_ACTIVITY"

  }
}
