.class public final Ll6/t0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final a:[Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Landroidx/lifecycle/a1;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/a1;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll6/t0;->c:Landroidx/lifecycle/a1;

    .line 5
    .line 6
    iput-object p2, p0, Ll6/t0;->b:Ljava/lang/Class;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    new-array p1, p1, [Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Ll6/t0;->a:[Ljava/lang/Object;

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Ll6/t0;->b:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-class v2, Ljava/lang/Object;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    :goto_0
    move-object v4, p3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget-object p3, p0, Ll6/t0;->a:[Ljava/lang/Object;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :goto_1
    sget-object p3, Ll6/l0;->b:Ll6/b;

    .line 24
    .line 25
    invoke-virtual {p3, p2}, Ll6/b;->e(Ljava/lang/reflect/Method;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p3, p2, v0, p1, v4}, Ll6/b;->d(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_2
    iget-object p3, p0, Ll6/t0;->c:Landroidx/lifecycle/a1;

    .line 37
    .line 38
    :goto_2
    iget-object v1, p3, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    instance-of v2, v1, Ll6/t;

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    check-cast v1, Ll6/t;

    .line 51
    .line 52
    :goto_3
    move-object p2, v1

    .line 53
    goto :goto_6

    .line 54
    :cond_3
    if-nez v1, :cond_5

    .line 55
    .line 56
    new-instance v2, Ljava/lang/Object;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    monitor-enter v2

    .line 62
    :try_start_0
    iget-object v1, p3, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    invoke-virtual {v1, p2, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    if-nez v1, :cond_4

    .line 71
    .line 72
    :try_start_1
    invoke-static {p3, v0, p2}, Ll6/t;->b(Landroidx/lifecycle/a1;Ljava/lang/Class;Ljava/lang/reflect/Method;)Ll6/t;

    .line 73
    .line 74
    .line 75
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    :try_start_2
    iget-object p3, p3, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-virtual {p3, p2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    monitor-exit v2

    .line 84
    goto :goto_3

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object p1, v0

    .line 87
    goto :goto_4

    .line 88
    :catchall_1
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    iget-object p3, p3, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 93
    .line 94
    invoke-virtual {p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_4
    monitor-exit v2

    .line 99
    goto :goto_5

    .line 100
    :goto_4
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    throw p1

    .line 102
    :cond_5
    :goto_5
    monitor-enter v1

    .line 103
    :try_start_3
    iget-object v2, p3, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 106
    .line 107
    invoke-virtual {v2, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_6

    .line 112
    .line 113
    monitor-exit v1

    .line 114
    goto :goto_2

    .line 115
    :catchall_2
    move-exception v0

    .line 116
    move-object p1, v0

    .line 117
    goto :goto_7

    .line 118
    :cond_6
    move-object p2, v2

    .line 119
    check-cast p2, Ll6/t;

    .line 120
    .line 121
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 122
    :goto_6
    new-instance v1, Ll6/a0;

    .line 123
    .line 124
    iget-object v2, p2, Ll6/t;->a:Ll6/r0;

    .line 125
    .line 126
    iget-object v5, p2, Ll6/t;->b:Lw5/d;

    .line 127
    .line 128
    iget-object v6, p2, Ll6/t;->c:Ll6/n;

    .line 129
    .line 130
    move-object v3, p1

    .line 131
    invoke-direct/range {v1 .. v6}, Ll6/a0;-><init>(Ll6/r0;Ljava/lang/Object;[Ljava/lang/Object;Lw5/d;Ll6/n;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v1, v4}, Ll6/t;->a(Ll6/a0;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :goto_7
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 140
    throw p1
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method
