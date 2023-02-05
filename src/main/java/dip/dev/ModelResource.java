package dip.dev;

//
import dip.dev.model.*;
import dip.dev.service.ModelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@CrossOrigin(origins = "https://diplom-538ce.web.app/")
@CrossOrigin(origins = "http://localhost:4200/")
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
    @GetMapping("/sorts/all")
    public ResponseEntity<List<Sort>> getAllSort(){
        List<Sort> sort = modelService.findAllSorts();
        return new ResponseEntity<>(sort, HttpStatus.OK);
    }
    @PutMapping("/acid/update")
    public ResponseEntity<Acid> updateAcid(@RequestBody Acid acid){
        Acid updateAcid = modelService.updateAcid(acid);
        return new ResponseEntity<>(updateAcid, HttpStatus.OK);
    }
    @PostMapping("/acid/add")
    public ResponseEntity<Acid> addAcid(@RequestBody Acid acid){
        Acid newAcid = modelService.addAcid(acid);
        return new ResponseEntity<>(newAcid, HttpStatus.CREATED);
    }
    @Transactional
    @DeleteMapping("/acid/delete/{id}")
    public ResponseEntity<?> deleteAcid(@PathVariable("id") Long id) {
        modelService.deleteAcid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/oilAcid/all")
    public ResponseEntity<List<OilAcid>> getAllOilAcid(){
        List<OilAcid> oilAcid = modelService.findAllOilAcid();
        return new ResponseEntity<>(oilAcid, HttpStatus.OK);
    }
    @PostMapping("/oilAcid/add")
    public ResponseEntity<OilAcid> addOilAcid(@RequestBody OilAcid oilAcid){
        OilAcid newOilAcid = modelService.addOilAcid(oilAcid);
        return new ResponseEntity<>(newOilAcid, HttpStatus.CREATED);
    }
    @PutMapping("/oilAcid/update")
    public ResponseEntity<OilAcid> updateOilAcid(@RequestBody OilAcid oilAcid){
        OilAcid updateOilAcid = modelService.updateOilAcid(oilAcid);
        return new ResponseEntity<>(updateOilAcid, HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping("/oilAcid/delete/{id}")
    public ResponseEntity<?> deleteOilAcid(@PathVariable("id") Long id) {
        modelService.deleteOilAcid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/oil/all")
    public ResponseEntity<List<Oil>> getAllOil(){
        List<Oil> oil = modelService.findAllOil();
        return new ResponseEntity<>(oil, HttpStatus.OK);
    }
    @PostMapping("/oil/add")
    public ResponseEntity<Oil> addOil(@RequestBody Oil oil){
        Oil newOil = modelService.addOil(oil);
        return new ResponseEntity<>(newOil, HttpStatus.CREATED);
    }
    @PutMapping("/oil/update")
    public ResponseEntity<Oil> updateOil(@RequestBody Oil oil){
        Oil updateOil = modelService.updateOil(oil);
        return new ResponseEntity<>(updateOil, HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping("/oil/delete/{id}")
    public ResponseEntity<?> deleteOil(@PathVariable("id") Long id) {
        modelService.deleteOil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/plantOil/all")
    public ResponseEntity<List<PlantOil>> getAllPlantOil(){
        List<PlantOil> plantOil = modelService.findAllPlantOil();
        return new ResponseEntity<>(plantOil, HttpStatus.OK);
    }
    @PostMapping("/plantOil/add")
    public ResponseEntity<PlantOil> addPlantOil(@RequestBody PlantOil plantOil){
        PlantOil newPlantOil = modelService.addPlantOil(plantOil);
        return new ResponseEntity<>(newPlantOil, HttpStatus.CREATED);
    }
    @PutMapping("/plantOil/update")
    public ResponseEntity<PlantOil> updatePlantOil(@RequestBody PlantOil plantOil){
        PlantOil updatePlantOil = modelService.updatePlantOil(plantOil);
        return new ResponseEntity<>(updatePlantOil, HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping("/plantOil/delete/{id}")
    public ResponseEntity<?> deletePlantOil(@PathVariable("id") Long id) {
        modelService.deletePlantOil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/plantOilAcid/all")
    public ResponseEntity<List<PlantOilAcid>> getAllPlantOilAcid(){
        List<PlantOilAcid> plantOilAcid = modelService.findAllPlantOilAcid();
        return new ResponseEntity<>(plantOilAcid, HttpStatus.OK);
    }
    @PostMapping("/plantOilAcid/add")
    public ResponseEntity<PlantOilAcid> addPlantOilAcid(@RequestBody PlantOilAcid plantOilAcid){
        PlantOilAcid newPlantOilAcid = modelService.addPlantOilAcid(plantOilAcid);
        return new ResponseEntity<>(newPlantOilAcid, HttpStatus.CREATED);
    }
    @PutMapping("/plantOilAcid/update")
    public ResponseEntity<PlantOilAcid> updatePlantOilAcid(@RequestBody PlantOilAcid plantOilAcid){
        PlantOilAcid updatePlantOilAcid = modelService.updatePlantOilAcid(plantOilAcid);
        return new ResponseEntity<>(updatePlantOilAcid, HttpStatus.OK);
    }
    @Transactional
    @DeleteMapping("/plantOilAcid/delete/{id}")
    public ResponseEntity<?> deletePlantOilAcid(@PathVariable("id") Long id) {
        modelService.deletePlantOilAcid(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
