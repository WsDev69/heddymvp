package com.heddymvp.app.modules.acnefive.ui

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneFiveBinding
import com.heddymvp.app.modules.acnefive.`data`.viewmodel.AcneFiveVM
import com.heddymvp.app.modules.acnesix.ui.AcneSixActivity
import com.heddymvp.app.modules.video.ui.VideoScreenActivity
import kotlin.String
import kotlin.Unit

class AcneFiveActivity : BaseActivity<ActivityAcneFiveBinding>(R.layout.activity_acne_five) {
  private val viewModel: AcneFiveVM by viewModels<AcneFiveVM>()

  private lateinit var enabled: ColorDrawable
  private lateinit var disabled: ColorDrawable

  private lateinit var fungal: Drawable
  private lateinit var cistic: Drawable
  private lateinit var hormonal: Drawable
  private lateinit var nodular: Drawable


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneFiveVM = viewModel

    enabled = ColorDrawable(resources.getColor(R.color.blue_A400))
    disabled = ColorDrawable(resources.getColor(R.color.gray_300))

    fungal = binding.btnFungalAcne.background.current
    cistic = binding.btnCisticAcne.background.current
    hormonal = binding.btnHormonalAcne.background.current
    nodular = binding.btnNodularAcne.background.current
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }

    binding.imageArrowright.setOnClickListener {
      startActivity(AcneSixActivity.getIntent(this, null))
    }

    binding.btnFungalAcne.setOnClickListener {
      fungal = setStyle(it, fungal)
      return@setOnClickListener
    }
    binding.btnCisticAcne.setOnClickListener {
      cistic = setStyle(it, cistic)
      return@setOnClickListener
    }
    binding.btnHormonalAcne.setOnClickListener {
      hormonal = setStyle(it, hormonal)
      return@setOnClickListener
    }
    binding.btnNodularAcne.setOnClickListener {
      nodular = setStyle(it, nodular)
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
    const val TAG: String = "ACNE_FIVE_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AcneFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }

  }
}
