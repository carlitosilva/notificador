package br.jus.tjba.api.push.notificador.amqp;

import br.jus.tjba.api.push.notificador.domain.services.EmailService;
import br.jus.tjba.api.push.notificador.model.ProcessoListagemModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcessoListener {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = "processo.movimentado")
    public void recebeMensagem(ProcessoListagemModel processo) {


        var to = "carlito.silva@gmail.com";
        String assunto = """
                Sistema %s - 
                O processo %s foi movimentado. 
                """.formatted(processo.sistema().sigla(),
                processo.numeroProcesso());
        emailService.sendMail(to, assunto, assunto);


    }
}
