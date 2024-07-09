package com.programming.prep;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class PrepController {

    private final PrepService prepService;

    /**
 * Retrieves a list of {@link Model} objects from the database.
 *
 * @return A list of {@link Model} objects.
 *
 * @throws Exception If an error occurs while retrieving the data.
 */
@GetMapping
public List<Model> getUser(){
    return prepService.getUser();
}

    @PostMapping
    public int createUser(@RequestBody Model model ){
        return prepService.createUser(model);
    }

    @PutMapping
    public String updateUser(@RequestBody Model model) {
        return prepService.updateUser(model);
    }

    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable("id") int id){
        return prepService.deleteUser(id);
    }

}
