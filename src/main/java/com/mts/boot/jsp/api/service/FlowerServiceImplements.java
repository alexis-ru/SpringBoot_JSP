package com.mts.boot.jsp.api.service;

import com.mts.boot.jsp.api.dao.FlowerRepository;
import com.mts.boot.jsp.api.entity.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FlowerServiceImplements implements FlowerService{

    private final FlowerRepository flowerRepository;


    @Autowired
    public FlowerServiceImplements(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    @Override
    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    @Override
    public void saveFlower(Flower flower) {
        flowerRepository.save(flower);
    }


    @Override
    public Flower getFlower(int id) {
        Optional<Flower> result = flowerRepository.findById(id);
        return result.orElseThrow();
    }

    @Override
    public void updateFlower(Flower flower) {
        updateFlower(flower);
    }


    @Override
    public void deleteFlower(int id) {
        flowerRepository.deleteById(id);
    }

    @Override
    public List<Flower> addFlower() {
        return addFlower();
    }

    @Override
    public List<Flower> addFlower(Flower flower) {
        return addFlower(flower);
    }
}
