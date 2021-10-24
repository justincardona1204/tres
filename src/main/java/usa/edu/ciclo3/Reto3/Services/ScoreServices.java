/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usa.edu.ciclo3.Reto3.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.edu.ciclo3.Reto3.Model.Score;
import usa.edu.ciclo3.Reto3.Repository.ScoreRepository;


/**
 *
 * @author justi
 */
@Service
public class ScoreServices {
    
    @Autowired
    private ScoreRepository calificacion;

    public List<Score> getScores() {
        return calificacion.getScores();
    }

    public Optional<Score> getIdScores(int id) {
        return calificacion.getIdScores(id);
    }

    public Score saveScore(Score objScore) {
        if (objScore.getId() == null) {
            return calificacion.saveScore(objScore);
        } else {
            Optional<Score> ScoreAux = calificacion.getIdScores(objScore.getId());

            if (ScoreAux.isEmpty()) {
                return calificacion.saveScore(objScore);
            } else {
                return objScore;
            }
        }
    }

    public Optional<Score> getIdScore(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
