# MosbyBareBonesRecyclerView
Simple implementation of a recycler view with Mosby

#Step 1: Gradle dependency
* add to build.gradle for the app: `compile 'com.hannesdorfmann.mosby:mvp:2.0.1'`

#Step 2: Make 3 packages
* model
    * has all the data/api calls/network info providers
* view
    * activity/adapters/view interfaces
* presenter
    * Presenter implementations and interfaces

#Step 3: Change activity's extensions
* Make the main activity
    * `extend MvpActivity<ActivityViewInterface, Presenter> implements AvtivityViewInterface`

#Step 4: Write View and Presenter classes
* a) ActivityViewInterface.java
    * Outlines what the view can do for the presenter
    * for example
        * `showError()`
        * `showList()`
        * `hideError()`
* b) Presenter.java
    * Connects the model to the views
    * holds refs to data/network sources called by callbacks on views and model to get data where it needs to go

#Step 5: Move data providing objects/code to model package and access data through presenter

