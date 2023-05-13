package com.heddymvp.app.modules.acnetwo.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneTwoBinding
import com.heddymvp.app.modules.acnetwo.`data`.viewmodel.AcneTwoVM
import kotlin.String
import kotlin.Unit

class AcneTwoActivity : BaseActivity<ActivityAcneTwoBinding>(R.layout.activity_acne_two) {
  private val viewModel: AcneTwoVM by viewModels<AcneTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACNE_TWO_ACTIVITY"

  }
}
