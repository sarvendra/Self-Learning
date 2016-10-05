package com.learning.service;

import com.learning.dao.SpitterDao;
import com.learning.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("spitterService")
public class SpitterServiceImpl implements SpitterService {
    @Autowired
    private SpitterDao spitterDao;

    public void addSpitter(Spitter spitter) {
        spitterDao.addSpitter(spitter);
    }

    public void saveSpitter(Spitter spitter) {
        spitterDao.saveSpitter(spitter);
    }

    public Spitter getSpitterById(String id) {
        return spitterDao.getSpitterById(id);
    }
}
