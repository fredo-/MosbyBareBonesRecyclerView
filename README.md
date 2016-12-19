# MosbyBareBonesRecyclerView
Simple implementation of a recycler view with Mosby

#Step 1: Gradle dependency
* add global references
  * RecyclerView (import it)

#Step 2: Make 3 packages
* add global references
  * RecyclerView (import it)

#Step 3: Change activity's extensions
* write recycler adapter class in new file (that `extends RecyclerView.Adapter<CustomHolder>`)
  (you'll write CustomHolder later)
  * add a global reference to a data array
  * implement methods
  * write constructor and set data to the constructor's input
  * update `getItemCount()` to return size of data array
  * in `onBindViewHolder()` set the fields of the holder with `holder.bindData(position)` (you'll write this method in the holder below)
  * in `onCreateViewHolder()` inflate the item layout with an xml id that will be defined later and pass to CustomHolder's constructor to return it
```java
@Override
public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
   View inflatedView = LayoutInflater.from(parent.getContext())
           .inflate(R.layout.item_layout, parent, false);
   return new CustomHolder(inflatedView);
}
```

#Step 4: Write View and Presenter classes
* a) ActivityViewInterface.java
    * Outlines what the view can do for the presenter
* b) Presenter.java
    * Connects the model to the views

#Step 5: Move data providing objects/code to model package and access data through presenter

