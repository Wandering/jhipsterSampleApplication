package io.github.yyp.jhipster.application.service;

import io.github.yyp.jhipster.application.service.dto.TaskDTO;
import java.util.List;

/**
 * Service Interface for managing Task.
 */
public interface TaskService {

    /**
     * Save a task.
     *
     * @param taskDTO the entity to save
     * @return the persisted entity
     */
    TaskDTO save(TaskDTO taskDTO);

    /**
     * Get all the tasks.
     *
     * @return the list of entities
     */
    List<TaskDTO> findAll();

    /**
     * Get the "id" task.
     *
     * @param id the id of the entity
     * @return the entity
     */
    TaskDTO findOne(Long id);

    /**
     * Delete the "id" task.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the task corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @return the list of entities
     */
    List<TaskDTO> search(String query);
}
