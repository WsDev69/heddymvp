package com.heddymvp.app.modules.video.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heddymvp.app.modules.video.data.model.VideoModel
import org.koin.core.KoinComponent

class VideoVM : ViewModel(), KoinComponent {
  val videoScreenModel: MutableLiveData<VideoModel> = MutableLiveData(VideoModel())

  var navArguments: Bundle? = null
}
