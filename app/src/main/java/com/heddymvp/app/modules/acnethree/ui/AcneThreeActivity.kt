package com.heddymvp.app.modules.acnethree.ui

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityAcneThreeBinding
import com.heddymvp.app.modules.acnethree.`data`.viewmodel.AcneThreeVM
import com.heddymvp.app.modules.acnetwo.ui.AcneTwoActivity
import com.heddymvp.app.modules.homescreeninterests.ui.HomeScreenInterestsActivity
import com.heddymvp.app.modules.video.ui.VideoScreenActivity
import kotlin.String
import kotlin.Unit

class AcneThreeActivity : BaseActivity<ActivityAcneThreeBinding>(R.layout.activity_acne_three) {
  private val viewModel: AcneThreeVM by viewModels<AcneThreeVM>()

  private lateinit var enabled: ColorDrawable
  private lateinit var disabled: ColorDrawable

  private lateinit var face: Drawable
  private lateinit var back: Drawable
  private lateinit var neck: Drawable
  private lateinit var other: Drawable


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.acneThreeVM = viewModel


    enabled = ColorDrawable(resources.getColor(R.color.blue_A400))
    disabled = ColorDrawable(resources.getColor(R.color.gray_300))

    face = binding.btnFace.background.current
    back = binding.btnBack.background.current
    neck = binding.btnNeck.background.current
    other = binding.btnOther.background.current
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }

    binding.imageFrame389.setOnClickListener {
      val destIntent = VideoScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    binding.imageArrowright.setOnClickListener {
      val sharedPreference =  getSharedPreferences("FINISHED_1ST",Context.MODE_PRIVATE)
      val editor = sharedPreference.edit()
      editor.putBoolean("finished",true)
      editor.putLong("l",100L)
      editor.apply()

      startActivity(HomeScreenInterestsActivity.getIntent(this, null))
    }

    binding.btnFace.setOnClickListener {
      face = setStyle(it, face)
      return@setOnClickListener
    }

    binding.btnBack.setOnClickListener {
      back = setStyle(it, back)
      return@setOnClickListener
    }

    binding.btnNeck.setOnClickListener {
      neck = setStyle(it, neck)
      return@setOnClickListener
    }

    binding.btnOther.setOnClickListener {
      other = setStyle(it, other)
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
    const val TAG: String = "ACNE_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AcneThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
