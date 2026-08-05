package repositores;

import com.example.aula.java.models.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface funcionario extends JpaRepository<FuncionarioModel, Long> {
}
