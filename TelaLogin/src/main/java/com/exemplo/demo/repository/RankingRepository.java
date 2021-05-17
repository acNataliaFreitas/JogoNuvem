package com.exemplo.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo.demo.domain.Ranking;


@Repository
public interface RankingRepository extends JpaRepository<Ranking, Integer> {

	List<Ranking> findByNivelOrderByPontuacaoDesc(String nivel);

}
