package com.heddymvp.app.modules.acnesix.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneSixBinding
import com.heddymvp.app.modules.acnesix.`data`.viewmodel.AcneSixVM
import kotlin.String
import kotlin.Unit

class AcneSixActivity : BaseActivity<ActivityAcneSixBinding>(R.layout.activity_acne_six) {
  private val viewModel: AcneSixVM by viewModels<AcneSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACNE_SIX_ACTIVITY"

  }
}
