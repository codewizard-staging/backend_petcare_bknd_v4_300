package com.app.petcare_bknd_v4.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.petcare_bknd_v4.model.Manager;
import com.app.petcare_bknd_v4.model.Pet;
import com.app.petcare_bknd_v4.model.PetCareCenter;
import com.app.petcare_bknd_v4.model.PetOwner;
import com.app.petcare_bknd_v4.model.Document;
import com.app.petcare_bknd_v4.model.PetService;
import com.app.petcare_bknd_v4.enums.PetServiceType;
import com.app.petcare_bknd_v4.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"petcare_bknd_v4_625\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}