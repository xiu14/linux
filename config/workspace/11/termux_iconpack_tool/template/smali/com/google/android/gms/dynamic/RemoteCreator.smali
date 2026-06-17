.class public abstract Lcom/google/android/gms/dynamic/RemoteCreator;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/dynamic/RemoteCreator$RemoteCreatorException;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;


# virtual methods
.method public abstract a(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/zam;
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/dynamic/RemoteCreator;->a:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/google/android/gms/common/GooglePlayServicesUtilLight;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    :try_start_0
    const-string v0, "com.google.android.gms"

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_1
    const-string v0, "com.google.android.gms.common.ui.SignInButtonCreatorImpl"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroid/os/IBinder;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/google/android/gms/dynamic/RemoteCreator;->a(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/zam;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lcom/google/android/gms/dynamic/RemoteCreator;->a:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    .line 43
    goto :goto_4

    .line 44
    :catch_1
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :catch_2
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :catch_3
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :goto_1
    new-instance v0, Lcom/google/android/gms/dynamic/RemoteCreator$RemoteCreatorException;

    .line 51
    .line 52
    const-string v1, "Could not access creator."

    .line 53
    .line 54
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :goto_2
    new-instance v0, Lcom/google/android/gms/dynamic/RemoteCreator$RemoteCreatorException;

    .line 59
    .line 60
    const-string v1, "Could not instantiate creator."

    .line 61
    .line 62
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :goto_3
    new-instance v0, Lcom/google/android/gms/dynamic/RemoteCreator$RemoteCreatorException;

    .line 67
    .line 68
    const-string v1, "Could not load creator class."

    .line 69
    .line 70
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_0
    new-instance p1, Lcom/google/android/gms/dynamic/RemoteCreator$RemoteCreatorException;

    .line 75
    .line 76
    const-string v0, "Could not get remote context."

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_1
    :goto_4
    iget-object p1, p0, Lcom/google/android/gms/dynamic/RemoteCreator;->a:Ljava/lang/Object;

    .line 83
    .line 84
    return-object p1
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
