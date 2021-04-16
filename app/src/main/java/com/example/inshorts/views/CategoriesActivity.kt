package com.example.inshorts.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.inshorts.R
import com.example.inshorts.fragments.*
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


        when (v?.id) {
            R.id.cvPolitics -> {
                openPoliticsFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvSports -> {
                openSportsFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvEntertainment -> {
                openEntertainmentFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvIndia -> {
                openIndiaFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvBusiness -> {
                openBusinessFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvTechnology -> {
                openTechnologyFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvTravel -> {
                openTravelFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvFashion -> {
                openFashionFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvStartUps -> {
                openStartupFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvHatke -> {
                openHatkeFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvAutomobile -> {
                openAutomobileFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvHealthFitness -> {
                openHealthFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvEducation -> {
                openEducationFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvScience -> {
                openScienceFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvInternational -> {
                openInternationalFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }

            R.id.cvMiscellanous -> {
                openMiscellaneousFragment()
                rlSearchBar.visibility = View.GONE
                scrollView.visibility = View.GONE
            }
        }
    }

    private fun openPoliticsFragment() {
        val politicsFragment = PoliticsFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, politicsFragment, "politicsFragment")
            .addToBackStack("politicsFragment").commit()
    }

    private fun openSportsFragment() {
        val sportsFragment = SportsFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, sportsFragment, "sportsFragment")
            .addToBackStack("sportsFragment").commit()
    }

    private fun openEntertainmentFragment() {
        val entertainmentFragment = EntertainmentFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, entertainmentFragment, "entertainmentFragment")
            .addToBackStack("entertainmentFragment").commit()
    }

    private fun openIndiaFragment() {
        val indiaFragment = IndiaFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, indiaFragment, "indiaFragment")
            .addToBackStack("indiaFragment").commit()
    }

    private fun openTravelFragment() {
        val travelFragment = TravelFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, travelFragment, "travelFragment")
            .addToBackStack("travelFragment").commit()
    }

    private fun openTechnologyFragment() {
        val technologyFragment = TechnologyFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, technologyFragment, "technologyFragment")
            .addToBackStack("technologyFragment").commit()
    }

    private fun openStartupFragment() {
        val startUpsFragment = StartupsFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, startUpsFragment, "startUpsFragment")
            .addToBackStack("startUpsFragment").commit()
    }

    private fun openHatkeFragment() {
        val hatkeFragment = HatkeFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, hatkeFragment, "hatkeFragment")
            .addToBackStack("hatkeFragment").commit()
    }

    private fun openHealthFragment() {
        val healthFitnessFragment = HealthFitnessFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, healthFitnessFragment, "healthFitnessFragment")
            .addToBackStack("healthFitnessFragment").commit()
    }

    private fun openEducationFragment() {
        val educationFragment = EducationFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, educationFragment, "educationFragment")
            .addToBackStack("educationFragment").commit()
    }

    private fun openScienceFragment() {
        val scienceFragment = ScienceFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, scienceFragment, "scienceFragment")
            .addToBackStack("scienceFragment").commit()
    }

    private fun openInternationalFragment() {
        val internationalNewsFragment = InternationalNewsFragment()
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.llCategoryContainer,
                internationalNewsFragment,
                "internationalNewsFragment"
            )
            .addToBackStack("internationalNewsFragment").commit()
    }

    private fun openMiscellaneousFragment() {
        val miscellanousFragment = MiscellanousFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, miscellanousFragment, "miscellanousFragment")
            .addToBackStack("miscellanousFragment").commit()
    }

    private fun openBusinessFragment() {
        val businessFragment = BusinessFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, businessFragment, "businessFragment")
            .addToBackStack("businessFragment").commit()
    }

    private fun openFashionFragment() {
        val fashionFragment = FashionFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, fashionFragment, "fashionFragment")
            .addToBackStack("fashionFragment").commit()
    }

    private fun openAutomobileFragment() {
        val autoMobileFragment = AutoMobileFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.llCategoryContainer, autoMobileFragment, "autoFrag")
            .addToBackStack("autoFrag").commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        rlSearchBar.visibility = View.VISIBLE
        scrollView.visibility = View.VISIBLE
    }
}