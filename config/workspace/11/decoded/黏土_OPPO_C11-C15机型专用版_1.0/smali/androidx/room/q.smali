.class public final Landroidx/room/q;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lq5/g;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lq5/g;

.field public final synthetic j:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Lq5/g;Ld5/p;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/room/q;->h:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/room/q;->i:Lq5/g;

    check-cast p2, Lv4/h;

    iput-object p2, p0, Landroidx/room/q;->j:Ljava/io/Serializable;

    return-void
.end method

.method public synthetic constructor <init>(Lq5/g;Ljava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/room/q;->h:I

    iput-object p1, p0, Landroidx/room/q;->i:Lq5/g;

    iput-object p2, p0, Landroidx/room/q;->j:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lq5/h;Lt4/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Landroidx/room/q;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/room/p;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/room/q;->j:Ljava/io/Serializable;

    .line 9
    .line 10
    check-cast v1, Lv4/h;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Landroidx/room/p;-><init>(Lq5/h;Ld5/p;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Landroidx/room/q;->i:Lq5/g;

    .line 16
    .line 17
    invoke-interface {p1, v0, p2}, Lq5/g;->b(Lq5/h;Lt4/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object p2, Lu4/a;->h:Lu4/a;

    .line 22
    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 27
    .line 28
    :goto_0
    return-object p1

    .line 29
    :pswitch_0
    instance-of v0, p2, Lq5/l;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v0, p2

    .line 34
    check-cast v0, Lq5/l;

    .line 35
    .line 36
    iget v1, v0, Lq5/l;->i:I

    .line 37
    .line 38
    const/high16 v2, -0x80000000

    .line 39
    .line 40
    and-int v3, v1, v2

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    sub-int/2addr v1, v2

    .line 45
    iput v1, v0, Lq5/l;->i:I

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance v0, Lq5/l;

    .line 49
    .line 50
    invoke-direct {v0, p0, p2}, Lq5/l;-><init>(Landroidx/room/q;Lt4/c;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    iget-object p2, v0, Lq5/l;->h:Ljava/lang/Object;

    .line 54
    .line 55
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 56
    .line 57
    iget v2, v0, Lq5/l;->i:I

    .line 58
    .line 59
    const/4 v3, 0x2

    .line 60
    const/4 v4, 0x1

    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    if-eq v2, v4, :cond_3

    .line 64
    .line 65
    if-ne v2, v3, :cond_2

    .line 66
    .line 67
    iget-wide v5, v0, Lq5/l;->n:J

    .line 68
    .line 69
    iget-object p1, v0, Lq5/l;->m:Ljava/lang/Throwable;

    .line 70
    .line 71
    iget-object v2, v0, Lq5/l;->l:Lq5/h;

    .line 72
    .line 73
    iget-object v7, v0, Lq5/l;->k:Landroidx/room/q;

    .line 74
    .line 75
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_3
    iget-wide v5, v0, Lq5/l;->n:J

    .line 89
    .line 90
    iget-object p1, v0, Lq5/l;->l:Lq5/h;

    .line 91
    .line 92
    iget-object v2, v0, Lq5/l;->k:Landroidx/room/q;

    .line 93
    .line 94
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object v7, v2

    .line 98
    :goto_2
    move-object v2, p1

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const-wide/16 v5, 0x0

    .line 104
    .line 105
    move-object p2, p0

    .line 106
    :goto_3
    iget-object v2, p2, Landroidx/room/q;->i:Lq5/g;

    .line 107
    .line 108
    check-cast v2, Lr1/j;

    .line 109
    .line 110
    iput-object p2, v0, Lq5/l;->k:Landroidx/room/q;

    .line 111
    .line 112
    iput-object p1, v0, Lq5/l;->l:Lq5/h;

    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    iput-object v7, v0, Lq5/l;->m:Ljava/lang/Throwable;

    .line 116
    .line 117
    iput-wide v5, v0, Lq5/l;->n:J

    .line 118
    .line 119
    iput v4, v0, Lq5/l;->i:I

    .line 120
    .line 121
    invoke-static {v2, p1, v0}, Lq5/u;->b(Lr1/j;Lq5/h;Lv4/c;)Ljava/io/Serializable;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-ne v2, v1, :cond_5

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_5
    move-object v7, p2

    .line 129
    move-object p2, v2

    .line 130
    goto :goto_2

    .line 131
    :goto_4
    move-object p1, p2

    .line 132
    check-cast p1, Ljava/lang/Throwable;

    .line 133
    .line 134
    if-eqz p1, :cond_8

    .line 135
    .line 136
    iget-object p2, v7, Landroidx/room/q;->j:Ljava/io/Serializable;

    .line 137
    .line 138
    check-cast p2, Lm2/l;

    .line 139
    .line 140
    new-instance v8, Ljava/lang/Long;

    .line 141
    .line 142
    invoke-direct {v8, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 143
    .line 144
    .line 145
    iput-object v7, v0, Lq5/l;->k:Landroidx/room/q;

    .line 146
    .line 147
    iput-object v2, v0, Lq5/l;->l:Lq5/h;

    .line 148
    .line 149
    iput-object p1, v0, Lq5/l;->m:Ljava/lang/Throwable;

    .line 150
    .line 151
    iput-wide v5, v0, Lq5/l;->n:J

    .line 152
    .line 153
    iput v3, v0, Lq5/l;->i:I

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    check-cast v8, Ljava/lang/Number;

    .line 159
    .line 160
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 161
    .line 162
    .line 163
    move-result-wide v8

    .line 164
    move-object p2, v0

    .line 165
    check-cast p2, Lt4/c;

    .line 166
    .line 167
    new-instance v10, Lm2/l;

    .line 168
    .line 169
    const/4 v11, 0x4

    .line 170
    invoke-direct {v10, v11, p2}, Lv4/h;-><init>(ILt4/c;)V

    .line 171
    .line 172
    .line 173
    iput-object p1, v10, Lm2/l;->i:Ljava/lang/Throwable;

    .line 174
    .line 175
    iput-wide v8, v10, Lm2/l;->j:J

    .line 176
    .line 177
    sget-object p2, Lp4/k;->a:Lp4/k;

    .line 178
    .line 179
    invoke-virtual {v10, p2}, Lm2/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    if-ne p2, v1, :cond_6

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_6
    :goto_5
    check-cast p2, Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_7

    .line 193
    .line 194
    const-wide/16 p1, 0x1

    .line 195
    .line 196
    add-long/2addr v5, p1

    .line 197
    const/4 p1, 0x1

    .line 198
    :goto_6
    move-object p2, v7

    .line 199
    goto :goto_7

    .line 200
    :cond_7
    throw p1

    .line 201
    :cond_8
    const/4 p1, 0x0

    .line 202
    goto :goto_6

    .line 203
    :goto_7
    if-nez p1, :cond_9

    .line 204
    .line 205
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 206
    .line 207
    :goto_8
    return-object v1

    .line 208
    :cond_9
    move-object p1, v2

    .line 209
    goto :goto_3

    .line 210
    :pswitch_1
    new-instance v0, Landroidx/room/p;

    .line 211
    .line 212
    iget-object v1, p0, Landroidx/room/q;->j:Ljava/io/Serializable;

    .line 213
    .line 214
    check-cast v1, [Ljava/lang/String;

    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    invoke-direct {v0, v2, p1, v1}, Landroidx/room/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, Landroidx/room/q;->i:Lq5/g;

    .line 221
    .line 222
    invoke-interface {p1, v0, p2}, Lq5/g;->b(Lq5/h;Lt4/c;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    sget-object p2, Lu4/a;->h:Lu4/a;

    .line 227
    .line 228
    if-ne p1, p2, :cond_a

    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_a
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 232
    .line 233
    :goto_9
    return-object p1

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
