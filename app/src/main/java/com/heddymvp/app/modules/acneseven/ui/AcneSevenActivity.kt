package com.heddymvp.app.modules.acneseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneSevenBinding
import com.heddymvp.app.modules.acneseven.`data`.viewmodel.AcneSevenVM
import com.heddymvp.app.modules.acnesix.ui.AcneSixActivity
import com.heddymvp.app.modules.homescreeninterests.ui.HomeScreenInterestsActivity
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

      binding.btnYesTakeMeThereOne.setOnClickListener {
        startActivity(HomeScreenInterestsActivity.getIntent(this, null))
      }
    }

    companion object {
        const val TAG: String = "ACNE_SEVEN_ACTIVITY"

        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, AcneSevenActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}
