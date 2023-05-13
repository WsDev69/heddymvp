package com.heddymvp.app.modules.homescreenacneleveltwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.homescreenacneleveltwo.`data`.model.HomeScreenAcneLevelTwoModel
import org.koin.core.KoinComponent

class HomeScreenAcneLevelTwoVM : ViewModel(), KoinComponent {
  val homeScreenAcneLevelTwoModel: MutableLiveData<HomeScreenAcneLevelTwoModel> =
      MutableLiveData(HomeScreenAcneLevelTwoModel())

  var navArguments: Bundle? = null
}
