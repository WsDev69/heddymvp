package com.heddymvp.app.modules.acneseven.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class AcneSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_based_on_your_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoIwouldpre: String? = MyApp.getInstance().resources.getString(R.string.msg_no_i_would_pre)

)
