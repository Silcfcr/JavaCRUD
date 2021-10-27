package com.silvia.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.silvia.models.Language;

@Repository
//Long tipo de primary Id del model, osea puede ser int....
public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
//	Optional<Language> findById( int id ); // SELECT * FROM languages WHERE identifier=id
//	Language save( Language language );

}
