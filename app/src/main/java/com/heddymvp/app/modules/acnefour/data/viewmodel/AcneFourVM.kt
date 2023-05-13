package com.heddymvp.app.modules.acnefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.acnefour.`data`.model.AcneFourModel
import org.koin.core.KoinComponent

class AcneFourVM : ViewModel(), KoinComponent {
  val acneFourModel: MutableLiveData<AcneFourModel> = MutableLiveData(AcneFourModel())

  var navArguments: Bundle? = null
}
