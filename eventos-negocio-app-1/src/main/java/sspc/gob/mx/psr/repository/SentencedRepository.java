package sspc.gob.mx.psr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sspc.gob.mx.psr.model.Sentenciado;

@Repository
public interface SentencedRepository extends JpaRepository<Sentenciado, Long> {
}
