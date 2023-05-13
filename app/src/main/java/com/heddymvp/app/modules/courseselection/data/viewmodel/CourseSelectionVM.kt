package com.heddymvp.app.modules.courseselection.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.courseselection.`data`.model.CourseSelectionModel
import com.heddymvp.app.modules.courseselection.`data`.model.ListgroupRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CourseSelectionVM : ViewModel(), KoinComponent {
  val courseSelectionModel: MutableLiveData<CourseSelectionModel> =
      MutableLiveData(CourseSelectionModel())

  var navArguments: Bundle? = null

  val listgroupList: MutableLiveData<MutableList<ListgroupRowModel>> =
      MutableLiveData(mutableListOf())
}
