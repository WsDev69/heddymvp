package com.heddymvp.app.modules.onboardingsurveyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.onboardingsurveyone.`data`.model.OnboardingSurveyOneModel
import org.koin.core.KoinComponent

class OnboardingSurveyOneVM : ViewModel(), KoinComponent {
  val onboardingSurveyOneModel: MutableLiveData<OnboardingSurveyOneModel> =
      MutableLiveData(OnboardingSurveyOneModel())

  var navArguments: Bundle? = null
}
