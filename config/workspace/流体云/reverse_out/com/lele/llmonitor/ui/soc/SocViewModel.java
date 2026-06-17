package com.lele.llmonitor.ui.soc;
public final class SocViewModel extends kz3 {
    public static final int $stable = 8;
    private final m52 _uiState;
    private final com.lele.llmonitor.data.soc.SocRepository repository;
    private final dg3 uiState;

    public SocViewModel()
    {
        this(0, 1, 0);
        return;
    }

    public SocViewModel(com.lele.llmonitor.data.soc.SocRepository p7)
    {
        p7.getClass();
        this.repository = p7;
        iw v7_1 = gg3.a(new com.lele.llmonitor.ui.soc.SocUiState(0, 0, 0, 7, 0));
        this._uiState = v7_1;
        this.uiState = new tr2(v7_1);
        xt3.I(l02.y(this), 0, 0, new com.lele.llmonitor.ui.soc.SocViewModel$1(this, 0), 3);
        return;
    }

    public synthetic SocViewModel(com.lele.llmonitor.data.soc.SocRepository p1, int p2, ic0 p3)
    {
        if ((p2 & 1) != 0) {
            p1 = new com.lele.llmonitor.data.soc.SocRepository(0, 1, 0);
        }
        this(p1);
        return;
    }

    public static final synthetic com.lele.llmonitor.data.soc.SocRepository access$getRepository$p(com.lele.llmonitor.ui.soc.SocViewModel p0)
    {
        return p0.repository;
    }

    public static final synthetic m52 access$get_uiState$p(com.lele.llmonitor.ui.soc.SocViewModel p0)
    {
        return p0._uiState;
    }

    public final dg3 getUiState()
    {
        return this.uiState;
    }
}
