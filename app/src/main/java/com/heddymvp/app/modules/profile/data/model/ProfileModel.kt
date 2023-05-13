package com.heddymvp.app.modules.profile.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanchange: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivites: String? = MyApp.getInstance().resources.getString(R.string.lbl_other)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl2)

)
