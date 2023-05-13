package com.heddymvp.app.modules.homescreenacneleveltwo.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenAcneLevelTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcne: String? = MyApp.getInstance().resources.getString(R.string.lbl_acne)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourJourney: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_journey)

)
