.class public abstract Ll2/f0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Ll2/s;
    .locals 6

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workerClassName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "workerParameters"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Ll2/s;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "{\n                Class.\u2026class.java)\n            }"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    :try_start_1
    new-array v2, v1, [Ljava/lang/Class;

    .line 33
    .line 34
    const-class v3, Landroid/content/Context;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    aput-object v3, v2, v4

    .line 38
    .line 39
    const-class v3, Landroidx/work/WorkerParameters;

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    aput-object v3, v2, v5

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-array v1, v1, [Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p1, v1, v4

    .line 51
    .line 52
    aput-object p3, v1, v5

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p3, "{\n                val co\u2026Parameters)\n            }"

    .line 59
    .line 60
    invoke-static {p1, p3}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    check-cast p1, Ll2/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    invoke-virtual {p1}, Ll2/s;->isUsed()Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-nez p3, :cond_0

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string p3, "WorkerFactory ("

    .line 75
    .line 76
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p3, ") returned an instance of a ListenableWorker ("

    .line 91
    .line 92
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p2, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."

    .line 99
    .line 100
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p2

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    sget-object v0, Ll2/g0;->a:Ljava/lang/String;

    .line 119
    .line 120
    const-string v1, "Could not instantiate "

    .line 121
    .line 122
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p3, v0, p2, p1}, Ll2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :catchall_1
    move-exception p1

    .line 131
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    sget-object v0, Ll2/g0;->a:Ljava/lang/String;

    .line 136
    .line 137
    const-string v1, "Invalid class: "

    .line 138
    .line 139
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p3, v0, p2, p1}, Ll2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    throw p1
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method
