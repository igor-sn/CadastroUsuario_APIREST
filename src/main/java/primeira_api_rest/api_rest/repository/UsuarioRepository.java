package primeira_api_rest.api_rest.repository;

import org.springframework.data.repository.CrudRepository;

import primeira_api_rest.api_rest.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{

}
