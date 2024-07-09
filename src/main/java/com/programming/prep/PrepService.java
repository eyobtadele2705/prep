package com.programming.prep;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrepService {

    private final PrepRepo prepRepo;
    public List<Model> getUser() {
        return prepRepo.findAll();
    }

    public int createUser(Model model) {
        try {
            Model save = prepRepo.save(model);
            return save.getId();
        }
        catch (Exception e){
            return -1;
        }

    }


public String updateUser(Model model) {
    var user = prepRepo.findById(model.getId()).orElse(null);
    if (user != null){
        Model model1 = Model.builder()
                .id(user.getId())
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .email(model.getEmail())
                .job(model.getJob())
                .build();
        prepRepo.save(model1);
        return "User updated";
    }
    else {
        return "User not found";
    }
}

    public String deleteUser(int id) {
        try {
            prepRepo.deleteById(id);
            return "Deleted successfully";
        }
        catch (Exception e){
            return "Failed while deleting the user";
        }
    }
}
