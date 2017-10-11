package com.example.susi.sobrecaofragmet;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Susi on 10/10/17.
 */

public class TesteFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teste, container, false);
        return view;
    }

    public void fecharFragment(){
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }
}
