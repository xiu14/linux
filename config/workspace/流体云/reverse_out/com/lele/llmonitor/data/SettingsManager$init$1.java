package com.lele.llmonitor.data;
final class SettingsManager$init$1 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    int label;

    public SettingsManager$init$1(android.content.Context p1, n60 p2)
    {
        this.$context = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        return new com.lele.llmonitor.data.SettingsManager$init$1(this.$context, p2);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.SettingsManager$init$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p4)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p4);
            com.lele.llmonitor.data.FollowSystemAppIconMode v0_4 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
            com.lele.llmonitor.data.AppIconPaletteManager.INSTANCE.syncOnAppStart(this.$context, ((Number) v0_4.getThemeMode().getValue()).intValue(), ((com.lele.llmonitor.ui.theme.ThemePalettePreset) v0_4.getThemePalettePreset().getValue()), ((com.lele.llmonitor.data.FollowSystemAppIconMode) v0_4.getFollowSystemAppIconMode().getValue()));
            return bw3.a;
        }
    }
}
