package br.gov.elotutelar.elo_tutelar_app.model;

import java.time.LocalDateTime;
import java.util.UUID;

import br.gov.elotutelar.elo_tutelar_app.unums.StatusDenuncia;
import br.gov.elotutelar.elo_tutelar_app.unums.TipoViolencia;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "denuncia")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    String protocolo;
    @Column(length = 5000)
    String descricao;
    TipoViolencia tipoViolencia;
    LocalDateTime dataHoraRegistro;
    StatusDenuncia status;

    String endereco;
    String numero;
    String bairro;
    String pontoReferencia;
    String nomeVitima;
    String provavelAutor;

}
