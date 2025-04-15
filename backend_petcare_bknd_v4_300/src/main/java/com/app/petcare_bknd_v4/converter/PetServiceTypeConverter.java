package com.app.petcare_bknd_v4.converter;

import com.app.petcare_bknd_v4.enums.PetServiceType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class PetServiceTypeConverter implements AttributeConverter<PetServiceType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PetServiceType petServiceType) {
        return petServiceType != null ? petServiceType.ordinal() : null;
    }

    @Override
    public PetServiceType convertToEntityAttribute(Integer dbData) {
		return PetServiceType.getPetServiceType(dbData);
    }
}
