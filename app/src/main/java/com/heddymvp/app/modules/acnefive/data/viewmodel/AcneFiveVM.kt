package com.heddymvp.app.modules.acnefive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.acnefive.`data`.model.AcneFiveModel
import org.koin.core.KoinComponent

class AcneFiveVM : ViewModel(), KoinComponent {
  val acneFiveModel: MutableLiveData<AcneFiveModel> = MutableLiveData(AcneFiveModel())

  var navArguments: Bundle? = null
}
