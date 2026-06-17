.class public final Lp3/x;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Lp3/c;

.field public final b:Lcom/google/android/gms/internal/play_billing/zzbi;

.field public final c:Lcom/google/android/gms/internal/play_billing/zzbi;

.field public final synthetic d:Lp3/b;


# direct methods
.method public constructor <init>(Lp3/b;Lp3/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp3/x;->d:Lp3/b;

    .line 5
    .line 6
    iget-object p1, p1, Lp3/b;->B:Lcom/google/android/gms/internal/play_billing/zzbl;

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/play_billing/zzbi;-><init>(Lcom/google/android/gms/internal/play_billing/zzbl;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lp3/x;->b:Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/play_billing/zzbi;-><init>(Lcom/google/android/gms/internal/play_billing/zzbl;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lp3/x;->c:Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 21
    .line 22
    iput-object p2, p0, Lp3/x;->a:Lp3/c;

    .line 23
    .line 24
    return-void
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
.method public final a(Z)Ljava/lang/Long;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "This stopwatch is already stopped."

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lp3/x;->b:Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 7
    .line 8
    iget-boolean v2, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 9
    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    iget-object v2, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->a:Lcom/google/android/gms/internal/play_billing/zzbl;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzbl;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iget-boolean v4, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    iput-boolean v0, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 23
    .line 24
    iget-wide v0, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 25
    .line 26
    iget-wide v4, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->d:J

    .line 27
    .line 28
    sub-long/2addr v2, v4

    .line 29
    add-long/2addr v2, v0

    .line 30
    iput-wide v2, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 31
    .line 32
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 35
    .line 36
    invoke-virtual {p1, v2, v3, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    iget-object p1, p0, Lp3/x;->c:Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 52
    .line 53
    iget-boolean v2, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 54
    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    iget-object v2, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->a:Lcom/google/android/gms/internal/play_billing/zzbl;

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzbl;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    iget-boolean v4, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    iput-boolean v0, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 68
    .line 69
    iget-wide v0, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 70
    .line 71
    iget-wide v4, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->d:J

    .line 72
    .line 73
    sub-long/2addr v2, v4

    .line 74
    add-long/2addr v2, v0

    .line 75
    iput-wide v2, p1, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 76
    .line 77
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 78
    .line 79
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 80
    .line 81
    invoke-virtual {p1, v2, v3, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_3
    const/4 p1, 0x0

    .line 97
    return-object p1
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

.method public final b(Lp3/e;Lcom/google/android/gms/internal/play_billing/zzie;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzig;->y()Lcom/google/android/gms/internal/play_billing/zzic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p1, Lp3/e;->a:I

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 11
    .line 12
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 13
    .line 14
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/play_billing/zzig;->x(Lcom/google/android/gms/internal/play_billing/zzig;I)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, Lp3/e;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 23
    .line 24
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 25
    .line 26
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/zzig;->u(Lcom/google/android/gms/internal/play_billing/zzig;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 30
    .line 31
    .line 32
    iget-object p1, v0, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 33
    .line 34
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 35
    .line 36
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/zzig;->w(Lcom/google/android/gms/internal/play_billing/zzig;Lcom/google/android/gms/internal/play_billing/zzie;)V

    .line 37
    .line 38
    .line 39
    if-eqz p3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 42
    .line 43
    .line 44
    iget-object p1, v0, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 45
    .line 46
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 47
    .line 48
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/play_billing/zzig;->t(Lcom/google/android/gms/internal/play_billing/zzig;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0, p4}, Lp3/x;->a(Z)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    iget-object p2, p0, Lp3/x;->d:Lp3/b;

    .line 56
    .line 57
    if-eqz p4, :cond_2

    .line 58
    .line 59
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjv;->x()Lcom/google/android/gms/internal/play_billing/zzjt;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    const/4 p4, 0x0

    .line 64
    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/play_billing/zzjt;->i(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3}, Lcom/google/android/gms/internal/play_billing/zzjt;->l()V

    .line 68
    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    invoke-virtual {p3}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 77
    .line 78
    .line 79
    iget-object p1, p3, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 80
    .line 81
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzjv;

    .line 82
    .line 83
    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjv;->v(Lcom/google/android/gms/internal/play_billing/zzjv;J)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzhx;->A()Lcom/google/android/gms/internal/play_billing/zzhv;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzhv;->i(Lcom/google/android/gms/internal/play_billing/zzic;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 97
    .line 98
    .line 99
    iget-object p4, p1, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 100
    .line 101
    check-cast p4, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 102
    .line 103
    const/4 v0, 0x6

    .line 104
    invoke-static {p4, v0}, Lcom/google/android/gms/internal/play_billing/zzhx;->z(Lcom/google/android/gms/internal/play_billing/zzhx;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/play_billing/zzhv;->l(Lcom/google/android/gms/internal/play_billing/zzjt;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 115
    .line 116
    invoke-virtual {p2, p1}, Lp3/b;->j(Lcom/google/android/gms/internal/play_billing/zzhx;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjo;->v()Lcom/google/android/gms/internal/play_billing/zzjm;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    invoke-virtual {p3}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 125
    .line 126
    .line 127
    iget-object p4, p3, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 128
    .line 129
    check-cast p4, Lcom/google/android/gms/internal/play_billing/zzjo;

    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 136
    .line 137
    invoke-static {p4, v0}, Lcom/google/android/gms/internal/play_billing/zzjo;->t(Lcom/google/android/gms/internal/play_billing/zzjo;Lcom/google/android/gms/internal/play_billing/zzig;)V

    .line 138
    .line 139
    .line 140
    if-eqz p1, :cond_3

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    invoke-virtual {p3}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 147
    .line 148
    .line 149
    iget-object p1, p3, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 150
    .line 151
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzjo;

    .line 152
    .line 153
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/zzjo;->u(Lcom/google/android/gms/internal/play_billing/zzjo;J)V

    .line 154
    .line 155
    .line 156
    :cond_3
    iget-object p1, p2, Lp3/b;->h:Lu2/c;

    .line 157
    .line 158
    invoke-virtual {p3}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzjo;

    .line 163
    .line 164
    invoke-virtual {p1, p2}, Lu2/c;->p(Lcom/google/android/gms/internal/play_billing/zzjo;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :goto_1
    const-string p2, "BillingClient"

    .line 169
    .line 170
    const-string p3, "Unable to log."

    .line 171
    .line 172
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    return-void
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public final c(Lp3/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lp3/x;->d:Lp3/b;

    .line 2
    .line 3
    iget-object v1, v0, Lp3/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget v0, v0, Lp3/b;->b:I

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    if-ne v0, v2, :cond_0

    .line 10
    .line 11
    monitor-exit v1

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :try_start_1
    iget-object v0, p0, Lp3/x;->a:Lp3/c;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lp3/c;->onBillingSetupFinished(Lp3/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_1
    move-exception p1

    .line 23
    const-string v0, "BillingClient"

    .line 24
    .line 25
    const-string v1, "Exception while calling onBillingSetupFinished."

    .line 26
    .line 27
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    throw p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onBindingDied(Landroid/content/ComponentName;)V
    .locals 5

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service died."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :try_start_0
    iget-object v0, p0, Lp3/x;->d:Lp3/b;

    .line 10
    .line 11
    invoke-static {v0}, Lp3/b;->t(Lp3/b;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lp3/b;->h:Lu2/c;

    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzhx;->A()Lcom/google/android/gms/internal/play_billing/zzhv;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 24
    .line 25
    .line 26
    iget-object v2, v1, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 27
    .line 28
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 29
    .line 30
    const/4 v3, 0x6

    .line 31
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzhx;->z(Lcom/google/android/gms/internal/play_billing/zzhx;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzig;->y()Lcom/google/android/gms/internal/play_billing/zzic;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzie;->n1:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 41
    .line 42
    .line 43
    iget-object v4, v2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 44
    .line 45
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 46
    .line 47
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/play_billing/zzig;->w(Lcom/google/android/gms/internal/play_billing/zzig;Lcom/google/android/gms/internal/play_billing/zzie;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzhv;->i(Lcom/google/android/gms/internal/play_billing/zzic;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjv;->x()Lcom/google/android/gms/internal/play_billing/zzjt;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/play_billing/zzjt;->i(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzjt;->l()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzhv;->l(Lcom/google/android/gms/internal/play_billing/zzjt;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lu2/c;->j(Lcom/google/android/gms/internal/play_billing/zzhx;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, v0, Lp3/b;->h:Lu2/c;

    .line 79
    .line 80
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzij;->t()Lcom/google/android/gms/internal/play_billing/zzij;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lu2/c;->o(Lcom/google/android/gms/internal/play_billing/zzij;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_0
    const-string v1, "BillingClient"

    .line 89
    .line 90
    const-string v2, "Unable to log."

    .line 91
    .line 92
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v0, p0, Lp3/x;->d:Lp3/b;

    .line 96
    .line 97
    iget-object v1, v0, Lp3/b;->a:Ljava/lang/Object;

    .line 98
    .line 99
    monitor-enter v1

    .line 100
    :try_start_1
    iget v2, v0, Lp3/b;->b:I

    .line 101
    .line 102
    const/4 v3, 0x3

    .line 103
    if-eq v2, v3, :cond_2

    .line 104
    .line 105
    iget v2, v0, Lp3/b;->b:I

    .line 106
    .line 107
    if-nez v2, :cond_1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_1
    invoke-virtual {v0, p1}, Lp3/b;->m(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lp3/b;->p()V

    .line 114
    .line 115
    .line 116
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 117
    :try_start_2
    iget-object p1, p0, Lp3/x;->a:Lp3/c;

    .line 118
    .line 119
    invoke-interface {p1}, Lp3/c;->onBillingServiceDisconnected()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :catchall_1
    move-exception p1

    .line 124
    const-string v0, "BillingClient"

    .line 125
    .line 126
    const-string v1, "Exception while calling onBillingServiceDisconnected."

    .line 127
    .line 128
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :catchall_2
    move-exception p1

    .line 133
    goto :goto_4

    .line 134
    :cond_2
    :goto_2
    :try_start_3
    monitor-exit v1

    .line 135
    :goto_3
    return-void

    .line 136
    :goto_4
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 137
    throw p1
    .line 138
    .line 139
    .line 140
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 9

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service connected."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lp3/x;->d:Lp3/b;

    .line 9
    .line 10
    iget-object v1, p1, Lp3/b;->a:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    iget v0, p1, Lp3/b;->b:I

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    monitor-exit v1

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    move-object p1, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    sget v0, Lcom/google/android/gms/internal/play_billing/zzal;->c:I

    .line 24
    .line 25
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    instance-of v4, v3, Lcom/google/android/gms/internal/play_billing/zzam;

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    move-object p2, v3

    .line 40
    check-cast p2, Lcom/google/android/gms/internal/play_billing/zzam;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    new-instance v3, Lcom/google/android/gms/internal/play_billing/zzak;

    .line 44
    .line 45
    invoke-direct {v3, p2, v0}, Lcom/google/android/gms/internal/play_billing/zzap;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object p2, v3

    .line 49
    :goto_0
    iput-object p2, p1, Lp3/b;->i:Lcom/google/android/gms/internal/play_billing/zzam;

    .line 50
    .line 51
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    new-instance v3, Lp3/w;

    .line 53
    .line 54
    invoke-direct {v3, p0}, Lp3/w;-><init>(Lp3/x;)V

    .line 55
    .line 56
    .line 57
    new-instance v6, Landroidx/lifecycle/b0;

    .line 58
    .line 59
    invoke-direct {v6, v2, p0}, Landroidx/lifecycle/b0;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lp3/b;->u()Landroid/os/Handler;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {p1}, Lp3/b;->g()Ljava/util/concurrent/ExecutorService;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    const-wide/16 v4, 0x7530

    .line 71
    .line 72
    invoke-static/range {v3 .. v8}, Lp3/b;->h(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-nez p2, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Lp3/b;->x()Lp3/e;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzie;->G:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 83
    .line 84
    invoke-virtual {p1, v0, p2}, Lp3/b;->l(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p2}, Lp3/x;->c(Lp3/e;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    return-void

    .line 91
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    throw p1
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service disconnected."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :try_start_0
    iget-object v0, p0, Lp3/x;->d:Lp3/b;

    .line 10
    .line 11
    invoke-static {v0}, Lp3/b;->t(Lp3/b;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lp3/b;->h:Lu2/c;

    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzhx;->A()Lcom/google/android/gms/internal/play_billing/zzhv;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 24
    .line 25
    .line 26
    iget-object v2, v1, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 27
    .line 28
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 29
    .line 30
    const/4 v3, 0x6

    .line 31
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzhx;->z(Lcom/google/android/gms/internal/play_billing/zzhx;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzig;->y()Lcom/google/android/gms/internal/play_billing/zzic;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzie;->m1:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 41
    .line 42
    .line 43
    iget-object v4, v2, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 44
    .line 45
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 46
    .line 47
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/play_billing/zzig;->w(Lcom/google/android/gms/internal/play_billing/zzig;Lcom/google/android/gms/internal/play_billing/zzie;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzhv;->i(Lcom/google/android/gms/internal/play_billing/zzic;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjv;->x()Lcom/google/android/gms/internal/play_billing/zzjt;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/play_billing/zzjt;->i(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzjt;->l()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzhv;->l(Lcom/google/android/gms/internal/play_billing/zzjt;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lu2/c;->j(Lcom/google/android/gms/internal/play_billing/zzhx;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, v0, Lp3/b;->h:Lu2/c;

    .line 79
    .line 80
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjs;->t()Lcom/google/android/gms/internal/play_billing/zzjs;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Lu2/c;->q(Lcom/google/android/gms/internal/play_billing/zzjs;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_0
    const-string v1, "BillingClient"

    .line 89
    .line 90
    const-string v2, "Unable to log."

    .line 91
    .line 92
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v0, p0, Lp3/x;->c:Lcom/google/android/gms/internal/play_billing/zzbi;

    .line 96
    .line 97
    const-wide/16 v1, 0x0

    .line 98
    .line 99
    iput-wide v1, v0, Lcom/google/android/gms/internal/play_billing/zzbi;->c:J

    .line 100
    .line 101
    iput-boolean p1, v0, Lcom/google/android/gms/internal/play_billing/zzbi;->b:Z

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzbi;->a()V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lp3/x;->d:Lp3/b;

    .line 107
    .line 108
    iget-object v1, v0, Lp3/b;->a:Ljava/lang/Object;

    .line 109
    .line 110
    monitor-enter v1

    .line 111
    :try_start_1
    iget v2, v0, Lp3/b;->b:I

    .line 112
    .line 113
    const/4 v3, 0x3

    .line 114
    if-ne v2, v3, :cond_1

    .line 115
    .line 116
    monitor-exit v1

    .line 117
    goto :goto_2

    .line 118
    :catchall_1
    move-exception p1

    .line 119
    goto :goto_3

    .line 120
    :cond_1
    invoke-virtual {v0, p1}, Lp3/b;->m(I)V

    .line 121
    .line 122
    .line 123
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    :try_start_2
    iget-object p1, p0, Lp3/x;->a:Lp3/c;

    .line 125
    .line 126
    invoke-interface {p1}, Lp3/c;->onBillingServiceDisconnected()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 127
    .line 128
    .line 129
    :goto_2
    return-void

    .line 130
    :catchall_2
    move-exception p1

    .line 131
    const-string v0, "BillingClient"

    .line 132
    .line 133
    const-string v1, "Exception while calling onBillingServiceDisconnected."

    .line 134
    .line 135
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 140
    throw p1
.end method
