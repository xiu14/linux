package com.lele.llmonitor.data.soc;
public final class LinuxSocDataSource$readPolicyFrequencyMap$$inlined$sortedBy$1 implements java.util.Comparator {

    public LinuxSocDataSource$readPolicyFrequencyMap$$inlined$sortedBy$1()
    {
        return;
    }

    public final int compare(Object p2, Object p3)
    {
        int v1_0;
        int v1_2 = ((java.io.File) p2).getName();
        v1_2.getClass();
        int v1_5 = oh3.k0(hh3.D0(v1_2, "policy"));
        int v0 = 2147483647;
        if (v1_5 == 0) {
            v1_0 = 2147483647;
        } else {
            v1_0 = v1_5.intValue();
        }
        int v1_1 = Integer.valueOf(v1_0);
        String v3_2 = ((java.io.File) p3).getName();
        v3_2.getClass();
        Integer v2_3 = oh3.k0(hh3.D0(v3_2, "policy"));
        if (v2_3 != null) {
            v0 = v2_3.intValue();
        }
        return l02.m(v1_1, Integer.valueOf(v0));
    }
}
