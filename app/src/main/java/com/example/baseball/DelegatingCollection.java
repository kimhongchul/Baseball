package com.example.baseball;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DelegatingCollection<T> implements Collection<T> {

    private ArrayList<T> innerList = new ArrayList<>();

    @Override
    public int size() {
        return innerList.size();
    }

    @Override
    public boolean isEmpty() {
        return innerList.isEmpty();
    }

    @Override
    public boolean contains(@Nullable Object o) {
        return innerList.contains(o);
    }

    @NonNull
    @Override
    public Iterator<T> iterator() {
        return innerList.iterator();
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return innerList.toArray();
    }

    @NonNull
    @Override
    public <T1> T1[] toArray(@NonNull T1[] a) {
        return innerList.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return innerList.add(t);
    }

    @Override
    public boolean remove(@Nullable Object o) {
        return innerList.remove(o);
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return innerList.containsAll(c);
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends T> c) {
        return innerList.addAll(c);
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return innerList.removeAll(c);
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return innerList.retainAll(c);
    }

    @Override
    public void clear() {
        innerList.clear();
    }
}
