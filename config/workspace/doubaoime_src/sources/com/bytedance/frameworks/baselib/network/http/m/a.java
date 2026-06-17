package com.bytedance.frameworks.baselib.network.http.m;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class a extends ObjectInputStream {
    private final Set<String> a;

    public a(InputStream inputStream, Class<?>... clsArr) throws IOException {
        super(inputStream);
        this.a = new HashSet();
        for (Class<?> cls : clsArr) {
            this.a.add(cls.getName());
        }
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        if (objectStreamClass == null || objectStreamClass.getName() == null) {
            return super.resolveClass(objectStreamClass);
        }
        String name = objectStreamClass.getName();
        return this.a.contains(name) ? super.resolveClass(objectStreamClass) : Class.forName(name, true, ClassLoader.getSystemClassLoader().getParent());
    }
}
