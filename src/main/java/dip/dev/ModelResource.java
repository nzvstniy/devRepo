package dip.dev;


import dip.dev.model.*;
import dip.dev.repo.OilRepo;
import dip.dev.repo.PlantOilRepo;
import dip.dev.repo.PoAcidRepo;
import dip.dev.repo.oAcidRepo;
import dip.dev.service.ModelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/table")
public class ModelResource {
    private final ModelService modelService;


    public ModelResource(ModelService modelService) {
        this.modelService = modelService;

    }

    @GetMapping("/acid/all")
    public ResponseEntity<List<Acid>> getAllAcid(){
        List<Acid> acid = modelService.findAllAcid();
        return new ResponseEntity<>(acid, HttpStatus.OK);
    }
    @GetMapping("/oAcid/all")
    public ResponseEntity<List<O_Acid>> getAllO_Acid(){
        List<O_Acid> o_acid = modelService.findAllO_Acid();
        return new ResponseEntity<>(o_acid, HttpStatus.OK);
    }
    @GetMapping("/oil/all")
    public ResponseEntity<List<Oil>> getAllOil(){
        List<Oil> oil = modelService.findAllOil();
        return new ResponseEntity<>(oil, HttpStatus.OK);
    }
    @GetMapping("/plantOil/all")
    public ResponseEntity<List<PlantOil>> getAllPlantOil(){
        List<PlantOil> plantOil = modelService.findAllPlantOil();
        return new ResponseEntity<>(plantOil, HttpStatus.OK);
    }
    @GetMapping("/poAcid/all")
    public ResponseEntity<List<Po_Acid>> getAllPo_Acid(){
        List<Po_Acid> po_acid = modelService.findAllPo_Acid();
        return new ResponseEntity<>(po_acid, HttpStatus.OK);
    }


    @PostMapping("/acid/add")
    public ResponseEntity<Acid> addAcid(@RequestBody Acid acid){
        Acid newAcid = modelService.addAcid(acid);
        return new ResponseEntity<>(newAcid, HttpStatus.CREATED);
    }

    @PostMapping("/oAcid/add")
    public ResponseEntity<O_Acid> addO_Acid(@RequestBody O_Acid o_acid){
        O_Acid newO_Acid = modelService.addO_Acid(o_acid);
        return new ResponseEntity<>(newO_Acid, HttpStatus.CREATED);
    }

    @PostMapping("/oil/add")
    public ResponseEntity<Oil> addOil(@RequestBody Oil oil){
        Oil newOil = modelService.addOil(oil);
        return new ResponseEntity<>(newOil, HttpStatus.CREATED);
    }

    @PostMapping("/plantOil/add")
    public ResponseEntity<PlantOil> addPlantOil(@RequestBody PlantOil plantOil){
        PlantOil newPlantOil = modelService.addPlantOil(plantOil);
        return new ResponseEntity<>(newPlantOil, HttpStatus.CREATED);
    }

    @PostMapping("/poAcid/add")
    public ResponseEntity<Po_Acid> addPo_Acid(@RequestBody Po_Acid poAcid){
        Po_Acid newPo_Acid = modelService.addPo_Acid(poAcid);
        return new ResponseEntity<>(newPo_Acid, HttpStatus.CREATED);
    }

    @PutMapping("/acid/update")
    public ResponseEntity<Acid> updateAcid(@RequestBody Acid acid){
        Acid updateAcid = modelService.updateAcid(acid);
        return new ResponseEntity<>(updateAcid, HttpStatus.OK);
    }
    @PutMapping("/oAcid/update")
    public ResponseEntity<O_Acid> updateO_Acid(@RequestBody O_Acid o_acid){
        O_Acid updateO_Acid = modelService.updateO_Acid(o_acid);
        return new ResponseEntity<>(updateO_Acid, HttpStatus.OK);
    }
    @PutMapping("/oil/update")
    public ResponseEntity<Oil> updateOil(@RequestBody Oil oil){
        Oil updateOil = modelService.updateOil(oil);
        return new ResponseEntity<>(updateOil, HttpStatus.OK);
    }
    @PutMapping("/plantOil/update")
    public ResponseEntity<PlantOil> updatePlantOil(@RequestBody PlantOil plantOil){
        PlantOil updatePlantOil = modelService.updatePlantOil(plantOil);
        return new ResponseEntity<>(updatePlantOil, HttpStatus.OK);
    }
    @PutMapping("/poAcid/update")
    public ResponseEntity<Po_Acid> updatePo_Acid(@RequestBody Po_Acid po_acid){
        Po_Acid updatePo_Acid = modelService.updatePo_Acid(po_acid);
        return new ResponseEntity<>(updatePo_Acid, HttpStatus.OK);
    }


    @Transactional
    @DeleteMapping("/acid/delete/{id}")
    public ResponseEntity<?> deleteAcid(@PathVariable("id") Long id) {
        modelService.deleteAcid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/oAcid/delete/{id}")
    public ResponseEntity<?> deleteO_Acid(@PathVariable("id") Long id) {
        modelService.deleteO_Acid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/oil/delete/{id}")
    public ResponseEntity<?> deleteOil(@PathVariable("id") Long id) {
        modelService.deleteOil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/plantOil/delete/{id}")
    public ResponseEntity<?> deletePlantOil(@PathVariable("id") Long id) {
        modelService.deletePlantOil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/poAcid/delete/{id}")
    public ResponseEntity<?> deletePo_Acid(@PathVariable("id") Long id) {
        modelService.deletePo_Acid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
