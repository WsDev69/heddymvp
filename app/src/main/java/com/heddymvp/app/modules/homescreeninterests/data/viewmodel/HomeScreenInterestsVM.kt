package com.heddymvp.app.modules.homescreeninterests.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.homescreeninterests.`data`.model.HomeScreenInterestsModel
import org.koin.core.KoinComponent

class HomeScreenInterestsVM : ViewModel(), KoinComponent {
  val homeScreenInterestsModel: MutableLiveData<HomeScreenInterestsModel> =
      MutableLiveData(HomeScreenInterestsModel())

  var navArguments: Bundle? = null
}
