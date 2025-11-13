package com.felipe.gs.gs_8_social_impact_work.api.dto;

public class TemaInfoResponse {
    private String tema;
    private String membro1;
    private String membro2;
    private String descricao;

    public TemaInfoResponse(String tema, String membro1, String membro2, String descricao) {
        this.tema = tema;
        this.membro1 = membro1;
        this.membro2 = membro2;
        this.descricao = descricao;
    }

    public String getTema() {
        return tema;
    }

    public String getMembro1() {
        return membro1;
    }

    public String getMembro2() {
        return membro2;
    }

    public String getDescricao() {
        return descricao;
    }
}
