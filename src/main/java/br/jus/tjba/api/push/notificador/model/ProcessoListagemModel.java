package br.jus.tjba.api.push.notificador.model;

public record ProcessoListagemModel(Long id, String numeroProcesso, UsuarioListagemModel usuario,
                                    SistemaListagemModel sistema) {
}
