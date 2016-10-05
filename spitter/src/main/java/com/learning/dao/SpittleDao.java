package com.learning.dao;

import com.learning.model.Spitter;
import com.learning.model.Spittle;

import java.util.List;

public interface SpittleDao {
    public void addSpittle(Spittle spittle);
    public void saveSpittle(Spittle spittle);
    public Spittle getSpittleById(String id);
    public List<Spittle> getRecentSpittles(int size);
}
