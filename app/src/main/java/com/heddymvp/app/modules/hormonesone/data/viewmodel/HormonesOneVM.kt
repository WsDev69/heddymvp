package com.heddymvp.app.modules.hormonesone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.hormonesone.`data`.model.HormonesOneModel
import org.koin.core.KoinComponent

class HormonesOneVM : ViewModel(), KoinComponent {
  val hormonesOneModel: MutableLiveData<HormonesOneModel> = MutableLiveData(HormonesOneModel())

  var navArguments: Bundle? = null
}
