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
    * implement `createPresenter()`
        * return a new instance of the presenter you want for the instance of the activity/fragment/view
        * this method allows you to check what instance you have of the class and return the right presenter
            * for example if you have two tabs both of which use the same fragment code, but two different instances because they do slightly different things, you can check which type of instance the object is and return two different presenters
            * this is useful if you want to use the same view for slightly different data (two lists but with different headers/different displays of similar data)

#Step 4: Write View and Presenter classes
* a) `ActivityViewInterface.java extends MvpView`
    * Outlines what the view can do for the presenter
    * for example
        * `showError()`
        * `showList()`
        * `hideError()`
        * `displayData()`
* b) `Presenter extends MvpBasePresenter<ActivityViewInterface>`
    * Connects the model to the views
    * holds refs to data/network sources called by callbacks on views and model to get data where it needs to go

#Step 5: Move data providing objects/code to model package and access data through presenter
* refactor code to display data in MainActivity to `displayData()`
* refactor adapter to take in the data array later with a `setData()` method
* move the data array to its own class and hold a reference to it in the presenter

