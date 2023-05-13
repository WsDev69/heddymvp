package com.heddymvp.app.modules.acnethree.ui

import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneThreeBinding
import com.heddymvp.app.modules.acnethree.`data`.viewmodel.AcneThreeVM
import kotlin.String
import kotlin.Unit

class AcneThreeActivity : BaseActivity<ActivityAcneThreeBinding>(R.layout.activity_acne_three) {
  private val viewModel: AcneThreeVM by viewModels<AcneThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACNE_THREE_ACTIVITY"

  }
}
