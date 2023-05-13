package com.heddymvp.app.modules.hormonesone.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityHormonesOneBinding
import com.heddymvp.app.modules.hormonesone.`data`.viewmodel.HormonesOneVM
import kotlin.String
import kotlin.Unit

class HormonesOneActivity : BaseActivity<ActivityHormonesOneBinding>(R.layout.activity_hormones_one)
    {
  private val viewModel: HormonesOneVM by viewModels<HormonesOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hormonesOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HORMONES_ONE_ACTIVITY"

  }
}
