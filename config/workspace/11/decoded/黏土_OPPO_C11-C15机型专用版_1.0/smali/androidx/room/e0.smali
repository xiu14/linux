.class public final Landroidx/room/e0;
.super Landroidx/lifecycle/f0;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final l:Landroidx/room/r0;

.field public final m:Lu2/e;

.field public final n:Landroidx/room/y0;

.field public final o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final r:Lt4/h;

.field public final s:Lu2/r;


# direct methods
.method public constructor <init>(Landroidx/room/r0;Lu2/e;[Ljava/lang/String;Lu2/r;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/lifecycle/f0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/room/e0;->l:Landroidx/room/r0;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/room/e0;->m:Lu2/e;

    .line 12
    .line 13
    new-instance p2, Landroidx/room/y0;

    .line 14
    .line 15
    invoke-direct {p2, p3, p0}, Landroidx/room/y0;-><init>([Ljava/lang/String;Landroidx/room/e0;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Landroidx/room/e0;->n:Landroidx/room/y0;

    .line 19
    .line 20
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Landroidx/room/e0;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Landroidx/room/e0;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Landroidx/room/e0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/room/r0;->inCompatibilityMode$room_runtime_release()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/room/r0;->getTransactionContext$room_runtime_release()Lt4/h;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object p1, Lt4/i;->h:Lt4/i;

    .line 55
    .line 56
    :goto_0
    iput-object p1, p0, Landroidx/room/e0;->r:Lt4/h;

    .line 57
    .line 58
    iput-object p4, p0, Landroidx/room/e0;->s:Lu2/r;

    .line 59
    .line 60
    return-void
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
.end method

.method public static final m(Landroidx/room/e0;Lv4/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Landroidx/room/z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/room/z0;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/z0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/z0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/z0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/room/z0;-><init>(Landroidx/room/e0;Lv4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/room/z0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/z0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    iget p0, v0, Landroidx/room/z0;->i:I

    .line 39
    .line 40
    iget-object v2, v0, Landroidx/room/z0;->h:Landroidx/room/e0;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :catch_0
    move-exception p0

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Landroidx/room/e0;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    invoke-virtual {p1, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/room/e0;->l:Landroidx/room/r0;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroidx/room/r0;->getInvalidationTracker()Landroidx/room/n;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v2, p0, Landroidx/room/e0;->n:Landroidx/room/y0;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const-string v6, "observer"

    .line 82
    .line 83
    invoke-static {v2, v6}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance v6, Landroidx/room/t1;

    .line 87
    .line 88
    invoke-direct {v6, p1, v2}, Landroidx/room/t1;-><init>(Landroidx/room/n;Landroidx/room/y0;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v6}, Landroidx/room/n;->a(Landroidx/room/k;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    new-instance v2, Landroidx/room/l;

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    invoke-direct {v2, p1, v3, v6}, Landroidx/room/l;-><init>(Landroidx/room/n;Lt4/c;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v2}, Le6/d;->O(Ld5/p;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_1
    iget-object p1, p0, Landroidx/room/e0;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 107
    .line 108
    invoke-virtual {p1, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    move-object v2, p0

    .line 113
    if-eqz p1, :cond_7

    .line 114
    .line 115
    move-object p1, v3

    .line 116
    const/4 p0, 0x0

    .line 117
    :goto_2
    :try_start_1
    iget-object v6, v2, Landroidx/room/e0;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 118
    .line 119
    invoke-virtual {v6, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 120
    .line 121
    .line 122
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    if-eqz v6, :cond_5

    .line 124
    .line 125
    :try_start_2
    iput-object v2, v0, Landroidx/room/z0;->h:Landroidx/room/e0;

    .line 126
    .line 127
    iput v5, v0, Landroidx/room/z0;->i:I

    .line 128
    .line 129
    iput v5, v0, Landroidx/room/z0;->l:I

    .line 130
    .line 131
    iget-object p0, v2, Landroidx/room/e0;->s:Lu2/r;

    .line 132
    .line 133
    invoke-virtual {p0}, Lu2/r;->call()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    if-ne p1, v1, :cond_4

    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_4
    const/4 p0, 0x1

    .line 141
    goto :goto_2

    .line 142
    :goto_3
    :try_start_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 143
    .line 144
    const-string v0, "Exception while computing database live data."

    .line 145
    .line 146
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :cond_5
    if-eqz p0, :cond_6

    .line 151
    .line 152
    invoke-virtual {v2, p1}, Landroidx/lifecycle/f0;->i(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 153
    .line 154
    .line 155
    :cond_6
    iget-object p1, v2, Landroidx/room/e0;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 156
    .line 157
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :goto_4
    iget-object p1, v2, Landroidx/room/e0;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 162
    .line 163
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 164
    .line 165
    .line 166
    throw p0

    .line 167
    :cond_7
    const/4 p0, 0x0

    .line 168
    :goto_5
    if-eqz p0, :cond_9

    .line 169
    .line 170
    iget-object p0, v2, Landroidx/room/e0;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-nez p0, :cond_8

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_8
    move-object p0, v2

    .line 180
    goto :goto_1

    .line 181
    :cond_9
    :goto_6
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 182
    .line 183
    return-object p0
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


# virtual methods
.method public final g()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/room/e0;->m:Lu2/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lu2/e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/room/e0;->l:Landroidx/room/r0;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/room/r0;->getCoroutineScope()Ln5/v;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Landroidx/room/x0;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, p0, v3, v2}, Landroidx/room/x0;-><init>(Landroidx/room/e0;Lt4/c;I)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    iget-object v4, p0, Landroidx/room/e0;->r:Lt4/h;

    .line 28
    .line 29
    invoke-static {v0, v4, v3, v1, v2}, Ln5/x;->p(Ln5/v;Lt4/h;Ln5/w;Ld5/p;I)Ln5/a0;

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/e0;->m:Lu2/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lu2/e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
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
.end method
