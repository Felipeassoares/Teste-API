package com.capgemini.TesteAPI.controller;

import com.capgemini.TesteAPI.model.Usuario;
import com.capgemini.TesteAPI.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @RequestMapping(value = "/mostrarnome/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String usuarioText(@PathVariable String name) {
        return "Curso Spring Boot API" + name + "!";
    }

    @RequestMapping(value = "/olamundo/{nome}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String retornaOlaMundo(@PathVariable String nome) {

        return "Ola mundo" + nome;
    }

    @GetMapping(value = "listatodos")
    @ResponseBody
    public ResponseEntity<List<Usuario>> listaUsuario() {

        usuarioRepository.findAll();

        List<Usuario> usuarios = usuarioRepository.findAll();

        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
    }

    @PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {

        Usuario user = usuarioRepository.save(usuario);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping(value = "atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizar(@RequestBody Usuario usuario) {

        if (usuario.getId() ==null){
            return new ResponseEntity<String>("Error 404 NOT FOUND", HttpStatus.NOT_FOUND);
        }

        Usuario user = usuarioRepository.saveAndFlush(usuario);

        return new ResponseEntity<Usuario>(user, HttpStatus.OK);
    }

    @DeleteMapping(value = "delete")
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Long iduser) {

        usuarioRepository.deleteById(iduser);

        return new ResponseEntity<String>("User deletado com sucesso", HttpStatus.OK);
    }

}


