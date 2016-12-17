package com.example.aluno.fragments;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements BlankFragment.OnFragmentInteractionListener,
                    GrayFragment.OnFragmentInteractionListener,
                    GreenFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(android.R.id.content, BlankFragment.newInstance(null, null));
        fragmentTransaction.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(android.R.id.content, GrayFragment.newInstance(null, null));
        fragmentTransaction.addToBackStack("voltar");
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteractionGray(Uri uri) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(android.R.id.content, GreenFragment.newInstance(null, null));
        fragmentTransaction.addToBackStack("voltar");
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteractionGreen(Uri uri) {

    }
}
