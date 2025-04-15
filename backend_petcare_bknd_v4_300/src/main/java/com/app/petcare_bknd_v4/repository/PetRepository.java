package com.app.petcare_bknd_v4.repository;


import com.app.petcare_bknd_v4.model.Pet;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PetRepository extends SimpleJpaRepository<Pet, String> {
    private final EntityManager em;
    public PetRepository(EntityManager em) {
        super(Pet.class, em);
        this.em = em;
    }
    @Override
    public List<Pet> findAll() {
        return em.createNativeQuery("Select * from \"petcare_bknd_v4_625\".\"Pet\"", Pet.class).getResultList();
    }
}