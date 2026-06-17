package com.bytedance.apm6.consumer.slardar.send;

import com.bytedance.apm6.consumer.slardar.send.DropDataMonitor;
import com.bytedance.apm6.consumer.slardar.send.b;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
interface e {

    public static class a implements e {
        @Override // com.bytedance.apm6.consumer.slardar.send.e
        public byte[] a(HashMap<Long, JSONArray> hashMap) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<Long> it2 = hashMap.keySet().iterator();
                while (it2.hasNext()) {
                    JSONArray jSONArray2 = hashMap.get(it2.next());
                    if (jSONArray2 != null) {
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            jSONArray.put(jSONArray2.get(i));
                        }
                    }
                }
                jSONObject.put("header", e.b.b.e.a.i.e.b(e.b.b.e.a.i.c.f().e(String.valueOf(e.b.b.e.a.i.e.a()))));
                jSONObject.put(RemoteMessageConst.DATA, jSONArray);
                return e.b.b.n.d.b(jSONObject.toString());
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.apm6.consumer.slardar.send.e
        public List<String> b() {
            return b.C0133b.a.d();
        }

        @Override // com.bytedance.apm6.consumer.slardar.send.e
        public String getName() {
            return "exception";
        }
    }

    public static class b implements e {
        @Override // com.bytedance.apm6.consumer.slardar.send.e
        public byte[] a(HashMap<Long, JSONArray> hashMap) {
            DropDataMonitor dropDataMonitor;
            e.b.b.e.a.i.a e2;
            try {
                JSONArray jSONArray = new JSONArray();
                for (Long l : hashMap.keySet()) {
                    e.b.b.e.a.i.a e3 = e.b.b.e.a.i.c.f().e(String.valueOf(l));
                    if (e3 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(RemoteMessageConst.DATA, hashMap.get(l));
                        jSONObject.put("header", e.b.b.e.a.i.e.b(e3));
                        jSONArray.put(jSONObject);
                    } else if (e.b.b.n.a.b()) {
                        List<String> list = e.b.b.e.a.a.a;
                        e.b.b.n.g.b.f("APM-Slardar", "HeaderInfo null for key " + l);
                    }
                }
                dropDataMonitor = DropDataMonitor.a.a;
                JSONArray b = dropDataMonitor.b();
                if (b.length() > 0 && (e2 = e.b.b.e.a.i.c.f().e(String.valueOf(e.b.b.e.a.i.e.a()))) != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(RemoteMessageConst.DATA, b);
                    jSONObject2.put("header", e.b.b.e.a.i.e.b(e2));
                    jSONArray.put(jSONObject2);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("list", jSONArray);
                if (e.b.b.n.a.b()) {
                    List<String> list2 = e.b.b.e.a.a.a;
                    e.b.b.n.g.b.a("APM-Slardar", "request:" + jSONObject3);
                }
                e.b.b.m.i.a aVar = (e.b.b.m.i.a) e.b.b.m.c.a(e.b.b.m.i.a.class);
                if (aVar != null) {
                    jSONObject3 = aVar.a(jSONObject3);
                }
                return e.b.b.n.d.b(jSONObject3.toString());
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.apm6.consumer.slardar.send.e
        public List<String> b() {
            return b.C0133b.a.f();
        }

        @Override // com.bytedance.apm6.consumer.slardar.send.e
        public String getName() {
            return "log";
        }
    }

    public static class c implements e {
        /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:14:0x0032, B:17:0x0067, B:22:0x006e, B:23:0x0072, B:25:0x0078, B:28:0x0085, B:33:0x003a, B:35:0x0049, B:36:0x004d, B:40:0x0057), top: B:13:0x0032, outer: #1 }] */
        @Override // com.bytedance.apm6.consumer.slardar.send.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public byte[] a(java.util.HashMap<java.lang.Long, org.json.JSONArray> r13) {
            /*
                r12 = this;
                r0 = 0
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lea
                r1.<init>()     // Catch: java.lang.Exception -> Lea
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lea
                r2.<init>()     // Catch: java.lang.Exception -> Lea
                java.util.Set r3 = r13.keySet()     // Catch: java.lang.Exception -> Lea
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> Lea
            L13:
                boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> Lea
                java.lang.String r5 = "APM-Slardar"
                if (r4 == 0) goto La7
                java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> Lea
                java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Exception -> Lea
                java.lang.Object r4 = r13.get(r4)     // Catch: java.lang.Exception -> Lea
                org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: java.lang.Exception -> Lea
                if (r4 != 0) goto L2a
                goto L13
            L2a:
                r6 = 0
                r7 = r6
            L2c:
                int r8 = r4.length()     // Catch: java.lang.Exception -> Lea
                if (r7 >= r8) goto L13
                org.json.JSONObject r8 = r4.getJSONObject(r7)     // Catch: java.lang.Exception -> L9c
                if (r8 != 0) goto L3a
            L38:
                r9 = r0
                goto L67
            L3a:
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L9c
                r9.<init>()     // Catch: java.lang.Exception -> L9c
                r10 = -1
                java.lang.String r11 = "wrapper_type_description"
                int r10 = r8.optInt(r11, r10)     // Catch: java.lang.Exception -> L9c
                r11 = 1
                if (r10 == r11) goto L4d
                r9.add(r8)     // Catch: java.lang.Exception -> L9c
                goto L67
            L4d:
                java.lang.String r10 = "wrapper_array_data"
                org.json.JSONArray r8 = r8.optJSONArray(r10)     // Catch: java.lang.Exception -> L9c
                if (r8 != 0) goto L56
                goto L38
            L56:
                r10 = r6
            L57:
                int r11 = r8.length()     // Catch: java.lang.Exception -> L9c
                if (r10 >= r11) goto L67
                java.lang.Object r11 = r8.get(r10)     // Catch: java.lang.Exception -> L64
                r9.add(r11)     // Catch: java.lang.Exception -> L64
            L64:
                int r10 = r10 + 1
                goto L57
            L67:
                boolean r8 = com.bytedance.android.input.k.b.a.e0(r9)     // Catch: java.lang.Exception -> L9c
                if (r8 == 0) goto L6e
                goto La4
            L6e:
                java.util.Iterator r8 = r9.iterator()     // Catch: java.lang.Exception -> L9c
            L72:
                boolean r9 = r8.hasNext()     // Catch: java.lang.Exception -> L9c
                if (r9 == 0) goto La4
                java.lang.Object r9 = r8.next()     // Catch: java.lang.Exception -> L9c
                r2.put(r9)     // Catch: java.lang.Exception -> L9c
                boolean r10 = e.b.b.n.a.b()     // Catch: java.lang.Exception -> L9c
                if (r10 == 0) goto L72
                java.util.List<java.lang.String> r10 = e.b.b.e.a.a.a     // Catch: java.lang.Exception -> L9c
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9c
                r10.<init>()     // Catch: java.lang.Exception -> L9c
                java.lang.String r11 = ":"
                r10.append(r11)     // Catch: java.lang.Exception -> L9c
                r10.append(r9)     // Catch: java.lang.Exception -> L9c
                java.lang.String r9 = r10.toString()     // Catch: java.lang.Exception -> L9c
                e.b.b.n.g.b.a(r5, r9)     // Catch: java.lang.Exception -> L9c
                goto L72
            L9c:
                r8 = move-exception
                java.util.List<java.lang.String> r9 = e.b.b.e.a.a.a     // Catch: java.lang.Exception -> Lea
                java.lang.String r9 = "serialize"
                e.b.b.n.g.b.c(r5, r9, r8)     // Catch: java.lang.Exception -> Lea
            La4:
                int r7 = r7 + 1
                goto L2c
            La7:
                boolean r13 = e.b.b.n.a.b()     // Catch: java.lang.Exception -> Lea
                if (r13 == 0) goto Lc3
                java.util.List<java.lang.String> r13 = e.b.b.e.a.a.a     // Catch: java.lang.Exception -> Lea
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lea
                r13.<init>()     // Catch: java.lang.Exception -> Lea
                java.lang.String r3 = "jsonArray:"
                r13.append(r3)     // Catch: java.lang.Exception -> Lea
                r13.append(r2)     // Catch: java.lang.Exception -> Lea
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> Lea
                e.b.b.n.g.b.a(r5, r13)     // Catch: java.lang.Exception -> Lea
            Lc3:
                e.b.b.e.a.i.c r13 = e.b.b.e.a.i.c.f()     // Catch: java.lang.Exception -> Lea
                long r3 = e.b.b.e.a.i.e.a()     // Catch: java.lang.Exception -> Lea
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Lea
                e.b.b.e.a.i.a r13 = r13.e(r3)     // Catch: java.lang.Exception -> Lea
                java.lang.String r3 = "header"
                org.json.JSONObject r13 = e.b.b.e.a.i.e.b(r13)     // Catch: java.lang.Exception -> Lea
                r1.put(r3, r13)     // Catch: java.lang.Exception -> Lea
                java.lang.String r13 = "data"
                r1.put(r13, r2)     // Catch: java.lang.Exception -> Lea
                java.lang.String r13 = r1.toString()     // Catch: java.lang.Exception -> Lea
                byte[] r13 = e.b.b.n.d.b(r13)     // Catch: java.lang.Exception -> Lea
                return r13
            Lea:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.consumer.slardar.send.e.c.a(java.util.HashMap):byte[]");
        }

        @Override // com.bytedance.apm6.consumer.slardar.send.e
        public List<String> b() {
            return b.C0133b.a.h();
        }

        @Override // com.bytedance.apm6.consumer.slardar.send.e
        public String getName() {
            return "trace";
        }
    }

    byte[] a(HashMap<Long, JSONArray> hashMap);

    List<String> b();

    String getName();
}
