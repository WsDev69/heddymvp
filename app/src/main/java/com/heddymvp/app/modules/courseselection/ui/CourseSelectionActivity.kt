package com.heddymvp.app.modules.courseselection.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import com.heddymvp.app.R
import com.heddymvp.app.appcomponents.base.BaseActivity
import com.heddymvp.app.databinding.ActivityCourseSelectionBinding
import com.heddymvp.app.modules.courseselection.`data`.model.ListgroupRowModel
import com.heddymvp.app.modules.courseselection.`data`.viewmodel.CourseSelectionVM
import com.heddymvp.app.modules.homescreeninterests.ui.HomeScreenInterestsActivity
import com.heddymvp.app.modules.onboardingsurveyone.ui.OnboardingSurveyOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CourseSelectionActivity : BaseActivity<ActivityCourseSelectionBinding>(R.layout.activity_course_selection) {
    private val viewModel: CourseSelectionVM by viewModels()

    override fun onInitialized(): Unit {
        viewModel.navArguments = intent.extras?.getBundle("bundle")
//        val listgroupAdapter = ListgroupAdapter(viewModel.listgroupList.value ?: mutableListOf())
//
//
//
//        listgroupAdapter.setOnItemClickListener(
//            object : ListgroupAdapter.OnItemClickListener {
//                override fun onItemClick(view: View, position: Int, item: ListgroupRowModel) {
//                    val destIntent = HomeScreenInterestsActivity.getIntent(view.context, null)
//                    startActivity(destIntent)
//                }
//            }
//        )
//
//        listgroupAdapter.setOnItemClickListener(
//            object : ListgroupAdapter.OnItemClickListener {
//                override fun onItemClick(view: View, position: Int, item: ListgroupRowModel) {
//                    onClickRecyclerListgroup(view, position, item)
//                }
//            }
//        )
//
//
//        val data = mutableListOf<ListgroupRowModel>()
//
//        data.add(ListgroupRowModel("Acne"))
//
//        viewModel.listgroupList.observe(this) {
//            listgroupAdapter.updateData(data)
//        }
        binding.courseSelectionVM = viewModel
    }

    override fun setUpClicks(): Unit {
        binding.linearRowchevronrightActive.setOnClickListener {
            val destIntent = HomeScreenInterestsActivity.getIntent(this, null)
            startActivity(destIntent)
        }
    }

    companion object {
        const val TAG: String = "COURSE_SELECTION_ACTIVITY"

        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, CourseSelectionActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }

    }
}
