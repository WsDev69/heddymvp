package com.heddymvp.app.modules.acnefour.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneFourBinding
import com.heddymvp.app.modules.acnefour.`data`.viewmodel.AcneFourVM
import kotlin.String
import kotlin.Unit

class AcneFourActivity : BaseActivity<ActivityAcneFourBinding>(R.layout.activity_acne_four) {
  private val viewModel: AcneFourVM by viewModels<AcneFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACNE_FOUR_ACTIVITY"

  }
}
