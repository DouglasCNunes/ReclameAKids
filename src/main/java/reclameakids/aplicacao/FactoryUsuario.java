package reclameakids.aplicacao;

import reclameakids.entidades.Administrador;
import reclameakids.entidades.Avaliador;
import reclameakids.entidades.ResponsavelEmpresa;
import reclameakids.entidades.Usuario;

public class FactoryUsuario {
  public static Usuario geraUsuario(Class clazz, String email, String nome, String senha) {
    Usuario gerador = null;
    if (clazz.equals(Administrador.class)) {
      gerador = new Administrador(email, senha, nome);
    } else if (clazz.equals(Avaliador.class)) {
      gerador = new Avaliador(email, senha, nome);
    } else if (clazz.equals(ResponsavelEmpresa.class)){
      gerador = new ResponsavelEmpresa(email, senha, nome, null);
    } else {
      throw new Error("Esse tipo de usuário não existe");
    }
    return gerador;
  }
}
