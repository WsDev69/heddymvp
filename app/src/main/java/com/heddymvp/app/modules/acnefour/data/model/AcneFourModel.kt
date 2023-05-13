package com.heddymvp.app.modules.acnefour.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class AcneFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDifferentkinds: String? =
      MyApp.getInstance().resources.getString(R.string.msg_different_kinds)

)
