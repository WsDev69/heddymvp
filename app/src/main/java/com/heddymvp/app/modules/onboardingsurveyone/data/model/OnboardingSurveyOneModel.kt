package com.heddymvp.app.modules.onboardingsurveyone.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingSurveyOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTellusmoreab: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tell_us_more_ab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_where_are_you_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatdoyouide: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_do_you_ide)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectanytopi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_any_topi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivites: String? = MyApp.getInstance().resources.getString(R.string.lbl_other)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame421Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame422Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame420Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame419Value: String? = null
)
