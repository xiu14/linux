package e.b.o.a.a;

import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;

/* loaded from: classes2.dex */
public class a {
    public static a b = new a();
    private C0444a a = new C0444a();

    /* renamed from: e.b.o.a.a.a$a, reason: collision with other inner class name */
    public static class C0444a {
        public String toString() {
            return "CpuAbnormalConfig{cpuHardWare='unknown', scene='" + DownloadSettingKeys.BugFix.DEFAULT + "', cpuSpeed=0.0, smallCpuCoreTimePercent=0.0, middleCpuCoreTimePercent=0.0, BigCpuCoreTimePercent=0.0}";
        }
    }

    public C0444a a() {
        return this.a;
    }

    public String toString() {
        return "AssistConfig{enableProcessCpuUsageStat=false, enableThreadCpuUsageStat=false, enableSystemCpuUsageStat=false, enableProcessTimeFreqPercent=false, enableSystemCpuTimeFreqPercent=false, cpuSampleBatteryTemp=37, cpuSampleBatteryLevel=30, cpuAbnormalConfig=" + this.a + '}';
    }
}
