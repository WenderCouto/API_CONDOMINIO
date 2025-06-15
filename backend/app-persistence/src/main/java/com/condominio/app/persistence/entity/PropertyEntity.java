package com.condominio.app.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * PropertyEntity class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Entity
@Table(name = "properties")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyEntity extends BaseEntity {
    private String title;
    private String description;
    private String address;
    private String complement;
    private String postalCode;
    private String neighborhood;
    private String city;
    private String state;
    private String country;

    private BigDecimal area;
    private Integer bedrooms;
    private Integer bathrooms;
    private Integer parkingSpaces;

    private boolean furnished;
    private boolean hasElevator;
    private boolean isCondominium;

    private String registrationNumber;
    private String notes;
}