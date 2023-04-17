package Classes;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

public boolean equals(Object objeto){
    if(objeto instanceof Usuario){ // instanceof ?
        Usuario outro = (Usuario) objeto; // cast = conversão

        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
        return nomeIgual && emailIgual;
    } else {
        return false;
    }
}
}
