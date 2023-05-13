package com.heddymvp.app.modules.acneseven.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneSevenBinding
import com.heddymvp.app.modules.acneseven.`data`.viewmodel.AcneSevenVM
import kotlin.String
import kotlin.Unit

class AcneSevenActivity : BaseActivity<ActivityAcneSevenBinding>(R.layout.activity_acne_seven) {
  private val viewModel: AcneSevenVM by viewModels<AcneSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACNE_SEVEN_ACTIVITY"

  }
}
