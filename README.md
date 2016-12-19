# BareBonesRecyclerView
Simple implementation of a recycler view to expose all the components necessary in a straight forward manner and facilitate learning/recall.
Each instruction below has a matching commit to show a simple implementation of the instructions.

#Step 1: Gradle dependency
* add to Gradle app file: `compile 'com.android.support:recyclerview-v7:25.0.1'`
* replace the version with something that fits your app

#Step 2: Create MainActivity.java
* add global references
  * RecyclerView (import it)
  * RecyclerAdapter (you'll write this class later)
  * LinearLayoutManger (import it)
  * Data (list of whatever you're trying to display, this project uses a simple array)
* in `MainActivity.onCreate()`
  * set recyclerView reference to a view with `findViewById(R.id.list)` (you'll add the recycler view with id `list` to xml later)
  * set RecyclerAdapter reference to a new RecyclerAdapter whose constructor takes in the data array
  * set linearLayoutManger to new LinearLayoutManager
  * set recyclerView adapter
  * set recyclerView layout manager
  
#Step 3: Add missing parts
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
* write `CustomHolder` class inside the adapter class (extends RecyclerView.ViewHolder implements OnClickListener)
    * implement methods
    * write refs to what you want to display in each row of recycler view (defined in the xml file for the layout of each row, which we'll write later)
    * write method `bindData(args)` to bind args to the refs above; setting the values directly from the holder will return an error
    * in constructor, set refs to fields in the xml we'll write later, findById() with future ids, and set the view's click listener to this
* write missing xml
  * add a RecyclerView widget to the xml of the main activity with the right id used in MainActivity
  * add a item xml layout file for the item to be displayed in each row of the recycler view, this will contain all the views that the `CustomHolder` requires
  
