package com.heddymvp.app.modules.acnesix.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class AcneSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectallthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_all_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasedonthein: String? =
      MyApp.getInstance().resources.getString(R.string.msg_based_on_the_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhenindoubt: String? = MyApp.getInstance().resources.getString(R.string.msg_when_in_doubt)

)
