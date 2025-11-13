package com.felipe.gs.gs_8_social_impact_work.api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.gs.gs_8_social_impact_work.api.dto.TemaInfoResponse;

@RestController
@Tag(name = "Tema", description = "Informações da Global Solution")
public class TemaController {

    @GetMapping("/info")
    @Operation(summary = "Retorna informações sobre o tema e membros do grupo")
    public ResponseEntity<TemaInfoResponse> getInfo() {

        TemaInfoResponse response = new TemaInfoResponse(
                "Modelos de trabalho baseados em impacto social e sustentabilidade",
                "Felipe Cardoso Scalesse Ferreira - RM 99062",
                "Carlos Augusto Gorgulho - RM 98456",
                "Esta API apresenta informações sobre modelos de trabalho baseados em impacto social e sustentabilidade. "
                        +
                        "A ideia é conectar organizações e profissionais a iniciativas que gerem valor social mensurável, "
                        +
                        "promovendo práticas de trabalho responsáveis, transparência no uso de recursos e monitoramento de "
                        +
                        "indicadores ambientais, sociais e de governança (ESG).");

        return ResponseEntity.ok(response);
    }
}
