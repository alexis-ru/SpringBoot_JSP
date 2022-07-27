package com.mts.boot.jsp.api.service;


import com.mts.boot.jsp.api.entity.Flower;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface FlowerService {

    public List<Flower> getAllFlowers();

    public void saveFlower(Flower flower);

    public Flower getFlower(int id);

    void updateFlower(Flower flower);

    public void deleteFlower(int id);

    public List<Flower> addFlower();

    List<Flower> addFlower(Flower flower);
}
