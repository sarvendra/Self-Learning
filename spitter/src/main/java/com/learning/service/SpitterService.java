package com.learning.service;

import com.learning.model.Spitter;

public interface SpitterService {
    public void addSpitter(Spitter spitter);
    public void saveSpitter(Spitter spitter);
    public Spitter getSpitterById(String id);
    public Spitter getSpitterByUsername(String username);
}
