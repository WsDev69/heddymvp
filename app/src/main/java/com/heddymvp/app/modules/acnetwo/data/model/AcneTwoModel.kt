package com.heddymvp.app.modules.acnetwo.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class AcneTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatkindofac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_kind_of_ac)
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
