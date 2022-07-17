package com.bootcamp.conectDDBB.service;

import com.bootcamp.conectDDBB.model.Coche;
import com.bootcamp.conectDDBB.repository.CocheRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CocheServiceImpl implements CocheService {

  private final CocheRepository cocheRepository;

  @Override
  public Coche addCoche(Coche coche) {
    return cocheRepository.save(coche);
  }
}
