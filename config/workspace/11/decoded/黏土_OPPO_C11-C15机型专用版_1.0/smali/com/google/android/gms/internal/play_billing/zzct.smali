.class final Lcom/google/android/gms/internal/play_billing/zzct;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Lcom/google/android/gms/internal/play_billing/zzcz;

.field public final i:Lp3/a0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/zzcz;Lp3/a0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/zzct;->h:Lcom/google/android/gms/internal/play_billing/zzcz;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/zzct;->i:Lp3/a0;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzct;->h:Lcom/google/android/gms/internal/play_billing/zzcz;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/zzdf;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/zzct;->i:Lp3/a0;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzdf;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzdf;->c()Ljava/lang/Throwable;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v2, v1}, Lp3/a0;->a(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    :goto_0
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 24
    .line 25
    .line 26
    move-result v1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    :goto_1
    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_5

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_6

    .line 49
    :cond_2
    :goto_2
    check-cast v0, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iget-object v3, v2, Lp3/a0;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Lp3/c0;

    .line 58
    .line 59
    if-lez v1, :cond_3

    .line 60
    .line 61
    iget v1, v2, Lp3/a0;->a:I

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const-string v4, "Billing override value was set by a license tester."

    .line 71
    .line 72
    invoke-static {v0, v4}, Lp3/f0;->a(ILjava/lang/String;)Lp3/e;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sget-object v4, Lcom/google/android/gms/internal/play_billing/zzie;->W0:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 77
    .line 78
    invoke-virtual {v3, v4, v1, v0}, Lp3/c0;->I(Lcom/google/android/gms/internal/play_billing/zzie;ILp3/e;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v2, Lp3/a0;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Ll0/a;

    .line 84
    .line 85
    invoke-interface {v1, v0}, Ll0/a;->accept(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    iget-object v0, v2, Lp3/a0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Ljava/lang/Runnable;

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 94
    .line 95
    .line 96
    :goto_3
    return-void

    .line 97
    :catchall_1
    move-exception v0

    .line 98
    if-nez v4, :cond_4

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 106
    .line 107
    .line 108
    :goto_4
    throw v0

    .line 109
    :catch_1
    const/4 v4, 0x1

    .line 110
    goto :goto_1

    .line 111
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    new-array v3, v3, [Ljava/lang/Object;

    .line 114
    .line 115
    aput-object v0, v3, v4

    .line 116
    .line 117
    const-string v0, "Future was expected to be done: %s"

    .line 118
    .line 119
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zzbj;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v1
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    :goto_5
    invoke-virtual {v2, v0}, Lp3/a0;->a(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v2, v0}, Lp3/a0;->a(Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    return-void
    .line 139
    .line 140
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzbc;

    .line 2
    .line 3
    const-string v1, "zzct"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzbc;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/play_billing/zzbb;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/play_billing/zzbb;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lcom/google/android/gms/internal/play_billing/zzbc;->c:Lcom/google/android/gms/internal/play_billing/zzbb;

    .line 14
    .line 15
    iput-object v1, v2, Lcom/google/android/gms/internal/play_billing/zzbb;->b:Lcom/google/android/gms/internal/play_billing/zzbb;

    .line 16
    .line 17
    iput-object v1, v0, Lcom/google/android/gms/internal/play_billing/zzbc;->c:Lcom/google/android/gms/internal/play_billing/zzbb;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/zzct;->i:Lp3/a0;

    .line 20
    .line 21
    iput-object v2, v1, Lcom/google/android/gms/internal/play_billing/zzbb;->a:Lp3/a0;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzbc;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
