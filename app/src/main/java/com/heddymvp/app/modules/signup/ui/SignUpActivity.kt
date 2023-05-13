package com.heddymvp.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.appcomponents.googleauth.GoogleHelper
import com.heddymvp.app.databinding.ActivitySignUpBinding
import com.heddymvp.app.modules.onboarding.ui.OnboardingActivity
import com.heddymvp.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
      googleLogin = GoogleHelper(this,
        onSuccess =  { accountInfo ->
          val destIntent = OnboardingActivity.getIntent(this, null)
          startActivity(destIntent)
          finish()
        },
        onError =  { error ->
          Toast.makeText(this.baseContext, "smth went wrong $error", Toast.LENGTH_SHORT).show()
        })
    }

      override fun setUpClicks(): Unit {
        binding.linearRowlogosgoogleic.setOnClickListener {
          googleLogin.login()
        }
        binding.imageArrowleft.setOnClickListener {
          finish()
        }
        binding.imageArrowleft.setOnClickListener {
          finish()
        }
      }

      companion object {
        const val TAG: String = "SIGN_UP_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SignUpActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
