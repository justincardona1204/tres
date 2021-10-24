/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usa.edu.ciclo3.Reto3.Web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import usa.edu.ciclo3.Reto3.Model.Score; 
import usa.edu.ciclo3.Reto3.Services.ScoreServices;  





/** 
 *
 * @author justi
 */
@RestController
@RequestMapping("/api/Score") // /api/Score/save
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ScoreController {
    
     
    @Autowired
    private ScoreServices objScoreService;

    @GetMapping("/all")
    public List<Score> getScores() {
        return objScoreService.getScores(); 
    }

    @GetMapping({"/id"})
    public Optional<Score> getIdScore(@PathVariable("id") int id) {
        return objScoreService.getIdScore(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score saveScore(@RequestBody Score objScor) {
        return objScoreService.saveScore(objScor);
    }

    
}
