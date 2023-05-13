package com.heddymvp.app.modules.acnetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.acnetwo.`data`.model.AcneTwoModel
import org.koin.core.KoinComponent

class AcneTwoVM : ViewModel(), KoinComponent {
  val acneTwoModel: MutableLiveData<AcneTwoModel> = MutableLiveData(AcneTwoModel())

  var navArguments: Bundle? = null
}
