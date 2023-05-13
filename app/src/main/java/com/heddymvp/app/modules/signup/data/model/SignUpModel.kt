package com.heddymvp.app.modules.signup.`data`.model

import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeddy: String? = MyApp.getInstance().resources.getString(R.string.lbl_heddy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegisterwitha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_register_with_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegisterwithg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_register_with_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonthaveacco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyEightOneValue: String? = null
)
