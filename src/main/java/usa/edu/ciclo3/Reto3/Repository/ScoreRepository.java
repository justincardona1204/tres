/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usa.edu.ciclo3.Reto3.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.edu.ciclo3.Reto3.Model.Score;
import usa.edu.ciclo3.Reto3.Repository.Crud.ScoreCrud;


/**
 *
 * @author justi
 */
@Repository
public class ScoreRepository {
    
   @Autowired
    private ScoreCrud calificacion; 
    
     //obtengo todos los registros de la tabla categoria
    public List<Score> getScores() {
        return (List<Score>) calificacion.findAll();
    }
    //aqui me devuelve el id que seleccione y si no me devuelve otra cosa.
    public Optional<Score> getIdScores(int id) {
        return calificacion.findById(id);
    }
    // en este guardo un registro de tipo categoria 
    public Score saveScore(Score objScor) {
        return calificacion.save(objScor);

    }
    
    
}
