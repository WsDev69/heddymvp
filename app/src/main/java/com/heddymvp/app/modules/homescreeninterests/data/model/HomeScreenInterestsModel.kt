package com.heddymvp.app.modules.homescreeninterests.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenInterestsModel(
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
  var txtGroup198: String? = MyApp.getInstance().resources.getString(R.string.lbl_introduction)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup197: String? = MyApp.getInstance().resources.getString(R.string.lbl_prevention)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup196: String? = MyApp.getInstance().resources.getString(R.string.msg_hormonal_factor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup195: String? = MyApp.getInstance().resources.getString(R.string.msg_lifestyle_facto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup193: String? = MyApp.getInstance().resources.getString(R.string.msg_psychological_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup194: String? = MyApp.getInstance().resources.getString(R.string.lbl_action_steps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourJourney: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_journey)

)
