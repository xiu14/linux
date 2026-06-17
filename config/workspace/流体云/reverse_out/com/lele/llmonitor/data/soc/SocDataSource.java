package com.lele.llmonitor.data.soc;
public interface SocDataSource {

    public abstract com.lele.llmonitor.data.soc.CpuModelResult probeCpuModel();

    public abstract Object probeCpuUsage();

    public abstract Object probeLoadAverages();

    public abstract com.lele.llmonitor.data.soc.MemoryInfoResult probeMemoryInfo();

    public abstract Object probeSocTemperatureC();

    public abstract java.util.List readCpuCoreFrequencies();

    public abstract qh2 readOnlineAndTotalCores();
}
