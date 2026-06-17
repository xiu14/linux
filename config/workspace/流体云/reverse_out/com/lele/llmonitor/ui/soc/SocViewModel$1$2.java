package com.lele.llmonitor.ui.soc;
final class SocViewModel$1$2 implements pv0 {
    final synthetic com.lele.llmonitor.ui.soc.SocViewModel this$0;

    public SocViewModel$1$2(com.lele.llmonitor.ui.soc.SocViewModel p1)
    {
        this.this$0 = p1;
        return;
    }

    public final Object emit(com.lele.llmonitor.data.soc.SocSnapshot p3, n60 p4)
    {
        bw3 v2_3 = com.lele.llmonitor.ui.soc.SocViewModel.access$get_uiState$p(this.this$0);
        com.lele.llmonitor.ui.soc.SocUiState v4_1 = new com.lele.llmonitor.ui.soc.SocUiState(0, p3, 0);
        bw3 v2_4 = ((fg3) v2_3);
        v2_4.getClass();
        v2_4.j(0, v4_1);
        return bw3.a;
    }

    public bridge synthetic Object emit(Object p1, n60 p2)
    {
        return this.emit(((com.lele.llmonitor.data.soc.SocSnapshot) p1), p2);
    }
}
