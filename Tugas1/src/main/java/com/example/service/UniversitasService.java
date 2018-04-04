package com.example.service;

import com.example.model.UniversitasModel;

public interface UniversitasService extends DataService<UniversitasModel> {
	UniversitasModel selectUniversitasByName(String name);
}
