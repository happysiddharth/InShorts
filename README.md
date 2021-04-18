<h1>InShorts (Clone of news app)</h1>
<p>The news application which provides the latest news from all over the world.</p>
<hr>
<h3>Used Technologies</h3>
<ul>
  <li>Java</li>
  <li>Kotlin</li>
  <li>Database</li>
  <li>REST API</li>
  <li>My SQL</li>
  <li>Vertical ViewPager Library</li>
</ul>  
<hr>
<h3>Features</h3>
<p>This app displays the information of the latest news updates with detailed list of categories. The app shows latest news categories includes Business, Politics,  Entertainment, Technology, Sports and much more. There are different categories to choose, read and stay well informed with all the latest news updates.
The brief summary for every news stories are available in the app.</p>
<hr>
<h3>Dependencies</h3>
<hr>

	implementation 'de.hdodenhof:circleimageview:3.1.0'
	//    developer.android.com/jetpack/androidx/releases/recyclerview
	//    developer.android.com/jetpack/androidx/releases/recyclerview
	//
	//    developer.android.com/jetpack/androidx/releases/cardview
	//    developer.android.com/jetpack/androidx/releases/cardview
	
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
    implementation 'androidx.appcompat:appcompat:1.1.0'
    
    // Retrofit & OkHttp
    implementation 'com.squareup.retrofit2:retrofit:2.5.0'
    // This library is used by retrofit internally to convert json-pojo and pojo-json
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
    //This library is used to observe the API logs, Http status code and the API response

    annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
    compile 'com.ryan.rv_gallery:rv-gallery:1.1.2'
    compileOnly 'com.google.android.wearable:wearable:2.8.1'
    implementation 'com.airbnb.android:lottie:3.4.1'
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    implementation 'androidx.core:core-ktx:1.3.2'
    implementation 'androidx.appcompat:appcompat:1.2.0'
    implementation 'com.google.android.material:material:1.3.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'

    //lottie library
    implementation 'com.airbnb.android:lottie:3.0.6'

    // Retrofit dependency which will be used to make network calls
    implementation 'com.squareup.retrofit2:retrofit:2.6.0'
    // GSON library which is used to convert POJO to JSON and vice versa
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
    // okhttp library used to observe the api call logs on LogCat
    implementation 'com.squareup.okhttp3:logging-interceptor:3.12.3'

    //view model
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0'

    implementation 'com.github.bumptech.glide:glide:4.11.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'

    implementation 'com.r0adkll:slidableactivity:2.1.0'

    implementation 'com.mohitdev:verticalviewpager:0.0.2'

    implementation 'com.squareup.okhttp3:logging-interceptor:3.8.0'
    implementation 'com.github.bumptech.glide:glide:4.11.0'
