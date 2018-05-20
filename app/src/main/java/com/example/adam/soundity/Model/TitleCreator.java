package com.example.adam.soundity.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {
    static  TitleCreator _titleCreator;
    List<TitleParent> _titleParents;

    public TitleCreator(Context context){
        _titleParents = new ArrayList<>();

        _titleParents.add(new TitleParent("Alternative", "Guitar", "HIGH"));
        _titleParents.add(new TitleParent("Disco polo", "Sax", "LOW"));
        _titleParents.add(new TitleParent("Free Jazz", "Trumpet", "MEDIUM"));
        _titleParents.add(new TitleParent("Psycho Rock", "Guitar", "PRO"));
        _titleParents.add(new TitleParent("Indie pop", "Guitar", "LOW"));
        _titleParents.add(new TitleParent("Electronic beats", "Drums", "HIGH"));
        _titleParents.add(new TitleParent("Alternative", "Guitar", "HIGH"));
        _titleParents.add(new TitleParent("Classic", "Upright-bass", "PRO"));
        _titleParents.add(new TitleParent("Jazz", "Sax", "MEDIUM"));
        _titleParents.add(new TitleParent("Disco polo", "Guitar", "HIGH"));
        _titleParents.add(new TitleParent("Alternative", "Guitar", "HIGH"));
        _titleParents.add(new TitleParent("Disco polo", "Sax", "LOW"));
        _titleParents.add(new TitleParent("Free Jazz", "Trumpet", "MEDIUM"));
        _titleParents.add(new TitleParent("Psycho Rock", "Guitar", "PRO"));
        _titleParents.add(new TitleParent("Indie pop", "Guitar", "LOW"));
        _titleParents.add(new TitleParent("Electronic beats", "Drums", "HIGH"));
        _titleParents.add(new TitleParent("Alternative", "Guitar", "HIGH"));
        _titleParents.add(new TitleParent("Classic", "Upright-bass", "PRO"));
        _titleParents.add(new TitleParent("Jazz", "Sax", "MEDIUM"));
        _titleParents.add(new TitleParent("Disco polo", "Guitar", "HIGH"));
    }

    public static TitleCreator get(Context context){

        if (_titleCreator == null)
            _titleCreator = new TitleCreator(context);
        return _titleCreator;
    }

    public List<TitleParent> getAll() {
        return _titleParents;
    }
}
