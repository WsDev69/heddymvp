package com.heddymvp.app.modules.achievements.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAchievementsBinding
import com.heddymvp.app.modules.achievements.`data`.viewmodel.AchievementsVM
import kotlin.String
import kotlin.Unit

class AchievementsActivity :
    BaseActivity<ActivityAchievementsBinding>(R.layout.activity_achievements) {
  private val viewModel: AchievementsVM by viewModels<AchievementsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.achievementsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACHIEVEMENTS_ACTIVITY"

  }
}
