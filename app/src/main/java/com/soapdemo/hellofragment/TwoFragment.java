package com.soapdemo.hellofragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soapdemo.hellofragment.databinding.TwoFragmentBinding;

public class TwoFragment extends Fragment {

    private TwoViewModel mViewModel;

    public static TwoFragment newInstance() {
        return new TwoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        TwoFragmentBinding binding = TwoFragmentBinding.inflate(inflater,container,false);
        mViewModel = new ViewModelProvider(this).get(TwoViewModel.class);
        binding.setDataContext( mViewModel );
        return binding.getRoot();
    }


}