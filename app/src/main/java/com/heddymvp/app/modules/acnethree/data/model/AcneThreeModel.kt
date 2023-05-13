package com.heddymvp.app.modules.acnethree.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class AcneThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhereisyoura: String? =
      MyApp.getInstance().resources.getString(R.string.msg_where_is_your_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasedonthein: String? =
      MyApp.getInstance().resources.getString(R.string.msg_based_on_the_in)

)
