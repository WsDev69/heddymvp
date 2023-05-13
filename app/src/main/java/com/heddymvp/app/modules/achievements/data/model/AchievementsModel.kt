package com.heddymvp.app.modules.achievements.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class AchievementsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAchievements: String? = MyApp.getInstance().resources.getString(R.string.lbl_achievements)

)
