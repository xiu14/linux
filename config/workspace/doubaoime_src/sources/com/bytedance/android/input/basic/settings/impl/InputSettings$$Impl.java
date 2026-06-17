package com.bytedance.android.input.basic.settings.impl;

import com.bytedance.android.input.basic.settings.api.c.j;
import com.bytedance.android.input.basic.settings.api.c.l;
import com.bytedance.news.common.settings.internal.IEnsureWrapper;
import com.bytedance.services.apm.api.IEnsure;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class InputSettings$$Impl implements InputSettings {
    private static final Gson GSON = new Gson();
    private static final int VERSION = -942693011;
    private com.bytedance.news.common.settings.e.g mStorage;
    private final ConcurrentHashMap<String, Object> mStickySettings = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Object> mTransientSettings = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Object> mCachedSettings = new ConcurrentHashMap<>();
    private final com.bytedance.news.common.settings.internal.d mInstanceCreator = new a(this);
    private com.bytedance.news.common.settings.e.j.a mExposedManager = com.bytedance.news.common.settings.e.j.a.a(com.bytedance.news.common.settings.internal.a.a());
    private IEnsure iEnsure = IEnsureWrapper.getInstance();

    class a implements com.bytedance.news.common.settings.internal.d {
        a(InputSettings$$Impl inputSettings$$Impl) {
        }

        @Override // com.bytedance.news.common.settings.internal.d
        public <T> T create(Class<T> cls) {
            if (cls == com.bytedance.android.input.basic.settings.impl.f.class) {
                return (T) new com.bytedance.android.input.basic.settings.impl.f();
            }
            if (cls == com.bytedance.android.input.basic.settings.impl.a.class) {
                return (T) new com.bytedance.android.input.basic.settings.impl.a();
            }
            if (cls == com.bytedance.android.input.basic.settings.impl.c.class) {
                return (T) new com.bytedance.android.input.basic.settings.impl.c();
            }
            if (cls == com.bytedance.android.input.basic.settings.impl.b.class) {
                return (T) new com.bytedance.android.input.basic.settings.impl.b();
            }
            if (cls == com.bytedance.android.input.basic.settings.impl.h.class) {
                return (T) new com.bytedance.android.input.basic.settings.impl.h();
            }
            if (cls == com.bytedance.android.input.basic.settings.impl.d.class) {
                return (T) new com.bytedance.android.input.basic.settings.impl.d();
            }
            if (cls == com.bytedance.android.input.basic.settings.impl.e.class) {
                return (T) new com.bytedance.android.input.basic.settings.impl.e();
            }
            return null;
        }
    }

    class b extends com.google.gson.u.a<j> {
        b(InputSettings$$Impl inputSettings$$Impl) {
        }
    }

    class c extends com.google.gson.u.a<com.bytedance.android.input.basic.settings.api.c.a> {
        c(InputSettings$$Impl inputSettings$$Impl) {
        }
    }

    class d extends com.google.gson.u.a<com.bytedance.android.input.basic.settings.api.c.e> {
        d(InputSettings$$Impl inputSettings$$Impl) {
        }
    }

    class e extends com.google.gson.u.a<com.bytedance.android.input.basic.settings.api.c.d> {
        e(InputSettings$$Impl inputSettings$$Impl) {
        }
    }

    class f extends com.google.gson.u.a<l> {
        f(InputSettings$$Impl inputSettings$$Impl) {
        }
    }

    class g extends com.google.gson.u.a<com.bytedance.android.input.basic.settings.api.c.g> {
        g(InputSettings$$Impl inputSettings$$Impl) {
        }
    }

    class h extends com.google.gson.u.a<com.bytedance.android.input.basic.settings.api.c.h> {
        h(InputSettings$$Impl inputSettings$$Impl) {
        }
    }

    public InputSettings$$Impl(com.bytedance.news.common.settings.e.g gVar) {
        this.mStorage = gVar;
    }

    @Override // com.bytedance.android.input.basic.settings.impl.InputSettings
    public com.bytedance.android.input.basic.settings.api.c.a asrConfig() {
        com.bytedance.android.input.basic.settings.api.c.a a2;
        com.bytedance.android.input.basic.settings.api.c.a aVar;
        IEnsure iEnsure;
        this.mExposedManager.d("asr_config");
        if (com.bytedance.news.common.settings.e.j.a.e("asr_config") && (iEnsure = this.iEnsure) != null) {
            StringBuilder M = e.a.a.a.a.M("get settings key = asr_config time = ");
            M.append(com.bytedance.news.common.settings.e.j.a.b());
            M.append(" thread name = ");
            M.append(Thread.currentThread().getName());
            iEnsure.ensureNotReachHere(M.toString());
        }
        if (this.mCachedSettings.containsKey("asr_config")) {
            a2 = (com.bytedance.android.input.basic.settings.api.c.a) this.mCachedSettings.get("asr_config");
            if (a2 == null) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.a) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.a.class, this.mInstanceCreator)).a();
                IEnsure iEnsure2 = this.iEnsure;
                if (iEnsure2 != null) {
                    iEnsure2.ensureNotReachHere("value == null asr_config");
                }
            }
        } else {
            com.bytedance.news.common.settings.e.g gVar = this.mStorage;
            if (gVar == null || !gVar.contains("asr_config")) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.a) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.a.class, this.mInstanceCreator)).a();
            } else {
                String a3 = this.mStorage.a("asr_config");
                try {
                    aVar = (com.bytedance.android.input.basic.settings.api.c.a) GSON.d(a3, new c(this).e());
                } catch (Exception e2) {
                    com.bytedance.android.input.basic.settings.api.c.a a4 = ((com.bytedance.android.input.basic.settings.impl.a) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.a.class, this.mInstanceCreator)).a();
                    IEnsure iEnsure3 = this.iEnsure;
                    if (iEnsure3 != null) {
                        iEnsure3.ensureNotReachHere(e2, "gson from json error" + a3);
                    }
                    e2.printStackTrace();
                    aVar = a4;
                }
                a2 = aVar;
            }
            if (a2 != null) {
                this.mCachedSettings.put("asr_config", a2);
            } else {
                a2 = ((com.bytedance.android.input.basic.settings.impl.a) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.a.class, this.mInstanceCreator)).a();
                IEnsure iEnsure4 = this.iEnsure;
                if (iEnsure4 != null) {
                    iEnsure4.ensureNotReachHere("value == null key = asr_config");
                }
            }
        }
        return a2;
    }

    @Override // com.bytedance.android.input.basic.settings.impl.InputSettings
    public com.bytedance.android.input.basic.settings.api.c.d candidateConfig() {
        com.bytedance.android.input.basic.settings.api.c.d a2;
        com.bytedance.android.input.basic.settings.api.c.d dVar;
        IEnsure iEnsure;
        this.mExposedManager.d("candidate_config");
        if (com.bytedance.news.common.settings.e.j.a.e("candidate_config") && (iEnsure = this.iEnsure) != null) {
            StringBuilder M = e.a.a.a.a.M("get settings key = candidate_config time = ");
            M.append(com.bytedance.news.common.settings.e.j.a.b());
            M.append(" thread name = ");
            M.append(Thread.currentThread().getName());
            iEnsure.ensureNotReachHere(M.toString());
        }
        if (this.mCachedSettings.containsKey("candidate_config")) {
            a2 = (com.bytedance.android.input.basic.settings.api.c.d) this.mCachedSettings.get("candidate_config");
            if (a2 == null) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.b) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.b.class, this.mInstanceCreator)).a();
                IEnsure iEnsure2 = this.iEnsure;
                if (iEnsure2 != null) {
                    iEnsure2.ensureNotReachHere("value == null candidate_config");
                }
            }
        } else {
            com.bytedance.news.common.settings.e.g gVar = this.mStorage;
            if (gVar == null || !gVar.contains("candidate_config")) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.b) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.b.class, this.mInstanceCreator)).a();
            } else {
                String a3 = this.mStorage.a("candidate_config");
                try {
                    dVar = (com.bytedance.android.input.basic.settings.api.c.d) GSON.d(a3, new e(this).e());
                } catch (Exception e2) {
                    com.bytedance.android.input.basic.settings.api.c.d a4 = ((com.bytedance.android.input.basic.settings.impl.b) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.b.class, this.mInstanceCreator)).a();
                    IEnsure iEnsure3 = this.iEnsure;
                    if (iEnsure3 != null) {
                        iEnsure3.ensureNotReachHere(e2, "gson from json error" + a3);
                    }
                    e2.printStackTrace();
                    dVar = a4;
                }
                a2 = dVar;
            }
            if (a2 != null) {
                this.mCachedSettings.put("candidate_config", a2);
            } else {
                a2 = ((com.bytedance.android.input.basic.settings.impl.b) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.b.class, this.mInstanceCreator)).a();
                IEnsure iEnsure4 = this.iEnsure;
                if (iEnsure4 != null) {
                    iEnsure4.ensureNotReachHere("value == null key = candidate_config");
                }
            }
        }
        return a2;
    }

    @Override // com.bytedance.android.input.basic.settings.impl.InputSettings
    public com.bytedance.android.input.basic.settings.api.c.e commonConfig() {
        com.bytedance.android.input.basic.settings.api.c.e a2;
        com.bytedance.android.input.basic.settings.api.c.e eVar;
        IEnsure iEnsure;
        this.mExposedManager.d("common_config");
        if (com.bytedance.news.common.settings.e.j.a.e("common_config") && (iEnsure = this.iEnsure) != null) {
            StringBuilder M = e.a.a.a.a.M("get settings key = common_config time = ");
            M.append(com.bytedance.news.common.settings.e.j.a.b());
            M.append(" thread name = ");
            M.append(Thread.currentThread().getName());
            iEnsure.ensureNotReachHere(M.toString());
        }
        if (this.mCachedSettings.containsKey("common_config")) {
            a2 = (com.bytedance.android.input.basic.settings.api.c.e) this.mCachedSettings.get("common_config");
            if (a2 == null) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.c) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.c.class, this.mInstanceCreator)).a();
                IEnsure iEnsure2 = this.iEnsure;
                if (iEnsure2 != null) {
                    iEnsure2.ensureNotReachHere("value == null common_config");
                }
            }
        } else {
            com.bytedance.news.common.settings.e.g gVar = this.mStorage;
            if (gVar == null || !gVar.contains("common_config")) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.c) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.c.class, this.mInstanceCreator)).a();
            } else {
                String a3 = this.mStorage.a("common_config");
                try {
                    eVar = (com.bytedance.android.input.basic.settings.api.c.e) GSON.d(a3, new d(this).e());
                } catch (Exception e2) {
                    com.bytedance.android.input.basic.settings.api.c.e a4 = ((com.bytedance.android.input.basic.settings.impl.c) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.c.class, this.mInstanceCreator)).a();
                    IEnsure iEnsure3 = this.iEnsure;
                    if (iEnsure3 != null) {
                        iEnsure3.ensureNotReachHere(e2, "gson from json error" + a3);
                    }
                    e2.printStackTrace();
                    eVar = a4;
                }
                a2 = eVar;
            }
            if (a2 != null) {
                this.mCachedSettings.put("common_config", a2);
            } else {
                a2 = ((com.bytedance.android.input.basic.settings.impl.c) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.c.class, this.mInstanceCreator)).a();
                IEnsure iEnsure4 = this.iEnsure;
                if (iEnsure4 != null) {
                    iEnsure4.ensureNotReachHere("value == null key = common_config");
                }
            }
        }
        return a2;
    }

    @Override // com.bytedance.android.input.basic.settings.impl.InputSettings
    public com.bytedance.android.input.basic.settings.api.c.g interceptPreDisplayedConfig() {
        com.bytedance.android.input.basic.settings.api.c.g a2;
        com.bytedance.android.input.basic.settings.api.c.g gVar;
        IEnsure iEnsure;
        this.mExposedManager.d("intercept_pre_displayed_config");
        if (com.bytedance.news.common.settings.e.j.a.e("intercept_pre_displayed_config") && (iEnsure = this.iEnsure) != null) {
            StringBuilder M = e.a.a.a.a.M("get settings key = intercept_pre_displayed_config time = ");
            M.append(com.bytedance.news.common.settings.e.j.a.b());
            M.append(" thread name = ");
            M.append(Thread.currentThread().getName());
            iEnsure.ensureNotReachHere(M.toString());
        }
        if (this.mCachedSettings.containsKey("intercept_pre_displayed_config")) {
            a2 = (com.bytedance.android.input.basic.settings.api.c.g) this.mCachedSettings.get("intercept_pre_displayed_config");
            if (a2 == null) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.d) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.d.class, this.mInstanceCreator)).a();
                IEnsure iEnsure2 = this.iEnsure;
                if (iEnsure2 != null) {
                    iEnsure2.ensureNotReachHere("value == null intercept_pre_displayed_config");
                }
            }
        } else {
            com.bytedance.news.common.settings.e.g gVar2 = this.mStorage;
            if (gVar2 == null || !gVar2.contains("intercept_pre_displayed_config")) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.d) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.d.class, this.mInstanceCreator)).a();
            } else {
                String a3 = this.mStorage.a("intercept_pre_displayed_config");
                try {
                    gVar = (com.bytedance.android.input.basic.settings.api.c.g) GSON.d(a3, new g(this).e());
                } catch (Exception e2) {
                    com.bytedance.android.input.basic.settings.api.c.g a4 = ((com.bytedance.android.input.basic.settings.impl.d) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.d.class, this.mInstanceCreator)).a();
                    IEnsure iEnsure3 = this.iEnsure;
                    if (iEnsure3 != null) {
                        iEnsure3.ensureNotReachHere(e2, "gson from json error" + a3);
                    }
                    e2.printStackTrace();
                    gVar = a4;
                }
                a2 = gVar;
            }
            if (a2 != null) {
                this.mCachedSettings.put("intercept_pre_displayed_config", a2);
            } else {
                a2 = ((com.bytedance.android.input.basic.settings.impl.d) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.d.class, this.mInstanceCreator)).a();
                IEnsure iEnsure4 = this.iEnsure;
                if (iEnsure4 != null) {
                    iEnsure4.ensureNotReachHere("value == null key = intercept_pre_displayed_config");
                }
            }
        }
        return a2;
    }

    @Override // com.bytedance.android.input.basic.settings.impl.InputSettings
    public com.bytedance.android.input.basic.settings.api.c.h keyboardDefaultLayoutAndroidConfig() {
        com.bytedance.android.input.basic.settings.api.c.h a2;
        com.bytedance.android.input.basic.settings.api.c.h hVar;
        IEnsure iEnsure;
        this.mExposedManager.d("keyboard_default_layou_Android");
        if (com.bytedance.news.common.settings.e.j.a.e("keyboard_default_layou_Android") && (iEnsure = this.iEnsure) != null) {
            StringBuilder M = e.a.a.a.a.M("get settings key = keyboard_default_layou_Android time = ");
            M.append(com.bytedance.news.common.settings.e.j.a.b());
            M.append(" thread name = ");
            M.append(Thread.currentThread().getName());
            iEnsure.ensureNotReachHere(M.toString());
        }
        if (this.mCachedSettings.containsKey("keyboard_default_layou_Android")) {
            a2 = (com.bytedance.android.input.basic.settings.api.c.h) this.mCachedSettings.get("keyboard_default_layou_Android");
            if (a2 == null) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.e) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.e.class, this.mInstanceCreator)).a();
                IEnsure iEnsure2 = this.iEnsure;
                if (iEnsure2 != null) {
                    iEnsure2.ensureNotReachHere("value == null keyboard_default_layou_Android");
                }
            }
        } else {
            com.bytedance.news.common.settings.e.g gVar = this.mStorage;
            if (gVar == null || !gVar.contains("keyboard_default_layou_Android")) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.e) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.e.class, this.mInstanceCreator)).a();
            } else {
                String a3 = this.mStorage.a("keyboard_default_layou_Android");
                try {
                    hVar = (com.bytedance.android.input.basic.settings.api.c.h) GSON.d(a3, new h(this).e());
                } catch (Exception e2) {
                    com.bytedance.android.input.basic.settings.api.c.h a4 = ((com.bytedance.android.input.basic.settings.impl.e) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.e.class, this.mInstanceCreator)).a();
                    IEnsure iEnsure3 = this.iEnsure;
                    if (iEnsure3 != null) {
                        iEnsure3.ensureNotReachHere(e2, "gson from json error" + a3);
                    }
                    e2.printStackTrace();
                    hVar = a4;
                }
                a2 = hVar;
            }
            if (a2 != null) {
                this.mCachedSettings.put("keyboard_default_layou_Android", a2);
            } else {
                a2 = ((com.bytedance.android.input.basic.settings.impl.e) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.e.class, this.mInstanceCreator)).a();
                IEnsure iEnsure4 = this.iEnsure;
                if (iEnsure4 != null) {
                    iEnsure4.ensureNotReachHere("value == null key = keyboard_default_layou_Android");
                }
            }
        }
        return a2;
    }

    @Override // com.bytedance.android.input.basic.settings.impl.InputSettings
    public j recommendConfig() {
        j a2;
        j jVar;
        IEnsure iEnsure;
        this.mExposedManager.d("recommend_config");
        if (com.bytedance.news.common.settings.e.j.a.e("recommend_config") && (iEnsure = this.iEnsure) != null) {
            StringBuilder M = e.a.a.a.a.M("get settings key = recommend_config time = ");
            M.append(com.bytedance.news.common.settings.e.j.a.b());
            M.append(" thread name = ");
            M.append(Thread.currentThread().getName());
            iEnsure.ensureNotReachHere(M.toString());
        }
        if (this.mCachedSettings.containsKey("recommend_config")) {
            a2 = (j) this.mCachedSettings.get("recommend_config");
            if (a2 == null) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.f) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.f.class, this.mInstanceCreator)).a();
                IEnsure iEnsure2 = this.iEnsure;
                if (iEnsure2 != null) {
                    iEnsure2.ensureNotReachHere("value == null recommend_config");
                }
            }
        } else {
            com.bytedance.news.common.settings.e.g gVar = this.mStorage;
            if (gVar == null || !gVar.contains("recommend_config")) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.f) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.f.class, this.mInstanceCreator)).a();
            } else {
                String a3 = this.mStorage.a("recommend_config");
                try {
                    jVar = (j) GSON.d(a3, new b(this).e());
                } catch (Exception e2) {
                    j a4 = ((com.bytedance.android.input.basic.settings.impl.f) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.f.class, this.mInstanceCreator)).a();
                    IEnsure iEnsure3 = this.iEnsure;
                    if (iEnsure3 != null) {
                        iEnsure3.ensureNotReachHere(e2, "gson from json error" + a3);
                    }
                    e2.printStackTrace();
                    jVar = a4;
                }
                a2 = jVar;
            }
            if (a2 != null) {
                this.mCachedSettings.put("recommend_config", a2);
            } else {
                a2 = ((com.bytedance.android.input.basic.settings.impl.f) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.f.class, this.mInstanceCreator)).a();
                IEnsure iEnsure4 = this.iEnsure;
                if (iEnsure4 != null) {
                    iEnsure4.ensureNotReachHere("value == null key = recommend_config");
                }
            }
        }
        return a2;
    }

    @Override // com.bytedance.android.input.basic.settings.impl.InputSettings
    public l thirdConfig() {
        l a2;
        l lVar;
        IEnsure iEnsure;
        this.mExposedManager.d("third_config");
        if (com.bytedance.news.common.settings.e.j.a.e("third_config") && (iEnsure = this.iEnsure) != null) {
            StringBuilder M = e.a.a.a.a.M("get settings key = third_config time = ");
            M.append(com.bytedance.news.common.settings.e.j.a.b());
            M.append(" thread name = ");
            M.append(Thread.currentThread().getName());
            iEnsure.ensureNotReachHere(M.toString());
        }
        if (this.mCachedSettings.containsKey("third_config")) {
            a2 = (l) this.mCachedSettings.get("third_config");
            if (a2 == null) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.h) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.h.class, this.mInstanceCreator)).a();
                IEnsure iEnsure2 = this.iEnsure;
                if (iEnsure2 != null) {
                    iEnsure2.ensureNotReachHere("value == null third_config");
                }
            }
        } else {
            com.bytedance.news.common.settings.e.g gVar = this.mStorage;
            if (gVar == null || !gVar.contains("third_config")) {
                a2 = ((com.bytedance.android.input.basic.settings.impl.h) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.h.class, this.mInstanceCreator)).a();
            } else {
                String a3 = this.mStorage.a("third_config");
                try {
                    lVar = (l) GSON.d(a3, new f(this).e());
                } catch (Exception e2) {
                    l a4 = ((com.bytedance.android.input.basic.settings.impl.h) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.h.class, this.mInstanceCreator)).a();
                    IEnsure iEnsure3 = this.iEnsure;
                    if (iEnsure3 != null) {
                        iEnsure3.ensureNotReachHere(e2, "gson from json error" + a3);
                    }
                    e2.printStackTrace();
                    lVar = a4;
                }
                a2 = lVar;
            }
            if (a2 != null) {
                this.mCachedSettings.put("third_config", a2);
            } else {
                a2 = ((com.bytedance.android.input.basic.settings.impl.h) com.bytedance.news.common.settings.internal.c.a(com.bytedance.android.input.basic.settings.impl.h.class, this.mInstanceCreator)).a();
                IEnsure iEnsure4 = this.iEnsure;
                if (iEnsure4 != null) {
                    iEnsure4.ensureNotReachHere("value == null key = third_config");
                }
            }
        }
        return a2;
    }

    @Override // com.bytedance.news.common.settings.api.annotation.ISettings
    public void updateSettings(com.bytedance.news.common.settings.e.d dVar) {
        com.bytedance.news.common.settings.internal.g b2 = com.bytedance.news.common.settings.internal.g.b(com.bytedance.news.common.settings.internal.a.a());
        if (dVar == null) {
            if (VERSION != b2.c("input_remote_settings_com.bytedance.android.input.basic.settings.impl.InputSettings")) {
                dVar = com.bytedance.news.common.settings.internal.e.c(com.bytedance.news.common.settings.internal.a.a()).d("");
                try {
                    if (!com.bytedance.news.common.settings.e.j.a.c()) {
                        b2.h("input_remote_settings_com.bytedance.android.input.basic.settings.impl.InputSettings", VERSION);
                    } else if (dVar != null) {
                        b2.h("input_remote_settings_com.bytedance.android.input.basic.settings.impl.InputSettings", VERSION);
                    }
                } catch (Throwable th) {
                    if (dVar != null) {
                        b2.h("input_remote_settings_com.bytedance.android.input.basic.settings.impl.InputSettings", VERSION);
                    }
                    IEnsure iEnsure = this.iEnsure;
                    if (iEnsure != null) {
                        iEnsure.ensureNotReachHere(th, "isUseOneSpForAppSettingsStatic error");
                    }
                }
            } else if (b2.e("input_remote_settings_com.bytedance.android.input.basic.settings.impl.InputSettings", "")) {
                dVar = com.bytedance.news.common.settings.internal.e.c(com.bytedance.news.common.settings.internal.a.a()).d("");
            } else if (dVar == null) {
                try {
                    if (com.bytedance.news.common.settings.e.j.a.c() && !b2.d("input_remote_settings_com.bytedance.android.input.basic.settings.impl.InputSettings")) {
                        dVar = com.bytedance.news.common.settings.internal.e.c(com.bytedance.news.common.settings.internal.a.a()).d("");
                        b2.g("input_remote_settings_com.bytedance.android.input.basic.settings.impl.InputSettings");
                    }
                } catch (Throwable th2) {
                    IEnsure iEnsure2 = this.iEnsure;
                    if (iEnsure2 != null) {
                        iEnsure2.ensureNotReachHere(th2, "isUseOneSpForAppSettingsStatic error");
                    }
                }
            }
        }
        if (dVar == null || this.mStorage == null) {
            return;
        }
        JSONObject a2 = dVar.a();
        if (a2 != null) {
            if (a2.has("recommend_config")) {
                this.mStorage.putString("recommend_config", a2.optString("recommend_config"));
                this.mCachedSettings.remove("recommend_config");
            }
            if (a2.has("asr_config")) {
                this.mStorage.putString("asr_config", a2.optString("asr_config"));
                this.mCachedSettings.remove("asr_config");
            }
            if (a2.has("common_config")) {
                this.mStorage.putString("common_config", a2.optString("common_config"));
                this.mCachedSettings.remove("common_config");
            }
            if (a2.has("candidate_config")) {
                this.mStorage.putString("candidate_config", a2.optString("candidate_config"));
                this.mCachedSettings.remove("candidate_config");
            }
            if (a2.has("third_config")) {
                this.mStorage.putString("third_config", a2.optString("third_config"));
                this.mCachedSettings.remove("third_config");
            }
            if (a2.has("intercept_pre_displayed_config")) {
                this.mStorage.putString("intercept_pre_displayed_config", a2.optString("intercept_pre_displayed_config"));
                this.mCachedSettings.remove("intercept_pre_displayed_config");
            }
            if (a2.has("keyboard_default_layou_Android")) {
                this.mStorage.putString("keyboard_default_layou_Android", a2.optString("keyboard_default_layou_Android"));
                this.mCachedSettings.remove("keyboard_default_layou_Android");
            }
        }
        this.mStorage.apply();
        b2.i("input_remote_settings_com.bytedance.android.input.basic.settings.impl.InputSettings", dVar.b());
    }
}
