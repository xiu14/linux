package com.facebook.cache.disk;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public interface i extends e.c.c.a.a {
    long a();

    boolean b(com.facebook.cache.common.b bVar);

    Map<String, String> c(com.facebook.cache.common.b bVar) throws IOException;

    e.c.a.a d(com.facebook.cache.common.b bVar);

    void g(com.facebook.cache.common.b bVar);

    long getCount();

    boolean h(com.facebook.cache.common.b bVar);

    e.c.a.a i(com.facebook.cache.common.b bVar, com.facebook.cache.common.i iVar) throws IOException;
}
