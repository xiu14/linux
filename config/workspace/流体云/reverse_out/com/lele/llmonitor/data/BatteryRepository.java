package com.lele.llmonitor.data;
public final class BatteryRepository {
    public static final int $stable = 0;
    private static final long HISTORY_RETENTION_MS = 172800000;
    private static final int INITIAL_LOAD_CHUNK_SIZE = 120;
    public static final com.lele.llmonitor.data.BatteryRepository INSTANCE = None;
    private static final String SNAPSHOT_FILE_NAME = "battery_history_snapshot.json";
    private static final int SNAPSHOT_VERSION = 1;
    private static android.content.Context appContext;
    private static volatile boolean hasInitialHistoryLoaded;
    private static final Object initialLoadGuard;
    private static pj1 initialLoadJob;
    private static long lastEmitTime;
    private static final le3 latestHistory;
    private static pj1 persistJob;
    private static final d80 repositoryScope;

    static BatteryRepository()
    {
        com.lele.llmonitor.data.BatteryRepository.INSTANCE = new com.lele.llmonitor.data.BatteryRepository();
        com.lele.llmonitor.data.BatteryRepository.latestHistory = new le3();
        com.lele.llmonitor.data.BatteryRepository.repositoryScope = r7.b(ix2.P(id1.g(), bd0.f));
        com.lele.llmonitor.data.BatteryRepository.initialLoadGuard = new Object();
        com.lele.llmonitor.data.BatteryRepository.$stable = 8;
        return;
    }

    private BatteryRepository()
    {
        return;
    }

    public static synthetic java.util.List a(com.lele.llmonitor.data.local.BatteryEntity p0)
    {
        return com.lele.llmonitor.data.BatteryRepository.mergeAndNormalizeEntries$lambda$1(p0);
    }

    public static final synthetic pj1 access$getPersistJob$p()
    {
        return com.lele.llmonitor.data.BatteryRepository.persistJob;
    }

    public static final synthetic java.util.List access$loadPersistedSnapshot(com.lele.llmonitor.data.BatteryRepository p0)
    {
        return p0.loadPersistedSnapshot();
    }

    public static final varargs synthetic java.util.List access$mergeAndNormalizeEntries(com.lele.llmonitor.data.BatteryRepository p0, java.util.List[] p1)
    {
        return p0.mergeAndNormalizeEntries(p1);
    }

    public static final synthetic Object access$persistSnapshot(com.lele.llmonitor.data.BatteryRepository p0, n60 p1)
    {
        return p0.persistSnapshot(p1);
    }

    public static final synthetic Object access$runInitialHistoryLoad(com.lele.llmonitor.data.BatteryRepository p0, n60 p1)
    {
        return p0.runInitialHistoryLoad(p1);
    }

    public static final synthetic void access$schedulePersistLocked(com.lele.llmonitor.data.BatteryRepository p0)
    {
        p0.schedulePersistLocked();
        return;
    }

    public static final synthetic void access$setLastEmitTime$p(long p0)
    {
        com.lele.llmonitor.data.BatteryRepository.lastEmitTime = p0;
        return;
    }

    public static final synthetic java.io.File access$snapshotFile(com.lele.llmonitor.data.BatteryRepository p0)
    {
        return p0.snapshotFile();
    }

    public static final synthetic void access$trimToCapacityLocked(com.lele.llmonitor.data.BatteryRepository p0)
    {
        p0.trimToCapacityLocked();
        return;
    }

    private final java.util.List loadPersistedSnapshot()
    {
        java.util.ArrayList v1_0 = 0;
        try {
            Throwable v0_2;
            Throwable v0_3 = this.snapshotFile();
        } catch (Throwable v0_10) {
            v0_2 = new cw2(v0_10);
            if (!(v0_2 instanceof cw2)) {
                v1_0 = v0_2;
            }
            java.util.ArrayList v1_3 = ((String) v1_0);
            Object v2_1 = uo0.d;
            if (v1_3 != null) {
                Throwable v0_6 = new org.json.JSONObject(v1_3).optJSONArray("items");
                if (v0_6 == null) {
                    v0_6 = new org.json.JSONArray();
                }
                java.util.ArrayList v1_5 = r7.B();
                long v3_0 = v0_6.length();
                int v4_0 = 0;
                int v5 = 0;
                while (v5 < v3_0) {
                    int v19;
                    int v21;
                    uo0 v20;
                    org.json.JSONObject v8 = v0_6.optJSONObject(v5);
                    if (v8 != null) {
                        v19 = v5;
                        v20 = v2_1;
                        v21 = v3_0;
                        v1_5.add(new com.lele.llmonitor.data.local.BatteryEntity(v8.optLong("id", 0), v8.optLong("ts", 0), v8.optInt("lv", v4_0), ((float) v8.optDouble("v", 0)), ((float) v8.optDouble("c", 0)), ((float) v8.optDouble("p", 0)), ((float) v8.optDouble("t", 0))));
                    } else {
                        v20 = v2_1;
                        v21 = v3_0;
                        v19 = v5;
                    }
                    v5 = (v19 + 1);
                    v2_1 = v20;
                    v3_0 = v21;
                    v4_0 = 0;
                }
                v20 = v2_1;
                Throwable v0_8 = r7.w(v1_5);
                java.util.ArrayList v1_2 = new java.util.ArrayList();
                Throwable v0_9 = v0_8.listIterator(0);
                do {
                    Object v2_8 = ((p61) v0_9);
                    if (!v2_8.hasNext()) {
                        Object v2_3;
                        if (dw2.a(v1_2) != null) {
                            v2_3 = v20;
                        } else {
                            v2_3 = v1_2;
                        }
                        return ((java.util.List) v2_3);
                    } else {
                        Object v2_10 = v2_8.next();
                    }
                } while(((com.lele.llmonitor.data.local.BatteryEntity) v2_10).getTimestamp() <= 0);
                v1_2.add(v2_10);
            } else {
                return v2_1;
            }
        }
        if (v0_3 != null) {
            if (!v0_3.exists()) {
                v0_3 = 0;
            } else {
            }
            if (v0_3 != null) {
                v0_2 = wt0.V(v0_3);
            }
        }
        v0_2 = 0;
    }

    private final varargs java.util.List mergeAndNormalizeEntries(java.util.List[] p5)
    {
        java.util.Iterator v0_0;
        Object v4_0 = wh.R(p5);
        java.util.ArrayList v5_4 = new yz2(27);
        if (!(v4_0 instanceof gs3)) {
            v0_0 = new xu0(v4_0, new a72(13), v5_4);
        } else {
            Object v4_1 = ((gs3) v4_0);
            v0_0 = new xu0(v4_1.a, v4_1.b, v5_4);
        }
        Object v4_3 = new com.lele.llmonitor.data.BatteryRepository$mergeAndNormalizeEntries$$inlined$sortedBy$1;
        v4_3();
        java.util.ArrayList v5_3 = new l(14);
        java.util.ArrayList v2_1 = new java.util.ArrayList();
        java.util.Iterator v0_2 = v0_0.iterator();
        while (v0_2.hasNext()) {
            v2_1.add(v0_2.next());
        }
        cx.l0(v2_1, v4_3);
        yi0 v1_4 = new yi0(v2_1.iterator(), v5_3);
        if (v1_4.hasNext()) {
            Object v4_6 = v1_4.next();
            if (v1_4.hasNext()) {
                java.util.ArrayList v5_7 = new java.util.ArrayList();
                v5_7.add(v4_6);
                while (v1_4.hasNext()) {
                    v5_7.add(v1_4.next());
                }
                return v5_7;
            } else {
                return r7.L(v4_6);
            }
        } else {
            return uo0.d;
        }
    }

    private static final java.util.List mergeAndNormalizeEntries$lambda$1(com.lele.llmonitor.data.local.BatteryEntity p8)
    {
        p8.getClass();
        Long v2 = Long.valueOf(p8.getTimestamp());
        Integer.valueOf(p8.getLevel());
        Float.valueOf(p8.getVoltage());
        Float.valueOf(p8.getCurrent());
        Float.valueOf(p8.getPower());
        return r7.M(new Object[] {v2, Float.valueOf(p8.getTemperature())}));
    }

    private final Object persistSnapshot(n60 p10)
    {
        java.nio.charset.Charset v0_3;
        if (!(p10 instanceof com.lele.llmonitor.data.BatteryRepository$persistSnapshot$1)) {
            v0_3 = new com.lele.llmonitor.data.BatteryRepository$persistSnapshot$1(this, p10);
        } else {
            v0_3 = ((com.lele.llmonitor.data.BatteryRepository$persistSnapshot$1) p10);
            java.io.File v1_2 = ((com.lele.llmonitor.data.BatteryRepository$persistSnapshot$1) p10).label;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.data.BatteryRepository$persistSnapshot$1) p10).label = (v1_2 - -2147483648);
            }
        }
        Throwable v10_2;
        Throwable v9_1 = v0_3.result;
        Throwable v10_1 = v0_3.label;
        bw3 v2_0 = bw3.a;
        try {
            if (v10_1 == null) {
                ib1.Q(v9_1);
                v10_2 = com.lele.llmonitor.data.BatteryRepository.appContext;
                if (v10_2 != null) {
                    String v4_3 = new com.lele.llmonitor.data.BatteryRepository$persistSnapshot$snapshot$1(0);
                    v0_3.L$0 = v10_2;
                    v0_3.label = 1;
                    v9_1 = xt3.k0(zy1.a, v4_3, v0_3);
                    java.nio.charset.Charset v0_2 = e80.d;
                    if (v9_1 != v0_2) {
                        Throwable v9_4 = ((java.util.List) v9_1);
                        if (!v9_4.isEmpty()) {
                            java.nio.charset.Charset v0_6 = new org.json.JSONObject();
                            v0_6.put("v", 1);
                            java.io.FileOutputStream v3_2 = new org.json.JSONArray();
                            Throwable v9_5 = v9_4.iterator();
                            while (v9_5.hasNext()) {
                                String v4_6 = ((com.lele.llmonitor.data.local.BatteryEntity) v9_5.next());
                                org.json.JSONObject v5_1 = new org.json.JSONObject();
                                v5_1.put("id", v4_6.getId());
                                v5_1.put("ts", v4_6.getTimestamp());
                                v5_1.put("lv", v4_6.getLevel());
                                v5_1.put("v", ((double) v4_6.getVoltage()));
                                v5_1.put("c", ((double) v4_6.getCurrent()));
                                v5_1.put("p", ((double) v4_6.getPower()));
                                v5_1.put("t", ((double) v4_6.getTemperature()));
                                v3_2.put(v5_1);
                            }
                            v0_6.put("items", v3_2);
                            Throwable v9_7 = new java.io.File;
                            v9_7(v10_2.getFilesDir(), "battery_history_snapshot.json.tmp");
                            java.io.File v1_6 = new java.io.File(v10_2.getFilesDir(), "battery_history_snapshot.json");
                            Throwable v10_5 = v0_6.toString();
                            v10_5.getClass();
                            java.nio.charset.Charset v0_7 = uu.a;
                            v0_7.getClass();
                            java.io.FileOutputStream v3_7 = new java.io.FileOutputStream(v9_7);
                            try {
                                wt0.X(v3_7, v10_5, v0_7);
                            } catch (Throwable v9_8) {
                                try {
                                    throw v9_8;
                                } catch (Throwable v10_6) {
                                    p34.j(v3_7, v9_8);
                                    throw v10_6;
                                }
                            }
                            v3_7.close();
                            if (!v9_7.renameTo(v1_6)) {
                                wt0.T(v9_7, v1_6);
                                v9_7.delete();
                                return v2_0;
                            }
                        }
                    } else {
                        return v0_2;
                    }
                }
            } else {
                if (v10_1 != 1) {
                    h.m("call to \'resume\' before \'invoke\' with coroutine");
                    return 0;
                } else {
                    v10_2 = ((android.content.Context) v0_3.L$0);
                    ib1.Q(v9_1);
                }
            }
        } catch (Throwable) {
        }
        return v2_0;
    }

    private final Object runInitialHistoryLoad(n60 p11)
    {
        com.lele.llmonitor.data.BatteryRepository$runInitialHistoryLoad$1 v0_2;
        if (!(p11 instanceof com.lele.llmonitor.data.BatteryRepository$runInitialHistoryLoad$1)) {
            v0_2 = new com.lele.llmonitor.data.BatteryRepository$runInitialHistoryLoad$1(this, p11);
        } else {
            v0_2 = ((com.lele.llmonitor.data.BatteryRepository$runInitialHistoryLoad$1) p11);
            e80 v1_2 = ((com.lele.llmonitor.data.BatteryRepository$runInitialHistoryLoad$1) p11).label;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.data.BatteryRepository$runInitialHistoryLoad$1) p11).label = (v1_2 - -2147483648);
            }
        }
        long v6_1;
        java.util.List v11_6;
        java.util.List v11_1 = v0_2.result;
        e80 v1_1 = e80.d;
        Throwable v2_0 = v0_2.label;
        try {
            if (v2_0 == null) {
                ib1.Q(v11_1);
                java.util.List v11_2 = com.lele.llmonitor.data.BatteryRepository.appContext;
            } else {
                if (v2_0 == 1) {
                    v6_1 = v0_2.J$0;
                    Throwable v2 = ((android.content.Context) v0_2.L$0);
                    ib1.Q(v11_1);
                    v11_6 = ((java.util.List) v11_1);
                    if (dw2.a(v11_6) != null) {
                        v11_6 = uo0.d;
                    } else {
                    }
                    java.util.List v11_7 = ((java.util.List) v11_6);
                    v0_2.L$0 = 0;
                    v0_2.L$1 = 0;
                    v0_2.J$0 = v6_1;
                    v0_2.label = 2;
                } else {
                    if (v2_0 != 2) {
                        h.m("call to \'resume\' before \'invoke\' with coroutine");
                        return 0;
                    } else {
                        this = ((android.content.Context) v0_2.L$0);
                        ib1.Q(v11_1);
                    }
                }
            }
        } catch (java.util.List v11_5) {
            v11_6 = new cw2(v11_5);
        }
        return bw3.a;
    }

    private final void schedulePersistLocked()
    {
        tf3 v3_0 = com.lele.llmonitor.data.BatteryRepository.persistJob;
        if (v3_0 != null) {
            v3_0.k(0);
        }
        com.lele.llmonitor.data.BatteryRepository.persistJob = xt3.I(com.lele.llmonitor.data.BatteryRepository.repositoryScope, 0, 0, new com.lele.llmonitor.data.BatteryRepository$schedulePersistLocked$1(0), 3);
        return;
    }

    private final java.io.File snapshotFile()
    {
        java.io.File v2_0 = com.lele.llmonitor.data.BatteryRepository.appContext;
        if (v2_0 != null) {
            return new java.io.File(v2_0.getFilesDir(), "battery_history_snapshot.json");
        } else {
            return 0;
        }
    }

    private final void trimToCapacityLocked()
    {
        while(true) {
            this = com.lele.llmonitor.data.BatteryRepository.latestHistory;
            if (this.size() <= 2000) {
                break;
            }
            this.remove(0);
        }
        return;
    }

    public final Object awaitInitialHistoryLoaded(android.content.Context p4, n60 p5)
    {
        this.init(p4);
        pj1 v0 = 0;
        if (!com.lele.llmonitor.data.BatteryRepository.hasInitialHistoryLoaded) {
            e80 v4_6 = com.lele.llmonitor.data.BatteryRepository.initialLoadJob;
            if ((v4_6 == null) || (v4_6.e() != 1)) {
                com.lele.llmonitor.data.BatteryRepository.initialLoadJob = xt3.I(com.lele.llmonitor.data.BatteryRepository.repositoryScope, 0, 0, new com.lele.llmonitor.data.BatteryRepository$awaitInitialHistoryLoaded$job$1$1(0), 3);
            } else {
            }
            v0 = com.lele.llmonitor.data.BatteryRepository.initialLoadJob;
        } else {
        }
        if (v0 == null) {
            return bw3.a;
        } else {
            bw3 v3_2 = v0.x0(p5);
            if (v3_2 != e80.d) {
                return bw3.a;
            } else {
                return v3_2;
            }
        }
    }

    public final Object clearAll(n60 p6)
    {
        com.lele.llmonitor.data.BatteryRepository$clearAll$1 v0_2;
        if (!(p6 instanceof com.lele.llmonitor.data.BatteryRepository$clearAll$1)) {
            v0_2 = new com.lele.llmonitor.data.BatteryRepository$clearAll$1(this, p6);
        } else {
            v0_2 = ((com.lele.llmonitor.data.BatteryRepository$clearAll$1) p6);
            int v1_2 = ((com.lele.llmonitor.data.BatteryRepository$clearAll$1) p6).label;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.data.BatteryRepository$clearAll$1) p6).label = (v1_2 - -2147483648);
            }
        }
        bw3 v5_1 = v0_2.result;
        com.lele.llmonitor.data.BatteryRepository$clearAll$3 v6_1 = v0_2.label;
        e80 v4 = e80.d;
        if (v6_1 == null) {
            ib1.Q(v5_1);
            com.lele.llmonitor.data.BatteryRepository$clearAll$3 v6_3 = new com.lele.llmonitor.data.BatteryRepository$clearAll$2(0);
            v0_2.label = 1;
            if (xt3.k0(zy1.a, v6_3, v0_2) != v4) {
                com.lele.llmonitor.data.BatteryRepository$clearAll$3 v6_5 = new com.lele.llmonitor.data.BatteryRepository$clearAll$3(0);
                v0_2.label = 2;
                if (xt3.k0(bd0.f, v6_5, v0_2) == v4) {
                    return v4;
                }
            }
        } else {
            if (v6_1 == 1) {
                ib1.Q(v5_1);
            } else {
                if (v6_1 != 2) {
                    h.m("call to \'resume\' before \'invoke\' with coroutine");
                    return 0;
                } else {
                    ib1.Q(v5_1);
                }
            }
        }
        return bw3.a;
    }

    public final Object emitNewEntry(com.lele.llmonitor.data.local.BatteryEntity p7, n60 p8)
    {
        com.lele.llmonitor.data.BatteryRepository$emitNewEntry$2 v0_0 = System.currentTimeMillis();
        if ((v0_0 - com.lele.llmonitor.data.BatteryRepository.lastEmitTime) >= 2000) {
            com.lele.llmonitor.data.BatteryRepository.lastEmitTime = v0_0;
            bw3 v6_0 = xt3.k0(zy1.a, new com.lele.llmonitor.data.BatteryRepository$emitNewEntry$2(p7, 0), p8);
            if (v6_0 == e80.d) {
                return v6_0;
            }
        }
        return bw3.a;
    }

    public final le3 getLatestHistory()
    {
        return com.lele.llmonitor.data.BatteryRepository.latestHistory;
    }

    public final void init(android.content.Context p1)
    {
        p1.getClass();
        com.lele.llmonitor.data.BatteryRepository.appContext = p1.getApplicationContext();
        return;
    }

    public final boolean isInitialHistoryLoaded()
    {
        return com.lele.llmonitor.data.BatteryRepository.hasInitialHistoryLoaded;
    }

    public final Object loadInitialData(java.util.List p9, n60 p10)
    {
        com.lele.llmonitor.data.BatteryRepository$loadInitialData$1 v0_2;
        if (!(p10 instanceof com.lele.llmonitor.data.BatteryRepository$loadInitialData$1)) {
            v0_2 = new com.lele.llmonitor.data.BatteryRepository$loadInitialData$1(this, p10);
        } else {
            v0_2 = ((com.lele.llmonitor.data.BatteryRepository$loadInitialData$1) p10);
            int v1_2 = ((com.lele.llmonitor.data.BatteryRepository$loadInitialData$1) p10).label;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.data.BatteryRepository$loadInitialData$1) p10).label = (v1_2 - -2147483648);
            }
        }
        i51 v9_2;
        com.lele.llmonitor.data.BatteryRepository$loadInitialData$2 v10_6;
        bw3 v8_2 = v0_2.result;
        com.lele.llmonitor.data.BatteryRepository$loadInitialData$2 v10_1 = v0_2.label;
        e80 v6 = e80.d;
        if (v10_1 == null) {
            ib1.Q(v8_2);
            com.lele.llmonitor.data.BatteryRepository$loadInitialData$2 v10_3 = new com.lele.llmonitor.data.BatteryRepository$loadInitialData$persisted$1(0);
            v0_2.L$0 = p9;
            v0_2.label = 1;
            v8_2 = xt3.k0(bd0.f, v10_3, v0_2);
            if (v8_2 != v6) {
                bw3 v8_4 = ((java.util.List) v8_2);
                com.lele.llmonitor.data.BatteryRepository$loadInitialData$merged$1 v4_2 = new com.lele.llmonitor.data.BatteryRepository$loadInitialData$currentSnapshot$1(0);
                v0_2.L$0 = p9;
                v0_2.L$1 = v8_4;
                v0_2.label = 2;
                com.lele.llmonitor.data.BatteryRepository$loadInitialData$2 v10_5 = xt3.k0(zy1.a, v4_2, v0_2);
                if (v10_5 != v6) {
                    v9_2 = v8_4;
                    v8_2 = v10_5;
                    v10_6 = p9;
                    com.lele.llmonitor.data.BatteryRepository$loadInitialData$merged$1 v4_4 = new com.lele.llmonitor.data.BatteryRepository$loadInitialData$merged$1(((java.util.List) v8_2), v10_6, v9_2, 0);
                    v0_2.L$0 = 0;
                    v0_2.L$1 = 0;
                    v0_2.L$2 = 0;
                    v0_2.label = 3;
                    v8_2 = xt3.k0(ii0.a, v4_4, v0_2);
                    if (v8_2 != v6) {
                        com.lele.llmonitor.data.BatteryRepository$loadInitialData$2 v10_9 = new com.lele.llmonitor.data.BatteryRepository$loadInitialData$2(((java.util.List) v8_2), 0);
                        v0_2.L$0 = 0;
                        v0_2.L$1 = 0;
                        v0_2.L$2 = 0;
                        v0_2.L$3 = 0;
                        v0_2.label = 4;
                        if (xt3.k0(zy1.a, v10_9, v0_2) == v6) {
                            return v6;
                        }
                    }
                }
            }
        } else {
            if (v10_1 == 1) {
                p9 = ((java.util.List) v0_2.L$0);
                ib1.Q(v8_2);
            } else {
                if (v10_1 == 2) {
                    v9_2 = ((java.util.List) v0_2.L$1);
                    v10_6 = ((java.util.List) v0_2.L$0);
                    ib1.Q(v8_2);
                } else {
                    if (v10_1 == 3) {
                        p9 = ((java.util.List) v0_2.L$1);
                        ib1.Q(v8_2);
                    } else {
                        if (v10_1 != 4) {
                            h.m("call to \'resume\' before \'invoke\' with coroutine");
                            return 0;
                        } else {
                            p9 = ((java.util.List) v0_2.L$2);
                            p9 = ((java.util.List) v0_2.L$0);
                            ib1.Q(v8_2);
                        }
                    }
                }
            }
        }
        return bw3.a;
    }

    public final void preloadInitialHistoryAsync(android.content.Context p4)
    {
        p4.getClass();
        this.init(p4);
        if (!com.lele.llmonitor.data.BatteryRepository.hasInitialHistoryLoaded) {
            tf3 v4_5 = com.lele.llmonitor.data.BatteryRepository.initialLoadJob;
            if ((v4_5 == null) || (v4_5.e() != 1)) {
                com.lele.llmonitor.data.BatteryRepository.initialLoadJob = xt3.I(com.lele.llmonitor.data.BatteryRepository.repositoryScope, 0, 0, new com.lele.llmonitor.data.BatteryRepository$preloadInitialHistoryAsync$1$1(0), 3);
                return;
            } else {
            }
        }
        return;
    }
}
