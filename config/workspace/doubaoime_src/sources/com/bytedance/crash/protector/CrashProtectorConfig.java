package com.bytedance.crash.protector;

import com.bytedance.crash.jni.NativeBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CrashProtectorConfig {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f4650f = {80, 82, 79, 84};

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f4651g = {48, 48, 51};
    private static final byte[] h = {120, 86, 52, 18};
    private static final Pattern i = Pattern.compile("^com\\.bytedance(\\.\\w+)*$");
    private ArrayList<String> a;
    private ArrayList<String> b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f4652c;

    /* renamed from: d, reason: collision with root package name */
    private int f4653d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4654e;

    enum ElfTag {
        ELF_BUILD_ID,
        ELF_PATH,
        ELF_NAME
    }

    enum SymbolTag {
        SYMBOL_ALL,
        SYMBOL_OFFSET,
        SYMBOL_NAME
    }

    CrashProtectorConfig(JSONObject jSONObject) {
        JSONObject jSONObject2;
        boolean z;
        boolean z2;
        int i2;
        JSONObject jSONObject3 = null;
        this.f4652c = null;
        this.f4653d = 0;
        this.f4654e = true;
        if (jSONObject != null) {
            boolean z3 = jSONObject.optInt("enable_open") != 0;
            JSONObject optJSONObject = jSONObject.optJSONObject("scope_list");
            jSONObject2 = jSONObject.optJSONObject("config_list");
            z = z3;
            jSONObject3 = optJSONObject;
        } else {
            jSONObject2 = null;
            z = false;
        }
        if (jSONObject3 == null) {
            try {
                jSONObject3 = new JSONObject();
            } catch (Throwable unused) {
            }
        }
        jSONObject2 = jSONObject2 == null ? new JSONObject() : jSONObject2;
        jSONObject3.put("com.bytedance.__default__", 1);
        jSONObject2.put("__default__.unwindstack.maps", "{ \"scope\": \"com.bytedance.__default__.unwindstack.maps\",\"signals\": [\"SIGSEGV\"], \"backtraces\":[ { \"elf_name\": \"libunwindstack.so\", \"symbol_name\": \"_ZN11unwindstack6Global19FindAndReadVariableEPNS_4MapsEPKc\", \"return_from_current_stack\": 1 }, { \"elf_name\": \"libunwindstack.so\", \"symbol_name\": \"_ZN11unwindstack15GlobalDebugImplINS_7DexFileEmNS_8Uint64_AEE14ForEachSymfileIZNS3_15GetFunctionNameEPNS_4MapsEmPNS_12SharedStringEPmEUlPS1_E_EEbS6_mT_\" }, { \"elf_name\": \"libunwindstack.so\", \"symbol_name\": \"_ZN11unwindstack15GlobalDebugImplINS_7DexFileEmNS_8Uint64_AEE15GetFunctionNameEPNS_4MapsEmPNS_12SharedStringEPm\" }, { \"elf_name\": \"libunwindstack.so\", \"symbol_name\": \"_ZN11unwindstack8Unwinder14FillInDexFrameEv\" } ] } ");
        z = true;
        if (z) {
            if (jSONObject3 == null) {
                z2 = false;
            } else {
                Iterator<String> keys = jSONObject3.keys();
                this.a = new ArrayList<>();
                this.b = new ArrayList<>();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (d(next)) {
                        if (jSONObject3.optInt(next) != 0) {
                            this.a.add(next);
                        } else {
                            this.b.add(next);
                        }
                    }
                }
                StringBuilder M = e.a.a.a.a.M("white list size: ");
                M.append(this.a.size());
                com.bytedance.android.input.k.b.a.X("NPTH_PROT", M.toString());
                z2 = !this.a.isEmpty();
            }
            if (z2) {
                this.f4654e = NativeBridge.E();
                a aVar = new a();
                aVar.f(f4650f);
                aVar.f(f4651g);
                aVar.h(this.f4654e ? 2 : 1);
                aVar.f(h);
                int e2 = aVar.e(0);
                int e3 = aVar.e(0);
                aVar.a(8);
                int d2 = aVar.d();
                if (jSONObject2 == null) {
                    i2 = 0;
                } else {
                    Iterator<String> keys2 = jSONObject2.keys();
                    i2 = 0;
                    while (keys2.hasNext()) {
                        String optString = jSONObject2.optString(keys2.next());
                        if (!optString.isEmpty()) {
                            try {
                                if (e(aVar, new JSONObject(optString))) {
                                    i2++;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                com.bytedance.android.input.k.b.a.X("NPTH_PROT", "config count: " + i2);
                if (i2 <= 0) {
                    return;
                }
                aVar.j(e3, aVar.d() - d2);
                aVar.j(e2, i2);
                byte[] bArr = new byte[8];
                aVar.a(8);
                byte[] b = aVar.b();
                int d3 = aVar.d();
                for (int i3 = 0; i3 < d3; i3 += 8) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        bArr[i4] = (byte) (bArr[i4] ^ b[i3 + i4]);
                    }
                }
                aVar.f(bArr);
                this.f4652c = aVar.b();
                this.f4653d = aVar.d();
            }
        }
    }

    private static Long c(Object obj) {
        if (obj == null || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            return null;
        }
        if (str.startsWith("0x") || str.startsWith("0X")) {
            try {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static boolean d(String str) {
        return str.length() < 256 && i.matcher(str).matches();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:166:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x046b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(com.bytedance.crash.protector.a r37, org.json.JSONObject r38) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.protector.CrashProtectorConfig.e(com.bytedance.crash.protector.a, org.json.JSONObject):boolean");
    }

    public byte[] a() {
        return this.f4652c;
    }

    public int b() {
        return this.f4653d;
    }
}
