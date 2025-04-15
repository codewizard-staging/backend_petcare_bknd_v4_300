package com.app.petcare_bknd_v4.repository;


import com.app.petcare_bknd_v4.model.PetCareCenter;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PetCareCenterRepository extends SimpleJpaRepository<PetCareCenter, String> {
    private final EntityManager em;
    public PetCareCenterRepository(EntityManager em) {
        super(PetCareCenter.class, em);
        this.em = em;
    }
    @Override
    public List<PetCareCenter> findAll() {
        return em.createNativeQuery("Select * from \"petcare_bknd_v4_625\".\"PetCareCenter\"", PetCareCenter.class).getResultList();
    }
}