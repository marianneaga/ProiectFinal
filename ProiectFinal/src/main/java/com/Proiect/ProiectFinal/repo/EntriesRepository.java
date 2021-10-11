package com.Proiect.ProiectFinal.repo;

import com.Proiect.ProiectFinal.models.Entries;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EntriesRepository extends CrudRepository <Entries, UUID> {
}
