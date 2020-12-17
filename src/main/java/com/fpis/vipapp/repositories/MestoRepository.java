package com.fpis.vipapp.repositories;

import com.fpis.vipapp.model.domain.Mesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MestoRepository extends JpaRepository<Mesto, Integer> {

    Mesto save(Mesto mesto);

    Mesto findByNaziv(String naziv);
}
