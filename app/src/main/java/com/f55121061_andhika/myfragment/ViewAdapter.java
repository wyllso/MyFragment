package com.f55121061_andhika.myfragment;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public interface ViewAdapter {
    int getCount();
    @Nullable
    abstract Fragment getItem(int position);

    void AddFragment(Fragment fragment, String Title);
}
