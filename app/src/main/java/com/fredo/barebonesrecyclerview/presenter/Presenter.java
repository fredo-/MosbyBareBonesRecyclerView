package com.fredo.barebonesrecyclerview.presenter;

import com.fredo.barebonesrecyclerview.model.DataRepository;
import com.fredo.barebonesrecyclerview.view.ActivityViewInterface;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

/**
 * Created by alfredovelasco on 12/19/16.
 */

public class Presenter extends MvpBasePresenter<ActivityViewInterface> {
    DataRepository repo = new DataRepository();

    public void loadData() {
        getView().displayData(repo.getData());
    }
}
