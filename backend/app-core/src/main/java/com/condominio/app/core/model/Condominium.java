package com.condominio.app.core.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Condominium class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Setter
@Getter
public class Condominium extends BaseModel{

    private String name;

    // Lazer e Bem-estar
    private boolean swimmingPool;
    private String swimmingPoolDescription;

    private boolean sauna;
    private String saunaDescription;

    private boolean gym;
    private String gymDescription;

    private boolean gameRoom;
    private String gameRoomDescription;

    private boolean partyRoom;
    private String partyRoomDescription;

    private boolean barbecueArea;
    private String barbecueAreaDescription;

    private boolean sportsCourt; // deve existir mais de um tipo, a depdender do condomínio…
    // Se houver mais de um, aí descreve tudo junto
    private String sportsCourtDescription;

    private boolean playground;
    private String playgroundDescription;

    private boolean kidsRoom;
    private String kidsRoomDescription;

    private boolean walkingTrack;
    private String walkingTrackDescription;

    // Conveniência
    private boolean security24h;
    private String security24hDescription;

    private boolean elevator;
    private String elevatorDescription;

    private boolean visitorParking;
    private String visitorParkingDescription;

    private boolean sharedLaundry;
    private String sharedLaundryDescription;

    private boolean commonAreaWifi;
    private String commonAreaWifiDescription;

    // Serviços
    private boolean internalMarket;
    private String internalMarketDescription;

    private boolean petPlace;
    private String petPlaceDescription;

    private boolean petCare;
    private String petCareDescription;

    private boolean coworkingSpace;
    private String coworkingSpaceDescription;

    private boolean library;
    private String libraryDescription;

    private boolean deliveryRoom;
    private String deliveryRoomDescription;

    // Família
    private boolean toddlerRoom; // brinquedos em uma sala, brinquedoteca infantil…
    private String toddlerRoomDescription;

    private boolean kidsEventSpace;
    private String kidsEventSpaceDescription;

    private boolean changingRoom; // fraldário
    private String changingRoomDescription;

    // Sustentabilidade
    private boolean solarEnergy;
    private String solarEnergyDescription;

    private boolean waterReuse;
    private String waterReuseDescription;

    private boolean composting;
    private String compostingDescription;

    private boolean electricCarCharger;
    private String electricCarChargerDescription;
}