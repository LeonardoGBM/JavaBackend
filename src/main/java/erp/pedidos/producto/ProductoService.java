package erp.pedidos.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository repository;
    //CRUD
    //Delimitador de acceso (public, private) tipo de dato de retorno, nombre del metodo, param,etros de entrada [sentencias]
    public Producto save(Producto entity){
        return repository.save(entity);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }


}
