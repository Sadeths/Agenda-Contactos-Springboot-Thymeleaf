package st.contactos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import st.contactos.modelo.Contacto;
import st.contactos.servicio.ContactoServicio;

@Controller
public class ContactoControlador {

    @Autowired
    ContactoServicio contactoServicio;

    @GetMapping("/")
    public String iniciar(ModelMap modelo){
        List<Contacto> contactos = contactoServicio.listarContactos();
        modelo.put("contactos", contactos);
        return "index"; //index.html
    }

    @GetMapping("/agregar")
    public String mostrarAgregar(){
        return "agregar";//agregar.html
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute("contactoForma") Contacto contacto){
        contactoServicio.guardarContacto(contacto);
        return "redirect:/"; //Redirigimos al controlador el path
    }

    @GetMapping("editar/{id}")
    public String mostrarEditar(@PathVariable(value= "id") int idContacto, ModelMap modelo){
        Contacto contacto = contactoServicio.buscarContactoPorId(idContacto);
        modelo.put("contacto", contacto);
        return "editar"; //editar.html
    }

    @PostMapping("/editar")
    public String editar(@ModelAttribute("contacto") Contacto contacto){
        contactoServicio.guardarContacto(contacto);
        return "redirect:/"; //Redirigimos al controlador path "/"
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value="id") int idContacto){
        Contacto contacto = new Contacto();
        contacto.setIdContacto(idContacto);
        contactoServicio.eliminarContacto(contacto);
        return "redirect:/"; //redireccionamos al path de inicio "/"

    }

}
