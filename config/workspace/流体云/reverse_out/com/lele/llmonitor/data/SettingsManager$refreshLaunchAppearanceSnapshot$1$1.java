package com.lele.llmonitor.data;
final class SettingsManager$refreshLaunchAppearanceSnapshot$1$1 extends jj3 implements h11 {
    final synthetic long $generation;
    final synthetic com.lele.llmonitor.data.LaunchAppearanceSnapshot $resolvedSnapshot;
    int label;

    public SettingsManager$refreshLaunchAppearanceSnapshot$1$1(long p1, com.lele.llmonitor.data.LaunchAppearanceSnapshot p3, n60 p4)
    {
        this.$generation = p1;
        this.$resolvedSnapshot = p3;
        super(2, p4);
        return;
    }

    public final n60 create(Object p3, n60 p4)
    {
        return new com.lele.llmonitor.data.SettingsManager$refreshLaunchAppearanceSnapshot$1$1(this.$generation, this.$resolvedSnapshot, p4);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.SettingsManager$refreshLaunchAppearanceSnapshot$1$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p5)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p5);
            bw3 v0_1 = bw3.a;
            if (this.$generation == com.lele.llmonitor.data.SettingsManager.access$getLaunchSnapshotRefreshGeneration$p()) {
                com.lele.llmonitor.data.SettingsManager.INSTANCE.getLaunchAppearanceSnapshot().setValue(this.$resolvedSnapshot);
                return v0_1;
            } else {
                return v0_1;
            }
        }
    }
}
