package dip.dev.service;

import dip.dev.model.*;
import dip.dev.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ModelService {
    private final AcidRepo acidRepo;
    private final OilAcidRepo oilAcidRepo;
    private final OilRepo oilRepo;
    private final PlantOilRepo plantOilRepo;
    private final PlantOilAcidRepo plantOilAcidRepo;

    @Autowired
    public ModelService(AcidRepo acidRepo, OilAcidRepo oilAcidRepo, OilRepo oilRepo, PlantOilRepo plantOilRepo, PlantOilAcidRepo plantOilAcidRepo) {
        this.acidRepo = acidRepo;
        this.oilAcidRepo = oilAcidRepo;
        this.oilRepo = oilRepo;
        this.plantOilRepo = plantOilRepo;
        this.plantOilAcidRepo = plantOilAcidRepo;
    }

    public Acid addAcid(Acid acid) {

        return acidRepo.save(acid);
    }

    public OilAcid addOilAcid(OilAcid oilAcid) {

        return oilAcidRepo.save(oilAcid);
    }

    public Oil addOil(Oil oil) {

        return oilRepo.save(oil);
    }

    public PlantOil addPlantOil(PlantOil plantOil) {

        return plantOilRepo.save(plantOil);
    }

    public PlantOilAcid addPlantOilAcid(PlantOilAcid plantOilAcid) {

        return plantOilAcidRepo.save(plantOilAcid);
    }

    public List<Acid> findAllAcid() {
        return acidRepo.findAll();
    }
    public List<OilAcid> findAllOilAcid() {
        return oilAcidRepo.findAll();
    }
    public List<Oil> findAllOil() {
        return oilRepo.findAll();
    }
    public List<PlantOil> findAllPlantOil() {
        return plantOilRepo.findAll();
    }
    public List<PlantOilAcid> findAllPlantOilAcid() {
        return plantOilAcidRepo.findAll();
    }

    public Acid updateAcid(Acid acid) {
        return acidRepo.save(acid);
    }
    public OilAcid updateOilAcid(OilAcid oilAcid) {
        return oilAcidRepo.save(oilAcid);
    }
    public Oil updateOil(Oil oil) {
        return oilRepo.save(oil);
    }
    public PlantOil updatePlantOil(PlantOil plantOil) {
        return plantOilRepo.save(plantOil);
    }
    public PlantOilAcid updatePlantOilAcid(PlantOilAcid plantOilAcid) {
        return plantOilAcidRepo.save(plantOilAcid);
    }


    public void deleteAcid(Long id_acid) {
        acidRepo.deleteAcidById_acid(id_acid);
    }
    public void deleteOilAcid(Long id_acid_oil) {
        oilAcidRepo.deleteOilAcidById_acid_oil(id_acid_oil);
    }
    public void deleteOil(Long id_oil) {
        oilRepo.deleteOilById_oil(id_oil);
    }

    public void deletePlantOil(Long id_plant_oil) {
        plantOilRepo.deletePlantOilById_plant_oil(id_plant_oil);
    }

    public void deletePlantOilAcid(Long id_acid_plant) {
        plantOilAcidRepo.deletePlantOilAcidById_acid_plant(id_acid_plant);
    }



}
