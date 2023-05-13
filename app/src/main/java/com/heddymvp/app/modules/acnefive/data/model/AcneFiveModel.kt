package com.heddymvp.app.modules.acnefive.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class AcneFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatdoyouthi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_do_you_thi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasedonthein: String? =
      MyApp.getInstance().resources.getString(R.string.msg_based_on_the_in)

)
