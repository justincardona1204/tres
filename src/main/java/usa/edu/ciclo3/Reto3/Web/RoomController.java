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
import usa.edu.ciclo3.Reto3.Model.Room;
import usa.edu.ciclo3.Reto3.Services.RoomServices;



/**
 *
 * @author justi
 */
@RestController
@RequestMapping("/api/Room") // /api/Room/save
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class RoomController {
    
    @Autowired
    private RoomServices objRoomService;

    @GetMapping("/all")
    public List<Room> getRoom() {
        return objRoomService.getRooms(); 
    }

    @GetMapping({"/id"})
    public Optional<Room> getId(@PathVariable("id") int id) {
        return objRoomService.getId(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Room saveRoom(@RequestBody Room objR) {
        return objRoomService.saveRoom(objR);
    }

    
}
