.class public final Ld6/u;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lj6/i0;


# instance fields
.field public final h:J

.field public i:Z

.field public final j:Lj6/i;

.field public final k:Lj6/i;

.field public l:Z

.field public final synthetic m:Ld6/w;


# direct methods
.method public constructor <init>(Ld6/w;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld6/u;->m:Ld6/w;

    .line 5
    .line 6
    iput-wide p2, p0, Ld6/u;->h:J

    .line 7
    .line 8
    iput-boolean p4, p0, Ld6/u;->i:Z

    .line 9
    .line 10
    new-instance p1, Lj6/i;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ld6/u;->j:Lj6/i;

    .line 16
    .line 17
    new-instance p1, Lj6/i;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ld6/u;->k:Lj6/i;

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
.end method


# virtual methods
.method public final U(Lj6/i;J)J
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "sink"

    .line 8
    .line 9
    invoke-static {v0, v4}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v6, v2, v4

    .line 15
    .line 16
    if-ltz v6, :cond_9

    .line 17
    .line 18
    :goto_0
    iget-object v6, v1, Ld6/u;->m:Ld6/w;

    .line 19
    .line 20
    monitor-enter v6

    .line 21
    :try_start_0
    iget-object v7, v6, Ld6/w;->k:Ld6/v;

    .line 22
    .line 23
    invoke-virtual {v7}, Lj6/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-virtual {v6}, Ld6/w;->f()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    iget-boolean v7, v1, Ld6/u;->i:Z

    .line 33
    .line 34
    if-nez v7, :cond_0

    .line 35
    .line 36
    iget-object v7, v6, Ld6/w;->n:Ljava/io/IOException;

    .line 37
    .line 38
    if-nez v7, :cond_1

    .line 39
    .line 40
    new-instance v7, Ld6/c0;

    .line 41
    .line 42
    invoke-virtual {v6}, Ld6/w;->f()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-static {v8}, Landroidx/appcompat/app/b;->s(I)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v7, v8}, Ld6/c0;-><init>(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_0
    const/4 v7, 0x0

    .line 57
    :cond_1
    :goto_1
    iget-boolean v8, v1, Ld6/u;->l:Z

    .line 58
    .line 59
    if-nez v8, :cond_8

    .line 60
    .line 61
    iget-object v8, v1, Ld6/u;->k:Lj6/i;

    .line 62
    .line 63
    iget-wide v9, v8, Lj6/i;->i:J

    .line 64
    .line 65
    const-wide/16 v11, -0x1

    .line 66
    .line 67
    const/4 v13, 0x0

    .line 68
    cmp-long v14, v9, v4

    .line 69
    .line 70
    if-lez v14, :cond_2

    .line 71
    .line 72
    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    invoke-virtual {v8, v0, v9, v10}, Lj6/i;->U(Lj6/i;J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    iget-wide v14, v6, Ld6/w;->c:J

    .line 81
    .line 82
    add-long/2addr v14, v8

    .line 83
    iput-wide v14, v6, Ld6/w;->c:J

    .line 84
    .line 85
    iget-wide v4, v6, Ld6/w;->d:J

    .line 86
    .line 87
    sub-long/2addr v14, v4

    .line 88
    if-nez v7, :cond_4

    .line 89
    .line 90
    iget-object v4, v6, Ld6/w;->b:Ld6/o;

    .line 91
    .line 92
    iget-object v4, v4, Ld6/o;->w:Ld6/b0;

    .line 93
    .line 94
    invoke-virtual {v4}, Ld6/b0;->a()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    div-int/lit8 v4, v4, 0x2

    .line 99
    .line 100
    int-to-long v4, v4

    .line 101
    cmp-long v10, v14, v4

    .line 102
    .line 103
    if-ltz v10, :cond_4

    .line 104
    .line 105
    iget-object v4, v6, Ld6/w;->b:Ld6/o;

    .line 106
    .line 107
    iget v5, v6, Ld6/w;->a:I

    .line 108
    .line 109
    invoke-virtual {v4, v5, v14, v15}, Ld6/o;->E(IJ)V

    .line 110
    .line 111
    .line 112
    iget-wide v4, v6, Ld6/w;->c:J

    .line 113
    .line 114
    iput-wide v4, v6, Ld6/w;->d:J

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    iget-boolean v4, v1, Ld6/u;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    if-nez v4, :cond_3

    .line 120
    .line 121
    if-nez v7, :cond_3

    .line 122
    .line 123
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    .line 126
    const/4 v13, 0x1

    .line 127
    :cond_3
    move-wide v8, v11

    .line 128
    goto :goto_2

    .line 129
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 134
    .line 135
    .line 136
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 139
    .line 140
    .line 141
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 142
    :cond_4
    :goto_2
    :try_start_4
    iget-object v4, v6, Ld6/w;->k:Ld6/v;

    .line 143
    .line 144
    invoke-virtual {v4}, Ld6/v;->k()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 145
    .line 146
    .line 147
    monitor-exit v6

    .line 148
    if-eqz v13, :cond_5

    .line 149
    .line 150
    const-wide/16 v4, 0x0

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_5
    cmp-long v0, v8, v11

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    return-wide v8

    .line 159
    :cond_6
    if-nez v7, :cond_7

    .line 160
    .line 161
    return-wide v11

    .line 162
    :cond_7
    throw v7

    .line 163
    :catchall_1
    move-exception v0

    .line 164
    goto :goto_4

    .line 165
    :cond_8
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    .line 166
    .line 167
    const-string v2, "stream closed"

    .line 168
    .line 169
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 173
    :goto_3
    :try_start_6
    iget-object v2, v6, Ld6/w;->k:Ld6/v;

    .line 174
    .line 175
    invoke-virtual {v2}, Ld6/v;->k()V

    .line 176
    .line 177
    .line 178
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 179
    :goto_4
    monitor-exit v6

    .line 180
    throw v0

    .line 181
    :cond_9
    const-string v0, "byteCount < 0: "

    .line 182
    .line 183
    invoke-static {v0, v2, v3}, Landroidx/appcompat/app/b;->m(Ljava/lang/String;J)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v2
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

.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Ld6/u;->m:Ld6/w;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Ld6/u;->l:Z

    .line 6
    .line 7
    iget-object v1, p0, Ld6/u;->k:Lj6/i;

    .line 8
    .line 9
    iget-wide v2, v1, Lj6/i;->i:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lj6/i;->a()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v4, v2, v0

    .line 21
    .line 22
    if-lez v4, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Ld6/u;->m:Ld6/w;

    .line 25
    .line 26
    sget-object v1, Lx5/b;->a:[B

    .line 27
    .line 28
    iget-object v0, v0, Ld6/w;->b:Ld6/o;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Ld6/o;->u(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Ld6/u;->m:Ld6/w;

    .line 34
    .line 35
    invoke-virtual {v0}, Ld6/w;->a()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    monitor-exit v0

    .line 41
    throw v1
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

.method public final h()Lj6/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/u;->m:Ld6/w;

    .line 2
    .line 3
    iget-object v0, v0, Ld6/w;->k:Ld6/v;

    .line 4
    .line 5
    return-object v0
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
