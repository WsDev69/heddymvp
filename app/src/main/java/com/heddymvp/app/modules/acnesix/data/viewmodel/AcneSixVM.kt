package com.heddymvp.app.modules.acnesix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.acnesix.`data`.model.AcneSixModel
import org.koin.core.KoinComponent

class AcneSixVM : ViewModel(), KoinComponent {
  val acneSixModel: MutableLiveData<AcneSixModel> = MutableLiveData(AcneSixModel())

  var navArguments: Bundle? = null
}
