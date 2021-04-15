package com.example.inshorts.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.inshorts.R
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_categories.*

class CategoriesActivity : AppCompatActivity(), View.OnClickListener {

    private var slider: SlidrInterface? = null

    private var x1: Float? = null
    private var y1: Float? = null
    private var x2: Float? = null
    private var y2: Float? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        settingsBtn.setOnClickListener {
            //TODO open setting activity
        }

        nextBtn.setOnClickListener {
            openNewsFeedActivity()
        }

        rlSearchBar.setOnClickListener {
            openSearchActivity()
        }

        rlSearchBar.visibility = View.VISIBLE
        scrollView.visibility = View.VISIBLE
        cvPolitics.setOnClickListener(this)
        cvSports.setOnClickListener(this)
        cvEntertainment.setOnClickListener(this)
        cvIndia.setOnClickListener(this)
        cvBusiness.setOnClickListener(this)
        cvTechnology.setOnClickListener(this)
        cvTravel.setOnClickListener(this)
        cvFashion.setOnClickListener(this)
        cvStartUps.setOnClickListener(this)
        cvHatke.setOnClickListener(this)
        cvAutomobile.setOnClickListener(this)
        cvHealthFitness.setOnClickListener(this)
        cvEducation.setOnClickListener(this)
        cvScience.setOnClickListener(this)
        cvInternational.setOnClickListener(this)
        cvMiscellanous.setOnClickListener(this)
    }

    private fun openSearchActivity() {
        //TODO Search activity
    }

    private fun openNewsFeedActivity() {
        val openNewsFeed = Intent(this, NewsFeedActivity::class.java)
        startActivity(openNewsFeed)
    }

    override fun onClick(v: View?) {

        rlSearchBar.visibility = View.VISIBLE
        scrollView.visibility = View.VISIBLE


//        when (v?.id) {
//            R.id.cvPolitics -> {
//                openPoliticsFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvSports -> {
//                openSportsFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvEntertainment -> {
//                openEntertainmentFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvIndia -> {
//                openIndiaFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvBusiness -> {
//                openBusinessFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvTechnology -> {
//                openTechnologyFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvTravel -> {
//                openTravelFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvFashion -> {
//                openFashionFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvStartUps -> {
//                openStartupFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvHatke -> {
//                openHatkeFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvAutomobile -> {
//                openAutomobileFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvHealthFitness -> {
//                openHealthFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvEducation -> {
//                openEducationFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvScience -> {
//                openScienceFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvInternational -> {
//                openInternationalFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//
//            R.id.cvMiscellanous -> {
//                openMiscellanousFragment()
//                rlSearchBar.visibility = View.GONE
//                scrollView.visibility = View.GONE
//            }
//        }
    }
}