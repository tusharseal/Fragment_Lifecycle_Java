package com.example.fragmentlifecyclejava;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Fragment1 extends Fragment implements IOnBackPressed {

    private static final String COMMON_TAG = "CombinedLifeCycle";
    private static final String FRAGMENT_NAME = Fragment1.class.getSimpleName();
    private static final String TAG = COMMON_TAG;

    @Override
    public void onAttach(Context context) {
        Log.i(TAG, FRAGMENT_NAME +" onAttach");
        Toast.makeText(getActivity(),"I am onAttach from Fragment1", Toast.LENGTH_SHORT).show();
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, FRAGMENT_NAME +" onCreate");
        Toast.makeText(getActivity(),"I am onCreate from Fragment1", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //this is Basic one.
        Log.i(TAG, FRAGMENT_NAME +" onCreateView");
        Toast.makeText(getActivity(),"I am onCreateView from Fragment1", Toast.LENGTH_SHORT).show();


        return inflater.inflate(R.layout.fragment_1, container, false);

        /*//But if u want to use any button in fragment you need to return the view.

        View view = inflater.inflate(R.layout.fragment_1, container, false);

        return view;*/
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, FRAGMENT_NAME +" onActivityCreated");
        Toast.makeText(getActivity(),"I am onActivityCreated from Fragment1", Toast.LENGTH_SHORT).show();
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i(TAG, FRAGMENT_NAME +" onStart");
        Toast.makeText(getActivity(),"I am onStart from Fragment1", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i(TAG, FRAGMENT_NAME +" onResume");
        Toast.makeText(getActivity(),"I am onResume from Fragment1", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i(TAG, FRAGMENT_NAME +" onPause");
        Toast.makeText(getActivity(),"I am onPause from Fragment1", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i(TAG, FRAGMENT_NAME +" onStop");
        Toast.makeText(getActivity(),"I am onStop from Fragment1", Toast.LENGTH_SHORT).show();
        super.onStop();
    }


    @Override
    public void onDestroyView() {
        Log.i(TAG, FRAGMENT_NAME +" onDestroyView");
        Toast.makeText(getActivity(),"I am onDestroyView from Fragment1", Toast.LENGTH_SHORT).show();
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, FRAGMENT_NAME +" onDestroy");
        Toast.makeText(getActivity(),"I am onDestroy from Fragment1", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i(TAG, FRAGMENT_NAME +" onDetach");
        Toast.makeText(getActivity(),"I am onDetach from Fragment1", Toast.LENGTH_SHORT).show();
        super.onDetach();
    }

    @Override
    public boolean onBackPressed() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        return false;
    }

}