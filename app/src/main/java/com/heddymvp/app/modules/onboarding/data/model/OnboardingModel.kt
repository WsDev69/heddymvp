package com.heddymvp.app.modules.onboarding.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsgettokno: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lets_get_to_kno)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_complete_the_2)

)
