package com.heddymvp.app.modules.onboardingsurveyone.ui

import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityOnboardingSurveyOneBinding
import com.heddymvp.app.modules.courseselection.ui.CourseSelectionActivity
import com.heddymvp.app.modules.homescreeninterests.ui.HomeScreenInterestsActivity
import com.heddymvp.app.modules.onboarding.ui.OnboardingActivity
import com.heddymvp.app.modules.onboardingsurveyone.`data`.viewmodel.OnboardingSurveyOneVM
import kotlin.String
import kotlin.Unit

class OnboardingSurveyOneActivity :
    BaseActivity<ActivityOnboardingSurveyOneBinding>(R.layout.activity_onboarding_survey_one) {
    private val viewModel: OnboardingSurveyOneVM by viewModels<OnboardingSurveyOneVM>()

    private lateinit var enabled: ColorDrawable
    private lateinit var disabled: ColorDrawable

    private lateinit var currentBody: Drawable
    private lateinit var currentHealthy: Drawable
    private lateinit var currentAnce: Drawable
    private lateinit var currentConfidence: Drawable
    private lateinit var currentMotivation: Drawable
    private lateinit var currentOther: Drawable

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
        binding.onboardingSurveyOneVM = viewModel

        enabled = ColorDrawable(resources.getColor(R.color.blue_A400))
        disabled = ColorDrawable(resources.getColor(R.color.gray_300))

        currentBody = binding.btnBodyImage.background.current
        currentHealthy = binding.btnMentalHealth.background.current
        currentAnce = binding.btnAcne.background.current
        currentConfidence = binding.btnConfidence.background.current
        currentMotivation = binding.btnMotivation.background.current
        currentOther = binding.btnOther.background.current
    }

    override fun setUpClicks(): Unit {
        binding.btnBodyImage.setOnClickListener {
            currentBody = setStyle(it, currentBody)
            return@setOnClickListener
        }
        binding.btnMentalHealth.setOnClickListener {
            currentHealthy = setStyle(it, currentHealthy)
            return@setOnClickListener
        }
        binding.btnAcne.setOnClickListener {
            currentAnce = setStyle(it, currentAnce)
            return@setOnClickListener
        }
        binding.btnConfidence.setOnClickListener {
            currentConfidence = setStyle(it, currentConfidence)
            return@setOnClickListener
        }
        binding.btnMotivation.setOnClickListener {
            currentMotivation = setStyle(it, currentMotivation)
            return@setOnClickListener
        }

        binding.btnOther.setOnClickListener {
            currentOther = setStyle(it, currentOther)
            return@setOnClickListener
        }
        binding.imageArrowright.setOnClickListener {
            val destIntent = CourseSelectionActivity.getIntent(this, null)
            startActivity(destIntent)
            finish()
        }

        binding.btnAcne
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
        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, OnboardingSurveyOneActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }

        const val TAG: String = "ONBOARDING_SURVEY_ONE_ACTIVITY"

    }
}
