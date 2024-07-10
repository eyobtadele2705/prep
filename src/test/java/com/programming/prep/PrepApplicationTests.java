package com.programming.prep;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class PrepApplicationTests {
/*
    @Mock
    private PrepRepo prepRepo;

    @InjectMocks
    private PrepService prepService;

    private Model validModel;
    private Model nullModel;
    private Model emptyModel;

    @BeforeEach
    public void setUp() {
        validModel = new Model(1, "Jane", "Doe", "john.doe@example.com", "Developer");
        nullModel = new Model(0, null, null, null, null);
        emptyModel = new Model(0, "", "", "", "");
    }

    @Test
    public void updateUser_validModel_shouldUpdateUser() {
        when(prepRepo.findById(validModel.getId())).thenReturn(java.util.Optional.of(validModel));

        prepService.updateUser(validModel);

        verify(prepRepo).save(any(Model.class));
    }

    @Test
    public void updateUser_nullModel_shouldThrowException() {
        assertThrows(NullPointerException.class, () -> prepService.updateUser(nullModel));
    }i

    @Test
    public void updateUser_emptyModel_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> prepService.updateUser(emptyModel));
    }

    @Test
    public void updateUser_userNotFound_shouldThrowException() {
        when(prepRepo.findById(validModel.getId())).thenReturn(java.util.Optional.empty());

        assertThrows(RuntimeException.class, () -> prepService.updateUser(validModel));
    }

    @Test
    public void updateUser_repoThrowsException_shouldThrowException() {
        when(prepRepo.findById(validModel.getId())).thenReturn(java.util.Optional.of(validModel));
        doThrow(new RuntimeException("Repository error")).when(prepRepo).save(any(Model.class));

        assertThrows(RuntimeException.class, () -> prepService.updateUser(validModel));
    }*/
}

