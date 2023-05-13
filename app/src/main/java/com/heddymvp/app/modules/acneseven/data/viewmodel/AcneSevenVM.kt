package com.heddymvp.app.modules.acneseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.acneseven.`data`.model.AcneSevenModel
import org.koin.core.KoinComponent

class AcneSevenVM : ViewModel(), KoinComponent {
  val acneSevenModel: MutableLiveData<AcneSevenModel> = MutableLiveData(AcneSevenModel())

  var navArguments: Bundle? = null
}
