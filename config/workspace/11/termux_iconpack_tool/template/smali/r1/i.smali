.class public final Lr1/i;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lq5/h;


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Lp4/a;


# direct methods
.method public constructor <init>(Lq5/h;Landroidx/work/impl/WorkDatabase_Impl;Landroidx/room/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr1/i;->h:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/i;->i:Ljava/lang/Object;

    iput-object p2, p0, Lr1/i;->j:Ljava/lang/Object;

    iput-object p3, p0, Lr1/i;->k:Lp4/a;

    return-void
.end method

.method public constructor <init>(Lq5/h;Lt4/h;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lr1/i;->h:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lr1/i;->i:Ljava/lang/Object;

    .line 4
    invoke-static {p2}, Ls5/b;->m(Lt4/h;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lr1/i;->j:Ljava/lang/Object;

    .line 5
    new-instance p2, Landroidx/room/n1;

    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-direct {p2, p1, v0, v1}, Landroidx/room/n1;-><init>(Ljava/lang/Object;Lt4/c;I)V

    iput-object p2, p0, Lr1/i;->k:Lp4/a;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lr1/i;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr1/i;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt4/h;

    .line 9
    .line 10
    iget-object v1, p0, Lr1/i;->k:Lp4/a;

    .line 11
    .line 12
    check-cast v1, Landroidx/room/n1;

    .line 13
    .line 14
    iget-object v2, p0, Lr1/i;->j:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v0, p1, v2, v1, p2}, Lr5/c;->a(Lt4/h;Ljava/lang/Object;Ljava/lang/Object;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lu4/a;->h:Lu4/a;

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 26
    .line 27
    :goto_0
    return-object p1

    .line 28
    :pswitch_0
    instance-of v0, p2, Lr1/h;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, Lr1/h;

    .line 34
    .line 35
    iget v1, v0, Lr1/h;->i:I

    .line 36
    .line 37
    const/high16 v2, -0x80000000

    .line 38
    .line 39
    and-int v3, v1, v2

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    sub-int/2addr v1, v2

    .line 44
    iput v1, v0, Lr1/h;->i:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance v0, Lr1/h;

    .line 48
    .line 49
    invoke-direct {v0, p0, p2}, Lr1/h;-><init>(Lr1/i;Lt4/c;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object p2, v0, Lr1/h;->h:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 55
    .line 56
    iget v2, v0, Lr1/h;->i:I

    .line 57
    .line 58
    const/4 v3, 0x2

    .line 59
    const/4 v4, 0x1

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    if-eq v2, v4, :cond_3

    .line 63
    .line 64
    if-ne v2, v3, :cond_2

    .line 65
    .line 66
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_3
    iget-object p1, v0, Lr1/h;->j:Lq5/h;

    .line 79
    .line 80
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lr1/i;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p2, Lq5/h;

    .line 90
    .line 91
    check-cast p1, Ljava/util/Set;

    .line 92
    .line 93
    iget-object p1, p0, Lr1/i;->j:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 96
    .line 97
    iget-object v2, p0, Lr1/i;->k:Lp4/a;

    .line 98
    .line 99
    check-cast v2, Landroidx/room/a;

    .line 100
    .line 101
    iput-object p2, v0, Lr1/h;->j:Lq5/h;

    .line 102
    .line 103
    iput v4, v0, Lr1/h;->i:I

    .line 104
    .line 105
    invoke-static {p1, v2, v0, v4}, Lu2/f;->z(Landroidx/room/r0;Ld5/l;Lt4/c;Z)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v1, :cond_5

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    move-object v5, p2

    .line 113
    move-object p2, p1

    .line 114
    move-object p1, v5

    .line 115
    :goto_2
    const/4 v2, 0x0

    .line 116
    iput-object v2, v0, Lr1/h;->j:Lq5/h;

    .line 117
    .line 118
    iput v3, v0, Lr1/h;->i:I

    .line 119
    .line 120
    invoke-interface {p1, p2, v0}, Lq5/h;->c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v1, :cond_6

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_6
    :goto_3
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 128
    .line 129
    :goto_4
    return-object v1

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
