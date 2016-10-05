package com.learning.service;

import com.learning.dao.SpittleDao;
import com.learning.model.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("spittleService")
public class SpittleServiceImpl implements SpittleService {
    @Autowired
    private SpittleDao spittleDao;

    public void addSpittle(Spittle spittle) {
        spittleDao.addSpittle(spittle);
    }

    public void saveSpittle(Spittle spittle) {
        spittleDao.saveSpittle(spittle);
    }

    public Spittle getSpittleById(String id) {
        return spittleDao.getSpittleById(id);
    }

    public List<Spittle> getRecentSpittles(int size) {
        return spittleDao.getRecentSpittles(size);
    }
}