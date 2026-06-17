package com.facebook.cache.disk;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface c {

    public interface a {
        long a();

        long b();

        String getId();
    }

    public interface b {
    }

    void a() throws IOException;

    long b(String str) throws IOException;

    void c();

    b d(String str, Object obj) throws IOException;

    boolean e(String str, Object obj) throws IOException;

    Collection<a> f() throws IOException;

    boolean g(String str, Object obj) throws IOException;

    Map<String, String> h(String str, Object obj) throws IOException;

    e.c.a.a i(String str, Object obj) throws IOException;

    boolean isExternal();

    Collection<a> j() throws IOException;

    List<a> k() throws IOException;

    long l(a aVar) throws IOException;

    long remove(String str) throws IOException;
}
