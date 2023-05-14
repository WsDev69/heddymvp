package com.heddymvp.app.modules.acnesix.ui

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneSixBinding
import com.heddymvp.app.modules.acnefive.ui.AcneFiveActivity
import com.heddymvp.app.modules.acneseven.ui.AcneSevenActivity
import com.heddymvp.app.modules.acnesix.`data`.viewmodel.AcneSixVM
import kotlin.String
import kotlin.Unit

class AcneSixActivity : BaseActivity<ActivityAcneSixBinding>(R.layout.activity_acne_six) {
  private val viewModel: AcneSixVM by viewModels<AcneSixVM>()

  private lateinit var enabled: ColorDrawable
  private lateinit var disabled: ColorDrawable

  private lateinit var breackouts: Drawable
  private lateinit var acne2: Drawable
  private lateinit var acne3: Drawable


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneSixVM = viewModel

    enabled = ColorDrawable(resources.getColor(R.color.blue_A400))
    disabled = ColorDrawable(resources.getColor(R.color.gray_300))

    breackouts = binding.btnMyBreakoutsAreContinuallyRecurringInTheSameArea.background.current
    acne2 = binding.btnMyAcneIsUsuallyOnTheLowerPartOfMyFace.background.current
    acne3 = binding.btnMyAcneIsLinkedToMyHormonalFluctuations.background.current
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }

    binding.imageArrowright.setOnClickListener {
      startActivity(AcneSevenActivity.getIntent(this, null))
    }

    binding.btnMyBreakoutsAreContinuallyRecurringInTheSameArea.setOnClickListener {
      breackouts = setStyle(it, breackouts)
      return@setOnClickListener
    }

    binding.btnMyAcneIsUsuallyOnTheLowerPartOfMyFace.setOnClickListener {
      acne2 = setStyle(it, acne2)
      return@setOnClickListener
    }

    binding.btnMyAcneIsLinkedToMyHormonalFluctuations.setOnClickListener {
      acne3 = setStyle(it, acne3)
      return@setOnClickListener
    }

  }

  private fun setStyle(it: View, current: Drawable): Drawable{
    if (current == enabled.current) {
      it.setBackgroundResource(R.drawable.rectangle_bg_gray_400_radius_27)
      disabled.current

      return  disabled.current
    }
    it.setBackgroundResource(R.drawable.rectangle_bg_blue_a400_radius_27_5)
    return enabled.current
  }

  companion object {
    const val TAG: String = "ACNE_SIX_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AcneSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
