package com.heddymvp.app.modules.acnefive.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneFiveBinding
import com.heddymvp.app.modules.acnefive.`data`.viewmodel.AcneFiveVM
import kotlin.String
import kotlin.Unit

class AcneFiveActivity : BaseActivity<ActivityAcneFiveBinding>(R.layout.activity_acne_five) {
  private val viewModel: AcneFiveVM by viewModels<AcneFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACNE_FIVE_ACTIVITY"

  }
}
