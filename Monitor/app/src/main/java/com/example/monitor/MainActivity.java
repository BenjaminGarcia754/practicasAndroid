package com.example.monitor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.monitor.databinding.ActivityMainBinding;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding.eqRecycler.setLayoutManager(new LinearLayoutManager(this));
        EqAdapter adapter = new EqAdapter();
        binding.eqRecycler.setAdapter(adapter);
        List<Earthquake> eqList = new List<Earthquake>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(@Nullable Object o) {
                return false;
            }

            @NonNull
            @Override
            public Iterator<Earthquake> iterator() {
                return null;
            }

            @NonNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NonNull
            @Override
            public <T> T[] toArray(@NonNull T[] ts) {
                return null;
            }

            @Override
            public boolean add(Earthquake earthquake) {
                return false;
            }

            @Override
            public boolean remove(@Nullable Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(@NonNull Collection<? extends Earthquake> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, @NonNull Collection<? extends Earthquake> collection) {
                return false;
            }

            @Override
            public boolean removeAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(@NonNull Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Earthquake get(int i) {
                return null;
            }

            @Override
            public Earthquake set(int i, Earthquake earthquake) {
                return null;
            }

            @Override
            public void add(int i, Earthquake earthquake) {

            }

            @Override
            public Earthquake remove(int i) {
                return null;
            }

            @Override
            public int indexOf(@Nullable Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(@Nullable Object o) {
                return 0;
            }

            @NonNull
            @Override
            public ListIterator<Earthquake> listIterator() {
                return null;
            }

            @NonNull
            @Override
            public ListIterator<Earthquake> listIterator(int i) {
                return null;
            }

            @NonNull
            @Override
            public List<Earthquake> subList(int i, int i1) {
                return null;
            }
        };
        adapter.submitList(eqList);
    }
}