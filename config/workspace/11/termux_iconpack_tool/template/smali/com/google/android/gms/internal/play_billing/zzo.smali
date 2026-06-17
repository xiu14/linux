.class public Lcom/google/android/gms/internal/play_billing/zzo;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/zzcz;


# static fields
.field public static final k:Z

.field public static final l:Ljava/util/logging/Logger;

.field public static final m:Lcom/google/android/gms/internal/play_billing/zzd;

.field public static final n:Ljava/lang/Object;


# instance fields
.field public volatile h:Ljava/lang/Object;

.field public volatile i:Lcom/google/android/gms/internal/play_billing/zzh;

.field public volatile j:Lcom/google/android/gms/internal/play_billing/zzm;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-class v0, Lcom/google/android/gms/internal/play_billing/zzm;

    .line 2
    .line 3
    const-string v1, "guava.concurrent.generate_cancellation_cause"

    .line 4
    .line 5
    const-string v2, "false"

    .line 6
    .line 7
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sput-boolean v1, Lcom/google/android/gms/internal/play_billing/zzo;->k:Z

    .line 16
    .line 17
    const-class v1, Lcom/google/android/gms/internal/play_billing/zzo;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sput-object v2, Lcom/google/android/gms/internal/play_billing/zzo;->l:Ljava/util/logging/Logger;

    .line 28
    .line 29
    :try_start_0
    new-instance v3, Lcom/google/android/gms/internal/play_billing/zzj;

    .line 30
    .line 31
    const-class v2, Ljava/lang/Thread;

    .line 32
    .line 33
    const-string v4, "a"

    .line 34
    .line 35
    invoke-static {v0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v2, "b"

    .line 40
    .line 41
    invoke-static {v0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const-string v2, "j"

    .line 46
    .line 47
    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const-class v0, Lcom/google/android/gms/internal/play_billing/zzh;

    .line 52
    .line 53
    const-string v2, "i"

    .line 54
    .line 55
    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    const-class v0, Ljava/lang/Object;

    .line 60
    .line 61
    const-string v2, "h"

    .line 62
    .line 63
    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/play_billing/zzj;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    :goto_0
    move-object v9, v0

    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    new-instance v3, Lcom/google/android/gms/internal/play_billing/zzl;

    .line 75
    .line 76
    invoke-direct {v3}, Lcom/google/android/gms/internal/play_billing/zzl;-><init>()V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_1
    sput-object v3, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 81
    .line 82
    if-eqz v9, :cond_0

    .line 83
    .line 84
    sget-object v4, Lcom/google/android/gms/internal/play_billing/zzo;->l:Ljava/util/logging/Logger;

    .line 85
    .line 86
    sget-object v5, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 87
    .line 88
    const-string v7, "<clinit>"

    .line 89
    .line 90
    const-string v8, "SafeAtomicHelper is broken!"

    .line 91
    .line 92
    const-string v6, "com.android.billingclient.util.concurrent.AbstractResolvableFuture"

    .line 93
    .line 94
    invoke-virtual/range {v4 .. v9}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    new-instance v0, Ljava/lang/Object;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    sput-object v0, Lcom/google/android/gms/internal/play_billing/zzo;->n:Ljava/lang/Object;

    .line 103
    .line 104
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public static d(Lcom/google/android/gms/internal/play_billing/zzo;)V
    .locals 4

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->j:Lcom/google/android/gms/internal/play_billing/zzm;

    .line 2
    .line 3
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 4
    .line 5
    sget-object v2, Lcom/google/android/gms/internal/play_billing/zzm;->c:Lcom/google/android/gms/internal/play_billing/zzm;

    .line 6
    .line 7
    invoke-virtual {v1, p0, v0, v2}, Lcom/google/android/gms/internal/play_billing/zzd;->e(Lcom/google/android/gms/internal/play_billing/zzo;Lcom/google/android/gms/internal/play_billing/zzm;Lcom/google/android/gms/internal/play_billing/zzm;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    :goto_0
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->i:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 17
    .line 18
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzh;->d:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 19
    .line 20
    invoke-virtual {v1, p0, v0, v3}, Lcom/google/android/gms/internal/play_billing/zzd;->c(Lcom/google/android/gms/internal/play_billing/zzo;Lcom/google/android/gms/internal/play_billing/zzh;Lcom/google/android/gms/internal/play_billing/zzh;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    move-object p0, v2

    .line 27
    :goto_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v1, v0, Lcom/google/android/gms/internal/play_billing/zzh;->c:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 30
    .line 31
    iput-object p0, v0, Lcom/google/android/gms/internal/play_billing/zzh;->c:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 32
    .line 33
    move-object p0, v0

    .line 34
    move-object v0, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    :goto_2
    if-eqz p0, :cond_4

    .line 37
    .line 38
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzh;->a:Ljava/lang/Runnable;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/zzh;->c:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 41
    .line 42
    instance-of v3, v0, Lcom/google/android/gms/internal/play_billing/zzk;

    .line 43
    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/zzh;->b:Ljava/util/concurrent/Executor;

    .line 47
    .line 48
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/play_billing/zzo;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 49
    .line 50
    .line 51
    move-object p0, v1

    .line 52
    goto :goto_2

    .line 53
    :cond_3
    throw v2

    .line 54
    :cond_4
    return-void

    .line 55
    :cond_5
    iget-object v3, v0, Lcom/google/android/gms/internal/play_billing/zzm;->a:Ljava/lang/Thread;

    .line 56
    .line 57
    if-eqz v3, :cond_6

    .line 58
    .line 59
    iput-object v2, v0, Lcom/google/android/gms/internal/play_billing/zzm;->a:Ljava/lang/Thread;

    .line 60
    .line 61
    invoke-static {v3}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 62
    .line 63
    .line 64
    :cond_6
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/zzm;->b:Lcom/google/android/gms/internal/play_billing/zzm;

    .line 65
    .line 66
    goto :goto_0
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
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

.method public static f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    move-object v5, v0

    .line 7
    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "RuntimeException while executing runnable "

    .line 20
    .line 21
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, " with executor "

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v2, "com.android.billingclient.util.concurrent.AbstractResolvableFuture"

    .line 40
    .line 41
    const-string v3, "executeListener"

    .line 42
    .line 43
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzo;->l:Ljava/util/logging/Logger;

    .line 44
    .line 45
    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/zze;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/zzg;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzo;->n:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    :cond_0
    return-object p0

    .line 15
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    .line 16
    .line 17
    check-cast p0, Lcom/google/android/gms/internal/play_billing/zzg;

    .line 18
    .line 19
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/zzg;->a:Ljava/lang/Throwable;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_2
    check-cast p0, Lcom/google/android/gms/internal/play_billing/zze;

    .line 26
    .line 27
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/zze;->a:Ljava/lang/Throwable;

    .line 28
    .line 29
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 30
    .line 31
    const-string v1, "Task was cancelled."

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    throw v0
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
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


# virtual methods
.method public final b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->i:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 5
    .line 6
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzh;->d:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 7
    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    .line 10
    new-instance v2, Lcom/google/android/gms/internal/play_billing/zzh;

    .line 11
    .line 12
    invoke-direct {v2, p1, p2}, Lcom/google/android/gms/internal/play_billing/zzh;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object v0, v2, Lcom/google/android/gms/internal/play_billing/zzh;->c:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 16
    .line 17
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 18
    .line 19
    invoke-virtual {v3, p0, v0, v2}, Lcom/google/android/gms/internal/play_billing/zzd;->c(Lcom/google/android/gms/internal/play_billing/zzo;Lcom/google/android/gms/internal/play_billing/zzh;Lcom/google/android/gms/internal/play_billing/zzh;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->i:Lcom/google/android/gms/internal/play_billing/zzh;

    .line 27
    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    :cond_2
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/zzo;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public c()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/google/android/gms/internal/play_billing/zzk;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "setFuture=[null]"

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledFuture;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v0, p0

    .line 15
    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 16
    .line 17
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v3, "remaining delay=["

    .line 26
    .line 27
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " ms]"

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    return-object v0
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
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

.method public final cancel(Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/zzk;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v4, 0x0

    .line 12
    :goto_0
    or-int/2addr v1, v4

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    sget-boolean v1, Lcom/google/android/gms/internal/play_billing/zzo;->k:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance p1, Lcom/google/android/gms/internal/play_billing/zze;

    .line 20
    .line 21
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 22
    .line 23
    const-string v4, "Future.cancel() was called."

    .line 24
    .line 25
    invoke-direct {v1, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/play_billing/zze;-><init>(Ljava/util/concurrent/CancellationException;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    if-eqz p1, :cond_2

    .line 33
    .line 34
    sget-object p1, Lcom/google/android/gms/internal/play_billing/zze;->b:Lcom/google/android/gms/internal/play_billing/zze;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/play_billing/zze;->c:Lcom/google/android/gms/internal/play_billing/zze;

    .line 38
    .line 39
    :cond_3
    :goto_1
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 40
    .line 41
    invoke-virtual {v1, p0, v0, p1}, Lcom/google/android/gms/internal/play_billing/zzd;->d(Lcom/google/android/gms/internal/play_billing/zzo;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/zzo;->d(Lcom/google/android/gms/internal/play_billing/zzo;)V

    .line 48
    .line 49
    .line 50
    instance-of p1, v0, Lcom/google/android/gms/internal/play_billing/zzk;

    .line 51
    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    return v2

    .line 55
    :cond_4
    const/4 p1, 0x0

    .line 56
    throw p1

    .line 57
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    .line 58
    .line 59
    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/zzk;

    .line 60
    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    :cond_6
    return v3
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
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

.method public final e(Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    const-string v0, "]"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :catch_0
    move-exception v0

    .line 19
    goto :goto_3

    .line 20
    :catch_1
    move-exception v1

    .line 21
    goto :goto_4

    .line 22
    :cond_0
    :goto_1
    const-string v1, "SUCCESS, result=["

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    if-ne v2, p0, :cond_1

    .line 28
    .line 29
    const-string v1, "this future"

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_2
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v2

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 51
    .line 52
    .line 53
    :cond_2
    throw v2
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    :goto_3
    const-string v1, "UNKNOWN, cause=["

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v0, " thrown from get()]"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_2
    const-string v0, "CANCELLED"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_4
    const-string v2, "FAILURE, cause=["

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_3
    const/4 v1, 0x1

    .line 95
    goto :goto_0
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

.method public final g(Lcom/google/android/gms/internal/play_billing/zzm;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p1, Lcom/google/android/gms/internal/play_billing/zzm;->a:Ljava/lang/Thread;

    .line 3
    .line 4
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/zzo;->j:Lcom/google/android/gms/internal/play_billing/zzm;

    .line 5
    .line 6
    sget-object v1, Lcom/google/android/gms/internal/play_billing/zzm;->c:Lcom/google/android/gms/internal/play_billing/zzm;

    .line 7
    .line 8
    if-eq p1, v1, :cond_3

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    :goto_1
    if-eqz p1, :cond_3

    .line 12
    .line 13
    iget-object v2, p1, Lcom/google/android/gms/internal/play_billing/zzm;->b:Lcom/google/android/gms/internal/play_billing/zzm;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/google/android/gms/internal/play_billing/zzm;->a:Ljava/lang/Thread;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    move-object v1, p1

    .line 20
    goto :goto_2

    .line 21
    :cond_0
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iput-object v2, v1, Lcom/google/android/gms/internal/play_billing/zzm;->b:Lcom/google/android/gms/internal/play_billing/zzm;

    .line 24
    .line 25
    iget-object p1, v1, Lcom/google/android/gms/internal/play_billing/zzm;->a:Ljava/lang/Thread;

    .line 26
    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 31
    .line 32
    invoke-virtual {v3, p0, p1, v2}, Lcom/google/android/gms/internal/play_billing/zzd;->e(Lcom/google/android/gms/internal/play_billing/zzo;Lcom/google/android/gms/internal/play_billing/zzm;Lcom/google/android/gms/internal/play_billing/zzm;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_2
    move-object p1, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    return-void
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
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
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

.method public final get()Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_8

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    instance-of v4, v0, Lcom/google/android/gms/internal/play_billing/zzk;

    xor-int/2addr v4, v2

    and-int/2addr v3, v4

    if-eqz v3, :cond_1

    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzo;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->j:Lcom/google/android/gms/internal/play_billing/zzm;

    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzm;->c:Lcom/google/android/gms/internal/play_billing/zzm;

    if-eq v0, v3, :cond_7

    new-instance v4, Lcom/google/android/gms/internal/play_billing/zzm;

    .line 4
    invoke-direct {v4}, Lcom/google/android/gms/internal/play_billing/zzm;-><init>()V

    :cond_2
    sget-object v5, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 5
    invoke-virtual {v5, v4, v0}, Lcom/google/android/gms/internal/play_billing/zzd;->a(Lcom/google/android/gms/internal/play_billing/zzm;Lcom/google/android/gms/internal/play_billing/zzm;)V

    .line 6
    invoke-virtual {v5, p0, v0, v4}, Lcom/google/android/gms/internal/play_billing/zzd;->e(Lcom/google/android/gms/internal/play_billing/zzo;Lcom/google/android/gms/internal/play_billing/zzm;Lcom/google/android/gms/internal/play_billing/zzm;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 7
    :cond_3
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_5

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    if-eqz v0, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    :goto_1
    instance-of v5, v0, Lcom/google/android/gms/internal/play_billing/zzk;

    xor-int/2addr v5, v2

    and-int/2addr v3, v5

    if-eqz v3, :cond_3

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzo;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 11
    :cond_5
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/play_billing/zzo;->g(Lcom/google/android/gms/internal/play_billing/zzm;)V

    new-instance v0, Ljava/lang/InterruptedException;

    .line 12
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 13
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->j:Lcom/google/android/gms/internal/play_billing/zzm;

    if-ne v0, v3, :cond_2

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    .line 14
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzo;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 15
    :cond_8
    new-instance v0, Ljava/lang/InterruptedException;

    .line 16
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    .line 17
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    .line 18
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v6

    if-nez v6, :cond_16

    .line 19
    iget-object v6, v0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    const/4 v8, 0x1

    if-eqz v6, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    instance-of v10, v6, Lcom/google/android/gms/internal/play_billing/zzk;

    xor-int/2addr v10, v8

    and-int/2addr v9, v10

    if-eqz v9, :cond_1

    .line 20
    invoke-static {v6}, Lcom/google/android/gms/internal/play_billing/zzo;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_1
    const-wide/16 v9, 0x0

    cmp-long v6, v4, v9

    if-lez v6, :cond_2

    .line 21
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v11

    add-long/2addr v11, v4

    goto :goto_1

    :cond_2
    move-wide v11, v9

    :goto_1
    const-wide/16 v13, 0x3e8

    cmp-long v6, v4, v13

    if-ltz v6, :cond_a

    iget-object v6, v0, Lcom/google/android/gms/internal/play_billing/zzo;->j:Lcom/google/android/gms/internal/play_billing/zzm;

    sget-object v15, Lcom/google/android/gms/internal/play_billing/zzm;->c:Lcom/google/android/gms/internal/play_billing/zzm;

    if-eq v6, v15, :cond_9

    new-instance v7, Lcom/google/android/gms/internal/play_billing/zzm;

    .line 22
    invoke-direct {v7}, Lcom/google/android/gms/internal/play_billing/zzm;-><init>()V

    const/16 v16, 0x1

    :cond_3
    sget-object v8, Lcom/google/android/gms/internal/play_billing/zzo;->m:Lcom/google/android/gms/internal/play_billing/zzd;

    .line 23
    invoke-virtual {v8, v7, v6}, Lcom/google/android/gms/internal/play_billing/zzd;->a(Lcom/google/android/gms/internal/play_billing/zzm;Lcom/google/android/gms/internal/play_billing/zzm;)V

    .line 24
    invoke-virtual {v8, v0, v6, v7}, Lcom/google/android/gms/internal/play_billing/zzd;->e(Lcom/google/android/gms/internal/play_billing/zzo;Lcom/google/android/gms/internal/play_billing/zzm;Lcom/google/android/gms/internal/play_billing/zzm;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 25
    :cond_4
    invoke-static {v0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 26
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_7

    .line 27
    iget-object v4, v0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    if-eqz v4, :cond_5

    const/4 v5, 0x1

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    :goto_2
    instance-of v6, v4, Lcom/google/android/gms/internal/play_billing/zzk;

    xor-int/lit8 v6, v6, 0x1

    and-int/2addr v5, v6

    if-eqz v5, :cond_6

    .line 28
    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/zzo;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 29
    :cond_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v4, v11, v4

    cmp-long v6, v4, v13

    if-gez v6, :cond_4

    .line 30
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/play_billing/zzo;->g(Lcom/google/android/gms/internal/play_billing/zzm;)V

    goto :goto_3

    .line 31
    :cond_7
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/play_billing/zzo;->g(Lcom/google/android/gms/internal/play_billing/zzm;)V

    new-instance v1, Ljava/lang/InterruptedException;

    .line 32
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    .line 33
    :cond_8
    iget-object v6, v0, Lcom/google/android/gms/internal/play_billing/zzo;->j:Lcom/google/android/gms/internal/play_billing/zzm;

    if-ne v6, v15, :cond_3

    :cond_9
    iget-object v1, v0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    .line 34
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/zzo;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :cond_a
    const/16 v16, 0x1

    :goto_3
    cmp-long v6, v4, v9

    if-lez v6, :cond_e

    .line 35
    iget-object v4, v0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    if-eqz v4, :cond_b

    const/4 v5, 0x1

    goto :goto_4

    :cond_b
    const/4 v5, 0x0

    :goto_4
    instance-of v6, v4, Lcom/google/android/gms/internal/play_billing/zzk;

    xor-int/lit8 v6, v6, 0x1

    and-int/2addr v5, v6

    if-eqz v5, :cond_c

    .line 36
    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/zzo;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 37
    :cond_c
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_d

    .line 38
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v4, v11, v4

    goto :goto_3

    .line 39
    :cond_d
    new-instance v1, Ljava/lang/InterruptedException;

    .line 40
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1

    .line 41
    :cond_e
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzo;->toString()Ljava/lang/String;

    move-result-object v6

    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Waited "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-long v11, v4, v13

    cmp-long v8, v11, v9

    if-gez v8, :cond_14

    const-string v8, " (plus "

    invoke-virtual {v2, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    neg-long v4, v4

    sget-object v8, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 44
    invoke-virtual {v3, v4, v5, v8}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v11

    .line 45
    invoke-virtual {v3, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v17

    sub-long v4, v4, v17

    cmp-long v3, v11, v9

    if-eqz v3, :cond_10

    cmp-long v8, v4, v13

    if-lez v8, :cond_f

    goto :goto_5

    :cond_f
    const/16 v16, 0x0

    :cond_10
    :goto_5
    if-lez v3, :cond_12

    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v16, :cond_11

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_11
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_12
    if-eqz v16, :cond_13

    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " nanoseconds "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_13
    const-string v1, "delay)"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 48
    :cond_14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzo;->isDone()Z

    move-result v1

    if-eqz v1, :cond_15

    const-string v1, " but future completed as timeout expired"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 49
    new-instance v2, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v2, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 50
    :cond_15
    new-instance v1, Ljava/util/concurrent/TimeoutException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 51
    :cond_16
    new-instance v1, Ljava/lang/InterruptedException;

    .line 52
    invoke-direct {v1}, Ljava/lang/InterruptedException;-><init>()V

    throw v1
.end method

.method public final isCancelled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/google/android/gms/internal/play_billing/zze;

    .line 4
    .line 5
    return v0
    .line 6
    .line 7
    .line 8
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
.end method

.method public final isDone()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/zzk;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    xor-int/2addr v1, v2

    .line 12
    and-int/2addr v0, v1

    .line 13
    return v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "[status="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/zzo;->h:Ljava/lang/Object;

    .line 19
    .line 20
    instance-of v1, v1, Lcom/google/android/gms/internal/play_billing/zze;

    .line 21
    .line 22
    const-string v2, "]"

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const-string v1, "CANCELLED"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/zzo;->isDone()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/zzo;->e(Ljava/lang/StringBuilder;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/zzo;->c()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v3, "Exception thrown from implementation: "

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_0
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    const-string v3, "PENDING, info=["

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/zzo;->isDone()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/zzo;->e(Ljava/lang/StringBuilder;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    const-string v1, "PENDING"

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0
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
