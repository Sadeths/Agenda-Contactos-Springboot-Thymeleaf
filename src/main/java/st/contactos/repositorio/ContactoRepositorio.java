package st.contactos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import st.contactos.modelo.Contacto;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {

}
