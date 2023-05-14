package com.heddymvp.app.modules.acnetwo.ui

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneTwoBinding
import com.heddymvp.app.modules.acnethree.ui.AcneThreeActivity
import com.heddymvp.app.modules.acnetwo.`data`.viewmodel.AcneTwoVM
import com.heddymvp.app.modules.homescreeninterests.ui.HomeScreenInterestsActivity
import com.heddymvp.app.modules.video.ui.VideoScreenActivity
import kotlin.String
import kotlin.Unit

class AcneTwoActivity : BaseActivity<ActivityAcneTwoBinding>(R.layout.activity_acne_two) {
  private val viewModel: AcneTwoVM by viewModels<AcneTwoVM>()

  private lateinit var enabled: ColorDrawable
  private lateinit var disabled: ColorDrawable

  private lateinit var black: Drawable
  private lateinit var white: Drawable
  private lateinit var ppules: Drawable
  private lateinit var pustules: Drawable
  private lateinit var nodules: Drawable
  private lateinit var cysts: Drawable

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneTwoVM = viewModel

    enabled = ColorDrawable(resources.getColor(R.color.blue_A400))
    disabled = ColorDrawable(resources.getColor(R.color.gray_300))

    black = binding.btnBlackheads.background.current
    white = binding.btnWhiteheads.background.current
    ppules = binding.btnPapules.background.current
    pustules = binding.btnPustules.background.current
    nodules = binding.btnNodules.background.current
    cysts = binding.btnCysts.background.current
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = HomeScreenInterestsActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    binding.imageFrame389.setOnClickListener {
      val destIntent = VideoScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    binding.imageArrowright.setOnClickListener {
      val destIntent = AcneThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    binding.btnBlackheads.setOnClickListener {
      black = setStyle(it, black)
      return@setOnClickListener
    }

    binding.btnWhiteheads.setOnClickListener {
      white = setStyle(it, white)
      return@setOnClickListener
    }

    binding.btnPapules.setOnClickListener {
      ppules = setStyle(it, ppules)
      return@setOnClickListener
    }

    binding.btnPustules.setOnClickListener {
      pustules = setStyle(it, pustules)
      return@setOnClickListener
    }

    binding.btnNodules.setOnClickListener {
      nodules = setStyle(it, nodules)
      return@setOnClickListener
    }

    binding.btnCysts.setOnClickListener {
      cysts = setStyle(it, cysts)
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
    const val TAG: String = "ACNE_TWO_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AcneTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
