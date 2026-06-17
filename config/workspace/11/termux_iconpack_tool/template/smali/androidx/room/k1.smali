.class public final Landroidx/room/k1;
.super Lv4/h;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/room/s1;[I[Ljava/lang/String;Lt4/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/room/k1;->h:I

    .line 1
    iput-object p1, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lv4/h;-><init>(ILt4/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V
    .locals 0

    .line 2
    iput p6, p0, Landroidx/room/k1;->h:I

    iput-object p1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lv4/h;-><init>(ILt4/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lt4/c;)Lt4/c;
    .locals 9

    .line 1
    iget v0, p0, Landroidx/room/k1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/room/k1;

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Ll2/s;

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, Lp3/j;

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, p1

    .line 26
    check-cast v5, Lu2/p;

    .line 27
    .line 28
    const/4 v7, 0x3

    .line 29
    move-object v6, p2

    .line 30
    invoke-direct/range {v1 .. v7}, Landroidx/room/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    move-object v7, p2

    .line 35
    new-instance v2, Landroidx/room/k1;

    .line 36
    .line 37
    iget-object p1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v3, p1

    .line 40
    check-cast v3, Lp3/j;

    .line 41
    .line 42
    iget-object p1, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v4, p1

    .line 45
    check-cast v4, Lu2/p;

    .line 46
    .line 47
    iget-object p1, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v5, p1

    .line 50
    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 51
    .line 52
    iget-object p1, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v6, p1

    .line 55
    check-cast v6, Lcom/google/common/util/concurrent/ListenableFuture;

    .line 56
    .line 57
    const/4 v8, 0x2

    .line 58
    invoke-direct/range {v2 .. v8}, Landroidx/room/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :pswitch_1
    move-object v7, p2

    .line 63
    new-instance v2, Landroidx/room/k1;

    .line 64
    .line 65
    iget-object p1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v3, p1

    .line 68
    check-cast v3, Ll2/s;

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v4, p1

    .line 73
    check-cast v4, Lu2/p;

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v5, p1

    .line 78
    check-cast v5, Lv2/p;

    .line 79
    .line 80
    iget-object p1, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v6, p1

    .line 83
    check-cast v6, Landroid/content/Context;

    .line 84
    .line 85
    const/4 v8, 0x1

    .line 86
    invoke-direct/range {v2 .. v8}, Landroidx/room/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt4/c;I)V

    .line 87
    .line 88
    .line 89
    return-object v2

    .line 90
    :pswitch_2
    move-object v7, p2

    .line 91
    new-instance p2, Landroidx/room/k1;

    .line 92
    .line 93
    iget-object v0, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Landroidx/room/s1;

    .line 96
    .line 97
    iget-object v1, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, [I

    .line 100
    .line 101
    iget-object v2, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, [Ljava/lang/String;

    .line 104
    .line 105
    invoke-direct {p2, v0, v1, v2, v7}, Landroidx/room/k1;-><init>(Landroidx/room/s1;[I[Ljava/lang/String;Lt4/c;)V

    .line 106
    .line 107
    .line 108
    iput-object p1, p2, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 109
    .line 110
    return-object p2

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/room/k1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ln5/v;

    .line 7
    .line 8
    check-cast p2, Lt4/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroidx/room/k1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/room/k1;

    .line 15
    .line 16
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroidx/room/k1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Ln5/v;

    .line 24
    .line 25
    check-cast p2, Lt4/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Landroidx/room/k1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroidx/room/k1;

    .line 32
    .line 33
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroidx/room/k1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Ln5/v;

    .line 41
    .line 42
    check-cast p2, Lt4/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Landroidx/room/k1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Landroidx/room/k1;

    .line 49
    .line 50
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroidx/room/k1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p1, Lq5/h;

    .line 58
    .line 59
    check-cast p2, Lt4/c;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Landroidx/room/k1;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Landroidx/room/k1;

    .line 66
    .line 67
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroidx/room/k1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p1, Lu4/a;->h:Lu4/a;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Landroidx/room/k1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 7
    .line 8
    iget v1, p0, Landroidx/room/k1;->i:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ll2/s;

    .line 37
    .line 38
    iget-object v3, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Lp3/j;

    .line 41
    .line 42
    iget-object v4, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Lu2/p;

    .line 45
    .line 46
    iput v2, p0, Landroidx/room/k1;->i:I

    .line 47
    .line 48
    invoke-static {p1, v1, v3, v4, p0}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->a(Landroidx/work/impl/workers/ConstraintTrackingWorker;Ll2/s;Lp3/j;Lu2/p;Lv4/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :cond_2
    :goto_0
    return-object p1

    .line 56
    :pswitch_0
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 57
    .line 58
    iget v1, p0, Landroidx/room/k1;->i:I

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    if-ne v1, v2, :cond_3

    .line 64
    .line 65
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_4
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Lp3/j;

    .line 83
    .line 84
    iget-object v1, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lu2/p;

    .line 87
    .line 88
    iput v2, p0, Landroidx/room/k1;->i:I

    .line 89
    .line 90
    invoke-static {p1, v1, p0}, Lx2/g;->a(Lp3/j;Lu2/p;Lv4/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iget-object v0, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Lcom/google/common/util/concurrent/ListenableFuture;

    .line 113
    .line 114
    invoke-interface {p1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 115
    .line 116
    .line 117
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 118
    .line 119
    :goto_2
    return-object v0

    .line 120
    :pswitch_1
    iget-object v0, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lu2/p;

    .line 123
    .line 124
    iget-object v0, v0, Lu2/p;->c:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Ll2/s;

    .line 129
    .line 130
    sget-object v2, Lu4/a;->h:Lu4/a;

    .line 131
    .line 132
    iget v3, p0, Landroidx/room/k1;->i:I

    .line 133
    .line 134
    const/4 v4, 0x2

    .line 135
    const/4 v5, 0x1

    .line 136
    if-eqz v3, :cond_8

    .line 137
    .line 138
    if-eq v3, v5, :cond_7

    .line 139
    .line 140
    if-ne v3, v4, :cond_6

    .line 141
    .line 142
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 149
    .line 150
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_7
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_8
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ll2/s;->getForegroundInfoAsync()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    const-string v3, "worker.getForegroundInfoAsync()"

    .line 166
    .line 167
    invoke-static {p1, v3}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iput v5, p0, Landroidx/room/k1;->i:I

    .line 171
    .line 172
    invoke-static {p1, v1, p0}, Lm2/g0;->a(Lcom/google/common/util/concurrent/ListenableFuture;Ll2/s;Lv4/h;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-ne p1, v2, :cond_9

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_9
    :goto_3
    check-cast p1, Ll2/l;

    .line 180
    .line 181
    if-eqz p1, :cond_b

    .line 182
    .line 183
    sget-object v3, Lv2/n;->a:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    new-instance v6, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v7, "Updating notification for "

    .line 192
    .line 193
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v5, v3, v0}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Lv2/p;

    .line 209
    .line 210
    iget-object v3, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v3, Landroid/content/Context;

    .line 213
    .line 214
    invoke-virtual {v1}, Ll2/s;->getId()Ljava/util/UUID;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iget-object v5, v0, Lv2/p;->a:Lu2/i;

    .line 219
    .line 220
    iget-object v5, v5, Lu2/i;->a:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v5, Landroidx/room/c1;

    .line 223
    .line 224
    new-instance v6, Lv2/o;

    .line 225
    .line 226
    invoke-direct {v6, v0, v1, p1, v3}, Lv2/o;-><init>(Lv2/p;Ljava/util/UUID;Ll2/l;Landroid/content/Context;)V

    .line 227
    .line 228
    .line 229
    const-string p1, "<this>"

    .line 230
    .line 231
    invoke-static {v5, p1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    new-instance p1, Lg2/h;

    .line 235
    .line 236
    const/4 v0, 0x2

    .line 237
    const-string v1, "setForegroundAsync"

    .line 238
    .line 239
    invoke-direct {p1, v5, v1, v6, v0}, Lg2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 240
    .line 241
    .line 242
    invoke-static {p1}, Lu2/f;->t(Ls/j;)Ls/l;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iput v4, p0, Landroidx/room/k1;->i:I

    .line 247
    .line 248
    invoke-static {p1, p0}, La/a;->g(Lcom/google/common/util/concurrent/ListenableFuture;Lt4/c;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-ne p1, v2, :cond_a

    .line 253
    .line 254
    :goto_4
    move-object p1, v2

    .line 255
    :cond_a
    :goto_5
    return-object p1

    .line 256
    :cond_b
    const-string p1, "Worker was marked important ("

    .line 257
    .line 258
    const-string v1, ") but did not provide ForegroundInfo"

    .line 259
    .line 260
    invoke-static {p1, v0, v1}, Landroidx/appcompat/app/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 265
    .line 266
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :pswitch_2
    iget-object v0, p0, Landroidx/room/k1;->l:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, [I

    .line 273
    .line 274
    iget-object v1, p0, Landroidx/room/k1;->k:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, Landroidx/room/s1;

    .line 277
    .line 278
    sget-object v2, Lu4/a;->h:Lu4/a;

    .line 279
    .line 280
    iget v3, p0, Landroidx/room/k1;->i:I

    .line 281
    .line 282
    const/4 v4, 0x0

    .line 283
    const/4 v5, 0x3

    .line 284
    const/4 v6, 0x2

    .line 285
    const/4 v7, 0x1

    .line 286
    if-eqz v3, :cond_f

    .line 287
    .line 288
    if-eq v3, v7, :cond_e

    .line 289
    .line 290
    if-eq v3, v6, :cond_d

    .line 291
    .line 292
    if-eq v3, v5, :cond_c

    .line 293
    .line 294
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 295
    .line 296
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 297
    .line 298
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw p1

    .line 302
    :cond_c
    :try_start_0
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    new-instance p1, Landroidx/fragment/app/i0;

    .line 306
    .line 307
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 308
    .line 309
    .line 310
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    :catchall_0
    move-exception p1

    .line 312
    goto :goto_9

    .line 313
    :cond_d
    iget-object v3, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v3, Lq5/h;

    .line 316
    .line 317
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_e
    iget-object v3, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v3, Lq5/h;

    .line 324
    .line 325
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_f
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    iget-object p1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p1, Lq5/h;

    .line 335
    .line 336
    iget-object v3, v1, Landroidx/room/s1;->h:Landroidx/room/z;

    .line 337
    .line 338
    invoke-virtual {v3, v0}, Landroidx/room/z;->c([I)Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_12

    .line 343
    .line 344
    iget-object v3, v1, Landroidx/room/s1;->a:Landroidx/room/r0;

    .line 345
    .line 346
    iput-object p1, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 347
    .line 348
    iput v7, p0, Landroidx/room/k1;->i:I

    .line 349
    .line 350
    invoke-static {v3, p0}, Lu2/f;->s(Landroidx/room/r0;Lv4/c;)Lt4/h;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    if-ne v3, v2, :cond_10

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_10
    move-object v9, v3

    .line 358
    move-object v3, p1

    .line 359
    move-object p1, v9

    .line 360
    :goto_6
    check-cast p1, Lt4/h;

    .line 361
    .line 362
    new-instance v7, Landroidx/room/h1;

    .line 363
    .line 364
    const/4 v8, 0x0

    .line 365
    invoke-direct {v7, v1, v4, v8}, Landroidx/room/h1;-><init>(Ljava/lang/Object;Lt4/c;I)V

    .line 366
    .line 367
    .line 368
    iput-object v3, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 369
    .line 370
    iput v6, p0, Landroidx/room/k1;->i:I

    .line 371
    .line 372
    invoke-static {p1, v7, p0}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    if-ne p1, v2, :cond_11

    .line 377
    .line 378
    goto :goto_8

    .line 379
    :cond_11
    :goto_7
    move-object p1, v3

    .line 380
    :cond_12
    :try_start_1
    new-instance v3, Lkotlin/jvm/internal/o;

    .line 381
    .line 382
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 383
    .line 384
    .line 385
    iget-object v6, v1, Landroidx/room/s1;->i:La1/q;

    .line 386
    .line 387
    new-instance v7, Landroidx/room/j1;

    .line 388
    .line 389
    iget-object v8, p0, Landroidx/room/k1;->m:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v8, [Ljava/lang/String;

    .line 392
    .line 393
    invoke-direct {v7, v3, p1, v8, v0}, Landroidx/room/j1;-><init>(Lkotlin/jvm/internal/o;Lq5/h;[Ljava/lang/String;[I)V

    .line 394
    .line 395
    .line 396
    iput-object v4, p0, Landroidx/room/k1;->j:Ljava/lang/Object;

    .line 397
    .line 398
    iput v5, p0, Landroidx/room/k1;->i:I

    .line 399
    .line 400
    invoke-virtual {v6, v7, p0}, La1/q;->v(Landroidx/room/j1;Lv4/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 401
    .line 402
    .line 403
    :goto_8
    return-object v2

    .line 404
    :goto_9
    iget-object v1, v1, Landroidx/room/s1;->h:Landroidx/room/z;

    .line 405
    .line 406
    invoke-virtual {v1, v0}, Landroidx/room/z;->d([I)Z

    .line 407
    .line 408
    .line 409
    throw p1

    .line 410
    nop

    .line 411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
