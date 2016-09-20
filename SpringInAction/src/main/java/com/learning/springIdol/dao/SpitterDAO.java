package com.learning.springIdol.dao;

import com.learning.springIdol.model.Spitter;

public interface SpitterDAO {
    public void addSpitter(Spitter spitter);
    public void saveSpitter(Spitter spitter);
    public Spitter getSpitterById(String id);
}
