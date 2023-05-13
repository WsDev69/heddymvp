package com.heddymvp.app.modules.acnethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.acnethree.`data`.model.AcneThreeModel
import org.koin.core.KoinComponent

class AcneThreeVM : ViewModel(), KoinComponent {
  val acneThreeModel: MutableLiveData<AcneThreeModel> = MutableLiveData(AcneThreeModel())

  var navArguments: Bundle? = null
}
