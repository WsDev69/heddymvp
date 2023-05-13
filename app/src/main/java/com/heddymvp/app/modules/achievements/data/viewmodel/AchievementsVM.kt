package com.heddymvp.app.modules.achievements.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.achievements.`data`.model.AchievementsModel
import org.koin.core.KoinComponent

class AchievementsVM : ViewModel(), KoinComponent {
  val achievementsModel: MutableLiveData<AchievementsModel> = MutableLiveData(AchievementsModel())

  var navArguments: Bundle? = null
}
