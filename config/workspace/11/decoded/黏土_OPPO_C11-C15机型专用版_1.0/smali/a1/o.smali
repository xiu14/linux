.class public final synthetic La1/o;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/datatransport/runtime/scheduling/DefaultScheduler;Lcom/google/android/datatransport/runtime/TransportContext;Lcom/google/android/datatransport/runtime/a;Lcom/google/android/datatransport/runtime/EventInternal;)V
    .locals 0

    .line 1
    const/16 p3, 0x9

    iput p3, p0, La1/o;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/o;->i:Ljava/lang/Object;

    iput-object p2, p0, La1/o;->j:Ljava/lang/Object;

    iput-object p4, p0, La1/o;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, La1/o;->h:I

    iput-object p1, p0, La1/o;->i:Ljava/lang/Object;

    iput-object p2, p0, La1/o;->j:Ljava/lang/Object;

    iput-object p3, p0, La1/o;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ls/i;Ld5/a;)V
    .locals 1

    .line 3
    const/4 v0, 0x4

    iput v0, p0, La1/o;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/o;->i:Ljava/lang/Object;

    iput-object p2, p0, La1/o;->j:Ljava/lang/Object;

    check-cast p3, Lkotlin/jvm/internal/k;

    iput-object p3, p0, La1/o;->k:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 9

    .line 1
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm2/d;

    .line 4
    .line 5
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ls/l;

    .line 8
    .line 9
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lm2/e0;

    .line 12
    .line 13
    :try_start_0
    iget-object v1, v1, Ls/l;->i:Ls/k;

    .line 14
    .line 15
    invoke-virtual {v1}, Ls/h;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    const/4 v1, 0x1

    .line 27
    :goto_0
    iget-object v3, v0, Lm2/d;->k:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v3

    .line 30
    :try_start_1
    iget-object v4, v2, Lm2/e0;->a:Lu2/p;

    .line 31
    .line 32
    invoke-static {v4}, La/a;->B(Lu2/p;)Lu2/j;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-object v5, v4, Lu2/j;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v5}, Lm2/d;->d(Ljava/lang/String;)Lm2/e0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-ne v6, v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v5}, Lm2/d;->b(Ljava/lang/String;)Lm2/e0;

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_3

    .line 50
    :cond_0
    :goto_1
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v6, Lm2/d;->l:Ljava/lang/String;

    .line 55
    .line 56
    new-instance v7, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-class v8, Lm2/d;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v8, " "

    .line 71
    .line 72
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v5, " executed; reschedule = "

    .line 79
    .line 80
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v2, v6, v5}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v0, Lm2/d;->j:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    const/4 v5, 0x0

    .line 100
    :goto_2
    if-ge v5, v2, :cond_1

    .line 101
    .line 102
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    check-cast v6, Lm2/a;

    .line 109
    .line 110
    invoke-interface {v6, v4, v1}, Lm2/a;->c(Lu2/j;Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_1
    monitor-exit v3

    .line 115
    return-void

    .line 116
    :goto_3
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    throw v0
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


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, La1/o;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/DefaultScheduler;

    .line 9
    .line 10
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/google/android/datatransport/runtime/TransportContext;

    .line 13
    .line 14
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lcom/google/android/datatransport/runtime/EventInternal;

    .line 17
    .line 18
    sget-object v3, Lcom/google/android/datatransport/runtime/scheduling/DefaultScheduler;->f:Ljava/util/logging/Logger;

    .line 19
    .line 20
    const-string v4, "Transport backend \'"

    .line 21
    .line 22
    :try_start_0
    iget-object v5, v0, Lcom/google/android/datatransport/runtime/scheduling/DefaultScheduler;->c:Lcom/google/android/datatransport/runtime/backends/BackendRegistry;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/TransportContext;->b()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-interface {v5, v6}, Lcom/google/android/datatransport/runtime/backends/BackendRegistry;->a(Ljava/lang/String;)Lcom/google/android/datatransport/runtime/backends/TransportBackend;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/TransportContext;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, "\' is not registered"

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v3, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catch_0
    move-exception v0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-interface {v5, v2}, Lcom/google/android/datatransport/runtime/backends/TransportBackend;->a(Lcom/google/android/datatransport/runtime/EventInternal;)Lcom/google/android/datatransport/runtime/EventInternal;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object v4, v0, Lcom/google/android/datatransport/runtime/scheduling/DefaultScheduler;->e:Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard;

    .line 71
    .line 72
    new-instance v5, Lg2/h;

    .line 73
    .line 74
    const/4 v6, 0x3

    .line 75
    invoke-direct {v5, v0, v1, v2, v6}, Lg2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v4, v5}, Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard;->a(Lcom/google/android/datatransport/runtime/synchronization/SynchronizationGuard$CriticalSection;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v2, "Error scheduling event "

    .line 85
    .line 86
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v3, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :goto_1
    return-void

    .line 104
    :pswitch_0
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lu2/c;

    .line 107
    .line 108
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lm2/j;

    .line 111
    .line 112
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, La1/w;

    .line 115
    .line 116
    iget-object v0, v0, Lu2/c;->h:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lm2/d;

    .line 119
    .line 120
    invoke-virtual {v0, v1, v2}, Lm2/d;->i(Lm2/j;La1/w;)Z

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_1
    invoke-direct {p0}, La1/o;->a()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_2
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lu2/u;

    .line 131
    .line 132
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, Ll6/h;

    .line 135
    .line 136
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Ljava/lang/Throwable;

    .line 139
    .line 140
    iget-object v0, v0, Lu2/u;->i:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Ll6/o;

    .line 143
    .line 144
    invoke-interface {v1, v0, v2}, Ll6/h;->e(Ll6/e;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_3
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Lu2/u;

    .line 151
    .line 152
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, Ll6/h;

    .line 155
    .line 156
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v2, Ll6/s0;

    .line 159
    .line 160
    iget-object v0, v0, Lu2/u;->i:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Ll6/o;

    .line 163
    .line 164
    iget-object v3, v0, Ll6/o;->i:Ll6/e;

    .line 165
    .line 166
    invoke-interface {v3}, Ll6/e;->p0()Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_1

    .line 171
    .line 172
    new-instance v2, Ljava/io/IOException;

    .line 173
    .line 174
    const-string v3, "Canceled"

    .line 175
    .line 176
    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v1, v0, v2}, Ll6/h;->e(Ll6/e;Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_1
    invoke-interface {v1, v0, v2}, Ll6/h;->d(Ll6/e;Ll6/s0;)V

    .line 184
    .line 185
    .line 186
    :goto_2
    return-void

    .line 187
    :pswitch_4
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 190
    .line 191
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v1, Ls/i;

    .line 194
    .line 195
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v2, Lkotlin/jvm/internal/k;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_2

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_2
    :try_start_1
    invoke-interface {v2}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v1, v0}, Ls/i;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :catchall_0
    move-exception v0

    .line 215
    invoke-virtual {v1, v0}, Ls/i;->b(Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    :goto_3
    return-void

    .line 219
    :pswitch_5
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 222
    .line 223
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, Ls/i;

    .line 226
    .line 227
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v2, Ld5/a;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_3

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_3
    :try_start_2
    invoke-interface {v2}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v1, v0}, Ls/i;->a(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :catchall_1
    move-exception v0

    .line 247
    invoke-virtual {v1, v0}, Ls/i;->b(Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    :goto_4
    return-void

    .line 251
    :pswitch_6
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Landroidx/fragment/app/h2;

    .line 254
    .line 255
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, Landroidx/fragment/app/h2;

    .line 258
    .line 259
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v2, Landroidx/fragment/app/p;

    .line 262
    .line 263
    iget-object v0, v0, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 264
    .line 265
    iget-object v1, v1, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 266
    .line 267
    iget-boolean v2, v2, Landroidx/fragment/app/p;->o:Z

    .line 268
    .line 269
    sget-object v3, Landroidx/fragment/app/v1;->a:Landroidx/fragment/app/a2;

    .line 270
    .line 271
    const-string v3, "inFragment"

    .line 272
    .line 273
    invoke-static {v0, v3}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v3, "outFragment"

    .line 277
    .line 278
    invoke-static {v1, v3}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    if-eqz v2, :cond_4

    .line 282
    .line 283
    invoke-virtual {v1}, Landroidx/fragment/app/l0;->getEnterTransitionCallback()Lb0/h0;

    .line 284
    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_4
    invoke-virtual {v0}, Landroidx/fragment/app/l0;->getEnterTransitionCallback()Lb0/h0;

    .line 288
    .line 289
    .line 290
    :goto_5
    return-void

    .line 291
    :pswitch_7
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Landroid/view/ViewGroup;

    .line 294
    .line 295
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v1, Landroid/view/View;

    .line 298
    .line 299
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v2, Landroidx/fragment/app/e;

    .line 302
    .line 303
    const-string v3, "$container"

    .line 304
    .line 305
    invoke-static {v0, v3}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    const-string v3, "this$0"

    .line 309
    .line 310
    invoke-static {v2, v3}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 314
    .line 315
    .line 316
    iget-object v0, v2, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/f;

    .line 317
    .line 318
    iget-object v0, v0, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 319
    .line 320
    invoke-virtual {v0, v2}, Landroidx/fragment/app/h2;->c(Landroidx/fragment/app/g2;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_8
    iget-object v0, p0, La1/o;->i:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, La1/q;

    .line 327
    .line 328
    iget-object v1, p0, La1/o;->j:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, Le6/d;

    .line 331
    .line 332
    iget-object v2, p0, La1/o;->k:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 335
    .line 336
    :try_start_3
    iget-object v0, v0, La1/q;->i:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, Landroid/content/Context;

    .line 339
    .line 340
    invoke-static {v0}, La/a;->u(Landroid/content/Context;)La1/z;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    if-eqz v0, :cond_5

    .line 345
    .line 346
    iget-object v3, v0, La1/z;->a:La1/l;

    .line 347
    .line 348
    check-cast v3, La1/y;

    .line 349
    .line 350
    iget-object v4, v3, La1/y;->k:Ljava/lang/Object;

    .line 351
    .line 352
    monitor-enter v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 353
    :try_start_4
    iput-object v2, v3, La1/y;->m:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 354
    .line 355
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 356
    :try_start_5
    iget-object v0, v0, La1/z;->a:La1/l;

    .line 357
    .line 358
    new-instance v3, La1/p;

    .line 359
    .line 360
    invoke-direct {v3, v1, v2}, La1/p;-><init>(Le6/d;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v0, v3}, La1/l;->i(Le6/d;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 364
    .line 365
    .line 366
    goto :goto_7

    .line 367
    :catchall_2
    move-exception v0

    .line 368
    goto :goto_6

    .line 369
    :catchall_3
    move-exception v0

    .line 370
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 371
    :try_start_7
    throw v0

    .line 372
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 373
    .line 374
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 375
    .line 376
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 380
    :goto_6
    invoke-virtual {v1, v0}, Le6/d;->E(Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 384
    .line 385
    .line 386
    :goto_7
    return-void

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method
