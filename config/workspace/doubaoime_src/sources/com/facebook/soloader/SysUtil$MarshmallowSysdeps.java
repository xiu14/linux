package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Process;
import com.facebook.soloader.MinElf;
import java.util.ArrayList;
import java.util.TreeSet;

@e
@TargetApi(23)
/* loaded from: classes2.dex */
final class SysUtil$MarshmallowSysdeps {
    private SysUtil$MarshmallowSysdeps() {
    }

    @e
    public static String[] getSupportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        if (is64Bit()) {
            treeSet.add(MinElf.ISA.AARCH64.toString());
            treeSet.add(MinElf.ISA.X86_64.toString());
        } else {
            treeSet.add(MinElf.ISA.ARM.toString());
            treeSet.add(MinElf.ISA.X86.toString());
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (treeSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @e
    public static boolean is64Bit() {
        return Process.is64Bit();
    }
}
