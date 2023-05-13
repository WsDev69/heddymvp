package com.heddymvp.app.modules.hormonesone.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class HormonesOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_video_on_what_i)

)
