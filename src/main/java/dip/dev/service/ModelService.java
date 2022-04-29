package dip.dev.service;

import dip.dev.model.*;
import dip.dev.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ModelService {
    private final AcidRepo acidRepo;
    private final oAcidRepo oAcidRepo;
    private final OilRepo oilRepo;
    private final PlantOilRepo plantOilRepo;
    private final PoAcidRepo poAcidRepo;

    @Autowired
    public ModelService(AcidRepo acidRepo, dip.dev.repo.oAcidRepo oAcidRepo, OilRepo oilRepo, PlantOilRepo plantOilRepo, PoAcidRepo poAcidRepo) {
        this.acidRepo = acidRepo;
        this.oAcidRepo = oAcidRepo;
        this.oilRepo = oilRepo;
        this.plantOilRepo = plantOilRepo;
        this.poAcidRepo = poAcidRepo;
    }

    public Acid addAcid(Acid acid) {

        return acidRepo.save(acid);
    }

    public O_Acid addO_Acid(O_Acid o_acid) {

        return oAcidRepo.save(o_acid);
    }

    public Oil addOil(Oil oil) {

        return oilRepo.save(oil);
    }

    public PlantOil addPlantOil(PlantOil plantOil) {

        return plantOilRepo.save(plantOil);
    }

    public Po_Acid addPo_Acid(Po_Acid poAcid) {

        return poAcidRepo.save(poAcid);
    }

    public List<Acid> findAllAcid() {
        return acidRepo.findAll();
    }
    public List<O_Acid> findAllO_Acid() {
        return oAcidRepo.findAll();
    }
    public List<Oil> findAllOil() {
        return oilRepo.findAll();
    }
    public List<PlantOil> findAllPlantOil() {
        return plantOilRepo.findAll();
    }
    public List<Po_Acid> findAllPo_Acid() {
        return poAcidRepo.findAll();
    }

    public Acid updateAcid(Acid acid) {
        return acidRepo.save(acid);
    }
    public O_Acid updateO_Acid(O_Acid o_acid) {
        return oAcidRepo.save(o_acid);
    }
    public Oil updateOil(Oil oil) {
        return oilRepo.save(oil);
    }
    public PlantOil updatePlantOil(PlantOil plantOil) {
        return plantOilRepo.save(plantOil);
    }
    public Po_Acid updatePo_Acid(Po_Acid poAcid) {
        return poAcidRepo.save(poAcid);
    }


    public void deleteAcid(Long id_acid) {
        acidRepo.deleteAcidById_acid(id_acid);
    }
    public void deleteO_Acid(Long id_acid) {
        oAcidRepo.deleteO_AcidById_oil(id_acid);
    }
    public void deleteOil(Long id_acid) {
        oilRepo.deleteOilById_oil(id_acid);
    }
    public void deletePlantOil(Long id_acid) {
        plantOilRepo.deletePlantOilById_plant_oil(id_acid);
    }
    public void deletePo_Acid(Long id_acid) {
        poAcidRepo.deletePo_AcidById_plant_oil(id_acid);
    }



}
