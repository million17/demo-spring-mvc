package application.service.impl;

import application.converter.NewConverter;
import application.dto.NewDTO;
import application.entity.NewEntity;
import application.repository.NewRepository;
import application.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewService implements INewService {

    @Autowired
    private NewRepository newRepository;

    @Autowired
    private NewConverter newConverter;


    @Override
    public List<NewDTO> findAll() {
        List<NewDTO> models = new ArrayList<>();
        List<NewEntity> entities = newRepository.findAll();
        for (NewEntity item : entities) {
            NewDTO newDTO = newConverter.toDTO(item);
            models.add(newDTO);
        }
        return models;
    }

    @Override
    public NewDTO findById(long id) {
        NewEntity entity = newRepository.findOne(id);
        return newConverter.toDTO(entity);
    }
}