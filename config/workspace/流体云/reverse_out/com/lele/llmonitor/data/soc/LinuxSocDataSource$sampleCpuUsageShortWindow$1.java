package com.lele.llmonitor.data.soc;
final class LinuxSocDataSource$sampleCpuUsageShortWindow$1 extends p60 {
    Object L$0;
    int label;
    synthetic Object result;
    final synthetic com.lele.llmonitor.data.soc.LinuxSocDataSource this$0;

    public LinuxSocDataSource$sampleCpuUsageShortWindow$1(com.lele.llmonitor.data.soc.LinuxSocDataSource p1, n60 p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p2)
    {
        this.result = p2;
        this.label = (this.label | -2147483648);
        return com.lele.llmonitor.data.soc.LinuxSocDataSource.access$sampleCpuUsageShortWindow(this.this$0, this);
    }
}
