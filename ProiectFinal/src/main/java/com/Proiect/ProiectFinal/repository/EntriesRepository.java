package com.Proiect.ProiectFinal.repository;

import com.Proiect.ProiectFinal.models.Entry;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EntriesRepository extends CrudRepository <Entry, UUID> {
}
